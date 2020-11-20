package com.garfield.dubbo.provider;

import com.garfield.dubbo.provider.config.GlobalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author jingliyuan
 * @date 2020/11/20
 */
public class ProviderDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(GlobalConfig.class);
        applicationContext.getBean("helloService");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
