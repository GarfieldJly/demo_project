package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_ROUTINE_INIT")
public class RoutineInit implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "ROUTINE_NAME")
    private String routineName;

    @Column(name = "START_STEP")
    private Long startStep;

    @Column(name = "END_STEP")
    private Long endStep;

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
     * @return START_STEP
     */
    public Long getStartStep() {
        return startStep;
    }

    /**
     * @param startStep
     */
    public void setStartStep(Long startStep) {
        this.startStep = startStep;
    }

    /**
     * @return END_STEP
     */
    public Long getEndStep() {
        return endStep;
    }

    /**
     * @param endStep
     */
    public void setEndStep(Long endStep) {
        this.endStep = endStep;
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
        sb.append(", startStep=").append(startStep);
        sb.append(", endStep=").append(endStep);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}