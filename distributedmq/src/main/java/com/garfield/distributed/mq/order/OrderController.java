package com.garfield.distributed.mq.order;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    /**
     * 新增订单
     */
    @GetMapping("/createdOrder")
    @Transactional
    public String createdOrder(){

        rabbitTemplate.convertAndSend("createOrderExchange","createOrder","创建");

        //3.通知运单系统
        String result = restTemplate.getForObject("http://localhost:8084/waybill/createWayBill", String.class);
        return "OK";
    }
}
