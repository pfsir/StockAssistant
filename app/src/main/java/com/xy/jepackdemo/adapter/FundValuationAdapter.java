package com.xy.jepackdemo.adapter;

import com.xy.baselib.adapter.BaseDBRVAdapter;
import com.xy.jepackdemo.BR;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.FilterBondBean;
import com.xy.jepackdemo.bean.FundValuationBean;
import com.xy.jepackdemo.databinding.ItemChoiceBondCellLayoutBinding;
import com.xy.jepackdemo.databinding.ItemFundValuationBinding;

/**
 * @author libo
 * @date 2019/3/10.
 * description
 */
public class FundValuationAdapter extends BaseDBRVAdapter<FundValuationBean.DataBean.ItemsBean.TradingElementsBean, ItemFundValuationBinding> {

    public FundValuationAdapter() {
        super(R.layout.item_fund_valuation, BR.bean);
    }
}
