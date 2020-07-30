package com.xy.jepackdemo.bean;

import com.xy.jepackdemo.common.CommonUtil;
import com.xy.jepackdemo.common.LogUtil;

import java.text.DecimalFormat;
import java.util.List;

public class StockBean{

    /**
     * code : 0
     * message : success
     * data : [{"date":"2020-04-01T00:00:00+08:00","pe_ttm":13.511317994291991,"pb":1.3519346284652993,"dyr":0.01017293997965412,"stockCode":"000028"},{"date":"2020-04-01T00:00:00+08:00","pe_ttm":13.228157446580664,"pb":2.109906573963082,"dyr":0.022688477951635845,"stockCode":"600511"}]
     */

    private int code;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }



    public static class DataBean implements Comparable<StockBean.DataBean>{

        public DataBean(String stockName, String stockCode, String pe_ttm_pessimistic, String pe_ttm_neutral, String growth_rate) {
            this.pe_ttm_pessimistic = pe_ttm_pessimistic;
            this.pe_ttm_neutral = pe_ttm_neutral;
            this.growth_rate = growth_rate;
            this.stockCode = stockCode;
            this.stockName = stockName;
        }

        /**
         * date : 2020-04-01T00:00:00+08:00
         * pe_ttm : 13.511317994291991
         * pb : 1.3519346284652993
         * dyr : 0.01017293997965412
         * stockCode : 000028
         */

        private String date;
        private double pe_ttm;
        private double pev;
        /**
         * 保守pe
         */
        private String pe_ttm_pessimistic;
        private String pe_ttm_neutral;
        private double pb;
        private double dyr;
        /**
         * 合理增长率
         */
        private String growth_rate;
        private String stockCode;
        private String stockName;
        /**
         * 保守N
         */
        private String pessimisticN;
        /**
         * 乐观N
         */
        private String neutralN;
        /**
         * N
         */
        private String stockN;
        /**
         * 买入
         */
        private String stockPriceIn;
        /**
         * 买出
         */
        private String stockPriceOut;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getPe_ttm() {
            return CommonUtil.changeDouble(pe_ttm);
        }

        public void setPe_ttm(double pe_ttm) {
            this.pe_ttm = pe_ttm;
        }

        public double getPev() {
            return pev;
        }

        public void setPev(double pev) {
            this.pev = pev;
        }

        public double getPb() {
            return pb;
        }

        public void setPb(double pb) {
            this.pb = pb;
        }

        public String getDyr() {
            return CommonUtil.changeDouble(dyr) + "%";
        }

        public String getPerDyr() {
            return CommonUtil.changePerDouble(dyr);
        }

        public void setDyr(double dyr) {
            this.dyr = dyr;
        }

        public String getStockCode() {
            return stockCode;
        }

        public void setStockCode(String stockCode) {
            this.stockCode = stockCode;
        }

        public String getPe_ttm_pessimistic() {
            return pe_ttm_pessimistic;
        }

        public void setPe_ttm_pessimistic(String pe_ttm_pessimistic) {
            this.pe_ttm_pessimistic = pe_ttm_pessimistic;
        }

        public String getPe_ttm_neutral() {
            return pe_ttm_neutral;
        }

        public void setPe_ttm_neutral(String pe_ttm_neutral) {
            this.pe_ttm_neutral = pe_ttm_neutral;
        }

        public String getGrowth_rate() {
            return growth_rate;
        }

        public void setGrowth_rate(String growth_rate) {
            this.growth_rate = growth_rate;
        }

        public String getStockName() {
            return stockName;
        }

        public void setStockName(String stockName) {
            this.stockName = stockName;
        }

        public String getPessimisticN() {
            return pessimisticN;
        }

        public void setPessimisticN(String pessimisticN) {
            this.pessimisticN = pessimisticN;
        }

        public String getNeutralN() {
            return neutralN;
        }

        public void setNeutralN(String neutralN) {
            this.neutralN = neutralN;
        }

        public String getStockN() {
            return stockN;
        }

        public void setStockN(String stockN) {
            this.stockN = stockN;
        }

        public String getStockPriceIn() {
            return stockPriceIn;
        }

        public void setStockPriceIn(String stockPriceIn) {
            this.stockPriceIn = stockPriceIn;
        }

        public String getStockPriceOut() {
            return stockPriceOut;
        }

        public void setStockPriceOut(String stockPriceOut) {
            this.stockPriceOut = stockPriceOut;
        }

        @Override
        public int compareTo(DataBean dataBean) {
            //比较保守N
            try {
                return Double.compare(Double.parseDouble(dataBean.getPessimisticN()), Double.parseDouble(this.pessimisticN));
            } catch (Exception e) {
                return 0;
            }
        }
    }
}
