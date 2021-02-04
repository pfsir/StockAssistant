package com.xy.jepackdemo.ui.fund.change;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xy.baselib.base.BaseLazyFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.adapter.FundChangeAdapter;
import com.xy.jepackdemo.bean.FundDetailBean;
import com.xy.jepackdemo.common.CommonUtil;
import com.xy.jepackdemo.databinding.FragmentChangeFundBinding;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 优选，钉365界面
 */
public class ChangeFundFragment extends BaseLazyFragment<ChangeFundViewModel, FragmentChangeFundBinding> {

    private FundChangeAdapter fundChangeAdapter;
    private int fundType;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_change_fund;
    }

    @Override
    protected void initView() {
        Bundle arguments = getArguments();
        if (arguments != null){
            fundType = arguments.getInt(CommonUtil.FUND_TYPE);
        }
        dataBinding.setLifecycleOwner(this);
        dataBinding.setModel(viewModel);

        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                viewModel.requestFundValuation(fundType,false);
            }
        });
        dataBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishLoadMore();
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        linearLayoutManager.setSmoothScrollbarEnabled(true);
        linearLayoutManager.setAutoMeasureEnabled(true);
        dataBinding.valuationFundList.setLayoutManager(linearLayoutManager);

        //取消recycleView的滑动
        dataBinding.valuationFundList.setHasFixedSize(true);
        dataBinding.valuationFundList.setNestedScrollingEnabled(false);
        fundChangeAdapter = new FundChangeAdapter();
        dataBinding.valuationFundList.setAdapter(fundChangeAdapter);
    }

    @Override
    protected void initData() {

        viewModel.getFundValuationData().observe(this, new Observer<List<FundDetailBean.DataBean.ItemsBean>>() {
            @Override
            public void onChanged(List<FundDetailBean.DataBean.ItemsBean> itemsBeans) {
                dataBinding.refreshLayout.finishRefresh();
                fundChangeAdapter.setNewData(itemsBeans);
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestFundValuation(fundType,true);
    }

    @Override
    protected ChangeFundViewModel initViewModel() {
        return ViewModelProviders.of(this).get(ChangeFundViewModel.class);
    }

    @Override
    protected void showError(Object obj) {

    }
}
