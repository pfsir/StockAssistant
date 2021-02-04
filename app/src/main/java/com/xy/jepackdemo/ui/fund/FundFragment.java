package com.xy.jepackdemo.ui.fund;

import android.content.Intent;
import android.os.Bundle;
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
import com.xy.jepackdemo.common.CommonUtil;
import com.xy.jepackdemo.databinding.FragmentFundBinding;
import com.xy.jepackdemo.ui.SettingActivity;
import com.xy.jepackdemo.ui.fund.arbitrage.ArbitrageFundFragment;
import com.xy.jepackdemo.ui.fund.change.ChangeFundFragment;
import com.xy.jepackdemo.ui.fund.valuation.ValuationFundFragment;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 基金界面
 */
public class FundFragment extends BaseNoModelFragment<FragmentFundBinding> {


    private TextView tvLeft;
    private TextView tvCenterOne;
    private TextView tvCenterTwo;
    private TextView tvRight;
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
                Bundle bundle = new Bundle();
                switch (position){
                    case 0:
                        return new ValuationFundFragment();
                    case 1:
                        ChangeFundFragment changeFundFragment = new ChangeFundFragment();
                        bundle.putInt(CommonUtil.FUND_TYPE,CommonUtil.INITIATIVE);
                        changeFundFragment.setArguments(bundle);
                        return changeFundFragment;
                    case 2:
                        ChangeFundFragment changeFundFragment2= new ChangeFundFragment();
                        bundle.putInt(CommonUtil.FUND_TYPE,CommonUtil.D365);
                        changeFundFragment2.setArguments(bundle);
                        return changeFundFragment2;
                    default:
                        return new ArbitrageFundFragment();
                }
            }

            @Override
            public int getItemCount() {
                return 4;
            }
        });

        dataBinding.fundViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        dataBinding.fundViewPager.setCurrentItem(0,false);

        dataBinding.fundViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tvLeft.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                tvCenterOne.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                tvCenterTwo.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                tvRight.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                switch (position){
                    case 0:
                        tvLeft.setTextColor(getResources().getColor(R.color.colorPrimary));
                        break;
                    case 1:
                        tvCenterOne.setTextColor(getResources().getColor(R.color.colorPrimary));
                        break;
                    case 2:
                        tvCenterTwo.setTextColor(getResources().getColor(R.color.colorPrimary));
                        break;
                    case 3:
                        tvRight.setTextColor(getResources().getColor(R.color.colorPrimary));
                        break;
                }
            }
        });

        new TabLayoutMediator(dataBinding.bondTab, dataBinding.fundViewPager, true, new TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        }).attach();

        for (int i = 0; i < 4; i++) {
            //这里需要根据position修改tab的样式和文字等
            TabLayout.Tab tab = dataBinding.bondTab.getTabAt(i);
            switch (i){
                case 0:
                    tab.setCustomView(getTabViewLeft());
                    break;
                case 1:
                    tab.setCustomView(getCenterOne());
                    break;
                case 2:
                    tab.setCustomView(getCenterTwo());
                    break;
                case 3:
                    tab.setCustomView(getTabViewRight());
                    break;
            }
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

    private View getTabViewLeft() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View view = mInflater.inflate(R.layout.item_tab_left, null);
        tvLeft = view.findViewById(R.id.tab_text_left);
        tvLeft.setText("指基");
        return view;
    }

    private View getCenterOne() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View view = mInflater.inflate(R.layout.item_tab_center, null);
        tvCenterOne = view.findViewById(R.id.tab_text_center);
        tvCenterOne.setText("优选");
        return view;
    }

    private View getCenterTwo() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View view = mInflater.inflate(R.layout.item_tab_center, null);
        tvCenterTwo = view.findViewById(R.id.tab_text_center);
        tvCenterTwo.setText("钉365");
        return view;
    }

    private View getTabViewRight() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View view = mInflater.inflate(R.layout.item_tab_right, null);
        tvRight = view.findViewById(R.id.tab_text_right);
        tvRight.setText("套利");
        return view;
    }
}
