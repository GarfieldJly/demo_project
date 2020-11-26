package com.garfield.pape.config;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

/**
 * @author jingliyuan
 * @date 2020/11/26
 */
@Intercepts(@Signature(type = Executor.class,method = "update",args = {MappedStatement.class,Object.class}))
@Component
public class MyInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        SqlCommandType sqlCommandType = ms.getSqlCommandType();
        if (!SqlCommandType.INSERT.equals(sqlCommandType)&&!SqlCommandType.UPDATE.equals(sqlCommandType)){
            return invocation.proceed();
        }
        Object parameters = args[1];
        if (parameters instanceof Map){
            Map<String,Object> paramMap = (Map<String, Object>) parameters;
            if (ObjectUtils.isEmpty(paramMap.get("createTime"))){
                paramMap.put("createTime",new Date());
            }
            if (ObjectUtils.isEmpty(paramMap.get("updateTime"))){
                paramMap.put("updateTime",new Date());
            }

        }else{
            Class<?> aClass = parameters.getClass();
            Field createTimeField = aClass.getDeclaredField("createTime");
            createTimeField.setAccessible(true);
            Object createObj = createTimeField.get(parameters);
            if(ObjectUtils.isEmpty(createObj)){
                createTimeField.set(parameters,new Date());
            }

            Field updateTimeField = aClass.getDeclaredField("updateTime");
            updateTimeField.setAccessible(true);
            Object updateObj = updateTimeField.get(parameters);
            if(ObjectUtils.isEmpty(updateObj)){
                updateTimeField.set(parameters,new Date());
            }
        }

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
