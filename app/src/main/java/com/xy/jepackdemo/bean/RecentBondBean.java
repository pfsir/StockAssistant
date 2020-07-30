package com.xy.jepackdemo.bean;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description
 */
public class RecentBondBean {
    private int page;
    private List<RowsBean> rows;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean {
        /**
         * cell : {"amount":"500.00","ap_flag":"E","apply_cd":"733000","apply_date":"2019-10-28","apply_tips":"申购代码：733000；配售代码：704000；","bond_id":"110059","bond_nm":"浦发转债","cb_amount":"14.03","cb_type":"可转债","convert_price":"15.05","cp_flag":"Y","increase_rt":"-0.74","individual_limit":10000,"jsl_advise_text":"建议申购","list_date":"2019-11-15","lucky_draw_rt":"0.3017","ma20_price":"12.78","offline_accounts":"buy","offline_draw":"buy","offline_limit":"buy","online_amount":"34.40","pma_rt":"80.66","price":"12.14","progress_dt":"-","progress_nm":"2019-11-15上市","rating_cd":"AAA","ration_cd":"704000","ration_rt":"52.720","rid":172,"single_draw":"3.0170","status_cd":"ON","stock_id":"600000","stock_nm":"浦发银行","underwriter_rt":"0.25","valid_apply":"114.02"}
         * id : 600000
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

        public static class CellBean {
            /**
             * amount : 500.00
             * ap_flag : E
             * apply_cd : 733000
             * apply_date : 2019-10-28
             * apply_tips : 申购代码：733000；配售代码：704000；
             * bond_id : 110059
             * bond_nm : 浦发转债
             * cb_amount : 14.03
             * cb_type : 可转债
             * convert_price : 15.05
             * cp_flag : Y
             * increase_rt : -0.74
             * individual_limit : 10000
             * jsl_advise_text : 建议申购
             * list_date : 2019-11-15
             * lucky_draw_rt : 0.3017
             * ma20_price : 12.78
             * offline_accounts : buy
             * offline_draw : buy
             * offline_limit : buy
             * online_amount : 34.40
             * pma_rt : 80.66
             * price : 12.14
             * progress_dt : -
             * progress_nm : 2019-11-15上市
             * rating_cd : AAA
             * ration_cd : 704000
             * ration_rt : 52.720
             * rid : 172
             * single_draw : 3.0170
             * status_cd : ON
             * stock_id : 600000
             * stock_nm : 浦发银行
             * underwriter_rt : 0.25
             * valid_apply : 114.02
             */

            private String amount;
            private String ap_flag;
            private String apply_cd;
            private String apply_date;
            private String apply_tips;
            private String bond_id;
            private String bond_nm;
            private String cb_amount;
            private String cb_type;
            private String convert_price;
            private String cp_flag;
            private String increase_rt;
            private int individual_limit;
            private String jsl_advise_text;
            private String list_date;
            private String lucky_draw_rt;
            private String ma20_price;
            private String offline_accounts;
            private String offline_draw;
            private String offline_limit;
            private String online_amount;
            private String pma_rt;
            private String price;
            private String progress_dt;
            private String progress_nm;
            private String rating_cd;
            private String ration_cd;
            private String ration_rt;
            private int rid;
            private String single_draw;
            private String status_cd;
            private String stock_id;
            private String stock_nm;
            private String underwriter_rt;
            private String valid_apply;
            private String es_price;   //预估价格 = (现价比转股价+评级溢价+概念溢价)*100

            public String getEs_price() {
                return es_price;
            }

            public void setEs_price(String es_price) {
                this.es_price = es_price;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getAp_flag() {
                return ap_flag;
            }

            public void setAp_flag(String ap_flag) {
                this.ap_flag = ap_flag;
            }

            public String getApply_cd() {
                return apply_cd;
            }

            public void setApply_cd(String apply_cd) {
                this.apply_cd = apply_cd;
            }

            public String getApply_date() {
                return apply_date;
            }

            public void setApply_date(String apply_date) {
                this.apply_date = apply_date;
            }

            public String getApply_tips() {
                return apply_tips;
            }

            public void setApply_tips(String apply_tips) {
                this.apply_tips = apply_tips;
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

            public String getCb_amount() {
                return cb_amount;
            }

            public void setCb_amount(String cb_amount) {
                this.cb_amount = cb_amount;
            }

            public String getCb_type() {
                return cb_type;
            }

            public void setCb_type(String cb_type) {
                this.cb_type = cb_type;
            }

            public String getConvert_price() {
                return convert_price;
            }

            public void setConvert_price(String convert_price) {
                this.convert_price = convert_price;
            }

            public String getCp_flag() {
                return cp_flag;
            }

            public void setCp_flag(String cp_flag) {
                this.cp_flag = cp_flag;
            }

            public String getIncrease_rt() {
                return increase_rt;
            }

            public void setIncrease_rt(String increase_rt) {
                this.increase_rt = increase_rt;
            }

            public int getIndividual_limit() {
                return individual_limit;
            }

            public void setIndividual_limit(int individual_limit) {
                this.individual_limit = individual_limit;
            }

            public String getJsl_advise_text() {
                return jsl_advise_text;
            }

            public void setJsl_advise_text(String jsl_advise_text) {
                this.jsl_advise_text = jsl_advise_text;
            }

            public String getList_date() {
                return list_date;
            }

            public void setList_date(String list_date) {
                this.list_date = list_date;
            }

            public String getLucky_draw_rt() {
                if (lucky_draw_rt == null) {
                    return "-";
                }
                return lucky_draw_rt + "%";
            }

            public void setLucky_draw_rt(String lucky_draw_rt) {
                this.lucky_draw_rt = lucky_draw_rt;
            }

            public String getMa20_price() {
                return ma20_price;
            }

            public void setMa20_price(String ma20_price) {
                this.ma20_price = ma20_price;
            }

            public String getOffline_accounts() {
                return offline_accounts;
            }

            public void setOffline_accounts(String offline_accounts) {
                this.offline_accounts = offline_accounts;
            }

            public String getOffline_draw() {
                return offline_draw;
            }

            public void setOffline_draw(String offline_draw) {
                this.offline_draw = offline_draw;
            }

            public String getOffline_limit() {
                return offline_limit;
            }

            public void setOffline_limit(String offline_limit) {
                this.offline_limit = offline_limit;
            }

            public String getOnline_amount() {
                return online_amount;
            }

            public void setOnline_amount(String online_amount) {
                this.online_amount = online_amount;
            }

            public String getPma_rt() {
                return Math.round(Double.parseDouble(pma_rt))+"";
            }

            public void setPma_rt(String pma_rt) {
                this.pma_rt = pma_rt;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getProgress_dt() {
                return progress_dt;
            }

            public void setProgress_dt(String progress_dt) {
                this.progress_dt = progress_dt;
            }

            public String getProgress_nm() {
                return progress_nm.split("<br>")[0];
            }

            public void setProgress_nm(String progress_nm) {
                this.progress_nm = progress_nm;
            }

            public String getRating_cd() {
                return rating_cd;
            }

            public void setRating_cd(String rating_cd) {
                this.rating_cd = rating_cd;
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

            public int getRid() {
                return rid;
            }

            public void setRid(int rid) {
                this.rid = rid;
            }

            public String getSingle_draw() {
                return single_draw;
            }

            public void setSingle_draw(String single_draw) {
                this.single_draw = single_draw;
            }

            public String getStatus_cd() {
                return status_cd;
            }

            public void setStatus_cd(String status_cd) {
                this.status_cd = status_cd;
            }

            public String getStock_id() {
                return stock_id;
            }

            public void setStock_id(String stock_id) {
                this.stock_id = stock_id;
            }

            public String getStock_nm() {
                return stock_nm;
            }

            public void setStock_nm(String stock_nm) {
                this.stock_nm = stock_nm;
            }

            public String getUnderwriter_rt() {
                return underwriter_rt;
            }

            public void setUnderwriter_rt(String underwriter_rt) {
                this.underwriter_rt = underwriter_rt;
            }

            public String getValid_apply() {
                return valid_apply;
            }

            public void setValid_apply(String valid_apply) {
                this.valid_apply = valid_apply;
            }
        }
    }
}
