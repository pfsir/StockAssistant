package com.xy.baselib.bean;

/**
 *
 * 包名       com.xy.baselib.bean
 * 文件名:    DialogBean
 * 创建时间:  2019-03-27 on 20:54
 * 描述:     TODO 封装的对话框实体类
 *
 * @author 小阿飞
 */

public final class DialogBean {

    private boolean isShow;
    private String msg;

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
