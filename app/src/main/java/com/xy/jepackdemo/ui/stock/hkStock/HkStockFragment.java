package com.xy.jepackdemo.ui.stock.hkStock;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xy.baselib.base.BaseLazyFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.adapter.HKStockAdapter;
import com.xy.jepackdemo.adapter.HaremAdapter;
import com.xy.jepackdemo.bean.HkIpoBean;
import com.xy.jepackdemo.bean.StockBean;
import com.xy.jepackdemo.databinding.FragmentHkStockBinding;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 港股
 */
public class HkStockFragment extends BaseLazyFragment<HkStockViewModel, FragmentHkStockBinding> {

    private HKStockAdapter hkStockAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_hk_stock;
    }

    @Override
    protected void initView() {
        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                viewModel.requestHkIpoStock(true);
            }
        });
        dataBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishLoadMore();
            }
        });

        dataBinding.hkStockList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        hkStockAdapter = new HKStockAdapter();

        dataBinding.hkStockList.setAdapter(hkStockAdapter);
    }

    @Override
    protected void initData() {
        viewModel.getHkIpoStockData().observe(this, new Observer<List<HkIpoBean.RowsBean>>() {
            @Override
            public void onChanged(List<HkIpoBean.RowsBean> bean) {
                dataBinding.refreshLayout.finishRefresh();
                hkStockAdapter.setNewData(bean);
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestHkIpoStock(true);
    }

    @Override
    protected HkStockViewModel initViewModel() {
        return ViewModelProviders.of(this).get(HkStockViewModel.class);
    }

    @Override
    protected void showError(Object obj) {
        dataBinding.refreshLayout.finishRefresh();
    }
}
