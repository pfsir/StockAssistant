package com.xy.jepackdemo.bean;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/18.
 * description
 */
public class FilterBondBean {

    /**
     * page : 1
     * rows : [{"cell":{"adj_cnt":2,"adj_scnt":"2","adjust_tip":"","apply_cd":"072807","bond_id":"128034","bond_nm":"江银转债","convert_amt_ratio":"18.5%","convert_cd":"128034","convert_cd_tip":"128034；2018-08-01 开始转股","convert_dt":"2018-08-01","convert_price":"4.680","convert_value":"93.38","curr_iss_amt":"17.582","force_redeem_price":"6.08","full_price":"108.011","fund_rt":"buy","guarantor":"无担保","increase_rt":"0.07%","issuer_rating_cd":"AA+","last_time":"14:27:09","left_put_year":"-","margin_flg":"","maturity_dt":"2024-01-26","noted":0,"orig_iss_amt":"20.000","owned":0,"pb":"0.84","pre_bond_id":"sz128034","premium_rt":"15.67%","price":"108.011","price_tips":"全价：108.011 最后更新：14:27:09","put_convert_price":"-","put_count_days":15,"put_real_days":0,"put_total_days":30,"qflag":"N","qflag2":"N","qstatus":"00","rating_cd":"AA+","ration":"1.1316","ration_cd":"082807","ration_rt":"37.000","redeem_count_days":15,"redeem_flag":"X","redeem_icon":"","redeem_inc_cpn_fl":"n","redeem_price":"106.000","redeem_price_ratio":"130.000","redeem_real_days":0,"redeem_style":"Y","redeem_total_days":30,"ref_yield_info":"","repo_discount_rt":"0.00","repo_valid":"有效期：-","short_maturity_dt":"24-01-26","sincrease_rt":"0.23%","sprice":"4.37","sqflg":"Y","stock_cd":"002807","stock_id":"sz002807","stock_net_value":"0.00","stock_nm":"江阴银行","svolume":"2414.04","total_shares":"2171980498.0","volume":"1847.99","year_left":"4.192","ytm_rt":"0.35%","ytm_rt_tax":"-0.07%"},"id":"128034"},{"cell":{"adj_cnt":0,"adj_scnt":0,"adjust_tip":"","apply_cd":"733567","bond_id":"110047","bond_nm":"山鹰转债","convert_amt_ratio":"15.9%","convert_cd":"190047","convert_cd_tip":"190047；2019-05-27 开始转股","convert_dt":"2019-05-27","convert_price":"3.340","convert_value":"94.61","curr_iss_amt":"22.995","force_redeem_price":"4.34","full_price":"109.180","fund_rt":"buy","guarantor":"无担保","increase_rt":"0.33%","issuer_rating_cd":"AA+","last_time":"14:27:03","left_put_year":"-","margin_flg":"R","maturity_dt":"2024-11-21","next_put_dt":"2022-11-21","noted":0,"orig_iss_amt":"23.000","owned":0,"pb":"1.02","pre_bond_id":"sh110047","premium_rt":"15.40%","price":"109.180","price_tips":"全价：109.180 最后更新：14:27:03","put_convert_price":"2.34","put_convert_price_ratio":"73.99","put_count_days":30,"put_inc_cpn_fl":"y","put_price":"100.000","put_real_days":0,"put_total_days":30,"qflag":"N","qflag2":"N","qstatus":"00","rating_cd":"AA+","ration":"0.5030","ration_cd":"704567","ration_rt":"14.080","redeem_count_days":15,"redeem_flag":"X","redeem_icon":"","redeem_inc_cpn_fl":"n","redeem_price":"113.000","redeem_price_ratio":"130.000","redeem_real_days":0,"redeem_style":"Y","redeem_total_days":30,"ref_yield_info":"","repo_discount_rt":"0.00","repo_valid":"有效期：-","short_maturity_dt":"24-11-21","sincrease_rt":"0.32%","sprice":"3.16","sqflg":"Y","stock_cd":"600567","stock_id":"sh600567","stock_net_value":"0.00","stock_nm":"山鹰纸业","svolume":"5406.35","total_shares":"4584711167.0","volume":"229.59","year_left":"5.014","ytm_rt":"1.68%","ytm_rt_tax":"1.02%"},"id":"110047"}]
     * total : 2
     */

