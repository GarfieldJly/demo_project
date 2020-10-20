package com.garfield.distributed.mq.dispatch;

import com.garfield.distributed.mq.dao.DispatchEntityMapper;
import com.garfield.distributed.mq.domain.entity.DispatchEntity;
import com.garfield.distributed.mq.domain.entity.OrderEntity;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

/**
 * @author jingliyuan
 * @date 2020/9/15
 */
@Component
public class DispatchController {

    @Autowired
    private DispatchEntityMapper dispatchEntityMapper;

    @RabbitListener(queues = "OrderQueue")
    public void createWayBill(OrderEntity orderEntity, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws IOException {
        try {
            DispatchEntity dispatchEntity = new DispatchEntity();
            dispatchEntity.setId(UUID.randomUUID().toString());
            dispatchEntity.setOrderId(orderEntity.getId());
            dispatchEntity.setCourier("garfield");
            dispatchEntityMapper.insertSelective(dispatchEntity);
            channel.basicAck(tag,false);
        }catch (Exception e){
            channel.basicNack(tag,false,false);
        }
    }
}

