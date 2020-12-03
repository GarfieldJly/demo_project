package com.garfield.pape.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.util.Properties;

/**
 * @author jingliyuan
 * @date 2020/11/27
 */
@Intercepts(@Signature(type = StatementHandler.class,method = "prepare",args = {Connection.class,Integer.class}))
@Component
@Slf4j
public class StatementHandleInterceptorConfig implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        MetaObject metaObject = SystemMetaObject.forObject(statementHandler);
        MappedStatement mappedStatement = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        if(SqlCommandType.SELECT.equals(sqlCommandType)){
            String sql = boundSql.getSql();
            log.info("执行的sql:" + sql);
            //todo 统一修改sql语句
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
