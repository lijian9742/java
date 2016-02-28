package com.ergodicity.cgate.scheme;

public final class OrdLog
{


// ------------------------------------------
// Scheme "CustReplScheme"
// ------------------------------------------

    public static final class orders_log
    {
        public static final int TABLE_INDEX = 0;
        
	public static final int MSG_SIZE = 100;
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

        
    
        public long get_moment() {
            data.position(36);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_moment(long val) {
            data.position(36);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public int get_status() {
            data.position(48);
            return data.getInt();
        }

        public void set_status(int val) {
            data.position(48);
            data.putInt(val);
        }

        
    
        public byte get_action() {
            data.position(52);
            return data.get();
        }

        public void set_action(byte val) {
            data.position(52);
            data.put(val);
        }

        
    
        public int get_isin_id() {
            data.position(56);
            return data.getInt();
        }

        public void set_isin_id(int val) {
            data.position(56);
            data.putInt(val);
        }

        
    
        public byte get_dir() {
            data.position(60);
            return data.get();
        }

        public void set_dir(byte val) {
            data.position(60);
            data.put(val);
        }

        
    
        public java.math.BigDecimal get_price() {
            data.position(61);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_price(java.math.BigDecimal val) {
            data.position(61);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_price_scale() {
            data.position(61);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public int get_amount() {
            data.position(72);
            return data.getInt();
        }

        public void set_amount(int val) {
            data.position(72);
            data.putInt(val);
        }

        
    
        public int get_amount_rest() {
            data.position(76);
            return data.getInt();
        }

        public void set_amount_rest(int val) {
            data.position(76);
            data.putInt(val);
        }

        
    
        public long get_id_deal() {
            data.position(80);
            return data.getLong();
        }

        public void set_id_deal(long val) {
            data.position(80);
            data.putLong(val);
        }

        
    
        public java.math.BigDecimal get_deal_price() {
            data.position(88);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_deal_price(java.math.BigDecimal val) {
            data.position(88);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_deal_price_scale() {
            data.position(88);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    


    }

}

