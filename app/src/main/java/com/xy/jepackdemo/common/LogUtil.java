package com.xy.jepackdemo.common;

import android.util.Log;

/**
 * @author libo
 * @date 2019/1/2.
 * description: 日志工具类
 * 然后如果发布的时候,就直接把这个类的DEBUG 改成false,这样所有的log就不会再打印在控制台.
 */
public class LogUtil {
    public static final boolean DEBUG = true;
    private static final String DEFAULT_TAG = "IS-";

    /**
     * 规定每段显示的长度(studio中log单条是4*1024个字符长度。
     */
    private static final int LOG_MAX_LENGTH = 4000;
    private static final String V = "v";
    private static final String D = "d";
    private static final String I = "I";
    private static final String W = "w";
    private static final String E = "e";

    public static void v(String tag, String msg) {
        common(V, tag, msg);
    }

    public static void d(String tag, String msg) {
        common(D, tag, msg);
    }

    public static void i(String tag, String msg) {
        common(I, tag, msg);
    }

    public static void w(String tag, String msg) {
        common(W, tag, msg);
    }

    public static void e(String tag, String msg) {
        common(E, tag, msg);
    }


    public static void v(String msg) {
        common(V, DEFAULT_TAG, msg);
    }

    public static void d(String msg) {
        common(D, DEFAULT_TAG, msg);
    }

    public static void i(String msg) {
        common(I, DEFAULT_TAG, msg);
    }

    public static void w(String msg) {
        common(W, DEFAULT_TAG, msg);
    }

    public static void e(String msg) {
        common(E, DEFAULT_TAG, msg);
    }

    private static void common(String level, String tag, String msg) {
        if (DEBUG) {
            int strLength = msg.length();
            int start = 0;
            int end = LOG_MAX_LENGTH;
            int logPart = 50;
            for (int i = 0; i < logPart; i++) {
                //剩下的文本还是大于规定长度则继续重复截取并输出
                if (strLength > end) {
                    switch (level) {
                        case V:
                            Log.v(tag + i, msg.substring(start, end));
                            break;
                        case D:
                            Log.d(tag + i, msg.substring(start, end));
                            break;
                        case I:
                            Log.i(tag + i, msg.substring(start, end));
                            break;
                        case W:
                            Log.w(tag + i, msg.substring(start, end));
                            break;
                        case E:
                            Log.e(tag + i, msg.substring(start, end));
                            break;
                        default:
                            break;
                    }
                    start = end;
                    end = end + LOG_MAX_LENGTH;
                } else {
                    switch (level) {
                        case V:
                            Log.v(tag, msg.substring(start, strLength));
                            break;
                        case D:
                            Log.d(tag, msg.substring(start, strLength));
                            break;
                        case I:
                            Log.i(tag, msg.substring(start, strLength));
                            break;
                        case W:
                            Log.w(tag, msg.substring(start, strLength));
                            break;
                        case E:
                            Log.e(tag, msg.substring(start, strLength));
                            break;
                        default:
                            break;
                    }
                    break;
                }
            }
        }

    }
}
