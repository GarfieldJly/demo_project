package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_CONFIG_DATA")
public class ConfigData implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ITEM_KEY")
    private String itemKey;

    @Column(name = "ITEM_VALUE")
    private String itemValue;

    @Column(name = "ITEM_REMARK")
    private String itemRemark;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return ITEM_KEY
     */
    public String getItemKey() {
        return itemKey;
    }

    /**
     * @param itemKey
     */
    public void setItemKey(String itemKey) {
        this.itemKey = itemKey == null ? null : itemKey.trim();
    }

    /**
     * @return ITEM_VALUE
     */
    public String getItemValue() {
        return itemValue;
    }

    /**
     * @param itemValue
     */
    public void setItemValue(String itemValue) {
        this.itemValue = itemValue == null ? null : itemValue.trim();
    }

    /**
     * @return ITEM_REMARK
     */
    public String getItemRemark() {
        return itemRemark;
    }

    /**
     * @param itemRemark
     */
    public void setItemRemark(String itemRemark) {
        this.itemRemark = itemRemark == null ? null : itemRemark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemKey=").append(itemKey);
        sb.append(", itemValue=").append(itemValue);
        sb.append(", itemRemark=").append(itemRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}