package com.garfield.mqconsumer.demo.config;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * @author jingliyuan
 * @date 2020/9/11
 */
@Component
public class MyACKListener implements ChannelAwareMessageListener {
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
        System.out.println("收到的消息: "+new String(message.getBody()));
        System.out.println("消息来自队列:"+message.getMessageProperties().getConsumerQueue());

        //为true会重新放回队列
        channel.basicAck(deliveryTag,true);
    }
}
