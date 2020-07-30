package com.xy.jepackdemo.ui.bond.choice;

import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.jepackdemo.bean.FilterBondBean;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ChoiceViewModel extends BaseViewModel {

    private List<FilterBondBean.RowsBean.CellBean> cellBeans = new ArrayList<>();
    private List<FilterBondBean.RowsBean.CellBean> attBeans = new ArrayList<>();
    private List<FilterBondBean.RowsBean.CellBean> defBeans = new ArrayList<>();
    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<List<FilterBondBean.RowsBean.CellBean>> allBond = new UnPeekLiveData<>();

    public UnPeekLiveData<List<FilterBondBean.RowsBean.CellBean>> getAllBond() {
        return allBond;
    }

    /**
     * 请求进攻数据
     */
    public void requestAttackBond(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }
        //进攻表 溢价率<20%，价格小于110元，评级至少为AA，上市满足半年
        addDisposable(HttpClient.Builder.getJslService()
                .getJslFilterBond(System.currentTimeMillis(), 0, 110, "", "",
                        "20", "", "", "Y", "C", "Y",
                        "", "", 50)
                .compose(RxUtil.<FilterBondBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<FilterBondBean>() {
                    @Override
                    public void onNext(FilterBondBean filterBondBean) {
                        attBeans.clear();
                        cellBeans.clear();

                        if (filterBondBean.getRows() != null && filterBondBean.getRows().size() > 0) {
                            for (FilterBondBean.RowsBean rowsBean : filterBondBean.getRows()) {
                                FilterBondBean.RowsBean.CellBean cell = rowsBean.getCell();
                                if (cell != null) {
                                    switch (cell.getIssuer_rating_cd()) {
                                        case "AAA":
                                        case "AA+":
                                        case "AA":
                                            if (((6D - Double.parseDouble(cell.getYear_left())) > 0.5D) && !cell.getYtm_rt_tax().contains("-")) {
                                                cell.setType("攻");
                                                attBeans.add(cell);
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                        }
                        Collections.sort(attBeans);
                        cellBeans.addAll(attBeans);

                        requestDefBond(show);
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
     * 请求防御表数据
     */
    private void requestDefBond(final boolean show) {
        //价格低于100元,评级AA以上（含AA）
        addDisposable(HttpClient.Builder.getJslService()
                .getJslFilterBond(System.currentTimeMillis(), 0, 100, "", "",
                        "", "", "", "Y", "C", "Y",
                        "", "", 50)
                .compose(RxUtil.<FilterBondBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<FilterBondBean>() {
                    @Override
                    public void onNext(FilterBondBean filterBondBean) {
                        if (show) {
                            showDialog.setValue(false);
                        }
                        defBeans.clear();

                        if (filterBondBean.getRows() != null && filterBondBean.getRows().size() > 0) {
                            for (FilterBondBean.RowsBean rowsBean : filterBondBean.getRows()) {
                                FilterBondBean.RowsBean.CellBean cell = rowsBean.getCell();
                                if (cell != null) {
                                    switch (cell.getIssuer_rating_cd()) {
                                        case "AAA":
                                        case "AA+":
                                        case "AA":
                                            if (!cell.getYtm_rt_tax().contains("-")) {
                                                cell.setType("防");
                                                defBeans.add(cell);
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                        }
                        Collections.sort(defBeans);
                        cellBeans.addAll(defBeans);
                        allBond.setValue(cellBeans);
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
