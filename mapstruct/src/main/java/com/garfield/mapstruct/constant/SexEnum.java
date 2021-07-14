package com.garfield.mapstruct.constant;

/**
 * @author zhaojian
 * @date 2021/7/14
 */
public enum SexEnum {
    MALE(1,"男"),

    FAMALE(2,"女");

    private Integer code;

    private String des;

    SexEnum(Integer code, String des) {
        this.code = code;
        this.des = des;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
