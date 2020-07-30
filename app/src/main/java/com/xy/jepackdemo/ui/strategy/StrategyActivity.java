package com.xy.jepackdemo.ui.strategy;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;

import com.xy.baselib.base.BaseNoModelActivity;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.databinding.ActivityStrategyBinding;

/**
 * @author oyangpengfei
 * @date 2019/7/9.
 * description
 */
public class StrategyActivity extends BaseNoModelActivity<ActivityStrategyBinding> {
    public static final String MODEL_ONE = "modelOne";
    public static final String MODEL_TWO = "modelTwo";
    public static final String MODEL_THREE = "modelThree";
    public static final String MODEL_FOUR = "modelFour";
    public static final String STRATEGY = "strategy";

    private Handler handler = new Handler();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_strategy;
    }

    @Override
    protected void initView() {
        String modelOne = getIntent().getStringExtra(MODEL_ONE);
        String modelTwo = getIntent().getStringExtra(MODEL_TWO);
        String modelThree = getIntent().getStringExtra(MODEL_THREE);
        String modelFour = getIntent().getStringExtra(MODEL_FOUR);

        if (!TextUtils.isEmpty(modelOne) && !TextUtils.isEmpty(modelTwo) && !TextUtils.isEmpty(modelThree) && !TextUtils.isEmpty(modelFour)) {
            dataBinding.strategyTopicOne.setText(modelOne);
            dataBinding.strategyTopicTwo.setText(modelTwo);
            dataBinding.strategyTopicThree.setText(modelThree);
            dataBinding.strategyTopicFour.setText(modelFour);
        }
    }

    @Override
    protected void initData() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String myStrategy = getIntent().getStringExtra(STRATEGY);
                if (!TextUtils.isEmpty(myStrategy)) {
                    dataBinding.strategyStrategy.setText(myStrategy);
                    dataBinding.strategyRecommend.setVisibility(View.VISIBLE);
                }
            }
        }, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
