package com.ergodicity.cgate.scheme;

public final class FutInfo
{


// ------------------------------------------
// Scheme "CustReplScheme"
// ------------------------------------------

    public static final class session
    {
        public static final int TABLE_INDEX = 0;
        
	public static final int MSG_SIZE = 144;
        private java.nio.ByteBuffer data;

        public session() {
            
        }

        public session(java.nio.ByteBuffer data) {
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

        
    
        public long get_begin() {
            data.position(28);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_begin(long val) {
            data.position(28);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_end() {
            data.position(38);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_end(long val) {
            data.position(38);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public int get_state() {
            data.position(48);
            return data.getInt();
        }

        public void set_state(int val) {
            data.position(48);
            data.putInt(val);
        }

        
    
        public int get_opt_sess_id() {
            data.position(52);
            return data.getInt();
        }

        public void set_opt_sess_id(int val) {
            data.position(52);
            data.putInt(val);
        }

        
    
        public long get_inter_cl_begin() {
            data.position(56);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_inter_cl_begin(long val) {
            data.position(56);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_inter_cl_end() {
            data.position(66);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_inter_cl_end(long val) {
            data.position(66);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public int get_inter_cl_state() {
            data.position(76);
            return data.getInt();
        }

        public void set_inter_cl_state(int val) {
            data.position(76);
            data.putInt(val);
        }

        
    
        public byte get_eve_on() {
            data.position(80);
            return data.get();
        }

        public void set_eve_on(byte val) {
            data.position(80);
            data.put(val);
        }

        
    
        public long get_eve_begin() {
            data.position(82);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_eve_begin(long val) {
            data.position(82);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_eve_end() {
            data.position(92);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_eve_end(long val) {
            data.position(92);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public byte get_mon_on() {
            data.position(102);
            return data.get();
        }

        public void set_mon_on(byte val) {
            data.position(102);
            data.put(val);
        }

        
    
        public long get_mon_begin() {
            data.position(104);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_mon_begin(long val) {
            data.position(104);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_mon_end() {
            data.position(114);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_mon_end(long val) {
            data.position(114);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_pos_transfer_begin() {
            data.position(124);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_pos_transfer_begin(long val) {
            data.position(124);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public long get_pos_transfer_end() {
            data.position(134);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_pos_transfer_end(long val) {
            data.position(134);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    


    }

    public static final class fut_sess_contents
    {
        public static final int TABLE_INDEX = 1;
        
	public static final int MSG_SIZE = 396;
        private java.nio.ByteBuffer data;

        public fut_sess_contents() {
            
        }

        public fut_sess_contents(java.nio.ByteBuffer data) {
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

        
    
        public String get_short_isin() {
            data.position(32);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 25);
        }

        public void set_short_isin(String val) {
            data.position(32);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 25);
        }

        
    
        public String get_isin() {
            data.position(58);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 25);
        }

        public void set_isin(String val) {
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

        
    
        public int get_inst_term() {
            data.position(160);
            return data.getInt();
        }

        public void set_inst_term(int val) {
            data.position(160);
            data.putInt(val);
        }

        
    
        public String get_code_vcb() {
            data.position(164);
            return ru.micexrts.cgate.P2TypeParser.parseCXX(data, 25);
        }

        public void set_code_vcb(String val) {
            data.position(164);
            ru.micexrts.cgate.P2TypeComposer.composeCXX(data, val, 25);
        }

        
    
        public byte get_is_limited() {
            data.position(190);
            return data.get();
        }

        public void set_is_limited(byte val) {
            data.position(190);
            data.put(val);
        }

        
    
        public java.math.BigDecimal get_limit_up() {
            data.position(191);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_limit_up(java.math.BigDecimal val) {
            data.position(191);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_limit_up_scale() {
            data.position(191);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_limit_down() {
            data.position(202);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_limit_down(java.math.BigDecimal val) {
            data.position(202);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_limit_down_scale() {
            data.position(202);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_old_kotir() {
            data.position(213);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_old_kotir(java.math.BigDecimal val) {
            data.position(213);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_old_kotir_scale() {
            data.position(213);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_buy_deposit() {
            data.position(224);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_buy_deposit(java.math.BigDecimal val) {
            data.position(224);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.2", val);
        }

        
        public byte get_buy_deposit_scale() {
            data.position(224);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_sell_deposit() {
            data.position(234);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_sell_deposit(java.math.BigDecimal val) {
            data.position(234);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.2", val);
        }

        
        public byte get_sell_deposit_scale() {
            data.position(234);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public int get_roundto() {
            data.position(244);
            return data.getInt();
        }

        public void set_roundto(int val) {
            data.position(244);
            data.putInt(val);
        }

        
    
        public java.math.BigDecimal get_min_step() {
            data.position(248);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_min_step(java.math.BigDecimal val) {
            data.position(248);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_min_step_scale() {
            data.position(248);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public int get_lot_volume() {
            data.position(260);
            return data.getInt();
        }

        public void set_lot_volume(int val) {
            data.position(260);
            data.putInt(val);
        }

        
    
        public java.math.BigDecimal get_step_price() {
            data.position(264);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_step_price(java.math.BigDecimal val) {
            data.position(264);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_step_price_scale() {
            data.position(264);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public long get_d_pg() {
            data.position(276);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_d_pg(long val) {
            data.position(276);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public byte get_is_spread() {
            data.position(286);
            return data.get();
        }

        public void set_is_spread(byte val) {
            data.position(286);
            data.put(val);
        }

        
    
        public java.math.BigDecimal get_coeff() {
            data.position(287);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_coeff(java.math.BigDecimal val) {
            data.position(287);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d9.6", val);
        }

        
        public byte get_coeff_scale() {
            data.position(287);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public long get_d_exp() {
            data.position(294);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_d_exp(long val) {
            data.position(294);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    
        public byte get_is_percent() {
            data.position(304);
            return data.get();
        }

        public void set_is_percent(byte val) {
            data.position(304);
            data.put(val);
        }

        
    
        public java.math.BigDecimal get_percent_rate() {
            data.position(305);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_percent_rate(java.math.BigDecimal val) {
            data.position(305);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d6.2", val);
        }

        
        public byte get_percent_rate_scale() {
            data.position(305);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_last_cl_quote() {
            data.position(310);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_last_cl_quote(java.math.BigDecimal val) {
            data.position(310);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_last_cl_quote_scale() {
            data.position(310);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public int get_signs() {
            data.position(324);
            return data.getInt();
        }

        public void set_signs(int val) {
            data.position(324);
            data.putInt(val);
        }

        
    
        public byte get_is_trade_evening() {
            data.position(328);
            return data.get();
        }

        public void set_is_trade_evening(byte val) {
            data.position(328);
            data.put(val);
        }

        
    
        public int get_ticker() {
            data.position(332);
            return data.getInt();
        }

        public void set_ticker(int val) {
            data.position(332);
            data.putInt(val);
        }

        
    
        public int get_state() {
            data.position(336);
            return data.getInt();
        }

        public void set_state(int val) {
            data.position(336);
            data.putInt(val);
        }

        
    
        public byte get_price_dir() {
            data.position(340);
            return data.get();
        }

        public void set_price_dir(byte val) {
            data.position(340);
            data.put(val);
        }

        
    
        public int get_multileg_type() {
            data.position(344);
            return data.getInt();
        }

        public void set_multileg_type(int val) {
            data.position(344);
            data.putInt(val);
        }

        
    
        public int get_legs_qty() {
            data.position(348);
            return data.getInt();
        }

        public void set_legs_qty(int val) {
            data.position(348);
            data.putInt(val);
        }

        
    
        public java.math.BigDecimal get_step_price_clr() {
            data.position(352);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_step_price_clr(java.math.BigDecimal val) {
            data.position(352);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_step_price_clr_scale() {
            data.position(352);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_step_price_interclr() {
            data.position(363);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_step_price_interclr(java.math.BigDecimal val) {
            data.position(363);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_step_price_interclr_scale() {
            data.position(363);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public java.math.BigDecimal get_step_price_curr() {
            data.position(374);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsBigDecimal(data);
        }

        public void set_step_price_curr(java.math.BigDecimal val) {
            data.position(374);
            ru.micexrts.cgate.P2TypeComposer.composeBigDecimalAsBCD(data, "d16.5", val);
        }

        
        public byte get_step_price_curr_scale() {
            data.position(374);
            return ru.micexrts.cgate.P2TypeParser.parseBCDAsScale(data);
        }
        
    
        public long get_d_start() {
            data.position(386);
            return ru.micexrts.cgate.P2TypeParser.parseTimeAsLong(data);
        }

        public void set_d_start(long val) {
            data.position(386);
            ru.micexrts.cgate.P2TypeComposer.composeLongAsTime(data, val);
        }

        
    


    }

    public static final class sys_events
    {
        public static final int TABLE_INDEX = 2;
        
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

