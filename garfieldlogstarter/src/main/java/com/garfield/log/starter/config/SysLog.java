package com.garfield.log.starter.config;

import java.lang.annotation.*;

/**
 * @author jingliyuan
 * @date 2020/12/18
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
