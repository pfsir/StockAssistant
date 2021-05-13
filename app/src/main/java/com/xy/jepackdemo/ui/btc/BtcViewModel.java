package com.xy.jepackdemo.ui.btc;

import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.jepackdemo.bean.BtcPriceBean;
import com.xy.jepackdemo.bean.FgiBean;
import com.xy.jepackdemo.common.DateUtil;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class BtcViewModel extends BaseViewModel {

    private final List<FgiBean.DataFgi> fgiBeans = new ArrayList<>();
    private final List<List<BigDecimal>> btcPriceBeans = new ArrayList<>();

    protected UnPeekLiveData<List<FgiBean.DataFgi>> fgiData = new UnPeekLiveData<>();
    protected UnPeekLiveData<List<List<BigDecimal>>> btcPriceData = new UnPeekLiveData<>();

    public UnPeekLiveData<List<FgiBean.DataFgi>> getBtcFgiData() {
        return fgiData;
    }

    public UnPeekLiveData<List<List<BigDecimal>>> getBtcPriceData() {
        return btcPriceData;
    }

    /**
     * 请求btc价格
     */
    public void requestBtcPrice(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }

        String end = DateUtil.getInstance().longToYMD(System.currentTimeMillis());
        long startTime = System.currentTimeMillis() - 1000 * 60 * 60 * 24 * 30L;
        String start = DateUtil.getInstance().longToYMD(startTime);

        addDisposable(HttpClient.Builder.getBtcService()
                .getBtcData("bitcoin", start, end)
                .compose(RxUtil.<BtcPriceBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<BtcPriceBean>() {
                    @Override
                    public void onNext(BtcPriceBean btcPriceBean) {
                        btcPriceBeans.clear();
                        btcPriceBeans.addAll(btcPriceBean.getData());
                        btcPriceData.setValue(btcPriceBeans);
                        requestBtcFgi(show);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        if (show) {
                            showDialog.setValue(false);
                        }
                        error.setValue("发生错误了");
                    }
                }));
    }

    /**
     * 请求恐惧贪婪指数数据
     */
    public void requestBtcFgi(final boolean show) {

        addDisposable(HttpClient.Builder.getBtcService()
                .getFgiData()
                .compose(RxUtil.<FgiBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<FgiBean>() {
                    @Override
                    public void onNext(FgiBean fgiBean) {
                        fgiBeans.clear();
                        if (fgiBean.getData().size() > 30) {
                            fgiBeans.addAll(fgiBean.getData().subList(fgiBean.getData().size() - 30, fgiBean.getData().size()));
                        } else {
                            fgiBeans.addAll(fgiBean.getData());
                        }
                        fgiData.setValue(fgiBeans);
                        if (show) {
                            showDialog.setValue(false);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        if (show) {
                            showDialog.setValue(false);
                        }
                        error.setValue("发生错误了");
                    }
                }));
    }

}
