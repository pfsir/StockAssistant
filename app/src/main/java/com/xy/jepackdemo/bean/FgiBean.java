package com.xy.jepackdemo.bean;

import java.util.List;

/**
 * Create by OuYangPengFei on 4/29/21
 */
public class FgiBean {

    /**
     * code : 1
     * msg : sucess
     * data : [{"id":"1532","datetime":"2021-02-28","value":"55","result":"贪婪"},{"id":"1533","datetime":"2021-03-01","value":"38","result":"恐惧"},{"id":"1534","datetime":"2021-03-02","value":"78","result":"极度贪婪"},{"id":"1535","datetime":"2021-03-03","value":"78","result":"极度贪婪"},{"id":"1536","datetime":"2021-03-04","value":"84","result":"极度贪婪"},{"id":"1537","datetime":"2021-03-05","value":"77","result":"极度贪婪"},{"id":"1538","datetime":"2021-03-06","value":"77","result":"极度贪婪"},{"id":"1539","datetime":"2021-03-07","value":"76","result":"极度贪婪"},{"id":"1540","datetime":"2021-03-08","value":"81","result":"极度贪婪"},{"id":"1541","datetime":"2021-03-09","value":"81","result":"极度贪婪"},{"id":"1542","datetime":"2021-03-10","value":"68","result":"贪婪"},{"id":"1543","datetime":"2021-03-11","value":"73","result":"贪婪"},{"id":"1544","datetime":"2021-03-12","value":"70","result":"贪婪"},{"id":"1545","datetime":"2021-03-13","value":"74","result":"贪婪"},{"id":"1546","datetime":"2021-03-14","value":"78","result":"极度贪婪"},{"id":"1547","datetime":"2021-03-15","value":"76","result":"极度贪婪"},{"id":"1548","datetime":"2021-03-16","value":"71","result":"贪婪"},{"id":"1549","datetime":"2021-03-17","value":"71","result":"贪婪"},{"id":"1550","datetime":"2021-03-18","value":"72","result":"贪婪"},{"id":"1551","datetime":"2021-03-19","value":"71","result":"贪婪"},{"id":"1552","datetime":"2021-03-20","value":"75","result":"贪婪"},{"id":"1553","datetime":"2021-03-21","value":"73","result":"贪婪"},{"id":"1554","datetime":"2021-03-22","value":"70","result":"贪婪"},{"id":"1555","datetime":"2021-03-23","value":"66","result":"贪婪"},{"id":"1556","datetime":"2021-03-24","value":"65","result":"贪婪"},{"id":"1557","datetime":"2021-03-25","value":"60","result":"贪婪"},{"id":"1558","datetime":"2021-03-26","value":"54","result":"正常"},{"id":"1559","datetime":"2021-03-27","value":"65","result":"贪婪"},{"id":"1560","datetime":"2021-03-28","value":"74","result":"贪婪"},{"id":"1561","datetime":"2021-03-29","value":"72","result":"贪婪"},{"id":"1562","datetime":"2021-03-30","value":"72","result":"贪婪"},{"id":"1563","datetime":"2021-03-31","value":"76","result":"极度贪婪"},{"id":"1564","datetime":"2021-04-01","value":"74","result":"贪婪"},{"id":"1565","datetime":"2021-04-02","value":"74","result":"贪婪"},{"id":"1566","datetime":"2021-04-03","value":"73","result":"贪婪"},{"id":"1567","datetime":"2021-04-04","value":"74","result":"贪婪"},{"id":"1568","datetime":"2021-04-05","value":"71","result":"贪婪"},{"id":"1569","datetime":"2021-04-06","value":"75","result":"贪婪"},{"id":"1570","datetime":"2021-04-07","value":"72","result":"贪婪"},{"id":"1571","datetime":"2021-04-08","value":"73","result":"贪婪"},{"id":"1572","datetime":"2021-04-09","value":"70","result":"贪婪"},{"id":"1573","datetime":"2021-04-10","value":"70","result":"贪婪"},{"id":"1574","datetime":"2021-04-11","value":"76","result":"极度贪婪"},{"id":"1575","datetime":"2021-04-12","value":"74","result":"贪婪"},{"id":"1576","datetime":"2021-04-13","value":"74","result":"贪婪"},{"id":"1577","datetime":"2021-04-14","value":"75","result":"贪婪"},{"id":"1578","datetime":"2021-04-15","value":"79","result":"极度贪婪"},{"id":"1579","datetime":"2021-04-16","value":"78","result":"极度贪婪"},{"id":"1580","datetime":"2021-04-17","value":"76","result":"极度贪婪"},{"id":"1581","datetime":"2021-04-18","value":"79","result":"极度贪婪"},{"id":"1582","datetime":"2021-04-19","value":"74","result":"贪婪"},{"id":"1583","datetime":"2021-04-20","value":"73","result":"贪婪"},{"id":"1584","datetime":"2021-04-21","value":"73","result":"贪婪"},{"id":"1585","datetime":"2021-04-22","value":"65","result":"贪婪"},{"id":"1586","datetime":"2021-04-23","value":"55","result":"贪婪"},{"id":"1587","datetime":"2021-04-24","value":"37","result":"恐惧"},{"id":"1588","datetime":"2021-04-25","value":"31","result":"恐惧"},{"id":"1589","datetime":"2021-04-26","value":"27","result":"恐惧"},{"id":"1590","datetime":"2021-04-27","value":"50","result":"正常"},{"id":"1591","datetime":"2021-04-28","value":"59","result":"贪婪"},{"id":"1592","datetime":"2021-04-29","value":"52","result":"正常"}]
     */

    private int code;
    private String msg;
    private List<DataFgi> data;

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

    public List<DataFgi> getData() {
        return data;
    }

    public void setData(List<DataFgi> data) {
        this.data = data;
    }

    public static class DataFgi {
        /**
         * id : 1532
         * datetime : 2021-02-28
         * value : 55
         * result : 贪婪
         */

        private String id;
        private String datetime;
        private String value;
        private String result;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }
}
