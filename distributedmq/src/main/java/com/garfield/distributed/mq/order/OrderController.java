package com.garfield.distributed.mq.order;

import com.garfield.distributed.mq.dao.OrderEntityMapper;
import com.garfield.distributed.mq.dao.OrderStatusEntityMapper;
import com.garfield.distributed.mq.domain.entity.OrderEntity;
import com.garfield.distributed.mq.domain.entity.OrderStatusEntity;
import com.garfield.distributed.mq.service.OrderService;
import org.junit.jupiter.api.Order;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * @author jingliyuan
 * @date 2020/9/15
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private OrderService orderService;
    /**
     * 新增订单
     */
    @GetMapping("/createdOrder")
    public String createdOrder(){
        String orderId = UUID.randomUUID().toString();
        OrderEntity order = new OrderEntity();
        order.setId(orderId);
        order.setContent("买一杯星巴克");
        order.setConsumer("加菲猫");
        orderService.createOrder(order);
        //3.通知运单系统
//        String result = restTemplate.getForObject("http://localhost:8084/waybill/createWayBill", String.class);
        rabbitTemplate.convertAndSend("OrderExchange","order",order,new CorrelationData(orderId));
        return "OK";
    }
}
