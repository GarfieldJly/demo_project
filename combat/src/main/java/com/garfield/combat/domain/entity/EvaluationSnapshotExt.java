package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_SNAPSHOT_EXT")
public class EvaluationSnapshotExt implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "SNAPSHOT_ID")
    private Long snapshotId;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "CONTENT_TYPE")
    private Long contentType;

    @Column(name = "OPERATING_MODE")
    private Short operatingMode;

    @Column(name = "PARENT_UNIQUE_ID")
    private Long parentUniqueId;

    @Column(name = "PARENT_OPTION_ID")
    private Long parentOptionId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "HIERARCHY_TYPE")
    private Short hierarchyType;

    @Column(name = "HIERARCHY_CODE")
    private String hierarchyCode;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "JSON_CONTEXT")
    private String jsonContext;

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
     * @return SNAPSHOT_ID
     */
    public Long getSnapshotId() {
        return snapshotId;
    }

    /**
     * @param snapshotId
     */
    public void setSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
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
     * @return CONTENT_TYPE
     */
    public Long getContentType() {
        return contentType;
    }

    /**
     * @param contentType
     */
    public void setContentType(Long contentType) {
        this.contentType = contentType;
    }

    /**
     * @return OPERATING_MODE
     */
    public Short getOperatingMode() {
        return operatingMode;
    }

    /**
     * @param operatingMode
     */
    public void setOperatingMode(Short operatingMode) {
        this.operatingMode = operatingMode;
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
     * @return JSON_CONTEXT
     */
    public String getJsonContext() {
        return jsonContext;
    }

    /**
     * @param jsonContext
     */
    public void setJsonContext(String jsonContext) {
        this.jsonContext = jsonContext == null ? null : jsonContext.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", snapshotId=").append(snapshotId);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", contentType=").append(contentType);
        sb.append(", operatingMode=").append(operatingMode);
        sb.append(", parentUniqueId=").append(parentUniqueId);
        sb.append(", parentOptionId=").append(parentOptionId);
        sb.append(", questionId=").append(questionId);
        sb.append(", hierarchyType=").append(hierarchyType);
        sb.append(", hierarchyCode=").append(hierarchyCode);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", jsonContext=").append(jsonContext);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}