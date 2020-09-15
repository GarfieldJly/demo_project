package com.garfield.distributed.mq.order;

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
    /**
     * 新增订单
     */
    @GetMapping("/createdOrder")
    @Transactional
    public String createdOrder(){
        //1.订单表新增记录

        //2.订单日志表新增记录
        //3.通知运单系统
        String result = restTemplate.getForObject("http://localhost:8084/waybill/createWayBill", String.class);
        return "OK";
    }
}
