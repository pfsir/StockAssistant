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
import com.xy.jepackdemo.common.DateUtil;
import com.xy.jepackdemo.ui.view.ChartsLineView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oyangpengfei
 */


public class BtcViewAdapter extends RecyclerView.Adapter<BtcViewAdapter.ViewHolder> {
    private final List<List<Float>> btcPriceList;
    private final long mTemperatureMax;
    private final long mTemperatureMin;

    public BtcViewAdapter(List<List<Float>> btcPriceList) {
        this.btcPriceList = btcPriceList;
        List<Long> tempList = new ArrayList<>();
        for (List<Float>  bean : btcPriceList) {
            tempList.add(bean.get(4).longValue());
        }
        Long[] mHeight = tempList.toArray(new Long[tempList.size()]);
        //计算最大差值
        mTemperatureMax = CommonUtil.calculateMax(mHeight);
        mTemperatureMin = CommonUtil.calculateMin(mHeight);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_btc_price, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //设置RecyclerView 的这个holder 不复用
        holder.setIsRecyclable(false);
        int prePosition = position - 1;
        int nextPosition = position + 1;

        long temp = btcPriceList.get(position).get(4).longValue();
        if (position == 0) {
            long nextTemp = btcPriceList.get(nextPosition).get(4).longValue();
            holder.mChartsLineView.draws(temp, nextTemp, ChartsLineView.FIRST_ITEM);
        } else if (position == getItemCount() - 1) {
            long preTemp = btcPriceList.get(prePosition).get(4).longValue();
            holder.mChartsLineView.draws(preTemp, temp, ChartsLineView.LAST_ITEM, true);
        } else {
            long preTemp2 = btcPriceList.get(prePosition).get(4).longValue();
            long nextTemp2 = btcPriceList.get(nextPosition).get(4).longValue();
            holder.mChartsLineView.draws(preTemp2, temp, nextTemp2, ChartsLineView.MEDIUM_ITEM);
        }

        final List<Float> bean = btcPriceList.get(position);
        holder.mChartsLineView.setText(mTemperatureMax, mTemperatureMin, bean.get(4).longValue()+"");
        holder.mChartsLineView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = DateUtil.getInstance().longToYMD(bean.get(0).longValue());
                //转为string
                Toast.makeText(v.getContext(), time, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return btcPriceList.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        ChartsLineView mChartsLineView;

        public ViewHolder(View itemView) {
            super(itemView);
            mChartsLineView = itemView.findViewById(R.id.charts_view);
        }

    }
}
