package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_CONDITION")
public class CustomizeCondition implements Serializable {
    @Id
    @Column(name = "CONDITION_ID")
    private Long conditionId;

    @Column(name = "LOGIC_ID")
    private Long logicId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "CONDITION_TYPE")
    private String conditionType;

    @Column(name = "JOIN_TYPE")
    private String joinType;

    @Column(name = "NEXT_CONDITION_ID")
    private Long nextConditionId;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "MATH_TYPE")
    private Long mathType;

    @Column(name = "SCOPE")
    private String scope;

    private static final long serialVersionUID = 1L;

    /**
     * @return CONDITION_ID
     */
    public Long getConditionId() {
        return conditionId;
    }

    /**
     * @param conditionId
     */
    public void setConditionId(Long conditionId) {
        this.conditionId = conditionId;
    }

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
     * @return OPTION_ID
     */
    public Long getOptionId() {
        return optionId;
    }

    /**
     * @param optionId
     */
    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    /**
     * @return CONDITION_TYPE
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * @param conditionType
     */
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType == null ? null : conditionType.trim();
    }

    /**
     * @return JOIN_TYPE
     */
    public String getJoinType() {
        return joinType;
    }

    /**
     * @param joinType
     */
    public void setJoinType(String joinType) {
        this.joinType = joinType == null ? null : joinType.trim();
    }

    /**
     * @return NEXT_CONDITION_ID
     */
    public Long getNextConditionId() {
        return nextConditionId;
    }

    /**
     * @param nextConditionId
     */
    public void setNextConditionId(Long nextConditionId) {
        this.nextConditionId = nextConditionId;
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
     * @return UNIQUE_ID
     */
    public Long getUniqueId() {
        return uniqueId;
    }

    /**
     * @param uniqueId
     */
    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * @return MATH_TYPE
     */
    public Long getMathType() {
        return mathType;
    }

    /**
     * @param mathType
     */
    public void setMathType(Long mathType) {
        this.mathType = mathType;
    }

    /**
     * @return SCOPE
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope
     */
    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", conditionId=").append(conditionId);
        sb.append(", logicId=").append(logicId);
        sb.append(", questionId=").append(questionId);
        sb.append(", optionId=").append(optionId);
        sb.append(", conditionType=").append(conditionType);
        sb.append(", joinType=").append(joinType);
        sb.append(", nextConditionId=").append(nextConditionId);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", mathType=").append(mathType);
        sb.append(", scope=").append(scope);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}