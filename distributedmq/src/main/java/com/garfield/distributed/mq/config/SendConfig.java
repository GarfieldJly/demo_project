package com.garfield.distributed.mq.config;

import com.alibaba.fastjson.JSONObject;
import com.garfield.distributed.mq.dao.OrderMapper;
import com.garfield.distributed.mq.dao.OrderStatusMapper;
import com.garfield.distributed.mq.domain.entity.OrderEntity;
import com.garfield.distributed.mq.domain.entity.OrderStatusEntity;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 * @author jingliyuan
 * @date 2020/9/18
 */
@Configuration
public class SendConfig {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderStatusMapper orderStatusMapper;

    @Transactional
    public void send(){
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


    }
}
