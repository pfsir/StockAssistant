package com.xy.jepackdemo.adapter;

import android.text.TextPaint;

import androidx.core.content.ContextCompat;

import com.xy.baselib.adapter.BaseDBRVAdapter;
import com.xy.jepackdemo.BR;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.RecentBondBean;
import com.xy.jepackdemo.databinding.ItemNewBondCellLayoutBinding;

/**
 * @author libo
 * @date 2019/3/10.
 * description
 */
public class NewBondAdapter extends BaseDBRVAdapter<RecentBondBean.RowsBean.CellBean, ItemNewBondCellLayoutBinding> {

    public NewBondAdapter() {
        super(R.layout.item_new_bond_cell_layout, BR.bean);
    }

    @Override
    protected void onBindViewHolder(RecentBondBean.RowsBean.CellBean cellBean, ItemNewBondCellLayoutBinding binding, int position) {
        super.onBindViewHolder(cellBean, binding, position);
        TextPaint paint = binding.itemStatus.getPaint();
        paint.setFakeBoldText(false);
        switch (cellBean.getAp_flag()) {
            case "A":
            case "D":
                binding.itemStatus.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary));
                paint.setFakeBoldText(true);
                break;
            case "C":
                binding.itemStatus.setTextColor(ContextCompat.getColor(context, R.color.color_B2B2B2));
                break;
            default:
                binding.itemStatus.setTextColor(ContextCompat.getColor(context, R.color.color_333333));
                break;
        }
    }
}
