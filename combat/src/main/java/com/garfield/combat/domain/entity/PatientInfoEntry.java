package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_PATIENT_INFO_ENTRY")
public class PatientInfoEntry implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "FETCH_TYPE")
    private Short fetchType;

    @Column(name = "OTHER_PARAM")
    private String otherParam;

    @Column(name = "INFO_KEY")
    private String infoKey;

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
     * @return QUESTION_ID
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * @return FETCH_TYPE
     */
    public Short getFetchType() {
        return fetchType;
    }

    /**
     * @param fetchType
     */
    public void setFetchType(Short fetchType) {
        this.fetchType = fetchType;
    }

    /**
     * @return OTHER_PARAM
     */
    public String getOtherParam() {
        return otherParam;
    }

    /**
     * @param otherParam
     */
    public void setOtherParam(String otherParam) {
        this.otherParam = otherParam == null ? null : otherParam.trim();
    }

    /**
     * @return INFO_KEY
     */
    public String getInfoKey() {
        return infoKey;
    }

    /**
     * @param infoKey
     */
    public void setInfoKey(String infoKey) {
        this.infoKey = infoKey == null ? null : infoKey.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", questionId=").append(questionId);
        sb.append(", fetchType=").append(fetchType);
        sb.append(", otherParam=").append(otherParam);
        sb.append(", infoKey=").append(infoKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}