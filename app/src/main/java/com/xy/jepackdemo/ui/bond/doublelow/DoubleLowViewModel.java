package com.xy.jepackdemo.ui.bond.doublelow;

import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.jepackdemo.bean.DoubleLowBondBean;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DoubleLowViewModel extends BaseViewModel {

    private List<DoubleLowBondBean.RowsBean.CellBean> allBeans = new ArrayList<>();
    private List<DoubleLowBondBean.RowsBean.CellBean> cellBeans = new ArrayList<>();
    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<List<DoubleLowBondBean.RowsBean.CellBean>> doubleLowBond = new UnPeekLiveData<>();

    public UnPeekLiveData<List<DoubleLowBondBean.RowsBean.CellBean>> getDoubleLowBond() {
        return doubleLowBond;
    }

    /**
     * 请求双底数据
     */
    public void requestDoubleLowBond(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }
        //双低转债：价格及溢价率，且pb>1，最近无强赎 （即Redeem_flag==X）
        addDisposable(HttpClient.Builder.getJslService()
                .getJslAllBond(System.currentTimeMillis(), "N", "C", "Y", "N", 50)
                .compose(RxUtil.<DoubleLowBondBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<DoubleLowBondBean>() {
                    @Override
                    public void onNext(DoubleLowBondBean doubleLowBondBean) {
                        if (show) {
                            showDialog.setValue(false);
                        }
                        cellBeans.clear();
                        if (doubleLowBondBean.getRows() != null && doubleLowBondBean.getRows().size() > 0) {
                            for (DoubleLowBondBean.RowsBean rowsBean : doubleLowBondBean.getRows()) {
                                DoubleLowBondBean.RowsBean.CellBean cell = rowsBean.getCell();
                                allBeans.add(cell);
                            }
                        }
                        Collections.sort(allBeans);
                        for (DoubleLowBondBean.RowsBean.CellBean cellBean : allBeans) {
                            if (cellBeans.size() < 35 && Double.parseDouble(cellBean.getPb()) > 1 && "X".equals(cellBean.getRedeem_flag())) {
                                cellBeans.add(cellBean);
                            }
                        }
                        Collections.sort(cellBeans);
                        doubleLowBond.setValue(cellBeans);
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
