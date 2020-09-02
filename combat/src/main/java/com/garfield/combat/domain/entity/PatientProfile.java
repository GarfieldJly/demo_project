package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_D_PATIENT_PROFILE")
public class PatientProfile implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "PAT_INDEX_NO")
    private String patIndexNo;

    @Column(name = "ASSESSMENT_ID")
    private String assessmentId;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "CATALOGUE_CONTENT")
    private String catalogueContent;

    @Column(name = "EVALUATE_TIME")
    private Date evaluateTime;

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
     * @return PAT_INDEX_NO
     */
    public String getPatIndexNo() {
        return patIndexNo;
    }

    /**
     * @param patIndexNo
     */
    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo == null ? null : patIndexNo.trim();
    }

    /**
     * @return ASSESSMENT_ID
     */
    public String getAssessmentId() {
        return assessmentId;
    }

    /**
     * @param assessmentId
     */
    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId == null ? null : assessmentId.trim();
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
     * @return CATALOGUE_CONTENT
     */
    public String getCatalogueContent() {
        return catalogueContent;
    }

    /**
     * @param catalogueContent
     */
    public void setCatalogueContent(String catalogueContent) {
        this.catalogueContent = catalogueContent == null ? null : catalogueContent.trim();
    }

    /**
     * @return EVALUATE_TIME
     */
    public Date getEvaluateTime() {
        return evaluateTime;
    }

    /**
     * @param evaluateTime
     */
    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", patIndexNo=").append(patIndexNo);
        sb.append(", assessmentId=").append(assessmentId);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", catalogueContent=").append(catalogueContent);
        sb.append(", evaluateTime=").append(evaluateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}