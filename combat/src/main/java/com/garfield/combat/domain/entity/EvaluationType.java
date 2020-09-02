package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_TYPE")
public class EvaluationType implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "EVALUATION_LIST_TYPE")
    private String evaluationListType;

    @Column(name = "EVALUATION_LIST_CLASSIFY")
    private String evaluationListClassify;

    @Column(name = "EVALUATION_LIST_NAME")
    private String evaluationListName;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "CLASS_NAME")
    private String className;

    @Column(name = "CONSULTATION_INCIDENT")
    private String consultationIncident;

    @Column(name = "EVALUATION_LIST_SUBCLASS")
    private String evaluationListSubclass;

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
     * @return EVALUATION_LIST_TYPE
     */
    public String getEvaluationListType() {
        return evaluationListType;
    }

    /**
     * @param evaluationListType
     */
    public void setEvaluationListType(String evaluationListType) {
        this.evaluationListType = evaluationListType == null ? null : evaluationListType.trim();
    }

    /**
     * @return EVALUATION_LIST_CLASSIFY
     */
    public String getEvaluationListClassify() {
        return evaluationListClassify;
    }

    /**
     * @param evaluationListClassify
     */
    public void setEvaluationListClassify(String evaluationListClassify) {
        this.evaluationListClassify = evaluationListClassify == null ? null : evaluationListClassify.trim();
    }

    /**
     * @return EVALUATION_LIST_NAME
     */
    public String getEvaluationListName() {
        return evaluationListName;
    }

    /**
     * @param evaluationListName
     */
    public void setEvaluationListName(String evaluationListName) {
        this.evaluationListName = evaluationListName == null ? null : evaluationListName.trim();
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
     * @return CLASS_NAME
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * @return CONSULTATION_INCIDENT
     */
    public String getConsultationIncident() {
        return consultationIncident;
    }

    /**
     * @param consultationIncident
     */
    public void setConsultationIncident(String consultationIncident) {
        this.consultationIncident = consultationIncident == null ? null : consultationIncident.trim();
    }

    /**
     * @return EVALUATION_LIST_SUBCLASS
     */
    public String getEvaluationListSubclass() {
        return evaluationListSubclass;
    }

    /**
     * @param evaluationListSubclass
     */
    public void setEvaluationListSubclass(String evaluationListSubclass) {
        this.evaluationListSubclass = evaluationListSubclass == null ? null : evaluationListSubclass.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", evaluationListType=").append(evaluationListType);
        sb.append(", evaluationListClassify=").append(evaluationListClassify);
        sb.append(", evaluationListName=").append(evaluationListName);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", className=").append(className);
        sb.append(", consultationIncident=").append(consultationIncident);
        sb.append(", evaluationListSubclass=").append(evaluationListSubclass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}