    private int page;
    private int total;
    private List<RowsBean> rows;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean {
        /**
         * cell : {"adj_cnt":2,"adj_scnt":"2","adjust_tip":"","apply_cd":"072807","bond_id":"128034","bond_nm":"江银转债","convert_amt_ratio":"18.5%","convert_cd":"128034","convert_cd_tip":"128034；2018-08-01 开始转股","convert_dt":"2018-08-01","convert_price":"4.680","convert_value":"93.38","curr_iss_amt":"17.582","force_redeem_price":"6.08","full_price":"108.011","fund_rt":"buy","guarantor":"无担保","increase_rt":"0.07%","issuer_rating_cd":"AA+","last_time":"14:27:09","left_put_year":"-","margin_flg":"","maturity_dt":"2024-01-26","noted":0,"orig_iss_amt":"20.000","owned":0,"pb":"0.84","pre_bond_id":"sz128034","premium_rt":"15.67%","price":"108.011","price_tips":"全价：108.011 最后更新：14:27:09","put_convert_price":"-","put_count_days":15,"put_real_days":0,"put_total_days":30,"qflag":"N","qflag2":"N","qstatus":"00","rating_cd":"AA+","ration":"1.1316","ration_cd":"082807","ration_rt":"37.000","redeem_count_days":15,"redeem_flag":"X","redeem_icon":"","redeem_inc_cpn_fl":"n","redeem_price":"106.000","redeem_price_ratio":"130.000","redeem_real_days":0,"redeem_style":"Y","redeem_total_days":30,"ref_yield_info":"","repo_discount_rt":"0.00","repo_valid":"有效期：-","short_maturity_dt":"24-01-26","sincrease_rt":"0.23%","sprice":"4.37","sqflg":"Y","stock_cd":"002807","stock_id":"sz002807","stock_net_value":"0.00","stock_nm":"江阴银行","svolume":"2414.04","total_shares":"2171980498.0","volume":"1847.99","year_left":"4.192","ytm_rt":"0.35%","ytm_rt_tax":"-0.07%"}
         * id : 128034
         */

        private CellBean cell;
        private String id;

        public CellBean getCell() {
            return cell;
        }

        public void setCell(CellBean cell) {
            this.cell = cell;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class CellBean implements Comparable<CellBean> {
            /**
             * adj_cnt : 2
             * adj_scnt : 2
             * adjust_tip :
             * apply_cd : 072807
             * bond_id : 128034
             * bond_nm : 江银转债
             * convert_amt_ratio : 18.5%
             * convert_cd : 128034
             * convert_cd_tip : 128034；2018-08-01 开始转股
             * convert_dt : 2018-08-01
             * convert_price : 4.680
             * convert_value : 93.38
             * curr_iss_amt : 17.582
             * force_redeem_price : 6.08
             * full_price : 108.011
             * fund_rt : buy
             * guarantor : 无担保
             * increase_rt : 0.07%
             * issuer_rating_cd : AA+
             * last_time : 14:27:09
             * left_put_year : -
             * margin_flg :
             * maturity_dt : 2024-01-26
             * noted : 0
             * orig_iss_amt : 20.000
             * owned : 0
             * pb : 0.84
             * pre_bond_id : sz128034
             * premium_rt : 15.67%
             * price : 108.011
             * price_tips : 全价：108.011 最后更新：14:27:09
             * put_convert_price : -
             * put_count_days : 15
             * put_real_days : 0
             * put_total_days : 30
             * qflag : N
             * qflag2 : N
             * qstatus : 00
             * rating_cd : AA+
             * ration : 1.1316
             * ration_cd : 082807
             * ration_rt : 37.000
             * redeem_count_days : 15
             * redeem_flag : X
             * redeem_icon :
             * redeem_inc_cpn_fl : n
             * redeem_price : 106.000
             * redeem_price_ratio : 130.000
             * redeem_real_days : 0
             * redeem_style : Y
             * redeem_total_days : 30
             * ref_yield_info :
             * repo_discount_rt : 0.00
             * repo_valid : 有效期：-
             * short_maturity_dt : 24-01-26
             * sincrease_rt : 0.23%
             * sprice : 4.37
             * sqflg : Y
             * stock_cd : 002807
             * stock_id : sz002807
             * stock_net_value : 0.00
             * stock_nm : 江阴银行
             * svolume : 2414.04
             * total_shares : 2171980498.0
             * volume : 1847.99
             * year_left : 4.192
             * ytm_rt : 0.35%
             * ytm_rt_tax : -0.07%
             */

            private int adj_cnt;
            private String adj_scnt;
            private String adjust_tip;
            private String apply_cd;
            private String bond_id;
            private String bond_nm;
            private String convert_amt_ratio;
            private String convert_cd;
            private String convert_cd_tip;
            private String convert_dt;
            private String convert_price;
            private String convert_value;
            private String curr_iss_amt;
            private String force_redeem_price;
            private String full_price;
            private String fund_rt;
            private String guarantor;
            private String increase_rt;
            private String issuer_rating_cd;
            private String last_time;
            private String left_put_year;
            private String margin_flg;
            private String maturity_dt;
            private int noted;
            private String orig_iss_amt;
            private int owned;
            private String pb;
            private String pre_bond_id;
            private String premium_rt;
            private String price;
            private String price_tips;
            private String put_convert_price;
            private int put_count_days;
            private int put_real_days;
            private int put_total_days;
            private String qflag;
            private String qflag2;
            private String qstatus;
            private String rating_cd;
            private String ration;
            private String ration_cd;
            private String ration_rt;
            private int redeem_count_days;
            private String redeem_flag;
            private String redeem_icon;
            private String redeem_inc_cpn_fl;
            private String redeem_price;
            private String redeem_price_ratio;
            private int redeem_real_days;
            private String redeem_style;
            private int redeem_total_days;
            private String ref_yield_info;
            private String repo_discount_rt;
            private String repo_valid;
            private String short_maturity_dt;
            private String sincrease_rt;
            private String sprice;
            private String sqflg;
            private String stock_cd;
            private String stock_id;
            private String stock_net_value;
            private String stock_nm;
            private String svolume;
            private String total_shares;
            private String volume;
            private String year_left;
            private String ytm_rt;
            private String ytm_rt_tax;
            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getAdj_cnt() {
                return adj_cnt;
            }

            public void setAdj_cnt(int adj_cnt) {
                this.adj_cnt = adj_cnt;
            }

            public String getAdj_scnt() {
                return adj_scnt;
            }

            public void setAdj_scnt(String adj_scnt) {
                this.adj_scnt = adj_scnt;
            }

            public String getAdjust_tip() {
                return adjust_tip;
            }

            public void setAdjust_tip(String adjust_tip) {
                this.adjust_tip = adjust_tip;
            }

            public String getApply_cd() {
                return apply_cd;
            }

            public void setApply_cd(String apply_cd) {
                this.apply_cd = apply_cd;
            }

            public String getBond_id() {
                return bond_id;
            }

            public void setBond_id(String bond_id) {
                this.bond_id = bond_id;
            }

            public String getBond_nm() {
                return bond_nm;
            }

            public void setBond_nm(String bond_nm) {
                this.bond_nm = bond_nm;
            }

            public String getConvert_amt_ratio() {
                return convert_amt_ratio;
            }

            public void setConvert_amt_ratio(String convert_amt_ratio) {
                this.convert_amt_ratio = convert_amt_ratio;
            }

            public String getConvert_cd() {
                return convert_cd;
            }

            public void setConvert_cd(String convert_cd) {
                this.convert_cd = convert_cd;
            }

            public String getConvert_cd_tip() {
                return convert_cd_tip;
            }

            public void setConvert_cd_tip(String convert_cd_tip) {
                this.convert_cd_tip = convert_cd_tip;
            }

            public String getConvert_dt() {
                return convert_dt;
            }

            public void setConvert_dt(String convert_dt) {
                this.convert_dt = convert_dt;
            }

            public String getConvert_price() {
                return convert_price;
            }

            public void setConvert_price(String convert_price) {
                this.convert_price = convert_price;
            }

            public String getConvert_value() {
                return convert_value;
            }

            public void setConvert_value(String convert_value) {
                this.convert_value = convert_value;
            }

            public String getCurr_iss_amt() {
                return curr_iss_amt;
            }

            public void setCurr_iss_amt(String curr_iss_amt) {
                this.curr_iss_amt = curr_iss_amt;
            }

            public String getForce_redeem_price() {
                return force_redeem_price;
            }

            public void setForce_redeem_price(String force_redeem_price) {
                this.force_redeem_price = force_redeem_price;
            }

            public String getFull_price() {
                return full_price;
            }

            public void setFull_price(String full_price) {
                this.full_price = full_price;
            }

            public String getFund_rt() {
                return fund_rt;
            }

            public void setFund_rt(String fund_rt) {
                this.fund_rt = fund_rt;
            }

            public String getGuarantor() {
                return guarantor;
            }

            public void setGuarantor(String guarantor) {
                this.guarantor = guarantor;
            }

            public String getIncrease_rt() {
                return increase_rt;
            }

            public void setIncrease_rt(String increase_rt) {
                this.increase_rt = increase_rt;
            }

            public String getIssuer_rating_cd() {
                return issuer_rating_cd;
            }

            public void setIssuer_rating_cd(String issuer_rating_cd) {
                this.issuer_rating_cd = issuer_rating_cd;
            }

            public String getLast_time() {
                return last_time;
            }

            public void setLast_time(String last_time) {
                this.last_time = last_time;
            }

            public String getLeft_put_year() {
                return left_put_year;
            }

            public void setLeft_put_year(String left_put_year) {
                this.left_put_year = left_put_year;
            }

            public String getMargin_flg() {
                return margin_flg;
            }

            public void setMargin_flg(String margin_flg) {
                this.margin_flg = margin_flg;
            }

            public String getMaturity_dt() {
                return maturity_dt;
            }

            public void setMaturity_dt(String maturity_dt) {
                this.maturity_dt = maturity_dt;
            }

            public int getNoted() {
                return noted;
            }

            public void setNoted(int noted) {
                this.noted = noted;
            }

            public String getOrig_iss_amt() {
                return orig_iss_amt;
            }

            public void setOrig_iss_amt(String orig_iss_amt) {
                this.orig_iss_amt = orig_iss_amt;
            }

            public int getOwned() {
                return owned;
            }

            public void setOwned(int owned) {
                this.owned = owned;
            }

            public String getPb() {
                return pb;
            }

            public void setPb(String pb) {
                this.pb = pb;
            }

            public String getPre_bond_id() {
                return pre_bond_id;
            }

            public void setPre_bond_id(String pre_bond_id) {
                this.pre_bond_id = pre_bond_id;
            }

            public String getPremium_rt() {
                return premium_rt;
            }

            public void setPremium_rt(String premium_rt) {
                this.premium_rt = premium_rt;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getPrice_tips() {
                return price_tips;
            }

            public void setPrice_tips(String price_tips) {
                this.price_tips = price_tips;
            }

            public String getPut_convert_price() {
                return put_convert_price;
            }

            public void setPut_convert_price(String put_convert_price) {
                this.put_convert_price = put_convert_price;
            }

            public int getPut_count_days() {
                return put_count_days;
            }

            public void setPut_count_days(int put_count_days) {
                this.put_count_days = put_count_days;
            }

            public int getPut_real_days() {
                return put_real_days;
            }

            public void setPut_real_days(int put_real_days) {
                this.put_real_days = put_real_days;
            }

            public int getPut_total_days() {
                return put_total_days;
            }

            public void setPut_total_days(int put_total_days) {
                this.put_total_days = put_total_days;
            }

            public String getQflag() {
                return qflag;
            }

            public void setQflag(String qflag) {
                this.qflag = qflag;
            }

            public String getQflag2() {
                return qflag2;
            }

            public void setQflag2(String qflag2) {
                this.qflag2 = qflag2;
            }

            public String getQstatus() {
                return qstatus;
            }

            public void setQstatus(String qstatus) {
                this.qstatus = qstatus;
            }

            public String getRating_cd() {
                return rating_cd;
            }

            public void setRating_cd(String rating_cd) {
                this.rating_cd = rating_cd;
            }

            public String getRation() {
                return ration;
            }

            public void setRation(String ration) {
                this.ration = ration;
            }

            public String getRation_cd() {
                return ration_cd;
            }

            public void setRation_cd(String ration_cd) {
                this.ration_cd = ration_cd;
            }

            public String getRation_rt() {
                return ration_rt;
            }

            public void setRation_rt(String ration_rt) {
                this.ration_rt = ration_rt;
            }

            public int getRedeem_count_days() {
                return redeem_count_days;
            }

            public void setRedeem_count_days(int redeem_count_days) {
                this.redeem_count_days = redeem_count_days;
            }

            public String getRedeem_flag() {
                return redeem_flag;
            }

            public void setRedeem_flag(String redeem_flag) {
                this.redeem_flag = redeem_flag;
            }

            public String getRedeem_icon() {
                return redeem_icon;
            }

            public void setRedeem_icon(String redeem_icon) {
                this.redeem_icon = redeem_icon;
            }

            public String getRedeem_inc_cpn_fl() {
                return redeem_inc_cpn_fl;
            }

            public void setRedeem_inc_cpn_fl(String redeem_inc_cpn_fl) {
                this.redeem_inc_cpn_fl = redeem_inc_cpn_fl;
            }

            public String getRedeem_price() {
                return redeem_price;
            }

            public void setRedeem_price(String redeem_price) {
                this.redeem_price = redeem_price;
            }

            public String getRedeem_price_ratio() {
                return redeem_price_ratio;
            }

            public void setRedeem_price_ratio(String redeem_price_ratio) {
                this.redeem_price_ratio = redeem_price_ratio;
            }

            public int getRedeem_real_days() {
                return redeem_real_days;
            }

            public void setRedeem_real_days(int redeem_real_days) {
                this.redeem_real_days = redeem_real_days;
            }

            public String getRedeem_style() {
                return redeem_style;
            }

            public void setRedeem_style(String redeem_style) {
                this.redeem_style = redeem_style;
            }

            public int getRedeem_total_days() {
                return redeem_total_days;
            }

            public void setRedeem_total_days(int redeem_total_days) {
                this.redeem_total_days = redeem_total_days;
            }

            public String getRef_yield_info() {
                return ref_yield_info;
            }

            public void setRef_yield_info(String ref_yield_info) {
                this.ref_yield_info = ref_yield_info;
            }

            public String getRepo_discount_rt() {
                return repo_discount_rt;
            }

            public void setRepo_discount_rt(String repo_discount_rt) {
                this.repo_discount_rt = repo_discount_rt;
            }

            public String getRepo_valid() {
                return repo_valid;
            }

            public void setRepo_valid(String repo_valid) {
                this.repo_valid = repo_valid;
            }

            public String getShort_maturity_dt() {
                return short_maturity_dt;
            }

            public void setShort_maturity_dt(String short_maturity_dt) {
                this.short_maturity_dt = short_maturity_dt;
            }

            public String getSincrease_rt() {
                return sincrease_rt;
            }

            public void setSincrease_rt(String sincrease_rt) {
                this.sincrease_rt = sincrease_rt;
            }

            public String getSprice() {
                return sprice;
            }

            public void setSprice(String sprice) {
                this.sprice = sprice;
            }

            public String getSqflg() {
                return sqflg;
            }

            public void setSqflg(String sqflg) {
                this.sqflg = sqflg;
            }

            public String getStock_cd() {
                return stock_cd;
            }

            public void setStock_cd(String stock_cd) {
                this.stock_cd = stock_cd;
            }

            public String getStock_id() {
                return stock_id;
            }

            public void setStock_id(String stock_id) {
                this.stock_id = stock_id;
            }

            public String getStock_net_value() {
                return stock_net_value;
            }

            public void setStock_net_value(String stock_net_value) {
                this.stock_net_value = stock_net_value;
            }

            public String getStock_nm() {
                return stock_nm;
            }

            public void setStock_nm(String stock_nm) {
                this.stock_nm = stock_nm;
            }

            public String getSvolume() {
                return svolume;
            }

            public void setSvolume(String svolume) {
                this.svolume = svolume;
            }

            public String getTotal_shares() {
                return total_shares;
            }

            public void setTotal_shares(String total_shares) {
                this.total_shares = total_shares;
            }

            public String getVolume() {
                return volume;
            }

            public void setVolume(String volume) {
                this.volume = volume;
            }

            public String getYear_left() {
                return year_left;
            }

            public void setYear_left(String year_left) {
                this.year_left = year_left;
            }

            public String getYtm_rt() {
                return ytm_rt;
            }

            public void setYtm_rt(String ytm_rt) {
                this.ytm_rt = ytm_rt;
            }

            public String getYtm_rt_tax() {
                return ytm_rt_tax;
            }

            public void setYtm_rt_tax(String ytm_rt_tax) {
                this.ytm_rt_tax = ytm_rt_tax;
            }


            @Override
            public int compareTo(CellBean o) {
                String oPremiumRt = o.getYtm_rt_tax().replace("%", "");
                String tPremiumRt = this.getYtm_rt_tax().replace("%", "");
                Double doPremiumRt = Double.valueOf(oPremiumRt);
                Double dtPremiumRt = Double.valueOf(tPremiumRt);
                return (int) ((doPremiumRt - dtPremiumRt) * 100);
            }
        }

    }
}
