package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_SHARE_ASSESSMENT")
public class ShareAssessment implements Serializable {
    @Id
    @Column(name = "SHARE_ID")
    private Long shareId;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "GRAB_WAY")
    private Short grabWay;

    @Column(name = "RELATE_TYPE")
    private String relateType;

    private static final long serialVersionUID = 1L;

    /**
     * @return SHARE_ID
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * @param shareId
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
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
     * @return CATALOGUE_RULE
     */
    public String getCatalogueRule() {
        return catalogueRule;
    }

    /**
     * @param catalogueRule
     */
    public void setCatalogueRule(String catalogueRule) {
        this.catalogueRule = catalogueRule == null ? null : catalogueRule.trim();
    }

    /**
     * @return CATALOGUE_CODE
     */
    public String getCatalogueCode() {
        return catalogueCode;
    }

    /**
     * @param catalogueCode
     */
    public void setCatalogueCode(String catalogueCode) {
        this.catalogueCode = catalogueCode == null ? null : catalogueCode.trim();
    }

    /**
     * @return GRAB_WAY
     */
    public Short getGrabWay() {
        return grabWay;
    }

    /**
     * @param grabWay
     */
    public void setGrabWay(Short grabWay) {
        this.grabWay = grabWay;
    }

    /**
     * @return RELATE_TYPE
     */
    public String getRelateType() {
        return relateType;
    }

    /**
     * @param relateType
     */
    public void setRelateType(String relateType) {
        this.relateType = relateType == null ? null : relateType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shareId=").append(shareId);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", questionId=").append(questionId);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", grabWay=").append(grabWay);
        sb.append(", relateType=").append(relateType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}