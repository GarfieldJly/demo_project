package com.garfield.db.shardingjdbc.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author jingliyuan
 * @date 2020/11/13
 */
@Table(name = "t_order")
@Data
public class OrderBean implements Serializable {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "content")
    private String content;
}
