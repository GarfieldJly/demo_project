package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_FLOW")
public class EvaluationFlow implements Serializable {
    @Id
    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "FLOW_WORD_TEXT")
    private String flowWordText;

    private static final long serialVersionUID = 1L;

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
     * @return FLOW_WORD_TEXT
     */
    public String getFlowWordText() {
        return flowWordText;
    }

    /**
     * @param flowWordText
     */
    public void setFlowWordText(String flowWordText) {
        this.flowWordText = flowWordText == null ? null : flowWordText.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", flowWordText=").append(flowWordText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}