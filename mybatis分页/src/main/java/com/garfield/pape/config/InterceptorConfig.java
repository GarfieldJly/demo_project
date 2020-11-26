//package com.garfield.pape.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.ibatis.executor.statement.StatementHandler;
//import org.apache.ibatis.mapping.BoundSql;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.mapping.SqlCommandType;
//import org.apache.ibatis.plugin.*;
//import org.apache.ibatis.reflection.MetaObject;
//import org.apache.ibatis.reflection.SystemMetaObject;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Field;
//import java.sql.Connection;
//import java.util.Properties;
//
///**
// * @author jingliyuan
// * @date 2020/11/26
// */
//@Intercepts(@Signature(
//        type = StatementHandler.class,
//        method = "prepare",
//        args = {Connection.class, Integer.class}))
//@Slf4j
//@Component
//public class InterceptorConfig implements Interceptor {
//    @Override
//    public Object intercept(Invocation invocation) throws Throwable {
//        StatementHandler statementHandler = (StatementHandler)invocation.getTarget();
//        MetaObject metaObject = SystemMetaObject.forObject(statementHandler);
//        MappedStatement mappedStatement = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
//        BoundSql boundSql = statementHandler.getBoundSql();
//        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
//        log.info("方法执行前");
//        if (SqlCommandType.SELECT.equals(sqlCommandType)){
//            String sql = boundSql.getSql();
//            log.info("sql before:"+ sql);
//            sql = sql+" where is_delete = 0";
//            log.info("sql after:"+ sql);
//            Field sqlField = boundSql.getClass().getDeclaredField("sql");
//            sqlField.setAccessible(true);
//            sqlField.set(boundSql,sql);
//        }
//        return invocation.proceed();
//    }
//
//    @Override
//    public Object plugin(Object o) {
//        return Plugin.wrap(o,this);
//    }
//
//    @Override
//    public void setProperties(Properties properties) {
//
//    }
//}
