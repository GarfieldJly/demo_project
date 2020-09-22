package com.garfield.distributed.mq.dao;

import com.garfield.distributed.mq.domain.entity.DispatchEntity;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface DispatchEntityMapper extends Mapper<DispatchEntity> {
}