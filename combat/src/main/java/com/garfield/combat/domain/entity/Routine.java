package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_ROUTINE")
public class Routine implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "ROUTINE_NAME")
    private String routineName;

    @Column(name = "PREV_STEP")
    private Long prevStep;

    @Column(name = "NEXT_STEP")
    private Long nextStep;

    @Column(name = "CONDITION")
    private Short condition;

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
     * @return ROUTINE_NAME
     */
    public String getRoutineName() {
        return routineName;
    }

    /**
     * @param routineName
     */
    public void setRoutineName(String routineName) {
        this.routineName = routineName == null ? null : routineName.trim();
    }

    /**
     * @return PREV_STEP
     */
    public Long getPrevStep() {
        return prevStep;
    }

    /**
     * @param prevStep
     */
    public void setPrevStep(Long prevStep) {
        this.prevStep = prevStep;
    }

    /**
     * @return NEXT_STEP
     */
    public Long getNextStep() {
        return nextStep;
    }

    /**
     * @param nextStep
     */
    public void setNextStep(Long nextStep) {
        this.nextStep = nextStep;
    }

    /**
     * @return CONDITION
     */
    public Short getCondition() {
        return condition;
    }

    /**
     * @param condition
     */
    public void setCondition(Short condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", routineName=").append(routineName);
        sb.append(", prevStep=").append(prevStep);
        sb.append(", nextStep=").append(nextStep);
        sb.append(", condition=").append(condition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}