package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_ROUTINE_STEP")
public class RoutineStep implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "STEP_NAME")
    private String stepName;

    @Column(name = "REPEAT_TYPE")
    private Short repeatType;

    @Column(name = "PASS_RULE")
    private String passRule;

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
     * @return EVALUATION_ID
     */
    public Long getEvaluationId() {
        return evaluationId;
    }

    /**
     * @param evaluationId
     */
    public void setEvaluationId(Long evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * @return STATUS
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return STEP_NAME
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * @param stepName
     */
    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }

    /**
     * @return REPEAT_TYPE
     */
    public Short getRepeatType() {
        return repeatType;
    }

    /**
     * @param repeatType
     */
    public void setRepeatType(Short repeatType) {
        this.repeatType = repeatType;
    }

    /**
     * @return PASS_RULE
     */
    public String getPassRule() {
        return passRule;
    }

    /**
     * @param passRule
     */
    public void setPassRule(String passRule) {
        this.passRule = passRule == null ? null : passRule.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", status=").append(status);
        sb.append(", stepName=").append(stepName);
        sb.append(", repeatType=").append(repeatType);
        sb.append(", passRule=").append(passRule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}