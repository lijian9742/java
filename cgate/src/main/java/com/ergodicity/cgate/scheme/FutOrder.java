package com.ergodicity.cgate.scheme;

public final class FutOrder
{


// ------------------------------------------
// Scheme "CustReplScheme"
// ------------------------------------------

    public static final class orders_log
    {
        public static final int TABLE_INDEX = 0;
        
	    public static final int MSG_SIZE = 212;
        private java.nio.ByteBuffer data;

        public orders_log() {
            
        }

        public orders_log(java.nio.ByteBuffer data) {
            this.data = data;
        }

        public java.nio.ByteBuffer getData() {
            return data;
        }

        public void setData(java.nio.ByteBuffer data) {
            this.data = data;
        }

    
        public long get_replID() {
            data.position(0);
            return data.getLong();
        }

        public void set_replID(long val) {
            data.position(0);
            data.putLong(val);
        }

        
    
        public long get_replRev() {
            data.position(8);
            return data.getLong();
        }

        public void set_replRev(long val) {
            data.position(8);
            data.putLong(val);
        }

        
    
        public long get_replAct() {
            data.position(16);
            return data.getLong();
        }

        public void set_replAct(long val) {
            data.position(16);
            data.putLong(val);
        }

        
    
        public long get_id_ord() {
            data.position(24);
            return data.getLong();
        }

        public void set_id_ord(long val) {
            data.position(24);
            data.putLong(val);
        }

        
    
        public int get_sess_id() {
            data.position(32);
            return data.getInt();
        }

        public void set_sess_id(int val) {
            data.position(32);
            data.putInt(val);
        }

        
    
        public String get_client_code() {
            data.position(36);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 7);
        }

        public void set_client_code(String val) {
            data.position(36);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 7);
        }

        
    
        public long get_moment() {
            data.position(44);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_moment(long val) {
            data.position(44);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public int get_status() {
            data.position(56);
            return data.getInt();
        }

        public void set_status(int val) {
            data.position(56);
            data.putInt(val);
        }

        
    
        public byte get_action() {
            data.position(60);
            return data.get();
        }

        public void set_action(byte val) {
            data.position(60);
            data.put(val);
        }

        
    
        public int get_isin_id() {
            data.position(64);
            return data.getInt();
        }

        public void set_isin_id(int val) {
            data.position(64);
            data.putInt(val);
        }

        
    
        public byte get_dir() {
            data.position(68);
            return data.get();
        }

        public void set_dir(byte val) {
            data.position(68);
            data.put(val);
        }

        
    
        public java.math.BigDecimal get_price() {
            data.position(69);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_price(java.math.BigDecimal val) {
            data.position(69);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_price_scale() {
            data.position(69);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public int get_amount() {
            data.position(80);
            return data.getInt();
        }

        public void set_amount(int val) {
            data.position(80);
            data.putInt(val);
        }

        
    
        public int get_amount_rest() {
            data.position(84);
            return data.getInt();
        }

        public void set_amount_rest(int val) {
            data.position(84);
            data.putInt(val);
        }

        
    
        public String get_comment() {
            data.position(88);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 20);
        }

        public void set_comment(String val) {
            data.position(88);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 20);
        }

        
    
        public byte get_hedge() {
            data.position(109);
            return data.get();
        }

        public void set_hedge(byte val) {
            data.position(109);
            data.put(val);
        }

        
    
        public byte get_trust() {
            data.position(110);
            return data.get();
        }

        public void set_trust(byte val) {
            data.position(110);
            data.put(val);
        }

        
    
        public int get_ext_id() {
            data.position(112);
            return data.getInt();
        }

        public void set_ext_id(int val) {
            data.position(112);
            data.putInt(val);
        }

        
    
        public String get_login_from() {
            data.position(116);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 20);
        }

        public void set_login_from(String val) {
            data.position(116);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 20);
        }

        
    
        public String get_broker_to() {
            data.position(137);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 7);
        }

        public void set_broker_to(String val) {
            data.position(137);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 7);
        }

        
    
        public String get_broker_to_rts() {
            data.position(145);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 7);
        }

        public void set_broker_to_rts(String val) {
            data.position(145);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 7);
        }

        
    
        public long get_date_exp() {
            data.position(154);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_date_exp(long val) {
            data.position(154);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_id_ord1() {
            data.position(164);
            return data.getLong();
        }

        public void set_id_ord1(long val) {
            data.position(164);
            data.putLong(val);
        }

        
    
        public String get_broker_from_rts() {
            data.position(172);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 7);
        }

        public void set_broker_from_rts(String val) {
            data.position(172);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 7);
        }

        
    
        public long get_id_deal() {
            data.position(180);
            return data.getLong();
        }

        public void set_id_deal(long val) {
            data.position(180);
            data.putLong(val);
        }

        
    
        public java.math.BigDecimal get_deal_price() {
            data.position(188);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_deal_price(java.math.BigDecimal val) {
            data.position(188);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_deal_price_scale() {
            data.position(188);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public long get_local_stamp() {
            data.position(200);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_local_stamp(long val) {
            data.position(200);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    


    }

}

