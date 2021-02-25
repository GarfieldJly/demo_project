package com.garfield.exception.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author jingliyuan
 * @date 2021/2/22
 * @ControllerAdvice 可以用于定义@InitBinder、@ExceptionHandler和@ModelAttribute，并应用到所有的@RequestMapping中
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorInfo jsonErrorHandler(Exception e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode("500");
        errorInfo.setMsg(e.getMessage());
        return errorInfo;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorInfo jsonErrorHandler(MyException e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode(e.getCode());
        errorInfo.setMsg(e.getMsg());
        return errorInfo;
    }
}
