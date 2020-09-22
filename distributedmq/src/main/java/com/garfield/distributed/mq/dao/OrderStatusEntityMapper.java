package com.garfield.distributed.mq.dao;

import com.garfield.distributed.mq.domain.entity.OrderStatusEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderStatusEntityMapper extends Mapper<OrderStatusEntity> {
    int updateOrderStatusByOrderId(@Param("orderId") String orderId, @Param("status") int status);
}