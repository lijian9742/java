package com.ergodicity.cgate.scheme;

public final class OptInfo
{


// ------------------------------------------
// Scheme "CustReplScheme"
// ------------------------------------------

    public static final class opt_sess_contents
    {
        public static final int TABLE_INDEX = 0;
        
	public static final int MSG_SIZE = 368;
        private java.nio.ByteBuffer data;

        public opt_sess_contents() {
            
        }

        public opt_sess_contents(java.nio.ByteBuffer data) {
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

        
    
        public int get_sess_id() {
            data.position(24);
            return data.getInt();
        }

        public void set_sess_id(int val) {
            data.position(24);
            data.putInt(val);
        }

        
    
        public int get_isin_id() {
            data.position(28);
            return data.getInt();
        }

        public void set_isin_id(int val) {
            data.position(28);
            data.putInt(val);
        }

        
    
        public String get_isin() {
            data.position(32);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 25);
        }

        public void set_isin(String val) {
            data.position(32);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 25);
        }

        
    
        public String get_short_isin() {
            data.position(58);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 25);
        }

        public void set_short_isin(String val) {
            data.position(58);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 25);
        }

        
    
        public String get_name() {
            data.position(84);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 75);
        }

        public void set_name(String val) {
            data.position(84);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 75);
        }

        
    
        public String get_code_vcb() {
            data.position(160);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 25);
        }

        public void set_code_vcb(String val) {
            data.position(160);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 25);
        }

        
    
        public int get_fut_isin_id() {
            data.position(188);
            return data.getInt();
        }

        public void set_fut_isin_id(int val) {
            data.position(188);
            data.putInt(val);
        }

        
    
        public byte get_is_limited() {
            data.position(192);
            return data.get();
        }

        public void set_is_limited(byte val) {
            data.position(192);
            data.put(val);
        }

        
    
        public java.math.BigDecimal get_limit_up() {
            data.position(193);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_limit_up(java.math.BigDecimal val) {
            data.position(193);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_limit_up_scale() {
            data.position(193);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_limit_down() {
            data.position(204);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_limit_down(java.math.BigDecimal val) {
            data.position(204);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_limit_down_scale() {
            data.position(204);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_old_kotir() {
            data.position(215);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_old_kotir(java.math.BigDecimal val) {
            data.position(215);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_old_kotir_scale() {
            data.position(215);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_bgo_c() {
            data.position(226);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_bgo_c(java.math.BigDecimal val) {
            data.position(226);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.2", val);
        }

        
        public byte get_bgo_c_scale() {
            data.position(226);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_bgo_nc() {
            data.position(236);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_bgo_nc(java.math.BigDecimal val) {
            data.position(236);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.2", val);
        }

        
        public byte get_bgo_nc_scale() {
            data.position(236);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public byte get_europe() {
            data.position(246);
            return data.get();
        }

        public void set_europe(byte val) {
            data.position(246);
            data.put(val);
        }

        
    
        public byte get_put() {
            data.position(247);
            return data.get();
        }

        public void set_put(byte val) {
            data.position(247);
            data.put(val);
        }

        
    
        public java.math.BigDecimal get_strike() {
            data.position(248);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_strike(java.math.BigDecimal val) {
            data.position(248);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_strike_scale() {
            data.position(248);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public int get_roundto() {
            data.position(260);
            return data.getInt();
        }

        public void set_roundto(int val) {
            data.position(260);
            data.putInt(val);
        }

        
    
        public java.math.BigDecimal get_min_step() {
            data.position(264);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_min_step(java.math.BigDecimal val) {
            data.position(264);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_min_step_scale() {
            data.position(264);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public int get_lot_volume() {
            data.position(276);
            return data.getInt();
        }

        public void set_lot_volume(int val) {
            data.position(276);
            data.putInt(val);
        }

        
    
        public java.math.BigDecimal get_step_price() {
            data.position(280);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_step_price(java.math.BigDecimal val) {
            data.position(280);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_step_price_scale() {
            data.position(280);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public long get_d_pg() {
            data.position(292);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_d_pg(long val) {
            data.position(292);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_d_exec_beg() {
            data.position(302);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_d_exec_beg(long val) {
            data.position(302);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_d_exec_end() {
            data.position(312);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_d_exec_end(long val) {
            data.position(312);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public int get_signs() {
            data.position(324);
            return data.getInt();
        }

        public void set_signs(int val) {
            data.position(324);
            data.putInt(val);
        }

        
    
        public java.math.BigDecimal get_last_cl_quote() {
            data.position(328);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_last_cl_quote(java.math.BigDecimal val) {
            data.position(328);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_last_cl_quote_scale() {
            data.position(328);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_bgo_buy() {
            data.position(339);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_bgo_buy(java.math.BigDecimal val) {
            data.position(339);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.2", val);
        }

        
        public byte get_bgo_buy_scale() {
            data.position(339);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public int get_base_isin_id() {
            data.position(352);
            return data.getInt();
        }

        public void set_base_isin_id(int val) {
            data.position(352);
            data.putInt(val);
        }

        
    
        public long get_d_start() {
            data.position(356);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_d_start(long val) {
            data.position(356);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    


    }

    public static final class sys_events
    {
        public static final int TABLE_INDEX = 1;
        
	public static final int MSG_SIZE = 108;
        private java.nio.ByteBuffer data;

        public sys_events() {
            
        }

        public sys_events(java.nio.ByteBuffer data) {
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

        
    
        public long get_event_id() {
            data.position(24);
            return data.getLong();
        }

        public void set_event_id(long val) {
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

        
    
        public int get_event_type() {
            data.position(36);
            return data.getInt();
        }

        public void set_event_type(int val) {
            data.position(36);
            data.putInt(val);
        }

        
    
        public String get_message() {
            data.position(40);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 64);
        }

        public void set_message(String val) {
            data.position(40);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 64);
        }

        
    


    }

}

