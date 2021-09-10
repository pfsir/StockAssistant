package com.xy.jepackdemo.bean;

/**
 * Create by OuYangPengFei on 9/10/21
 */
public class BondPriceBean {

    /**
     * code : 200
     * msg :
     * data : {"cur_index":"1922.451","amount":"6100.591","volume":"544.426","count":372,"last_time":"2021-09-10 11:39:14","cur_increase_val":"-3.12","cur_increase_rt":"-0.16","avg_price":"144.665","avg_premium_rt":"33.86","avg_ytm_rt":"-4.06","mid_price":"123.419","turnover_rt":"8.92","price_90":0,"increase_rt_90":"0.000","price_90_100":5,"increase_rt_90_100":"-0.528","price_100_110":51,"increase_rt_100_110":"-0.400","price_110_120":93,"increase_rt_110_120":"-0.287","price_120_130":80,"increase_rt_120_130":"-0.373","price_130":143,"increase_rt_130":"0.134"}
     */

    private int code;
    private String msg;
    private DataDTO data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        /**
         * cur_index : 1922.451
         * amount : 6100.591
         * volume : 544.426
         * count : 372
         * last_time : 2021-09-10 11:39:14
         * cur_increase_val : -3.12
         * cur_increase_rt : -0.16
         * avg_price : 144.665
         * avg_premium_rt : 33.86
         * avg_ytm_rt : -4.06
         * mid_price : 123.419
         * turnover_rt : 8.92
         * price_90 : 0
         * increase_rt_90 : 0.000
         * price_90_100 : 5
         * increase_rt_90_100 : -0.528
         * price_100_110 : 51
         * increase_rt_100_110 : -0.400
         * price_110_120 : 93
         * increase_rt_110_120 : -0.287
         * price_120_130 : 80
         * increase_rt_120_130 : -0.373
         * price_130 : 143
         * increase_rt_130 : 0.134
         */

        private String cur_index;
        private String amount;
        private String volume;
        private int count;
        private String last_time;
        private String cur_increase_val;
        private String cur_increase_rt;
        private String avg_price;
        private String avg_premium_rt;
        private String avg_ytm_rt;
        private String mid_price;
        private String turnover_rt;
        private int price_90;
        private String increase_rt_90;
        private int price_90_100;
        private String increase_rt_90_100;
        private int price_100_110;
        private String increase_rt_100_110;
        private int price_110_120;
        private String increase_rt_110_120;
        private int price_120_130;
        private String increase_rt_120_130;
        private int price_130;
        private String increase_rt_130;

        public String getCur_index() {
            return cur_index;
        }

        public void setCur_index(String cur_index) {
            this.cur_index = cur_index;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getLast_time() {
            return last_time;
        }

        public void setLast_time(String last_time) {
            this.last_time = last_time;
        }

        public String getCur_increase_val() {
            return cur_increase_val;
        }

        public void setCur_increase_val(String cur_increase_val) {
            this.cur_increase_val = cur_increase_val;
        }

        public String getCur_increase_rt() {
            return cur_increase_rt;
        }

        public void setCur_increase_rt(String cur_increase_rt) {
            this.cur_increase_rt = cur_increase_rt;
        }

        public String getAvg_price() {
            return avg_price;
        }

        public void setAvg_price(String avg_price) {
            this.avg_price = avg_price;
        }

        public String getAvg_premium_rt() {
            return avg_premium_rt;
        }

        public void setAvg_premium_rt(String avg_premium_rt) {
            this.avg_premium_rt = avg_premium_rt;
        }

        public String getAvg_ytm_rt() {
            return avg_ytm_rt;
        }

        public void setAvg_ytm_rt(String avg_ytm_rt) {
            this.avg_ytm_rt = avg_ytm_rt;
        }

        public String getMid_price() {
            return mid_price;
        }

        public void setMid_price(String mid_price) {
            this.mid_price = mid_price;
        }

        public String getTurnover_rt() {
            return turnover_rt;
        }

        public void setTurnover_rt(String turnover_rt) {
            this.turnover_rt = turnover_rt;
        }

        public String getPrice_90() {
            return price_90 + "";
        }

        public void setPrice_90(int price_90) {
            this.price_90 = price_90;
        }

        public String getIncrease_rt_90() {
            return increase_rt_90;
        }

        public void setIncrease_rt_90(String increase_rt_90) {
            this.increase_rt_90 = increase_rt_90;
        }

        public String getPrice_90_100() {
            return price_90_100 + "";
        }

        public void setPrice_90_100(int price_90_100) {
            this.price_90_100 = price_90_100;
        }

        public String getIncrease_rt_90_100() {
            return increase_rt_90_100;
        }

        public void setIncrease_rt_90_100(String increase_rt_90_100) {
            this.increase_rt_90_100 = increase_rt_90_100;
        }

        public String getPrice_100_110() {
            return price_100_110 + "";
        }

        public void setPrice_100_110(int price_100_110) {
            this.price_100_110 = price_100_110;
        }

        public String getIncrease_rt_100_110() {
            return increase_rt_100_110;
        }

        public void setIncrease_rt_100_110(String increase_rt_100_110) {
            this.increase_rt_100_110 = increase_rt_100_110;
        }

        public String getPrice_110_120() {
            return price_110_120 + "";
        }

        public void setPrice_110_120(int price_110_120) {
            this.price_110_120 = price_110_120;
        }

        public String getIncrease_rt_110_120() {
            return increase_rt_110_120;
        }

        public void setIncrease_rt_110_120(String increase_rt_110_120) {
            this.increase_rt_110_120 = increase_rt_110_120;
        }

        public int getPrice_120_130() {
            return price_120_130;
        }

        public void setPrice_120_130(int price_120_130) {
            this.price_120_130 = price_120_130;
        }

        public String getIncrease_rt_120_130() {
            return increase_rt_120_130;
        }

        public void setIncrease_rt_120_130(String increase_rt_120_130) {
            this.increase_rt_120_130 = increase_rt_120_130;
        }

        public int getPrice_130() {
            return price_130;
        }

        public void setPrice_130(int price_130) {
            this.price_130 = price_130;
        }

        public String getIncrease_rt_130() {
            return increase_rt_130;
        }

        public void setIncrease_rt_130(String increase_rt_130) {
            this.increase_rt_130 = increase_rt_130;
        }
    }
}
