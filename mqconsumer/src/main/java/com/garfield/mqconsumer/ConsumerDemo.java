package com.garfield.mqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;

import javax.annotation.PostConstruct;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import java.io.Serializable;

/**
 * @author jingliyuan
 * @date 2020/9/7
 */
@SpringBootApplication
@EnableJms
public class ConsumerDemo {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemo.class);
    }
}
