package com.garfield.distributed.mq.service.impl;

import com.garfield.distributed.mq.dao.OrderEntityMapper;
import com.garfield.distributed.mq.dao.OrderStatusEntityMapper;
import com.garfield.distributed.mq.domain.entity.OrderEntity;
import com.garfield.distributed.mq.domain.entity.OrderStatusEntity;
import com.garfield.distributed.mq.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderStatusEntityMapper orderStatusEntityMapper;
    @Autowired
    private OrderEntityMapper orderEntityMapper;
    @Transactional
    @Override
    public void createOrder(OrderEntity order) {
        //1.订单表新增记录
        orderEntityMapper.insertSelective(order);
        //2.订单日志表新增记录
        OrderStatusEntity orderStatusEntity =new OrderStatusEntity();
        orderStatusEntity.setOrderId(order.getId());
        orderStatusEntity.setOrderContent(order.getContent());
        orderStatusEntity.setStatus(0);
        orderStatusEntityMapper.insertSelective(orderStatusEntity);
    }
}
