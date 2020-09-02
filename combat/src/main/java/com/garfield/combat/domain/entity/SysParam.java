package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_SYS_PARAM")
public class SysParam implements Serializable {
    @Id
    @Column(name = "SYS_CODE")
    private String sysCode;

    @Id
    @Column(name = "ORGAN_CODE")
    private String organCode;

    @Column(name = "SYS_VALUE")
    private String sysValue;

    private static final long serialVersionUID = 1L;

    /**
     * @return SYS_CODE
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * @param sysCode
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    /**
     * @return ORGAN_CODE
     */
    public String getOrganCode() {
        return organCode;
    }

    /**
     * @param organCode
     */
    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    /**
     * @return SYS_VALUE
     */
    public String getSysValue() {
        return sysValue;
    }

    /**
     * @param sysValue
     */
    public void setSysValue(String sysValue) {
        this.sysValue = sysValue == null ? null : sysValue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysCode=").append(sysCode);
        sb.append(", organCode=").append(organCode);
        sb.append(", sysValue=").append(sysValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}