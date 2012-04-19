package com.ergodicity.engine.capture

import akka.actor.Actor
import akka.event.Logging
import com.ergodicity.engine.plaza2.DataStream._
import com.ergodicity.engine.plaza2.scheme.OrdLog

case class OrdersCaptureException(msg: String) extends IllegalArgumentException(msg)

class OrdersCapture extends Actor {
  val log = Logging(context.system, this)

  var count = 0;

  protected def receive = {
    case DataBegin => log.debug("Begin Orders data")
    case e@DatumDeleted(rev) => log.warning("Unexpected DatumDeleted event: " + e)
    case DataEnd => log.debug("End Orders data")
    case e@DataDeleted(replId) => throw OrdersCaptureException("Unexpected DataDeleted event: " + e)

    case DataInserted(order: OrdLog.OrdersLogRecord) =>
      count += 1
      if (count % 1000 == 0) {
        log.info("Inserted order#"+count+": " + order)
      }
  }
}