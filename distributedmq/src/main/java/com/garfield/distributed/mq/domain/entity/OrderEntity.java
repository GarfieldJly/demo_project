package com.garfield.distributed.mq.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order_meituan")
public class OrderEntity implements Serializable {
    /**
     *  主键
     */
    @Id
    private String id;

    /**
     * 订单内容
     */
    private String content;

    /**
     * 顾客名称
     */
    private String consumer;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键
     *
     * @return id -  主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 主键
     *
     * @param id  主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取订单内容
     *
     * @return content - 订单内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置订单内容
     *
     * @param content 订单内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取顾客名称
     *
     * @return consumer - 顾客名称
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * 设置顾客名称
     *
     * @param consumer 顾客名称
     */
    public void setConsumer(String consumer) {
        this.consumer = consumer == null ? null : consumer.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", consumer=").append(consumer);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}