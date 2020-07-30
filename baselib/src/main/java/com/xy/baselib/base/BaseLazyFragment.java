package com.xy.baselib.base;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleObserver;

import com.xy.baselib.lifecycle.BaseViewModel;

/**
 *
 * 包名       com.xy.baselib.base
 * 文件名:    BaseLazyFragment
 * 创建时间:  2019-03-28 on 18:01
 * 描述:     TODO 懒加载Fragment基类，适用于一个页面多个Tab页面
 *
 * @author 小阿飞
 */

public abstract class BaseLazyFragment<VM extends BaseViewModel, DB extends ViewDataBinding>
        extends BaseFragment<VM, DB> implements LifecycleObserver {

    private boolean visibleToUser;

    @Override
    public void onResume() {
        super.onResume();
        if (!visibleToUser) {
            visibleToUser = true;
            lazyLoad();
        }
    }

    /**
     * 懒加载，只有在Fragment第一次创建且第一次对用户可见
     */
    protected abstract void lazyLoad();
}
