package com.xy.jepackdemo.ui.fund.valuation;

import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.baselib.utils.DateUtil;
import com.xy.jepackdemo.bean.FundValuationBean;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.util.List;


public class ValuationFundViewModel extends BaseViewModel {

    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<FundValuationBean.DataBean.ItemsBean> fundValuationData = new UnPeekLiveData<>();

    public UnPeekLiveData<String> tradeDate = new UnPeekLiveData<>();
    public UnPeekLiveData<String> buyAmount = new UnPeekLiveData<>();
    public UnPeekLiveData<String> remark = new UnPeekLiveData<>();

    public UnPeekLiveData<FundValuationBean.DataBean.ItemsBean> getFundValuationData() {
        return fundValuationData;
    }

    /**
     * 请求基金估值数据
     */
    public void requestFundValuation(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }
        //进攻表 溢价率<20%，价格小于110元，评级至少为AA，上市满足半年
        addDisposable(HttpClient.Builder.getDJService()
                .getDjFundInfo("1", "1")
                .compose(RxUtil.<FundValuationBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<FundValuationBean>() {
                    @Override
                    public void onNext(FundValuationBean fundValuationBean) {
                        if (show) {
                            showDialog.setValue(false);
                        }
                        if (fundValuationBean.getData().getItems().size() > 0) {
                            FundValuationBean.DataBean.ItemsBean itemsBean = fundValuationBean.getData().getItems().get(0);
                            tradeDate.setValue(DateUtil.getInstance().longToYMD(itemsBean.getTrade_date()));
                            buyAmount.setValue("￥" + itemsBean.getBuy_amount());
                            remark.setValue("              "+itemsBean.getRemark());

                            fundValuationData.setValue(itemsBean);
                        }
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
