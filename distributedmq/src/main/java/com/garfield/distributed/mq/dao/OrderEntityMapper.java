package com.garfield.distributed.mq.dao;

import com.garfield.distributed.mq.domain.entity.OrderEntity;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderEntityMapper extends Mapper<OrderEntity> {
}