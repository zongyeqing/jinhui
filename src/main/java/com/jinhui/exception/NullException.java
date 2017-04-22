package com.jinhui.exception;

/**
 * Created by zong on 2017/4/22.
 */
public class NullException extends Exception {
    public NullException(Object object) {
        super("NullException异常:"+object.getClass());
    }
}
