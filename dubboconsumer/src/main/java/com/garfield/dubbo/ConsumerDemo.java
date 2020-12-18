package com.garfield.dubbo;

import com.garfield.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jingliyuan
 * @date 2020/12/4
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        classPathXmlApplicationContext.start();
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        String sayHello = userService.sayHello("媛宝");
        System.out.println(sayHello);
        classPathXmlApplicationContext.close();
    }
}
