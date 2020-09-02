package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_NURSING_RECORD_GROUP")
public class NursingRecordGroup implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "GROUP_ORDER")
    private Short groupOrder;

    @Column(name = "WARD_CODE")
    private String wardCode;

    @Column(name = "WARD_NAME")
    private String wardName;

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
     * @return GROUP_NAME
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * @return GROUP_ORDER
     */
    public Short getGroupOrder() {
        return groupOrder;
    }

    /**
     * @param groupOrder
     */
    public void setGroupOrder(Short groupOrder) {
        this.groupOrder = groupOrder;
    }

    /**
     * @return WARD_CODE
     */
    public String getWardCode() {
        return wardCode;
    }

    /**
     * @param wardCode
     */
    public void setWardCode(String wardCode) {
        this.wardCode = wardCode == null ? null : wardCode.trim();
    }

    /**
     * @return WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * @param wardName
     */
    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupName=").append(groupName);
        sb.append(", groupOrder=").append(groupOrder);
        sb.append(", wardCode=").append(wardCode);
        sb.append(", wardName=").append(wardName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}