package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_RELATION")
public class EvaluationRelation implements Serializable {
    @Id
    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "HIERARCHY_CODE")
    private String hierarchyCode;

    @Column(name = "ROOT_QUESTION_ID")
    private Long rootQuestionId;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "QUOTE_UNIQUE_ID")
    private Long quoteUniqueId;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "PARENT_UNIQUE_ID")
    private Long parentUniqueId;

    @Column(name = "PARENT_OPTION_ID")
    private Long parentOptionId;

    @Column(name = "HIERARCHY_TYPE")
    private Short hierarchyType;

    private static final long serialVersionUID = 1L;

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
     * @return HIERARCHY_CODE
     */
    public String getHierarchyCode() {
        return hierarchyCode;
    }

    /**
     * @param hierarchyCode
     */
    public void setHierarchyCode(String hierarchyCode) {
        this.hierarchyCode = hierarchyCode == null ? null : hierarchyCode.trim();
    }

    /**
     * @return ROOT_QUESTION_ID
     */
    public Long getRootQuestionId() {
        return rootQuestionId;
    }

    /**
     * @param rootQuestionId
     */
    public void setRootQuestionId(Long rootQuestionId) {
        this.rootQuestionId = rootQuestionId;
    }

    /**
     * @return EVALUATION_LIST_ID
     */
    public Long getEvaluationListId() {
        return evaluationListId;
    }

    /**
     * @param evaluationListId
     */
    public void setEvaluationListId(Long evaluationListId) {
        this.evaluationListId = evaluationListId;
    }

    /**
     * @return QUOTE_UNIQUE_ID
     */
    public Long getQuoteUniqueId() {
        return quoteUniqueId;
    }

    /**
     * @param quoteUniqueId
     */
    public void setQuoteUniqueId(Long quoteUniqueId) {
        this.quoteUniqueId = quoteUniqueId;
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
     * @return PARENT_UNIQUE_ID
     */
    public Long getParentUniqueId() {
        return parentUniqueId;
    }

    /**
     * @param parentUniqueId
     */
    public void setParentUniqueId(Long parentUniqueId) {
        this.parentUniqueId = parentUniqueId;
    }

    /**
     * @return PARENT_OPTION_ID
     */
    public Long getParentOptionId() {
        return parentOptionId;
    }

    /**
     * @param parentOptionId
     */
    public void setParentOptionId(Long parentOptionId) {
        this.parentOptionId = parentOptionId;
    }

    /**
     * @return HIERARCHY_TYPE
     */
    public Short getHierarchyType() {
        return hierarchyType;
    }

    /**
     * @param hierarchyType
     */
    public void setHierarchyType(Short hierarchyType) {
        this.hierarchyType = hierarchyType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", questionId=").append(questionId);
        sb.append(", hierarchyCode=").append(hierarchyCode);
        sb.append(", rootQuestionId=").append(rootQuestionId);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", quoteUniqueId=").append(quoteUniqueId);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", parentUniqueId=").append(parentUniqueId);
        sb.append(", parentOptionId=").append(parentOptionId);
        sb.append(", hierarchyType=").append(hierarchyType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}