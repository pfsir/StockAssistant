package com.xy.jepackdemo.adapter;

import android.text.TextPaint;

import androidx.core.content.ContextCompat;

import com.xy.baselib.adapter.BaseDBRVAdapter;
import com.xy.jepackdemo.BR;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.HkIpoBean;
import com.xy.jepackdemo.common.DateUtil;
import com.xy.jepackdemo.databinding.ItemHkStockLayoutBinding;

/**
 * @author libo
 * @date 2019/3/10.
 * description
 */
public class HKStockAdapter extends BaseDBRVAdapter<HkIpoBean.RowsBean, ItemHkStockLayoutBinding> {

    public HKStockAdapter() {
        super(R.layout.item_hk_stock_layout, BR.bean);
    }

    @Override
    protected void onBindViewHolder(HkIpoBean.RowsBean dataBean, ItemHkStockLayoutBinding binding, int position) {
        super.onBindViewHolder(dataBean, binding, position);
        HkIpoBean.RowsBean.CellBean cell = dataBean.getCell();
        String applyDate = cell.getApply_dt().substring(0, 5) + "~" + cell.getApply_end_dt().substring(0, 5);
        String advise = cell.getJsl_advise_text().startsWith("<") ? "-" : cell.getJsl_advise_text();
        binding.hkAdviseText.setText(advise);
        binding.hkApplyDate.setText(applyDate);
        binding.hkListDate.setText(cell.getList_dt().substring(0, 5));
        try {
            String startDate = (DateUtil.getInstance().longToDate(System.currentTimeMillis(), "yyyy-MM-dd").getYear() + 1900) + "-" + cell.getApply_dt().substring(0, 5);
            String endDate = (DateUtil.getInstance().longToDate(System.currentTimeMillis(), "yyyy-MM-dd").getYear() + 1900) + "-" + cell.getApply_end_dt().substring(0, 5);
            long startTime = DateUtil.getInstance().stringToLong(startDate, "yyyy-MM-dd");
            long endTime = DateUtil.getInstance().stringToLong(endDate, "yyyy-MM-dd") + 24 * 60 * 60 * 1000;
            if (System.currentTimeMillis() > startTime && System.currentTimeMillis() < endTime) {
                binding.hkApplyDate.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary));
                TextPaint tp = binding.hkApplyDate.getPaint();
                tp.setFakeBoldText(true);
            } else {
                binding.hkApplyDate.setTextColor(ContextCompat.getColor(context, R.color.color_B2B2B2));
                TextPaint tp = binding.hkApplyDate.getPaint();
                tp.setFakeBoldText(false);
            }
            String listDate = (DateUtil.getInstance().longToDate(System.currentTimeMillis(), "yyyy-MM-dd").getYear() + 1900) + "-" + cell.getList_dt().substring(0, 5);
            String currentDate = DateUtil.getInstance().longToString(System.currentTimeMillis(), "yyyy-MM-dd");
            if (currentDate.equals(listDate)) {
                binding.hkListDate.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary));
                TextPaint tp = binding.hkListDate.getPaint();
                tp.setFakeBoldText(true);
            } else {
                binding.hkListDate.setTextColor(ContextCompat.getColor(context, R.color.color_B2B2B2));
                TextPaint tp = binding.hkListDate.getPaint();
                tp.setFakeBoldText(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
