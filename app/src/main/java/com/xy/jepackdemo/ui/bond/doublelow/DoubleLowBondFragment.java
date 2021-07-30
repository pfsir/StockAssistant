package com.xy.jepackdemo.ui.bond.doublelow;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xy.baselib.base.BaseLazyFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.adapter.DoubleLowBondAdapter;
import com.xy.jepackdemo.bean.DoubleLowBondBean;
import com.xy.jepackdemo.databinding.FragmentDoubleLowBondBinding;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2021/7/19.
 * description 双低债券界面
 */
public class DoubleLowBondFragment extends BaseLazyFragment<DoubleLowViewModel, FragmentDoubleLowBondBinding> {

    private DoubleLowBondAdapter doubleLowBondAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_double_low_bond;
    }

    @Override
    protected void initView() {
        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                viewModel.requestDoubleLowBond(false);
            }
        });
        dataBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishLoadMore();
            }
        });

        dataBinding.bondList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        doubleLowBondAdapter = new DoubleLowBondAdapter();
        dataBinding.bondList.setAdapter(doubleLowBondAdapter);
    }

    @Override
    protected void initData() {
        viewModel.getDoubleLowBond().observe(this, new Observer<List<DoubleLowBondBean.RowsBean.CellBean>>() {
            @Override
            public void onChanged(List<DoubleLowBondBean.RowsBean.CellBean> bean) {
                dataBinding.refreshLayout.finishRefresh();
                doubleLowBondAdapter.setNewData(bean);
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestDoubleLowBond(true);
    }

    @Override
    protected DoubleLowViewModel initViewModel() {
        return ViewModelProviders.of(this).get(DoubleLowViewModel.class);
    }

    @Override
    protected void showError(Object obj) {
        dataBinding.refreshLayout.finishRefresh();
    }
}
