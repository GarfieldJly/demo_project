package com.garfield.combat.config;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CommonMapper<T> extends MySqlMapper<T>, Mapper<T>, IdsMapper<T> {

}
