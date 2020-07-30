package com.xy.baselib.lifecycle;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import com.xy.baselib.bean.DialogBean;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * 包名       com.xy.baselib.lifecycle
 * 文件名:    BaseViewModel
 * 创建时间:  2019-03-27 on 10:44
 * 描述:     TODO ViewModel基类，管理rxJava发出的请求，ViewModel销毁同时也取消请求
 *
 * @author 小阿飞
 */

public abstract class BaseViewModel extends ViewModel {

    /**
     * 管理RxJava请求
     */
    private CompositeDisposable compositeDisposable;
    /**
     * 用来通知 Activity／Fragment 是否显示等待Dialog
     */
    protected DialogLiveData<DialogBean> showDialog = new DialogLiveData<>();
    /**
     * 当ViewModel层出现错误需要通知到Activity／Fragment
     */
    protected UnPeekLiveData<Object> error = new UnPeekLiveData<>();

    /**
     * 添加 rxJava 发出的请求
     */
    protected void addDisposable(Disposable disposable) {
        if (compositeDisposable == null || compositeDisposable.isDisposed()) {
            compositeDisposable = new CompositeDisposable();
        }
        compositeDisposable.add(disposable);
    }

    public void getShowDialog(LifecycleOwner owner, Observer<DialogBean> observer) {
        showDialog.observe(owner, observer);
    }

    public void getError(LifecycleOwner owner, Observer<Object> observer) {
        error.observe(owner, observer);
    }

    /**
     * ViewModel销毁同时也取消请求
     */
    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
            compositeDisposable = null;
        }
        showDialog = null;
        error = null;
    }
}
