package com.garfield.distributed.mq.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author jingliyuan
 * @date 2020/9/18
 */
@Data
@Table(name = "dispatch")
public class DispatchEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "courier")
    private String courier;
    @Column(name = "creat_time")
    private Date createTime;
}
