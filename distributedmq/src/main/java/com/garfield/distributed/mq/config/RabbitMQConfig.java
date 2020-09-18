package com.garfield.distributed.mq.config;

import com.alibaba.fastjson.JSONObject;
import com.garfield.distributed.mq.dao.OrderMapper;
import com.garfield.distributed.mq.dao.OrderStatusMapper;
import com.garfield.distributed.mq.domain.entity.OrderEntity;
import com.garfield.distributed.mq.domain.entity.OrderStatusEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.UUID;


/**
 * @author jingliyuan
 * @date 2020/9/16
 */
@Configuration
@Slf4j
public class RabbitMQConfig {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderStatusMapper orderStatusMapper;

    @Bean
    public RabbitTemplate crateRabbitTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean b, String s) {
                if(!b){
                   log.info("消息发送失败");
                }
                //1.订单表新增记录
                OrderEntity orderEntity = new OrderEntity();
                String orderId = UUID.randomUUID().toString();
                orderEntity.setId(orderId);
                orderEntity.setContent("买一杯一点点的奶茶");
                orderEntity.setConsumer("加菲猫");
                orderEntity.setCreateTime(new Date());
                orderMapper.insert(orderEntity);
                //2.订单日志表新增记录
                String orderContent = JSONObject.toJSONString(OrderEntity.class);
                OrderStatusEntity orderStatusEntity = new OrderStatusEntity();
                orderStatusEntity.setOrderId(orderId);
                orderStatusEntity.setOrderContent(orderContent);
                orderStatusEntity.setCreateTime(new Date());
                orderStatusMapper.insert(orderStatusEntity);
                log.info(correlationData.toString());
                log.info("确认信息:"+s);
            }
        });
        rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            @Override
            public void returnedMessage(Message message, int i, String s, String s1, String s2) {

            }
        });
        return rabbitTemplate;
    }

    @Bean
    public Queue createQueue(){
        return new Queue("createOrderQueue");
    }
    @Bean
    public DirectExchange createExchange(){
        return new DirectExchange("createOrderExchange");
    }
    @Bean
    public Binding binding(){
        return BindingBuilder.bind(createQueue()).to(createExchange()).with("createOrder");
    }

}
