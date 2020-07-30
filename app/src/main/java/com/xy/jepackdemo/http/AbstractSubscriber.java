package com.xy.jepackdemo.http;

import android.text.TextUtils;

import io.reactivex.subscribers.ResourceSubscriber;


/**
 * Created by oy on 2017/2/23.
 */

public abstract class AbstractSubscriber<T> extends ResourceSubscriber<T> {
    private String mErrorMsg;

    protected AbstractSubscriber() {
    }


    protected AbstractSubscriber(String errorMsg) {
        this.mErrorMsg = errorMsg;
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        String msg;
        if (mErrorMsg != null && !TextUtils.isEmpty(mErrorMsg)) {
            msg = mErrorMsg;
        } else {
            msg = e.toString();
        }
    }
}
