package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_TEMP_NURSINGPLAN")
public class TempNursingplan implements Serializable {
    @Column(name = "PLAN_ID")
    private Long planId;

    @Column(name = "WARD_CODE")
    private String wardCode;

    @Column(name = "EVALUATION_TYPE")
    private String evaluationType;

    @Column(name = "COLUMN_NUMBER")
    private Long columnNumber;

    @Column(name = "DIRECTION")
    private String direction;

    private static final long serialVersionUID = 1L;

    /**
     * @return PLAN_ID
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
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
     * @return EVALUATION_TYPE
     */
    public String getEvaluationType() {
        return evaluationType;
    }

    /**
     * @param evaluationType
     */
    public void setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType == null ? null : evaluationType.trim();
    }

    /**
     * @return COLUMN_NUMBER
     */
    public Long getColumnNumber() {
        return columnNumber;
    }

    /**
     * @param columnNumber
     */
    public void setColumnNumber(Long columnNumber) {
        this.columnNumber = columnNumber;
    }

    /**
     * @return DIRECTION
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", planId=").append(planId);
        sb.append(", wardCode=").append(wardCode);
        sb.append(", evaluationType=").append(evaluationType);
        sb.append(", columnNumber=").append(columnNumber);
        sb.append(", direction=").append(direction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}