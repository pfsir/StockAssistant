package com.xy.baselib.lifecycle;

import com.xy.baselib.bean.DialogBean;

/**
 * 包名       com.xy.baselib.lifecycle
 * 文件名:    DialogLiveData
 * 创建时间:  2019-03-27 on 20:57
 * 描述:     TODO
 *
 * @author 小阿飞
 */

public final class DialogLiveData<T> extends UnPeekLiveData<T> {

    private DialogBean bean = new DialogBean();

    public void setValue(boolean isShow) {
        bean.setShow(isShow);
        bean.setMsg("");
        setValue((T) bean);
    }

    public void setValue(boolean isShow, String msg) {
        bean.setShow(isShow);
        bean.setMsg(msg);
        setValue((T) bean);
    }
}