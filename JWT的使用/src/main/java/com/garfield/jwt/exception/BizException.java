package com.garfield.jwt.exception;

/**
 * BizException
 *
 * @author zhaojian
 * @date 2021/6/24
 */
public class BizException extends RuntimeException {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BizException(BizEnum bizEnum) {
        this.code = bizEnum.code;
        this.msg = bizEnum.msg;
    }
}
