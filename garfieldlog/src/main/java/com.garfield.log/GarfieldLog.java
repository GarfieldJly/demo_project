package com.garfield.log;

/**
 * @author jingliyuan
 * @date 2020/12/17
 */
public class GarfieldLog {
    private String message;
    private Integer code;
    private String exeuTime;
    private String className;
    private String methodName;
    private Long time;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getExeuTime() {
        return exeuTime;
    }

    public void setExeuTime(String exeuTime) {
        this.exeuTime = exeuTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "GarfieldLog{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", exeuTime='" + exeuTime + '\'' +
                ", className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                '}';
    }
}
