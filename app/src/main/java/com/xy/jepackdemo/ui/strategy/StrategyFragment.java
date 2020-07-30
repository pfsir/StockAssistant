package com.xy.jepackdemo.ui.strategy;

import android.content.Context;
import android.content.Intent;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.xy.baselib.base.BaseNoModelFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.TopicBean;
import com.xy.jepackdemo.common.Constants;
import com.xy.jepackdemo.databinding.FragmentStrategyBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oyangpengfei
 * @date 2019/11/14.
 * description
 */
public class StrategyFragment extends BaseNoModelFragment<FragmentStrategyBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_strategy;
    }

    @Override
    protected void initView() {
        List<TopicBean> topics = new ArrayList<>();
        topics.add(new TopicBean(getString(R.string.topic_one), true));
        topics.add(new TopicBean(getString(R.string.topic_two), false));
        topics.add(new TopicBean(getString(R.string.topic_three), false));
        topics.add(new TopicBean(getString(R.string.topic_four), true));


        for (int i = 0; i < topics.size(); i++) {
            TopicBean topicBean = topics.get(i);
            View view = View.inflate(getContext(), R.layout.layout_main_topic_content, null);
            TextView topic = view.findViewById(R.id.main_topic);
            topic.setText(topicBean.getTopic());
            RadioGroup radioGroup = view.findViewById(R.id.main_rg);
            final RadioButton radioButtonA = view.findViewById(R.id.main_rb_a);
            final RadioButton radioButtonB = view.findViewById(R.id.main_rb_b);
            final RadioButton radioButtonC = view.findViewById(R.id.main_rb_c);
            //是否有第三个选项
            if (topicBean.isHasMore()) {
                radioButtonC.setVisibility(View.VISIBLE);
                if (i == 0) {
                    radioButtonA.setText(getString(R.string.topic_one_a));
                    radioButtonB.setText(getString(R.string.topic_one_b));
                    radioButtonC.setText(getString(R.string.topic_one_c));
                } else {
                    radioButtonA.setText(getString(R.string.topic_four_a));
                    radioButtonB.setText(getString(R.string.topic_four_b));
                    radioButtonC.setText(getString(R.string.topic_four_c));
                }
            }
            //选中后文字改变
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if (checkedId == R.id.main_rb_a) {
                        radioButtonA.setTextColor(ContextCompat.getColor(getContext(), R.color.color_FFFFFF));
                        radioButtonB.setTextColor(ContextCompat.getColor(getContext(), R.color.color_333333));
                        radioButtonC.setTextColor(ContextCompat.getColor(getContext(), R.color.color_333333));
                    } else if (checkedId == R.id.main_rb_b) {
                        radioButtonA.setTextColor(ContextCompat.getColor(getContext(), R.color.color_333333));
                        radioButtonB.setTextColor(ContextCompat.getColor(getContext(), R.color.color_FFFFFF));
                        radioButtonC.setTextColor(ContextCompat.getColor(getContext(), R.color.color_333333));
                    } else {
                        radioButtonA.setTextColor(ContextCompat.getColor(getContext(), R.color.color_333333));
                        radioButtonB.setTextColor(ContextCompat.getColor(getContext(), R.color.color_333333));
                        radioButtonC.setTextColor(ContextCompat.getColor(getContext(), R.color.color_FFFFFF));
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.topMargin = dp2Px(getContext(), 10);
            dataBinding.mainContainerLayout.addView(view, layoutParams);

            initListener();
        }
    }

    @Override
    protected void initData() {

    }


    private void initListener() {
        //完成
        dataBinding.mainDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View layoutOne = dataBinding.mainContainerLayout.getChildAt(0);
                View layoutTwo = dataBinding.mainContainerLayout.getChildAt(1);
                View layoutThree = dataBinding.mainContainerLayout.getChildAt(2);
                View layoutFour = dataBinding.mainContainerLayout.getChildAt(3);

                RadioGroup radioGroupOne = layoutOne.findViewById(R.id.main_rg);
                RadioGroup radioGroupTwo = layoutTwo.findViewById(R.id.main_rg);
                RadioGroup radioGroupThree = layoutThree.findViewById(R.id.main_rg);
                RadioGroup radioGroupFour = layoutFour.findViewById(R.id.main_rg);

                if (radioGroupOne.getCheckedRadioButtonId() == -1 || radioGroupTwo.getCheckedRadioButtonId() == -1
                        || radioGroupThree.getCheckedRadioButtonId() == -1 || radioGroupFour.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "请确认已全部选择", Toast.LENGTH_SHORT).show();
                    return;
                }

                goStrategy(radioGroupOne, radioGroupTwo, radioGroupThree, radioGroupFour);
            }
        });
    }

    /**
     * 去策略界面
     *
     * @param radioGroupOne
     * @param radioGroupTwo
     * @param radioGroupThree
     * @param radioGroupFour
     */
    private void goStrategy(RadioGroup radioGroupOne, RadioGroup radioGroupTwo, RadioGroup radioGroupThree, RadioGroup radioGroupFour) {
        Intent intent = new Intent(getContext(), StrategyActivity.class);

        String time;
        String topicOne;
        if (radioGroupOne.getCheckedRadioButtonId() == R.id.main_rb_a) {
            time = "0.5年内";
            topicOne = Constants.SELECT_A;
        } else if (radioGroupOne.getCheckedRadioButtonId() == R.id.main_rb_b) {
            time = "0.5 - 3年";
            topicOne = Constants.SELECT_B;
        } else {
            time = "3年以上";
            topicOne = Constants.SELECT_C;
        }
        String modelOne = "1." + time + "的投资年限；";
        intent.putExtra(StrategyActivity.MODEL_ONE, modelOne);

        String style;
        String topicTwo;
        if (radioGroupTwo.getCheckedRadioButtonId() == R.id.main_rb_a) {
            style = "偏保守";
            topicTwo = Constants.SELECT_A;
        } else {
            style = "偏激进";
            topicTwo = Constants.SELECT_B;
        }
        String modelTwo = "2." + style + "的投资风格；";
        intent.putExtra(StrategyActivity.MODEL_TWO, modelTwo);

        String target;
        String topicThree;
        if (radioGroupThree.getCheckedRadioButtonId() == R.id.main_rb_a) {
            target = "有";
            topicThree = Constants.SELECT_A;
        } else {
            target = "无";
            topicThree = Constants.SELECT_B;
        }
        String modelThree = "3.资金" + target + "明确使用目的；";
        intent.putExtra(StrategyActivity.MODEL_THREE, modelThree);

        String type;
        String topicFour;
        if (radioGroupFour.getCheckedRadioButtonId() == R.id.main_rb_a) {
            type = "增量资金";
            topicFour = Constants.SELECT_A;
        } else if (radioGroupFour.getCheckedRadioButtonId() == R.id.main_rb_b) {
            type = "存量资金";
            topicFour = Constants.SELECT_B;
        } else {
            type = "增量资金+存量资金";
            topicFour = Constants.SELECT_C;
        }
        String modelFour = "4." + type + "的资金类型。";
        intent.putExtra(StrategyActivity.MODEL_FOUR, modelFour);

        String myStrategy = getStrategy(topicOne, topicTwo, topicThree, topicFour);
        intent.putExtra(StrategyActivity.STRATEGY, myStrategy);
        startActivity(intent);
    }

    /**
     * 获取策略
     *
     * @param topicOne
     * @param topicTwo
     * @param topicThree
     * @param topicFour
     * @return
     */
    private String getStrategy(String topicOne, String topicTwo, String topicThree, String topicFour) {
        String myStrategy;
        switch (topicOne) {
            case Constants.SELECT_A:
                //1.期限小于0.5年
                if (Constants.SELECT_A.equals(topicTwo)) {
                    //1.1有明确的时间或目的-固定理财
                    myStrategy = "固定收益理财\r\n1.银行存款等";
                } else {
                    //1.2没有明确的时间或目的-货币基金
                    myStrategy = "货币基金:\r\n1.余额宝\r\n2.微信零钱通等";
                }
                break;
            case Constants.SELECT_B:
                //2.期限为0.5-3年
                myStrategy = "债券策略:\r\n1.债券基金\r\n2.我要稳稳的幸福（且慢）";
                break;
            case Constants.SELECT_C:
                //3年以上
                if (Constants.SELECT_A.equals(topicThree)) {
                    //投资风格偏保守
                    myStrategy = "债股混合策略:\r\n1.安心盈动（且慢）\r\n2.股债二八（蛋卷）";
                } else {
                    if (Constants.SELECT_A.equals(topicFour)) {
                        //增量资金
                        myStrategy = "定投策略:\r\n1.螺丝钉组合（蛋卷）\r\n2.U定投（且慢）\r\n3.S定投（E大 且慢）";
                    } else if (Constants.SELECT_B.equals(topicFour)) {
                        //存量资金
                        myStrategy = "低估资产配置策略:\r\n1.长盈指数计划（E大 且慢）";
                    } else {
                        //均可
                        myStrategy = "定比例资产配置策略:\r\n1.极简策略（且慢）\r\n2.50-50策略（傻瓜投资）\r\n主动基金策略:\r\n1.老牌混合基金\r\n2.指数增强基金";
                    }
                }
                break;
            default:
                myStrategy = "";
                break;

        }
        return myStrategy;
    }

    public int dp2Px(Context context, int dpi) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpi, context.getResources().getDisplayMetrics());
    }
}
