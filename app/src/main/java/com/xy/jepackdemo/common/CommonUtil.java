package com.xy.jepackdemo.common;


import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.xy.jepackdemo.bean.RecentBondBean;
import com.xy.jepackdemo.bean.StockBean;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/15.
 * description
 */
public class CommonUtil {
    public static final String TOKEN = "bec7f9e6-9a60-43c2-9d6c-5ae9ea69ec4b";
    private static List<StockBean.DataBean> stockBeans;

    public static final String FUND_TYPE = "fundType";

    public static final int EXPONENT = 0;

    public static final int INITIATIVE = 1;

    public static final int D365 = 2;

    public static void init() {
        stockBeans = new ArrayList<>();
        //保守,中性，增长率，股票代码
        stockBeans.add(new StockBean.DataBean("劲嘉股份", "002191", "17", "20", "8%"));
        stockBeans.add(new StockBean.DataBean("泸州老窖", "000568", "24", "28", "10%"));
        stockBeans.add(new StockBean.DataBean("中国平安", "601318", "1.3", "1.5", "10%"));
        stockBeans.add(new StockBean.DataBean("万科A", "000002", "9", "10", "10%"));
        stockBeans.add(new StockBean.DataBean("保利地产", "600048", "7", "8", "10%"));
        stockBeans.add(new StockBean.DataBean("海康威视", "002415", "20", "25", "13%"));
        stockBeans.add(new StockBean.DataBean("贵州茅台", "600519", "28", "32", "15%"));
        stockBeans.add(new StockBean.DataBean("五粮液", "000858", "25", "30", "15%"));
        stockBeans.add(new StockBean.DataBean("伊利股份", "600887", "25", "28", "12%"));
        stockBeans.add(new StockBean.DataBean("格力电器", "000651", "13", "16", "10%"));
        stockBeans.add(new StockBean.DataBean("美的集团", "000333", "15", "18", "10%"));
        stockBeans.add(new StockBean.DataBean("招商银行", "600036", "1.5", "1.8", "10%"));
        stockBeans.add(new StockBean.DataBean("东方雨虹", "002271", "15", "18", "15%"));
        stockBeans.add(new StockBean.DataBean("三一重工", "600031", "14", "16", "10%"));
    }

    /**
     * 获取当前版本号
     */
    public static String getLocalVersion(Context context) {
        String localVersion = "";
        try {
            PackageInfo packageInfo = context.getApplicationContext().getPackageManager()
                    .getPackageInfo(context.getPackageName(), 0);
            localVersion = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return localVersion;
    }

    /**
     * 获取评级
     * 对于AAA级可转债，现价比转股价>95%可以放行。
     * 对于AA、AA+级可转债，现价比转股价>100%可以放行。
     *
     * @param cellBean
     */
    public static String getStar(RecentBondBean.RowsBean.CellBean cellBean) {
        String star;
        switch (cellBean.getRating_cd()) {
            case "AAA":
                star = "建议申购";
                break;
            case "AA+":
            case "AA":
                if (Double.parseDouble(cellBean.getPma_rt()) > 93) {
                    star = "建议申购";
                } else if (Double.parseDouble(cellBean.getPma_rt()) > 90) {
                    star = "申购有风险";
                } else {
                    star = "不建议申购";
                }
                break;
            case "AA-":
            case "A+":
                if (Double.parseDouble(cellBean.getPma_rt()) > 100) {
                    star = "建议申购";
                } else if (Double.parseDouble(cellBean.getPma_rt()) > 95) {
                    star = "申购有风险";
                } else {
                    star = "不建议申购";
                }
                break;
            default:
                star = "不建议申购";
                break;

        }
        return star;
    }

    /**
     * 获取合理市盈率
     *
     * @return
     */
    public static List<StockBean.DataBean> getStockInfoList() {
        return stockBeans;
    }

    /**
     * 转为带一个小数点的
     * @param num
     * @return
     */
    public static String changeDouble(double num) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        try {
            return decimalFormat.format(num);
        } catch (Exception e) {
            return "0.0";
        }
    }

    public static String changePerDouble(double num) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        try {
            return decimalFormat.format(num*100);
        } catch (Exception e) {
            return "0.0";
        }
    }
}
