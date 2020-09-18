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
public class OrderEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "content")
    private String content;
    @Column(name = "consumer")
    private String consumer;
    @Column(name = "creat_time")
    private Date createTime;
}
