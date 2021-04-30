package com.xy.jepackdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.FgiBean;
import com.xy.jepackdemo.common.CommonUtil;
import com.xy.jepackdemo.ui.view.ChartsLineView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oyangpengfei
 */


public class FgiViewAdapter extends RecyclerView.Adapter<FgiViewAdapter.ViewHolder> {
    private final List<FgiBean.DataFgi> fgiList;
    private final long mTemperatureMax;
    private final long mTemperatureMin;

    public FgiViewAdapter(List<FgiBean.DataFgi> fgiList) {
        this.fgiList = fgiList;
        List<Long> tempList = new ArrayList<>();
        for (FgiBean.DataFgi bean : fgiList) {
            tempList.add(Long.parseLong(bean.getValue()));
        }
        Long[] mHeight = tempList.toArray(new Long[tempList.size()]);
        //计算最大差值
        mTemperatureMax = CommonUtil.calculateMax(mHeight);
        mTemperatureMin = CommonUtil.calculateMin(mHeight);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_btc_fgi, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //设置RecyclerView 的这个holder 不复用
        holder.setIsRecyclable(false);
        int prePosition = position - 1;
        int nextPosition = position + 1;

        int temp = Integer.parseInt(fgiList.get(position).getValue());
        if (position == 0) {
            int nextTemp = Integer.parseInt(fgiList.get(nextPosition).getValue());
            holder.mChartsLineView.draws(temp, nextTemp, ChartsLineView.FIRST_ITEM);
        } else if (position == getItemCount() - 1) {
            int preTemp = Integer.parseInt(fgiList.get(prePosition).getValue());
            holder.mChartsLineView.draws(preTemp, temp, ChartsLineView.LAST_ITEM, true);
        } else {
            int preTemp2 = Integer.parseInt(fgiList.get(prePosition).getValue());
            int nextTemp2 = Integer.parseInt(fgiList.get(nextPosition).getValue());
            holder.mChartsLineView.draws(preTemp2, temp, nextTemp2, ChartsLineView.MEDIUM_ITEM);
        }

        final FgiBean.DataFgi bean = fgiList.get(position);
        holder.mChartsLineView.setText(mTemperatureMax, mTemperatureMin, bean.getValue());
        holder.mChartsLineView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), bean.getDatetime(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return fgiList.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        ChartsLineView mChartsLineView;

        public ViewHolder(View itemView) {
            super(itemView);
            mChartsLineView = itemView.findViewById(R.id.charts_view);
        }

    }
}
