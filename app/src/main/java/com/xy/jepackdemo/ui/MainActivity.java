package com.xy.jepackdemo.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.xy.baselib.base.BaseNoModelActivity;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.databinding.ActivityMainBinding;
import com.xy.jepackdemo.ui.bond.BondFragment;
import com.xy.jepackdemo.ui.fund.FundFragment;
import com.xy.jepackdemo.ui.stock.StockFragment;
import com.xy.jepackdemo.ui.strategy.StrategyFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/7/8.
 * description 首页
 */
public class MainActivity extends BaseNoModelActivity<ActivityMainBinding> implements View.OnClickListener {


    private List<Fragment> fragments;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        dataBinding.mainBoneLayout.setOnClickListener(this);
        dataBinding.mainStockLayout.setOnClickListener(this);
        dataBinding.mainFundLayout.setOnClickListener(this);
        dataBinding.mainStrategyLayout.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {

    }

    @Override
    protected void initData() {
        fragments = new ArrayList<>();
        fragments.add(new BondFragment());
        fragments.add(new StockFragment());
        fragments.add(new FundFragment());
        fragments.add(new StrategyFragment());

        showFragment(0);
        changBottom(0);
    }


    public void showFragment(final int position) {
        if (fragments.size() == 0) {
            return;
        }
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        for (int i = 0; i < fragments.size(); i++) {
            Fragment fragment = fragments.get(i);
            if (i == position) {
                if (fragment.isAdded()) {
                    transaction.show(fragment);
                } else {
                    transaction.add(R.id.view_main, fragment);
                }
            } else if (i == position + 1) {
                if (!fragment.isAdded()) {
                    transaction.add(R.id.view_main, fragment);
                }
                transaction.hide(fragment);
            } else {
                if (fragment.isAdded()) {
                    transaction.hide(fragment);
                }
            }
        }
        //commit允许状态丢失
        transaction.commitAllowingStateLoss();
    }


    /**
     * 改变底部控件
     */
    public void changBottom(int position) {
        dataBinding.mainBoneText.setTextColor(ContextCompat.getColor(this, R.color.color_666666));
        dataBinding.mainStockText.setTextColor(ContextCompat.getColor(this, R.color.color_666666));
        dataBinding.mainFundText.setTextColor(ContextCompat.getColor(this, R.color.color_666666));
        dataBinding.mainStrategyText.setTextColor(ContextCompat.getColor(this, R.color.color_666666));

        dataBinding.mainBoneImg.setImageResource(R.drawable.bond_un_select);
        dataBinding.mainStockImg.setImageResource(R.drawable.stock_un_select);
        dataBinding.mainFundImg.setImageResource(R.drawable.fund_un_select);
        dataBinding.mainStrategyImg.setImageResource(R.drawable.strategy_un_select);

        switch (position) {
            case 0:
                dataBinding.mainBoneImg.setImageResource(R.drawable.bond);
                dataBinding.mainBoneText.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                break;
            case 1:
                dataBinding.mainStockImg.setImageResource(R.drawable.stock);
                dataBinding.mainStockText.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                break;
            case 2:
                dataBinding.mainFundImg.setImageResource(R.drawable.fund);
                dataBinding.mainFundText.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                break;
            case 3:
                dataBinding.mainStrategyImg.setImageResource(R.drawable.strategy);
                dataBinding.mainStrategyText.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                break;
            default:
                break;
        }
    }

    @Override
    public void onClick(View view) {
        int position = 0;
        switch (view.getId()){
            case R.id.main_stock_layout:
                position = 1;
                break;
            case R.id.main_fund_layout:
                position = 2;
                break;
            case R.id.main_strategy_layout:
                position = 3;
                break;
            default:
                break;
        }
        showFragment(position);
        changBottom(position);
    }
}
