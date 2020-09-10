package com.garfield.mqconsumer.demo;

import org.springframework.stereotype.Component;

/**
 * @author jingliyuan
 * @date 2020/9/7
 */
@Component
public class Demo1 {
    /**
     * 如果发送的是对象，对象需要序列化，参数用 ObjectMessage
     * @param objectMessage
     */
//    @JmsListener(destination = "cat.queue")
//    public void receiver(String objectMessage){
//        System.out.println("收到的消息:"+objectMessage.toString());
//    }
}
