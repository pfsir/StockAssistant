package com.xy.baselib.utils;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

import java.lang.reflect.Field;


/**
 * Create by OuYangPengFei on 4/27/21
 * 解决Android8.0以下的吐司BadTokenException
 */
public class HookToast {
    private static Field sField_TN;
    private static Field sField_TN_Handler;

    static {
        try {
            //反射获取TN对象
            sField_TN = Toast.class.getDeclaredField("mTN");
            sField_TN.setAccessible(true);
            sField_TN_Handler = sField_TN.getType().getDeclaredField("mHandler");
            sField_TN_Handler.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected static void hook(Toast toast) {
        //if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
        try {
            Object tn = sField_TN.get(toast);
            Handler originHandler = (Handler) sField_TN_Handler.get(tn);
            sField_TN_Handler.set(tn, new SafeHandler(toast, originHandler));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        //}
    }

    /**
     * 替换Toast原有的Handler
     */
    private static class SafeHandler extends Handler {
        private final Toast mToast;
        private final Handler mOriginImpl;

        SafeHandler(Toast toast, Handler originHandler) {
            mToast = toast;
            mOriginImpl = originHandler;
        }

        @Override
        public void dispatchMessage(Message msg) {
            //对分发Message的处理方法进行try-catch
            try {
                super.dispatchMessage(msg);
            } catch (WindowManager.BadTokenException e) {
                e.printStackTrace();
                Log.e("Toast", "mToast:" + mToast + "," + e.toString());
            }
        }

        @Override
        public void handleMessage(Message msg) {
            //需要委托给原Handler执行
            mOriginImpl.handleMessage(msg);
        }
    }
}
