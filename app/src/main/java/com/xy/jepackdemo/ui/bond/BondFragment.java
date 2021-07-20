package com.xy.jepackdemo.ui.bond;

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
import com.xy.jepackdemo.ui.SettingActivity;
import com.xy.jepackdemo.ui.bond.choice.ChoiceBondFragment;
import com.xy.jepackdemo.ui.bond.doublelow.DoubleLowBondFragment;
import com.xy.jepackdemo.ui.bond.newbond.NewBondFragment;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description 精选债券界面
 * <p>
 * 债券名字 bond_nm
 * 股票名字 stock_nm
 * 级别 rating_cd
 * 方案进展 progress_nm
 * 现价比转股价 pma_rt
 * 当前状态：ap_flag E是即将上市，A是今日申购，B是未来申购，C是申购过了
 */
public class BondFragment extends BaseNoModelFragment<FragmentBondBinding> {


    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_bond;
    }

    @Override
    protected void initView() {
        dataBinding.bondViewPager.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                if (position == 0) {
                    return new NewBondFragment();
                } else if (position == 1) {
                    return new ChoiceBondFragment();
                } else {
                    return new DoubleLowBondFragment();
                }
            }

            @Override
            public int getItemCount() {
                return 3;
            }
        });

        dataBinding.bondViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        dataBinding.bondViewPager.setCurrentItem(0, false);
        dataBinding.bondViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    if (tv1 != null && tv2 != null && tv3 != null) {
                        tv1.setTextColor(getResources().getColor(R.color.colorPrimary));
                        tv2.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                        tv3.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                    }
                } else if (position == 1) {
                    if (tv1 != null && tv2 != null && tv3 != null) {
                        tv1.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                        tv2.setTextColor(getResources().getColor(R.color.colorPrimary));
                        tv3.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                    }
                } else {
                    if (tv1 != null && tv2 != null && tv3 != null) {
                        tv1.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                        tv2.setTextColor(getResources().getColor(R.color.color_FFF0F5));
                        tv3.setTextColor(getResources().getColor(R.color.colorPrimary));
                    }
                }
            }
        });

        new TabLayoutMediator(dataBinding.bondTab, dataBinding.bondViewPager, true, new TabConfigurationStrategy() {
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

        TabLayout.Tab tab3 = dataBinding.bondTab.getTabAt(2);
        if (tab3 != null) {
            tab3.setCustomView(getTabView2());
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
        tv1.setText("新债");
        return view;
    }

    private View getTabView1() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View view = mInflater.inflate(R.layout.item_tab_center, null);
        tv2 = view.findViewById(R.id.tab_text_center);
        tv2.setText("精选");
        return view;
    }

    private View getTabView2() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View view = mInflater.inflate(R.layout.item_tab_right, null);
        tv3 = view.findViewById(R.id.tab_text_right);
        tv3.setText("双低");
        return view;
    }
}
