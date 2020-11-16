package com.garfield.db.shardingjdbc.dao;

import com.garfield.db.shardingjdbc.bean.OrderBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jingliyuan
 * @date 2020/11/13
 */
@Repository
public interface OrderMapper1 {
    void insertOrder(@Param("orderBean") OrderBean orderBean);

    OrderBean selectByOrderId(@Param("orderId") Integer orderId);
}
