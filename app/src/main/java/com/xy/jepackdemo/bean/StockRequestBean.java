package com.xy.jepackdemo.bean;

import java.util.List;

public class StockRequestBean {

    /**
     * token : bec7f9e6-9a60-43c2-9d6c-5ae9ea69ec4b
     * date : 2020-04-01
     * stockCodes : ["000028","600036"]
     * metricsList : ["pe_ttm","pb","dyr"]
     */

    private String token;
    private String date;
    private String[] stockCodes;
    private String[] metricsList;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getStockCodes() {
        return stockCodes;
    }

    public void setStockCodes(String[] stockCodes) {
        this.stockCodes = stockCodes;
    }

    public String[] getMetricsList() {
        return metricsList;
    }

    public void setMetricsList(String[] metricsList) {
        this.metricsList = metricsList;
    }
}
