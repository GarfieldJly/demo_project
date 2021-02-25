//package com.garfield.exception.config;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author jingliyuan
// * @date 2021/2/22
// */
//@ControllerAdvice
//public class GlobalException {
//
//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//    }
//
//    @ModelAttribute
//    public void addAttribute(Model model){
//        model.addAttribute("name","garfield");
//    }
//
//    /**
//     * 定义全局的异常
//     */
//    @ResponseBody
//    @ExceptionHandler(value = Exception.class)
//    public Map exception(Exception exception){
//        HashMap hashMap = new HashMap();
//        hashMap.put("code",100);
//        hashMap.put("msg",exception.getMessage() + "全局异常");
//        return hashMap;
//    }
//
//    /**
//     * 自定义异常类
//     */
//    @ResponseBody
//    @ExceptionHandler(value = MyException.class)
//    public Map myException(MyException exception){
//        HashMap hashMap = new HashMap();
//        hashMap.put("code",exception.getCode());
//        hashMap.put("msg",exception.getMsg() + "自定义异常类");
//        return hashMap;
//    }
//
//}
