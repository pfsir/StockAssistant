package com.xy.jepackdemo.ui.fund;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy;
import com.xy.baselib.base.BaseNoModelFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.databinding.FragmentBondBinding;
import com.xy.jepackdemo.databinding.FragmentFundBinding;
import com.xy.jepackdemo.ui.SettingActivity;
import com.xy.jepackdemo.ui.bond.choice.ChoiceBondFragment;
import com.xy.jepackdemo.ui.bond.newbond.NewBondFragment;
import com.xy.jepackdemo.ui.fund.arbitrage.ArbitrageFundFragment;
import com.xy.jepackdemo.ui.fund.valuation.ValuationFundFragment;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 基金界面
 */
public class FundFragment extends BaseNoModelFragment<FragmentFundBinding> {


    private TextView tv1;
    private TextView tv2;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_fund;
    }

    @Override
    protected void initView() {
        dataBinding.fundViewPager.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                if (position == 0) {
                    return new ValuationFundFragment();
                }
                return new ArbitrageFundFragment();
            }

            @Override
            public int getItemCount() {
                return 2;
            }
        });

        dataBinding.fundViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        dataBinding.fundViewPager.setCurrentItem(0,false);

        dataBinding.fundViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    if (tv1 != null && tv2 != null) {
                        tv1.setTextColor(getResources().getColor(R.color.colorPrimary));
                        tv2.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                    }
                } else {
                    if (tv1 != null && tv2 != null) {
                        tv1.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                        tv2.setTextColor(getResources().getColor(R.color.colorPrimary));
                    }
                }
            }
        });

        new TabLayoutMediator(dataBinding.bondTab, dataBinding.fundViewPager, true, new TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        }).attach();

        //这里需要根据position修改tab的样式和文字等
        TabLayout.Tab tab1 = dataBinding.bondTab.getTabAt(0);
        if (tab1 != null) {
            tab1.setCustomView(getTabView0());
        }
        TabLayout.Tab tab2 = dataBinding.bondTab.getTabAt(1);
        if (tab2 != null) {
            tab2.setCustomView(getTabView1());
        }

        dataBinding.ivSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void initData() {

    }

    private View getTabView0() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View view = mInflater.inflate(R.layout.item_tab_left, null);
        tv1 = view.findViewById(R.id.tab_text_left);
        tv1.setText("估值");
        return view;
    }

    private View getTabView1() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View view = mInflater.inflate(R.layout.item_tab_right, null);
        tv2 = view.findViewById(R.id.tab_text_right);
        tv2.setText("套利");
        return view;
    }
}
