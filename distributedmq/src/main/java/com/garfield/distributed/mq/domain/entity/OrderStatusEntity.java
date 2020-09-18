package com.garfield.distributed.mq.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author jingliyuan
 * @date 2020/9/18
 */
@Data
public class OrderStatusEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "order_content")
    private String orderContent;
    @Column(name = "status")
    private Integer status;
    @Column(name = "creat_time")
    private Date createTime;
}
