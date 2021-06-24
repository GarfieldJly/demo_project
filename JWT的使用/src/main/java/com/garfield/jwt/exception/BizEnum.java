package com.garfield.jwt.exception;

/**
 * BizEnum
 *
 * @author zhaojian
 * @date 2021/6/24
 */
public enum BizEnum {
    PARAM_ERROR(1001,"参数缺失"),
    PARSE_ERROR(1002,"解析出错");
    Integer code;
    String msg;

    BizEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
