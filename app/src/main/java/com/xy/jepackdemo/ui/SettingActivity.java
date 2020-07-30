package com.xy.jepackdemo.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.xy.baselib.base.BaseNoModelActivity;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.common.CommonUtil;
import com.xy.jepackdemo.databinding.ActivitySettingBinding;


/**
 * @author oyangpengfei
 * @date 2019/7/9.
 * description
 */
public class SettingActivity extends BaseNoModelActivity<ActivitySettingBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_setting;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        String localVersion = CommonUtil.getLocalVersion(this);
        if (!TextUtils.isEmpty(localVersion)) {
            dataBinding.settingVersion.setText(localVersion);
        }
        dataBinding.tvCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                copy();
            }
        });
    }


    //复制信息
    public void copy() {
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText("ouyaanng");
        Toast.makeText(this, "复制成功", Toast.LENGTH_SHORT).show();
    }

}
