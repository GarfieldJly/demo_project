package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_LOGIC")
public class CustomizeLogic implements Serializable {
    @Id
    @Column(name = "LOGIC_ID")
    private Long logicId;

    @Column(name = "LOGIC_TYPE")
    private String logicType;

    @Column(name = "GENERAL_TYPE")
    private String generalType;

    @Column(name = "LOGIC_GROUP")
    private Long logicGroup;

    @Column(name = "START_CONDITION_ID")
    private Long startConditionId;

    @Column(name = "REVERSE_TYPE")
    private String reverseType;

    @Column(name = "IS_EMPTY")
    private Long isEmpty;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "LOGIC_SCOPE")
    private Long logicScope;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "LOGIC_MODE")
    private Short logicMode;

    private static final long serialVersionUID = 1L;

    /**
     * @return LOGIC_ID
     */
    public Long getLogicId() {
        return logicId;
    }

    /**
     * @param logicId
     */
    public void setLogicId(Long logicId) {
        this.logicId = logicId;
    }

    /**
     * @return LOGIC_TYPE
     */
    public String getLogicType() {
        return logicType;
    }

    /**
     * @param logicType
     */
    public void setLogicType(String logicType) {
        this.logicType = logicType == null ? null : logicType.trim();
    }

    /**
     * @return GENERAL_TYPE
     */
    public String getGeneralType() {
        return generalType;
    }

    /**
     * @param generalType
     */
    public void setGeneralType(String generalType) {
        this.generalType = generalType == null ? null : generalType.trim();
    }

    /**
     * @return LOGIC_GROUP
     */
    public Long getLogicGroup() {
        return logicGroup;
    }

    /**
     * @param logicGroup
     */
    public void setLogicGroup(Long logicGroup) {
        this.logicGroup = logicGroup;
    }

    /**
     * @return START_CONDITION_ID
     */
    public Long getStartConditionId() {
        return startConditionId;
    }

    /**
     * @param startConditionId
     */
    public void setStartConditionId(Long startConditionId) {
        this.startConditionId = startConditionId;
    }

    /**
     * @return REVERSE_TYPE
     */
    public String getReverseType() {
        return reverseType;
    }

    /**
     * @param reverseType
     */
    public void setReverseType(String reverseType) {
        this.reverseType = reverseType == null ? null : reverseType.trim();
    }

    /**
     * @return IS_EMPTY
     */
    public Long getIsEmpty() {
        return isEmpty;
    }

    /**
     * @param isEmpty
     */
    public void setIsEmpty(Long isEmpty) {
        this.isEmpty = isEmpty;
    }

    /**
     * @return SORT_NUM
     */
    public Long getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Long sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * @return LOGIC_SCOPE
     */
    public Long getLogicScope() {
        return logicScope;
    }

    /**
     * @param logicScope
     */
    public void setLogicScope(Long logicScope) {
        this.logicScope = logicScope;
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
     * @return LOGIC_MODE
     */
    public Short getLogicMode() {
        return logicMode;
    }

    /**
     * @param logicMode
     */
    public void setLogicMode(Short logicMode) {
        this.logicMode = logicMode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logicId=").append(logicId);
        sb.append(", logicType=").append(logicType);
        sb.append(", generalType=").append(generalType);
        sb.append(", logicGroup=").append(logicGroup);
        sb.append(", startConditionId=").append(startConditionId);
        sb.append(", reverseType=").append(reverseType);
        sb.append(", isEmpty=").append(isEmpty);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", logicScope=").append(logicScope);
        sb.append(", questionId=").append(questionId);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", logicMode=").append(logicMode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}