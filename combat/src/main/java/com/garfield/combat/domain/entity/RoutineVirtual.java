package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_ROUTINE_VIRTUAL")
public class RoutineVirtual implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "VIRTUAL_NAME")
    private String virtualName;

    @Column(name = "VIRTUAL_CODE")
    private String virtualCode;

    @Column(name = "DATA_FLAG")
    private Short dataFlag;

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
     * @return VIRTUAL_NAME
     */
    public String getVirtualName() {
        return virtualName;
    }

    /**
     * @param virtualName
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName == null ? null : virtualName.trim();
    }

    /**
     * @return VIRTUAL_CODE
     */
    public String getVirtualCode() {
        return virtualCode;
    }

    /**
     * @param virtualCode
     */
    public void setVirtualCode(String virtualCode) {
        this.virtualCode = virtualCode == null ? null : virtualCode.trim();
    }

    /**
     * @return DATA_FLAG
     */
    public Short getDataFlag() {
        return dataFlag;
    }

    /**
     * @param dataFlag
     */
    public void setDataFlag(Short dataFlag) {
        this.dataFlag = dataFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", virtualName=").append(virtualName);
        sb.append(", virtualCode=").append(virtualCode);
        sb.append(", dataFlag=").append(dataFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}