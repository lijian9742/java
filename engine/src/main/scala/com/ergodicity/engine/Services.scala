package com.ergodicity.engine

import akka.actor._
import akka.util.duration._
import service.{Service, ServiceId}
import akka.actor.FSM.Normal
import collection.mutable
import scalaz._
import com.ergodicity.engine.ServicesState.PendingServices
import akka.util.Timeout

case class ServiceStarted(service: ServiceId)

case class ServiceStopped(service: ServiceId)

sealed trait ServicesState

object ServicesState {

  case object Idle extends ServicesState

  case object Starting extends ServicesState

  case object Active extends ServicesState

  case object Stopping extends ServicesState

  case class PendingServices(pending: Iterable[ServiceId])

}

object Services {

  // Barriers for starting & stopping services
  case object StartUp extends ServiceId

  case object ShutDown extends ServiceId

  // Commands
  case object StartServices

  case object StopServices

  case class ResolveService(id: ServiceId)

  case class ServiceRef(id: ServiceId, ref: ActorRef)

  // Possible failures

  case class ServicesStartupTimedOut(pending: Iterable[ServiceId]) extends RuntimeException("Service start up timed out; Pending = " + pending)

  class ServiceFailedException(service: ServiceId, message: String) extends RuntimeException(message)

  class ServiceNotFoundException(service: ServiceId) extends RuntimeException("Service not found; service = " + service)

  // Managing Services dependencies
  object ServiceBarrier {
    def apply(pending: NonEmptyList[ServiceId])(onReady: => Unit): ServiceBarrier =
      new Waiting(pending)(onReady)
  }

  sealed trait ServiceBarrier {
    def waitFor(id: ServiceId): ServiceBarrier

    def ready(id: ServiceId): ServiceBarrier

    def toSeq: Seq[ServiceId]
  }

  private[this] case object Stale extends ServiceBarrier {
    val toSeq = Seq.empty[ServiceId]

    def waitFor(id: ServiceId): ServiceBarrier = throw new UnsupportedOperationException

    def ready(id: ServiceId) = this
  }

  private[this] class Waiting(pending: NonEmptyList[ServiceId])(onReady: => Unit) extends ServiceBarrier {
    def toSeq = pending.list.toSeq

    def waitFor(id: ServiceId) = new Waiting(pending :::> (id :: Nil))(onReady)

    def ready(id: ServiceId) = (pending.list.filterNot(_ == id)) match {
      case x :: xs => new Waiting(NonEmptyList(x, xs: _*))(onReady)
      case Nil => onReady; Stale
    }
  }

  case class ManagedService(ref: ActorRef, startBarrier: ServiceBarrier, stopBarrier: ServiceBarrier) {
    def start(id: ServiceId) = copy(startBarrier = startBarrier.ready(id))

    def stop(id: ServiceId) = copy(stopBarrier = stopBarrier.ready(id))

    def waitFor(id: ServiceId) = copy(stopBarrier = stopBarrier.waitFor(id))
  }

}

abstract class Services {
  this: Services with Actor with FSM[ServicesState, PendingServices] =>

  import Services._

  implicit val Self = this

  private implicit val timeout = Timeout(5.seconds)

  protected[engine] val services = mutable.Map.empty[ServiceId, ManagedService]

  protected[engine] def register(props: Props, dependOn: Seq[ServiceId] = Seq())(implicit id: ServiceId) {
    log.info("Register service, Id = " + id + ", depends on = " + dependOn)

    if (services.contains(id))
      throw new IllegalStateException("Service with id = " + id + " has been already registered")

    dependOn.foreach {
      required =>
        if (!services.contains(required)) {
          log.error("Missing required service = " + required + ", for " + id)
          throw new IllegalStateException("Missing required service = " + required + ", for " + id)
        }
    }

    val ref = context.actorOf(props, id.toString)

    val startBarrier = ServiceBarrier(NonEmptyList(StartUp, dependOn: _*)) {
      ref ! Service.Start
    }
    val stopBarrier = ServiceBarrier(NonEmptyList(ShutDown)) {
      ref ! Service.Stop
    }

    services(id) = ManagedService(ref, startBarrier, stopBarrier)

    // Update stop barrier on existing services
    services.transform {
      case (i, service) if (dependOn contains i) => service.waitFor(id)
      case (_, service) => service
    }
  }

  def service(id: ServiceId): ActorRef = services.get(id).map(_.ref).getOrElse(throw new ServiceNotFoundException(id))

  def apply(id: ServiceId) = service(id)

  def serviceStopped(implicit id: ServiceId) {
    self ! ServiceStopped(id)
  }

  def serviceStarted(implicit id: ServiceId) {
    self ! ServiceStarted(id)
  }

}


class ServicesActor extends Services with Actor with LoggingFSM[ServicesState, PendingServices] {

  import Services._
  import ServicesState._

  // Stop all services on any failed
  override def supervisorStrategy() = AllForOneStrategy() {
    case _: ServiceFailedException => SupervisorStrategy.Stop
  }

  startWith(Idle, PendingServices(Nil))

  when(Idle) {
    case Event(StartServices, _) =>
      log.info("Start all services = " + services.keys)
      started(StartUp)
      goto(Starting) using PendingServices(services.keys)
  }

  when(Starting, stateTimeout = 1.minute) {
    case Event(ServiceStarted(service), PendingServices(pending)) =>
      val remaining = pending.filterNot(_ == service)
      log.info("Service started = " + service + ", remaining = " + remaining)
      started(service)

      remaining.size match {
        case 0 => goto(Active) using PendingServices(Nil)
        case _ => stay() using PendingServices(remaining)
      }

    case Event(FSM.StateTimeout, PendingServices(remaining)) =>
      throw new ServicesStartupTimedOut(remaining)
  }

  when(Active) {
    case Event(StopServices, _) =>
      log.info("Stop all services = " + services.keys)
      stopped(ShutDown)
      goto(Stopping) using PendingServices(services.keys)
  }

  when(Stopping, stateTimeout = 30.seconds) {
    case Event(ServiceStopped(service), PendingServices(pending)) =>
      val remaining = pending.filterNot(_ == service)
      log.info("Service stopped = " + service + ", remaining = " + remaining)
      stopped(service)
      remaining.size match {
        case 0 => stop(Normal)
        case _ => stay() using PendingServices(remaining)
      }

    case Event(FSM.StateTimeout, PendingServices(pending)) =>
      stop(FSM.Shutdown)
  }

  whenUnhandled {
    case Event(ResolveService(id), _) =>
      sender ! ServiceRef(id, service(id))
      stay()
  }

  onTransition {
    case Starting -> Active => log.info("All services started")
  }

  override def preStart() {
    log.info("Registered services = " + services.keys)
    services.foreach {
      case (id, service) =>
        log.info(" - " + id + "; startBarrier = " + service.startBarrier.toSeq + ", stopBarrier = " + service.stopBarrier.toSeq)
    }
  }

  private def started(started: ServiceId) {
    services.transform {
      case (_, service) => service.start(started)
    }
  }

  private def stopped(stopped: ServiceId) {
    services.transform {
      case (_, service) => service.stop(stopped)
    }
  }
}
