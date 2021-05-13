package com.xy.jepackdemo.ui.btc;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.xy.baselib.base.BaseLazyFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.adapter.BtcViewAdapter;
import com.xy.jepackdemo.adapter.FgiViewAdapter;
import com.xy.jepackdemo.bean.FgiBean;
import com.xy.jepackdemo.databinding.FragmentBtcBinding;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author oyangpengfei
 * @date 2021/04/29.
 * description btc
 */
public class BtcFragment extends BaseLazyFragment<BtcViewModel, FragmentBtcBinding> {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_btc;
    }

    @Override
    protected void initView() {
        dataBinding.ivPriceRecycler.addOnScrollListener(new RecyclerView.OnScrollListener( ) {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                dataBinding.ivFgiRecycler.scrollBy(dx, dy);
            }
        });
    }

    @Override
    protected void initData() {
        viewModel.getBtcPriceData().observe(this, new Observer<List<List<BigDecimal>>>() {
            @Override
            public void onChanged(List<List<BigDecimal>> bean) {
                LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
                layoutManager.setOrientation(RecyclerView.HORIZONTAL);
                dataBinding.ivPriceRecycler.setLayoutManager(layoutManager);
                BtcViewAdapter btcViewAdapter = new BtcViewAdapter(bean);
                dataBinding.ivPriceRecycler.setAdapter(btcViewAdapter);
            }
        });

        viewModel.getBtcFgiData().observe(this, new Observer<List<FgiBean.DataFgi>>() {
            @Override
            public void onChanged(List<FgiBean.DataFgi> bean) {
                LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
                layoutManager.setOrientation(RecyclerView.HORIZONTAL);
                dataBinding.ivFgiRecycler.setLayoutManager(layoutManager);
                FgiViewAdapter fgiViewAdapter = new FgiViewAdapter(bean);
                dataBinding.ivFgiRecycler.setAdapter(fgiViewAdapter);
            }
        });
    }

    @Override
    protected void lazyLoad() {
        viewModel.requestBtcPrice(true);
    }

    @Override
    protected BtcViewModel initViewModel() {
        return ViewModelProviders.of(this).get(BtcViewModel.class);
    }

    @Override
    protected void showError(Object obj) {

    }
}
