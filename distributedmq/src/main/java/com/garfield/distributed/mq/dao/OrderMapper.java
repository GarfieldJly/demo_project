package com.garfield.distributed.mq.dao;

import com.garfield.distributed.mq.domain.entity.OrderEntity;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author jingliyuan
 * @date 2020/9/18
 */
@Repository
public interface OrderMapper extends Mapper<OrderEntity> {

}
