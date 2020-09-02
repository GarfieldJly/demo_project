package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_DIC_ITEM")
public class DicItem implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "DIC_ITEM_CODE")
    private String dicItemCode;

    @Column(name = "DIC_ITEM_KEY")
    private String dicItemKey;

    @Column(name = "DIC_ITEM_VALUE")
    private String dicItemValue;

    @Column(name = "CONFIGURE_STATUS")
    private String configureStatus;

    @Column(name = "REMARK")
    private String remark;

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
     * @return DIC_ITEM_CODE
     */
    public String getDicItemCode() {
        return dicItemCode;
    }

    /**
     * @param dicItemCode
     */
    public void setDicItemCode(String dicItemCode) {
        this.dicItemCode = dicItemCode == null ? null : dicItemCode.trim();
    }

    /**
     * @return DIC_ITEM_KEY
     */
    public String getDicItemKey() {
        return dicItemKey;
    }

    /**
     * @param dicItemKey
     */
    public void setDicItemKey(String dicItemKey) {
        this.dicItemKey = dicItemKey == null ? null : dicItemKey.trim();
    }

    /**
     * @return DIC_ITEM_VALUE
     */
    public String getDicItemValue() {
        return dicItemValue;
    }

    /**
     * @param dicItemValue
     */
    public void setDicItemValue(String dicItemValue) {
        this.dicItemValue = dicItemValue == null ? null : dicItemValue.trim();
    }

    /**
     * @return CONFIGURE_STATUS
     */
    public String getConfigureStatus() {
        return configureStatus;
    }

    /**
     * @param configureStatus
     */
    public void setConfigureStatus(String configureStatus) {
        this.configureStatus = configureStatus == null ? null : configureStatus.trim();
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dicItemCode=").append(dicItemCode);
        sb.append(", dicItemKey=").append(dicItemKey);
        sb.append(", dicItemValue=").append(dicItemValue);
        sb.append(", configureStatus=").append(configureStatus);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}