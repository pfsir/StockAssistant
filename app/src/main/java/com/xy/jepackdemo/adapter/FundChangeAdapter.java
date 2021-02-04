package com.xy.jepackdemo.adapter;

import com.xy.baselib.adapter.BaseDBRVAdapter;
import com.xy.jepackdemo.BR;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.FundDetailBean;
import com.xy.jepackdemo.bean.FundValuationBean;
import com.xy.jepackdemo.databinding.ItemFundValuationBinding;

import java.util.List;

/**
 * @author libo
 * @date 2019/3/10.
 * description
 */
public class FundChangeAdapter extends BaseDBRVAdapter<FundDetailBean.DataBean.ItemsBean, ItemFundValuationBinding> {

    public FundChangeAdapter() {
        super(R.layout.item_fund_change, BR.bean);
    }
}
