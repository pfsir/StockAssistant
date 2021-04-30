package com.xy.jepackdemo.adapter;

import android.text.TextPaint;

import androidx.core.content.ContextCompat;

import com.xy.baselib.adapter.BaseDBRVAdapter;
import com.xy.jepackdemo.BR;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.FundLofBean;
import com.xy.jepackdemo.databinding.ItemFundArbitrageBinding;

/**
 * @author libo
 * @date 2019/3/10.
 * description
 */
public class FundArbitrageAdapter extends BaseDBRVAdapter<FundLofBean.RowsBean, ItemFundArbitrageBinding> {

    public FundArbitrageAdapter() {
        super(R.layout.item_fund_arbitrage, BR.bean);
    }

    @Override
    protected void onBindViewHolder(FundLofBean.RowsBean rowsBean, ItemFundArbitrageBinding binding, int position) {
        super.onBindViewHolder(rowsBean, binding, position);
        switch (position){
            case 0:
            case 1:
                binding.itemFundNm.setTextColor(ContextCompat.getColor(context, R.color.color_EB3323));
                binding.itemFundId.setTextColor(ContextCompat.getColor(context, R.color.color_F29089));
                break;
            default:
                binding.itemFundNm.setTextColor(ContextCompat.getColor(context, R.color.color_333333));
                binding.itemFundId.setTextColor(ContextCompat.getColor(context, R.color.color_666666));
                break;
        }
    }
}
