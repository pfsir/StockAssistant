package com.xy.jepackdemo.ui.fund.change;

import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.baselib.utils.DateUtil;
import com.xy.jepackdemo.bean.FundDetailBean;
import com.xy.jepackdemo.common.CommonUtil;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.util.List;

import io.reactivex.Flowable;


public class ChangeFundViewModel extends BaseViewModel {

    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<List<FundDetailBean.DataBean.ItemsBean>> fundDetailData = new UnPeekLiveData<>();

    public UnPeekLiveData<List<FundDetailBean.DataBean.ItemsBean>> getFundValuationData() {
        return fundDetailData;
    }

    /**
     * 请求基金估值数据
     */
    public void requestFundValuation(int type,final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }
        Flowable<FundDetailBean> flowable;
        switch (type){
            case CommonUtil.INITIATIVE:
                 flowable = HttpClient.Builder.getDJService()
                        .getDjFundDetail("CSI1033");
                break;
            default:
                flowable = HttpClient.Builder.getDJService()
                        .getDjFundDetail("CSI1019");
                break;
        }

        addDisposable(flowable.compose(RxUtil.<FundDetailBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<FundDetailBean>() {
                    @Override
                    public void onNext(FundDetailBean fundValuationBean) {
                        if (show) {
                            showDialog.setValue(false);
                        }
                        fundDetailData.setValue(fundValuationBean.getData().getItems());
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
