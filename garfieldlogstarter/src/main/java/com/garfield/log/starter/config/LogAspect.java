package com.garfield.log.starter.config;

import com.garfield.log.GarfieldLog;
import com.google.gson.Gson;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jingliyuan
 * @date 2020/12/18
 */
@Aspect
public class LogAspect {
    @Pointcut("@annotation(com.garfield.log.starter.config.SysLog)")
    public void logPointCut(){

    }
    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis() - startTime;
        saveLog(proceedingJoinPoint,endTime);
        return proceed;
    }

    public void saveLog(ProceedingJoinPoint joinPoint,Long time){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        GarfieldLog garfieldLog = new GarfieldLog();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        garfieldLog.setExeuTime(dateFormat.format(new Date()));
        SysLog sysLog = method.getAnnotation(SysLog.class);
        //请求的 类名、方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        garfieldLog.setClassName(className);
        garfieldLog.setMethodName(methodName);
        garfieldLog.setTime(time);
        //请求的参数
        Object[] args = joinPoint.getArgs();
        try{
            List<String> list = new ArrayList<String>();
            for (Object o : args) {
                list.add(new Gson().toJson(o));
            }
        }catch (Exception e){ }
        System.out.println("开始记录日志");
        System.out.println(garfieldLog.toString());
    }
}
