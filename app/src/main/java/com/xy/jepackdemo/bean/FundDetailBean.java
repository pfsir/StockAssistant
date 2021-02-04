package com.xy.jepackdemo.bean;

import java.util.List;

public class FundDetailBean {

    /**
     * data : {"items":[{"fd_code":"005827","fd_name":"易方达蓝筹精选混合","type_desc":"混合型","type":"hybrid","percent":25.8,"total_gain_rate":137.72560000000001},{"fd_code":"163402","fd_name":"兴全趋势","type_desc":"混合型","type":"hybrid","percent":19.78,"total_gain_rate":56.3868},{"fd_code":"166002","fd_name":"中欧新蓝筹混合A","type_desc":"混合型","type":"hybrid","percent":19.67,"total_gain_rate":59.4384},{"fd_code":"169101","fd_name":"东方红睿丰混合","type_desc":"混合型","type":"hybrid","percent":10.2,"total_gain_rate":-0.0167},{"fd_code":"161005","fd_name":"富国天惠成长LOF","type_desc":"混合型","type":"hybrid","percent":10.04,"total_gain_rate":80.2285},{"fd_code":"270002","fd_name":"广发稳健增长混合A类","type_desc":"混合型","type":"hybrid","percent":9.47,"total_gain_rate":30.948500000000003},{"fd_code":"001810","fd_name":"中欧潜力价值混合","type_desc":"混合型","type":"hybrid","percent":5.04,"total_gain_rate":0.7463},{"fd_code":"260108","fd_name":"景顺长城新兴成长","type_desc":"混合型","type":"hybrid","percent":0,"total_gain_rate":120.20100000000001}],"indicator_docs":[{"type":"yield","title":"收益率","docs":["组合内成分基金的累计收益率，代表了每只成分基金在组合中截至目前的收益率情况"]},{"type":"max_withdraw","title":"最大回撤","docs":["组合成立以来，净值走到最低点时的收益率回撤幅度的最大值。","最大回撤用来描述买入产品后可能出现的最糟糕的情况。通常用来衡量该组合的抗风险能力。","计算组合成立以来时间的回撤，基准指数的时间范围与组合一致。"]},{"type":"votility","title":"年化波动率","docs":["代表组合资产收益率的年化波动程度。通常用来衡量该组合的风险水平。","以近一年的周涨跌计算年化波动率，若组合成立时间不足半年，不具备参考价值，不展示该数据。"]},{"type":"sharpe","title":"夏普比率","docs":["代表每承受一单位总风险，会产生多少的超额报酬。","如果夏普比率为正值，说明在近一年组合平均收益率超过了无风险利率。","以近一年的组合数据计算夏普，若组合成立时间不足半年，不具备参考价值，不展示该数据。"]},{"type":"annual_returns","title":"年化收益率","docs":["采用XIRR算法计算组合年化收益率。"]},{"type":"total_gain_rate","title":"组合收益率","docs":["组合截至最新日期的累计收益率；收益率=组合累计收益/最大净流入成本。"]}]}
     * result_code : 0
     */

    private DataBean data;
    private int result_code;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getResult_code() {
        return result_code;
    }

    public void setResult_code(int result_code) {
        this.result_code = result_code;
    }

    public static class DataBean {
        private List<ItemsBean> items;
        private List<IndicatorDocsBean> indicator_docs;

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public List<IndicatorDocsBean> getIndicator_docs() {
            return indicator_docs;
        }

        public void setIndicator_docs(List<IndicatorDocsBean> indicator_docs) {
            this.indicator_docs = indicator_docs;
        }

        public static class ItemsBean {
            /**
             * fd_code : 005827
             * fd_name : 易方达蓝筹精选混合
             * type_desc : 混合型
             * type : hybrid
             * percent : 25.8
             * total_gain_rate : 137.72560000000001
             */

            private String fd_code;
            private String fd_name;
            private String type_desc;
            private String type;
            private double percent;
            private double total_gain_rate;

            public String getFd_code() {
                return fd_code;
            }

            public void setFd_code(String fd_code) {
                this.fd_code = fd_code;
            }

            public String getFd_name() {
                return fd_name;
            }

            public void setFd_name(String fd_name) {
                this.fd_name = fd_name;
            }

            public String getType_desc() {
                return type_desc;
            }

            public void setType_desc(String type_desc) {
                this.type_desc = type_desc;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPercent() {
                return String.format("%.2f",percent) + "%";
            }

            public void setPercent(double percent) {
                this.percent = percent;
            }

            public String getTotal_gain_rate() {
                return String.format("%.2f",total_gain_rate)+"%";
            }

            public void setTotal_gain_rate(double total_gain_rate) {
                this.total_gain_rate = total_gain_rate;
            }
        }

        public static class IndicatorDocsBean {
            /**
             * type : yield
             * title : 收益率
             * docs : ["组合内成分基金的累计收益率，代表了每只成分基金在组合中截至目前的收益率情况"]
             */

            private String type;
            private String title;
            private List<String> docs;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<String> getDocs() {
                return docs;
            }

            public void setDocs(List<String> docs) {
                this.docs = docs;
            }
        }
    }
}
