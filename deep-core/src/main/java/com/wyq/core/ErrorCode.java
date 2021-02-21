package com.wyq.core;

/**
 * 功能说明：
 * 全局错误码
 *
 * @author wyq
 * @email 342622023@qq.com
 * @phone 131****8100
 */
public enum ErrorCode {
    /**
     * 1000错误码
     */
    UNKNOWN_ERR(1000, "未知错误");


    private int code;

    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
