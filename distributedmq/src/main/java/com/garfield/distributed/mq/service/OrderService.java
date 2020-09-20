package com.garfield.distributed.mq.service;

import com.garfield.distributed.mq.domain.entity.OrderEntity;

public interface OrderService {
    void createOrder(OrderEntity orderEntity);
}
