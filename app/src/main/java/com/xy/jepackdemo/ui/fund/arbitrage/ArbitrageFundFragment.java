package com.xy.jepackdemo.ui.fund.arbitrage;

import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xy.baselib.base.BaseLazyFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.adapter.FilterBondAdapter;
import com.xy.jepackdemo.adapter.FundArbitrageAdapter;
import com.xy.jepackdemo.bean.FilterBondBean;
import com.xy.jepackdemo.bean.FundLofBean;
import com.xy.jepackdemo.databinding.FragmentArbitrageFundBinding;
import com.xy.jepackdemo.ui.SettingActivity;
import com.xy.jepackdemo.ui.bond.choice.ChoiceViewModel;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 基金套利界面
 */
public class ArbitrageFundFragment extends BaseLazyFragment<ArbitrageFundViewModel, FragmentArbitrageFundBinding> {

    private FundArbitrageAdapter fundArbitrageAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_arbitrage_fund;
    }

    @Override
    protected void initView() {
        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishRefresh();
            }
        });
        dataBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishLoadMore();
            }
        });

        dataBinding.arbitrageFundList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        fundArbitrageAdapter = new FundArbitrageAdapter();
        dataBinding.arbitrageFundList.setAdapter(fundArbitrageAdapter);
    }

    @Override
    protected void initData() {
        viewModel.getLofFundData().observe(this, new Observer<List<FundLofBean.RowsBean>>() {
            @Override
            public void onChanged(List<FundLofBean.RowsBean> bean) {
                fundArbitrageAdapter.setNewData(bean);
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestLofFund(true);
    }

    @Override
    protected ArbitrageFundViewModel initViewModel() {
        return ViewModelProviders.of(this).get(ArbitrageFundViewModel.class);
    }

    @Override
    protected void showError(Object obj) {

    }
}
