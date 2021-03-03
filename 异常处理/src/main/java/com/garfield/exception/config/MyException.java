package com.garfield.exception.config;

/**
 * @author jingliyuan
 * @date 2021/2/22
 * spring 对RuntimeException的异常会进行事务回滚
 */
public class MyException extends RuntimeException{
    private String code;
    private String msg;

    public MyException( String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
