package com.xy.jepackdemo.ui.fund.arbitrage;

import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.jepackdemo.bean.FundLofBean;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArbitrageFundViewModel extends BaseViewModel {

    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<List<FundLofBean.RowsBean>> lofFundData = new UnPeekLiveData<>();


    public UnPeekLiveData<List<FundLofBean.RowsBean>> getLofFundData() {
        return lofFundData;
    }

    /**
     * 请求进攻数据
     */
    public void requestLofFund(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }
        addDisposable(HttpClient.Builder.getJslService()
                .getJslLofFund(System.currentTimeMillis(), 25, 1)
                .compose(RxUtil.<FundLofBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<FundLofBean>() {
                    @Override
                    public void onNext(FundLofBean fundLofBean) {
                        if (show) {
                            showDialog.setValue(false);
                        }
                        List<FundLofBean.RowsBean> rows = fundLofBean.getRows();
                        List<FundLofBean.RowsBean> currentRows =new ArrayList<>();
                        for (FundLofBean.RowsBean rowsBean : rows) {
                            if ("163402".equals(rowsBean.getCell().getFund_id())||"161005".equals(rowsBean.getCell().getFund_id())) {
                                currentRows.add(rowsBean);
                            }
                        }
                        rows.removeAll(currentRows);
                        Collections.sort(rows);

                        for (FundLofBean.RowsBean rowsBean : currentRows){
                            rows.add(0,rowsBean);
                        }
                        lofFundData.setValue(rows);
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
