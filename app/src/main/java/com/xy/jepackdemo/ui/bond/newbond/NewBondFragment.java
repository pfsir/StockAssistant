package com.xy.jepackdemo.ui.bond.newbond;

import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xy.baselib.base.BaseFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.adapter.NewBondAdapter;
import com.xy.jepackdemo.bean.RecentBondBean;
import com.xy.jepackdemo.databinding.FragmentNewBondBinding;
import com.xy.jepackdemo.ui.SettingActivity;

import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 新债界面
 *
 * 债券名字 bond_nm
 * 股票名字 stock_nm
 * 级别 rating_cd
 * 方案进展 progress_nm
 * 现价比转股价 pma_rt
 * 当前状态：ap_flag E是即将上市，D是当日上市，A是今日申购，B是未来申购，C是申购过了
 */
public class NewBondFragment extends BaseFragment<NewBondViewModel, FragmentNewBondBinding> {

    private NewBondAdapter newBondAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_new_bond;
    }

    @Override
    protected void initView() {
        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                viewModel.requestNewBond(false);
            }
        });
        dataBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishLoadMore();
            }
        });


        dataBinding.newBondList.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        newBondAdapter = new NewBondAdapter();
        dataBinding.newBondList.setAdapter(newBondAdapter);
    }

    @Override
    protected void initData() {
        viewModel.requestNewBond(true);

        viewModel.getNewBondList().observe(this, new Observer<List<RecentBondBean.RowsBean.CellBean>>() {
            @Override
            public void onChanged(List<RecentBondBean.RowsBean.CellBean> bean) {
                dataBinding.refreshLayout.finishRefresh();
                newBondAdapter.setNewData(bean);
            }
        });
    }

    @Override
    protected NewBondViewModel initViewModel() {
        return ViewModelProviders.of(this).get(NewBondViewModel.class);
    }

    @Override
    protected void showError(Object obj) {

    }
}
