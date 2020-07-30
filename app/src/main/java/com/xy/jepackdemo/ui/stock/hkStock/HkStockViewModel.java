package com.xy.jepackdemo.ui.stock.hkStock;

import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.jepackdemo.bean.HkIpoBean;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.util.ArrayList;
import java.util.List;


public class HkStockViewModel extends BaseViewModel {

    private List<HkIpoBean.RowsBean> hkStockBeans = new ArrayList<>();
    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<List<HkIpoBean.RowsBean>> hkIpoStockData = new UnPeekLiveData<>();

    public UnPeekLiveData<List<HkIpoBean.RowsBean>> getHkIpoStockData() {
        return hkIpoStockData;
    }

    /**
     * 请求港股上市数据
     */
    public void requestHkIpoStock(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }

        addDisposable(HttpClient.Builder.getJslService()
                .getJslHkIpo(System.currentTimeMillis())
                .compose(RxUtil.<HkIpoBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<HkIpoBean>() {
                    @Override
                    public void onNext(HkIpoBean hkIpoBean) {
                        hkStockBeans.clear();
                        hkStockBeans.addAll(hkIpoBean.getRows());
                        hkIpoStockData.setValue(hkStockBeans);
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
