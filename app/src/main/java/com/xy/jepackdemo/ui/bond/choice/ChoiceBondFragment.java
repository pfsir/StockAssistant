package com.xy.jepackdemo.ui.bond.choice;

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
import com.xy.jepackdemo.bean.FilterBondBean;
import com.xy.jepackdemo.databinding.FragmentChoiceBondBinding;
import com.xy.jepackdemo.ui.SettingActivity;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 精选债券界面
 *
 * 债券名字 bond_nm
 * 股票名字 stock_nm
 * 级别 rating_cd
 * 方案进展 progress_nm
 * 现价比转股价 pma_rt
 * 当前状态：ap_flag E是即将上市，A是今日申购，B是未来申购，C是申购过了
 */
public class ChoiceBondFragment extends BaseLazyFragment<ChoiceViewModel, FragmentChoiceBondBinding> {

    private FilterBondAdapter filterBondAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_choice_bond;
    }

    @Override
    protected void initView() {
        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                viewModel.requestAttackBond(false);
            }
        });
        dataBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishLoadMore();
            }
        });

        dataBinding.bondList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        filterBondAdapter = new FilterBondAdapter();
        dataBinding.bondList.setAdapter(filterBondAdapter);
    }

    @Override
    protected void initData() {
        viewModel.getAllBond().observe(this, new Observer<List<FilterBondBean.RowsBean.CellBean>>() {
            @Override
            public void onChanged(List<FilterBondBean.RowsBean.CellBean> bean) {
                dataBinding.refreshLayout.finishRefresh();
                filterBondAdapter.setNewData(bean);
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestAttackBond(true);
    }

    @Override
    protected ChoiceViewModel initViewModel() {
        return ViewModelProviders.of(this).get(ChoiceViewModel.class);
    }

    @Override
    protected void showError(Object obj) {
        dataBinding.refreshLayout.finishRefresh();
    }
}
