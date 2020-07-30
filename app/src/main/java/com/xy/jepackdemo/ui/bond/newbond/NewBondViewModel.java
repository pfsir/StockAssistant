package com.xy.jepackdemo.ui.bond.newbond;

import android.text.TextUtils;

import com.xy.baselib.lifecycle.BaseViewModel;
import com.xy.baselib.lifecycle.UnPeekLiveData;
import com.xy.jepackdemo.bean.RecentBondBean;
import com.xy.jepackdemo.http.AbstractSubscriber;
import com.xy.jepackdemo.http.HttpClient;
import com.xy.jepackdemo.http.RxUtil;

import java.util.ArrayList;
import java.util.List;


public class NewBondViewModel extends BaseViewModel {

    /**
     * 当数据请求成功回调
     */
    protected UnPeekLiveData<List<RecentBondBean.RowsBean.CellBean>> newBondList = new UnPeekLiveData<>();


    public UnPeekLiveData<List<RecentBondBean.RowsBean.CellBean>> getNewBondList() {
        return newBondList;
    }

    /**
     * 请求新债
     */
    public void requestNewBond(final boolean show) {
        if (show) {
            showDialog.setValue(true, "加载中");
        }

        addDisposable(HttpClient.Builder.getJslService()
                .getJslRecentBond(System.currentTimeMillis())
                .compose(RxUtil.<RecentBondBean>rxSchedulerHelper())
                .subscribeWith(new AbstractSubscriber<RecentBondBean>() {
                    @Override
                    public void onNext(RecentBondBean recentBondBean) {
                        if (show) {
                            showDialog.setValue(false);
                        }

                        //处理数据
                        List<RecentBondBean.RowsBean> rows = recentBondBean.getRows();
                        if (rows == null || rows.size() == 0) {
                            return;
                        }

                        int maxRowsLength = 40;
                        List<RecentBondBean.RowsBean> recentRows = new ArrayList<>();

                        for (RecentBondBean.RowsBean rowsBean : rows) {
                            if (rowsBean == null || rowsBean.getCell() == null || TextUtils.isEmpty(rowsBean.getCell().getBond_nm())
                                    || rowsBean.getCell().getBond_nm().endsWith("EB")) {
                                continue;
                            }
                            if (recentRows.size() >= maxRowsLength) {
                               break;
                            }
                            recentRows.add(rowsBean);
                        }

                        showData(recentRows);
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

    private void showData(List<RecentBondBean.RowsBean> tenRows) {
        List<RecentBondBean.RowsBean.CellBean> cellBeanList = new ArrayList<>();
        for (RecentBondBean.RowsBean rowsBean : tenRows) {
            RecentBondBean.RowsBean.CellBean cell = rowsBean.getCell();
            String pma_rt = cell.getPma_rt();
            double pmaRt = Double.parseDouble(pma_rt);
            int pmaRtInt = (int) pmaRt;
            int rating;
            switch (cell.getRating_cd().trim()) {
                case "AAA":
                    rating = 15;
                    break;
                case "AA+":
                case "AA":
                    rating = 10;
                    break;
                case "AA-":
                    rating = 5;
                    break;
                default:
                    rating = 0;
                    break;
            }
            String esPrice;
            if (pmaRtInt < 90) {
                esPrice = (pmaRtInt + rating + 20 + 5) + "";
            } else if (pmaRtInt < 100) {
                esPrice = (pmaRtInt + rating + 10 + 5) + "";
            } else {
                esPrice = (pmaRtInt + rating + 5) + "";
            }

            cell.setEs_price(esPrice);

            cellBeanList.add(cell);
            newBondList.setValue(cellBeanList);
        }
    }


}
