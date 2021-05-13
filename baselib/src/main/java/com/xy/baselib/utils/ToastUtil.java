package com.xy.baselib.utils;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xy.baselib.R;

public class ToastUtil extends HookToast {

    public static final int TYPE_LINE_CENTER = 1;
    public static final int TYPE_LINE_BOTTOM = 2;

    public static void showToast(Context ctx, int message) {
        showToast(ctx, message + "", TYPE_LINE_CENTER);
    }

    public static void showToast(Context ctx, String message) {
        showToast(ctx, message + "", TYPE_LINE_CENTER);
    }

    public static void showToast(Context ctx, String message, int type) {
        Toast toast = new Toast(ctx.getApplicationContext());
        hook(toast);
        toast.setView(getView(ctx, message, type));
        if (type == TYPE_LINE_CENTER) {
            toast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, DensityUtil.dip2px(ctx, 50f));
        }
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    private static View getView(Context context, String text, int type) {
        int paddingLeft = DensityUtil.dip2px(context, 12f);
        int paddingRight = DensityUtil.dip2px(context, 12f);
        int paddingTop = DensityUtil.dip2px(context, 12f);
        int paddingBottom = DensityUtil.dip2px(context, 12f);
        LinearLayout mLayout = new LinearLayout(context);
        mLayout.setGravity(Gravity.CENTER);
        //mLayout.setBackgroundColor(Color.parseColor("#00000000"));
        TextView mShow = new TextView(context);
        mShow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.dialog_loading_bg));
        mShow.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        // 设置对其方式
        mShow.setGravity(Gravity.CENTER);
        // 设置字体颜色
        mShow.setTextColor(Color.WHITE);
        // 设置字体大小
        mShow.setTextSize(13);

        if (type == TYPE_LINE_CENTER) {
            mShow.setMaxLines(2);
            mShow.setMaxWidth(DensityUtil.dip2px(context, 155f));
        } else if (type == TYPE_LINE_BOTTOM) {
            mShow.setMaxLines(2);
            mShow.setMaxWidth(DensityUtil.dip2px(context, 320f));
        }

        mShow.setText(text);
        mLayout.addView(mShow);
        return mLayout;
    }

}
