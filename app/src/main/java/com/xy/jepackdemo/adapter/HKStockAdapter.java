package com.xy.jepackdemo.adapter;

import android.text.TextPaint;
import android.text.TextUtils;

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
        binding.hkApplyDate.setText(applyDate);

        if (!TextUtils.isEmpty(cell.getLucky_draw_rt())) {
            //一手中签率
            String luckyRt = cell.getLucky_draw_rt() + "%";
            if (cell.getLucky_draw_rt().endsWith(".00")) {
                luckyRt = cell.getLucky_draw_rt().substring(0, cell.getLucky_draw_rt().length() - 3) + "%";
            }
            binding.hkLuckyDrawRt.setText(luckyRt);
        }else {
            binding.hkLuckyDrawRt.setText("-");
        }
        if (!TextUtils.isEmpty(cell.getFirst_incr_rt())) {
            //首日涨幅
            String incrRt = cell.getFirst_incr_rt() + "%";
            if (cell.getFirst_incr_rt().endsWith(".00")) {
                incrRt = cell.getFirst_incr_rt().substring(0, cell.getFirst_incr_rt().length() - 3) + "%";
            }
            binding.hkIncrRtText.setText(incrRt);
        }else {
            binding.hkIncrRtText.setText("-");
        }

        try {
            String startDate = (DateUtil.getInstance().longToDate(System.currentTimeMillis(), "yyyy-MM-dd").getYear() + 1900) + "-" + cell.getApply_dt().substring(0, 5);
            String endDate = (DateUtil.getInstance().longToDate(System.currentTimeMillis(), "yyyy-MM-dd").getYear() + 1900) + "-" + cell.getApply_end_dt().substring(0, 5);
            long startTime = DateUtil.getInstance().stringToLong(startDate, "yyyy-MM-dd");
            long endTime = DateUtil.getInstance().stringToLong(endDate, "yyyy-MM-dd") + 24 * 60 * 60 * 1000;
            if (System.currentTimeMillis() > startTime && System.currentTimeMillis() < endTime) {
                binding.hkApplyDate.setTextColor(ContextCompat.getColor(context, R.color.color_EB3323));
                TextPaint tp = binding.hkApplyDate.getPaint();
                tp.setFakeBoldText(true);
            } else {
                binding.hkApplyDate.setTextColor(ContextCompat.getColor(context, R.color.color_B2B2B2));
                TextPaint tp = binding.hkApplyDate.getPaint();
                tp.setFakeBoldText(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
