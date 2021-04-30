package com.xy.jepackdemo.ui.fund.valuation;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xy.baselib.base.BaseLazyFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.adapter.FundValuationAdapter;
import com.xy.jepackdemo.bean.FundValuationBean;
import com.xy.jepackdemo.databinding.FragmentValuationFundBinding;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 基金估值界面
 */
public class ValuationFundFragment extends BaseLazyFragment<ValuationFundViewModel, FragmentValuationFundBinding> {

    private FundValuationAdapter fundValuationAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_valuation_fund;
    }

    @Override
    protected void initView() {
        dataBinding.setLifecycleOwner(this);
        dataBinding.setModel(viewModel);

        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                viewModel.requestFundValuation(false);
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
        fundValuationAdapter = new FundValuationAdapter();
        dataBinding.valuationFundList.setAdapter(fundValuationAdapter);
    }

    @Override
    protected void initData() {

        viewModel.getFundValuationData().observe(this, new Observer<FundValuationBean.DataBean.ItemsBean>() {
            @Override
            public void onChanged(FundValuationBean.DataBean.ItemsBean bean) {
                dataBinding.refreshLayout.finishRefresh();
                fundValuationAdapter.setNewData(bean.getTrading_elements());
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestFundValuation(true);
    }

    @Override
    protected ValuationFundViewModel initViewModel() {
        return ViewModelProviders.of(this).get(ValuationFundViewModel.class);
    }

    @Override
    protected void showError(Object obj) {
        dataBinding.refreshLayout.finishRefresh();
    }
}
