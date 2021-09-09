package com.xy.jepackdemo.bean;

import java.util.List;

/**
 * Create by OuYangPengFei on 9/8/21
 */
public class FundBean {

    /**
     * code : 1
     * message : success
     * data : [{"date":"2021-09-08T00:00:00+08:00","cp":7544.04,"cpc":0.006015524881549724,"stockCode":"000905"},{"date":"2021-09-08T00:00:00+08:00","cp":4972.13,"cpc":-0.004145945285539427,"stockCode":"000300"}]
     */

    private int code;
    private String message;
    private List<Data> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        /**
         * date : 2021-09-08T00:00:00+08:00
         * cp : 7544.04
         * cpc : 0.006015524881549724
         * stockCode : 000905
         */

        private String date;
        private double cp;
        private double cpc;
        private String stockCode;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public double getCp() {
            return cp;
        }

        public void setCp(double cp) {
            this.cp = cp;
        }

        public double getCpc() {
            return cpc;
        }

        public void setCpc(double cpc) {
            this.cpc = cpc;
        }

        public String getStockCode() {
            return stockCode;
        }

        public void setStockCode(String stockCode) {
            this.stockCode = stockCode;
        }
    }
}
