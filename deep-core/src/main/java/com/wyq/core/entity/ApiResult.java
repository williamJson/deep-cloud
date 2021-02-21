package com.wyq.core.entity;

import java.io.Serializable;

/**
 * 功能说明：
 * api通用返回对象
 *
 * @author wyq
 * @email 342622023@qq.com
 * @phone 131****8100
 */
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 返回码
     */
    private int code;

    /**
     * 描述信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;


    public ApiResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ApiResult(int code, String msg) {
        this(code, msg, null);
    }

}
