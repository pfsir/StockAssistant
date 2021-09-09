package com.xy.jepackdemo.ui.fund.rotate;

import com.google.gson.Gson;
import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.baselib.utils.SharePreUtil;
import com.xy.jepackdemo.bean.FundBean;
import com.xy.jepackdemo.bean.FundTrueBean;
import com.xy.jepackdemo.bean.StockBean;
import com.xy.jepackdemo.bean.StockRequestBean;
import com.xy.jepackdemo.common.App;
import com.xy.jepackdemo.common.CommonUtil;
import com.xy.jepackdemo.common.DateUtil;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import okhttp3.RequestBody;


public class RotateViewModel extends BaseViewModel {
    public static String LAST_ROTATE = "LastRotate";
    public static String HS = "hs";
    public static String ZZ = "zz";
    private List<FundBean.Data> startDataList = new ArrayList<>();
    private FundTrueBean fundTrueBean = new FundTrueBean();
    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<FundTrueBean> fundTrueBeanData = new UnPeekLiveData<>();

    public UnPeekLiveData<FundTrueBean> getFund() {
        return fundTrueBeanData;
    }

    /**
     * 请求基金数据
     */
    public void requestFund(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }
        StockRequestBean stockRequestBean = new StockRequestBean();
        stockRequestBean.setToken(CommonUtil.TOKEN);

        String date = DateUtil.getInstance().longToYMD(System.currentTimeMillis() - 20 * 24 * 60 * 60 * 1000);
        stockRequestBean.setDate(date);
        String[] metricsList = new String[]{"cp", "cpc"};
        stockRequestBean.setMetricsList(metricsList);
        String[] stockCodes = new String[]{"000905", "000300"};
        stockRequestBean.setStockCodes(stockCodes);

        String json = new Gson().toJson(stockRequestBean);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);

        addDisposable(HttpClient.Builder.getLxrService()
                .getLxrFundInfo(body)
                .compose(RxUtil.<FundBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<FundBean>() {
                    @Override
                    public void onNext(FundBean fundBean) {
                        startDataList.clear();
                        startDataList.addAll(fundBean.getData());
                        requestEndFund(show);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        if (show) {
                            showDialog.setValue(false);
                        }
                        /*
                         * 发生了错误，通知UI层
                         */
                        error.setValue("发生错误了");
                    }
                }));
    }

    public void requestEndFund(final boolean show) {
        StockRequestBean stockRequestBean = new StockRequestBean();
        stockRequestBean.setToken(CommonUtil.TOKEN);

        String date = DateUtil.getInstance().longToYMD(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
        stockRequestBean.setDate(date);
        String[] metricsList = new String[]{"cp", "cpc"};
        stockRequestBean.setMetricsList(metricsList);
        String[] stockCodes = new String[]{"000905", "000300"};
        stockRequestBean.setStockCodes(stockCodes);

        String json = new Gson().toJson(stockRequestBean);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);

        addDisposable(HttpClient.Builder.getLxrService()
                .getLxrFundInfo(body)
                .compose(RxUtil.<FundBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<FundBean>() {
                    @Override
                    public void onNext(FundBean fundBean) {
                        if (show) {
                            showDialog.setValue(false);
                        }
                        DecimalFormat df = new DecimalFormat("#.00");
                        double zz500 = (fundBean.getData().get(0).getCp() - startDataList.get(0).getCp()) * 100 / startDataList.get(0).getCp();
                        double hs300 = (fundBean.getData().get(1).getCp() - startDataList.get(1).getCp()) * 100 / startDataList.get(1).getCp();

                        String current = SharePreUtil.getString(App.getInstance(), LAST_ROTATE, HS);
                        fundTrueBean.setCurrentValue(current);

                        fundTrueBean.setMaxValue(hs300 >= zz500 ? HS : ZZ);
                        if (!fundTrueBean.getMaxValue().equals(current)) {
                            fundTrueBean.setShouldRotate("是");
                        }else {
                            fundTrueBean.setShouldRotate("否");
                        }
                        fundTrueBean.setHs300(df.format(hs300) + "%");
                        fundTrueBean.setZz500(df.format(zz500) + "%");

                        fundTrueBeanData.setValue(fundTrueBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        if (show) {
                            showDialog.setValue(false);
                        }
                        /*
                         * 发生了错误，通知UI层
                         */
                        error.setValue("发生错误了");
                    }
                }));
    }
}
