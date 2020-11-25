package com.garfield.db.shardingjdbc.controller;

import com.garfield.db.shardingjdbc.dao.OrderMapper1;
import com.garfield.db.shardingjdbc.vo.OrderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/11/13
 */
@RestController
@RequestMapping(value = "/garfield")
public class OrderController {
    @Autowired
    private OrderMapper1 orderMapper;

    @GetMapping("/addOrder")
    public void addOrder(@ModelAttribute OrderBean orderBean){
        orderMapper.insertOrder(orderBean);
    }

    @GetMapping("/getOrder")
    public OrderBean getOrder(Integer id){
        return orderMapper.selectByOrderId(id);
    }
}
