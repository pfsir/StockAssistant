package com.xy.jepackdemo.ui.fund.rotate;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xy.baselib.base.BaseLazyFragment;
import com.xy.baselib.utils.SharePreUtil;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.FundTrueBean;
import com.xy.jepackdemo.common.App;
import com.xy.jepackdemo.databinding.FragmentRotateFundBinding;

import static com.xy.jepackdemo.ui.fund.rotate.RotateViewModel.LAST_ROTATE;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 300和500基金轮动界面
 */
public class RotateFragment extends BaseLazyFragment<RotateViewModel, FragmentRotateFundBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_rotate_fund;
    }

    @Override
    protected void initView() {
        dataBinding.setLifecycleOwner(this);
        dataBinding.setModel(viewModel);
        dataBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                viewModel.requestFund(true);
            }
        });
        dataBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                dataBinding.refreshLayout.finishLoadMore();
            }
        });
    }

    @Override
    protected void initData() {
        viewModel.getFund().observe(this, new Observer<FundTrueBean>() {
            @Override
            public void onChanged(final FundTrueBean bean) {
                dataBinding.refreshLayout.finishRefresh();
                if ("是".equals(bean.getShouldRotate())) {
                    dataBinding.tvShouldRotate.setTextColor(getContext().getResources().getColor(R.color.color_EB3323));
                    dataBinding.tvRotate.setVisibility(View.VISIBLE);
                    dataBinding.tvRotate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            SharePreUtil.putString(App.getInstance(), LAST_ROTATE, bean.getMaxValue());
                            viewModel.requestFund(true);
                        }
                    });
                } else {
                    dataBinding.tvShouldRotate.setTextColor(getContext().getResources().getColor(R.color.color_333333));
                    dataBinding.tvRotate.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestFund(true);
    }

    @Override
    protected RotateViewModel initViewModel() {
        return ViewModelProviders.of(this).get(RotateViewModel.class);
    }

    @Override
    protected void showError(Object obj) {
        dataBinding.refreshLayout.finishRefresh();
    }
}
