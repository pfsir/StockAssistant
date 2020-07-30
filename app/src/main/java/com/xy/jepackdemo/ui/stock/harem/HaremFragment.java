package com.xy.jepackdemo.ui.stock.harem;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xy.baselib.base.BaseLazyFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.adapter.HaremAdapter;
import com.xy.jepackdemo.bean.StockBean;
import com.xy.jepackdemo.databinding.FragmentHaremBinding;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 股票界面
 */
public class HaremFragment extends BaseLazyFragment<HaremViewModel, FragmentHaremBinding> {

    private HaremAdapter haremAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_harem;
    }

    @Override
    protected void initView() {
        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                viewModel.requestStock(true);
            }
        });
        dataBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishLoadMore();
            }
        });

        dataBinding.stockList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        haremAdapter = new HaremAdapter();
        dataBinding.stockList.setAdapter(haremAdapter);
    }

    @Override
    protected void initData() {
        viewModel.getStock().observe(this, new Observer<List<StockBean.DataBean>>() {
            @Override
            public void onChanged(List<StockBean.DataBean> bean) {
                dataBinding.refreshLayout.finishRefresh();
                haremAdapter.setNewData(bean);
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestStock(true);
    }

    @Override
    protected HaremViewModel initViewModel() {
        return ViewModelProviders.of(this).get(HaremViewModel.class);
    }

    @Override
    protected void showError(Object obj) {

    }
}
