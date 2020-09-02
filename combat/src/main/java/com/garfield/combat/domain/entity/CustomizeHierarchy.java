package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_HIERARCHY")
public class CustomizeHierarchy implements Serializable {
    @Id
    @Column(name = "HIERARCHY_ID")
    private Long hierarchyId;

    @Column(name = "CHILD_QUESTION_ID")
    private Long childQuestionId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "HIERARCHY_TYPE")
    private Long hierarchyType;

    @Column(name = "ROOT_QUESTION_ID")
    private Long rootQuestionId;

    private static final long serialVersionUID = 1L;

    /**
     * @return HIERARCHY_ID
     */
    public Long getHierarchyId() {
        return hierarchyId;
    }

    /**
     * @param hierarchyId
     */
    public void setHierarchyId(Long hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * @return CHILD_QUESTION_ID
     */
    public Long getChildQuestionId() {
        return childQuestionId;
    }

    /**
     * @param childQuestionId
     */
    public void setChildQuestionId(Long childQuestionId) {
        this.childQuestionId = childQuestionId;
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
     * @return HIERARCHY_TYPE
     */
    public Long getHierarchyType() {
        return hierarchyType;
    }

    /**
     * @param hierarchyType
     */
    public void setHierarchyType(Long hierarchyType) {
        this.hierarchyType = hierarchyType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hierarchyId=").append(hierarchyId);
        sb.append(", childQuestionId=").append(childQuestionId);
        sb.append(", questionId=").append(questionId);
        sb.append(", optionId=").append(optionId);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", hierarchyType=").append(hierarchyType);
        sb.append(", rootQuestionId=").append(rootQuestionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}