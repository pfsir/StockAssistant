package com.xy.jepackdemo.adapter;

import android.text.TextPaint;

import androidx.core.content.ContextCompat;

import com.xy.baselib.adapter.BaseDBRVAdapter;
import com.xy.jepackdemo.BR;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.StockBean;
import com.xy.jepackdemo.databinding.ItemHaremLayoutBinding;

/**
 * @author libo
 * @date 2019/3/10.
 * description
 */
public class HaremAdapter extends BaseDBRVAdapter<StockBean.DataBean, ItemHaremLayoutBinding> {

    public HaremAdapter() {
        super(R.layout.item_harem_layout, BR.bean);
    }

    @Override
    protected void onBindViewHolder(StockBean.DataBean dataBean, ItemHaremLayoutBinding binding, int position) {
        super.onBindViewHolder(dataBean, binding, position);
        TextPaint paint = binding.itemN.getPaint();
        paint.setFakeBoldText(false);
        double pessimisticN = Double.parseDouble(dataBean.getPessimisticN());

        if (pessimisticN > 15) {
            binding.itemN.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary));
        }
    }
}
