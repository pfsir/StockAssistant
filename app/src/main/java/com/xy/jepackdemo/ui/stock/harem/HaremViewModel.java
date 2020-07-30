package com.xy.jepackdemo.ui.stock.harem;

import com.google.gson.Gson;
import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.jepackdemo.bean.StockBean;
import com.xy.jepackdemo.bean.StockRequestBean;
import com.xy.jepackdemo.common.CommonUtil;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import okhttp3.RequestBody;


public class HaremViewModel extends BaseViewModel {

    private List<StockBean.DataBean> stockBeans = new ArrayList<>();
    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<List<StockBean.DataBean>> stockList = new UnPeekLiveData<>();

    public UnPeekLiveData<List<StockBean.DataBean>> getStock() {
        return stockList;
    }

    /**
     * 请求股票数据
     */
    public void requestStock(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }
        StockRequestBean stockRequestBean = new StockRequestBean();
        stockRequestBean.setToken(CommonUtil.TOKEN);

        stockRequestBean.setDate("latest");
        String[] metricsList = new String[]{"pe_ttm", "pb", "dyr"};
        stockRequestBean.setMetricsList(metricsList);
        String[] stockCodes = new String[]{"002191", "000568", "000002", "600048",
                "002415", "600519", "000858", "600887", "000651",
                "000333", "600036", "002271", "600031"};
        stockRequestBean.setStockCodes(stockCodes);


        String json = new Gson().toJson(stockRequestBean);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);

        addDisposable(HttpClient.Builder.getLxrService()
                .getLxrStockInfo(body)
                .compose(RxUtil.<StockBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<StockBean>() {
                    @Override
                    public void onNext(StockBean stockBean) {
                        stockBeans.clear();
                        List<StockBean.DataBean> requestDataList = stockBean.getData();
                        List<StockBean.DataBean> stockInfoList = CommonUtil.getStockInfoList();
                        for (StockBean.DataBean requestBean : requestDataList) {
                            for (StockBean.DataBean dataBean : stockInfoList) {
                                if (dataBean.getStockCode().equals(requestBean.getStockCode())) {
                                    switch (dataBean.getStockCode()) {
                                        case "600036":
                                            requestBean.setPe_ttm(requestBean.getPb());
                                            dataBean.setPe_ttm(requestBean.getPb());
                                            break;
                                        default:
                                            dataBean.setPe_ttm(Double.parseDouble(requestBean.getPe_ttm()));
                                            break;
                                    }
                                    dataBean.setDyr(Double.parseDouble(requestBean.getPerDyr()));
                                    //市盈率增速
                                    double pessimisticX = Math.pow(Double.parseDouble(dataBean.getPe_ttm_pessimistic()) / Double.parseDouble(requestBean.getPe_ttm()), 1f / 3);
                                    double neutralX = Math.pow(Double.parseDouble(dataBean.getPe_ttm_neutral()) / Double.parseDouble(requestBean.getPe_ttm()), 1f / 3);
                                    //利润增速
                                    double Y = 1 + Double.parseDouble(dataBean.getGrowth_rate().replace("%", "")) / 100.00d;
                                    //股息率
                                    double perDyr = Double.parseDouble(requestBean.getPerDyr()) / 100.00d;
                                    String pessimisticN = CommonUtil.changeDouble((pessimisticX * Y + perDyr - 1) * 100);
                                    String neutralN = CommonUtil.changeDouble((neutralX * Y + perDyr - 1) * 100);

                                    dataBean.setPessimisticN(pessimisticN);
                                    dataBean.setNeutralN(neutralN);
                                    dataBean.setStockN(pessimisticN + "% | " + neutralN + "%");
                                    break;
                                }
                            }
                        }
                        stockBeans.addAll(stockInfoList);
                        requestInsuranceStock(show);
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

    /**
     * 请求保险行业股票
     * @param show
     */
    private void requestInsuranceStock(final boolean show) {
        StockRequestBean stockRequestBean = new StockRequestBean();
        stockRequestBean.setToken(CommonUtil.TOKEN);

        stockRequestBean.setDate("latest");
        String[] metricsList = new String[]{ "pev", "dyr"};
        stockRequestBean.setMetricsList(metricsList);
        String[] stockCodes = new String[]{ "601318"};
        stockRequestBean.setStockCodes(stockCodes);

        String json = new Gson().toJson(stockRequestBean);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);

        addDisposable(HttpClient.Builder.getLxrService()
                .getLxrInsuranceStockInfo(body)
                .compose(RxUtil.<StockBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<StockBean>() {
                    @Override
                    public void onNext(StockBean stockBean) {
                        if (show) {
                            showDialog.setValue(false);
                        }
                        List<StockBean.DataBean> requestDataList = stockBean.getData();
                        for (StockBean.DataBean requestBean : requestDataList) {
                            for (StockBean.DataBean dataBean : stockBeans) {
                                if (dataBean.getStockCode().equals(requestBean.getStockCode())) {
                                    dataBean.setPe_ttm(requestBean.getPev());

                                    dataBean.setDyr(Double.parseDouble(requestBean.getPerDyr()));
                                    //市盈率增速
                                    double pessimisticX = Math.pow(Double.parseDouble(dataBean.getPe_ttm_pessimistic()) / requestBean.getPev(), 1f / 3);
                                    double neutralX = Math.pow(Double.parseDouble(dataBean.getPe_ttm_neutral()) / requestBean.getPev(), 1f / 3);
                                    //利润增速
                                    double Y = 1 + Double.parseDouble(dataBean.getGrowth_rate().replace("%", "")) / 100.00d;
                                    //股息率
                                    double perDyr = Double.parseDouble(requestBean.getPerDyr()) / 100.00d;
                                    String pessimisticN = CommonUtil.changeDouble((pessimisticX * Y + perDyr - 1) * 100);
                                    String neutralN = CommonUtil.changeDouble((neutralX * Y + perDyr - 1) * 100);

                                    dataBean.setPessimisticN(pessimisticN);
                                    dataBean.setNeutralN(neutralN);
                                    dataBean.setStockN(pessimisticN + "% | " + neutralN + "%");
                                    break;
                                }
                            }
                        }
                        //排序
                        Collections.sort(stockBeans);

                        stockList.setValue(stockBeans);
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
