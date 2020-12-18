package com.garfield.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author jingliyuan
 * @date 2020/12/4
 */
public class ProviderDemo {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("provider.xml");
        classPathXmlApplicationContext.start();
        System.in.read();
    }
}
