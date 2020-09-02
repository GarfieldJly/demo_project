package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_PRINT_TEMPLATE")
public class PrintTemplate implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORGAN_CODE")
    private String organCode;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "TEMPLATE_TYPE")
    private String templateType;

    @Column(name = "IS_VALID")
    private String isValid;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "TEMPLATE_CLASSIFY")
    private String templateClassify;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "TEMPLATE_CONTEXT")
    private String templateContext;

    @Column(name = "TEMPLATE_ASSIST")
    private String templateAssist;

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
     * @return ORGAN_CODE
     */
    public String getOrganCode() {
        return organCode;
    }

    /**
     * @param organCode
     */
    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
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
     * @return TEMPLATE_TYPE
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * @param templateType
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * @return IS_VALID
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * @param isValid
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return TEMPLATE_CLASSIFY
     */
    public String getTemplateClassify() {
        return templateClassify;
    }

    /**
     * @param templateClassify
     */
    public void setTemplateClassify(String templateClassify) {
        this.templateClassify = templateClassify == null ? null : templateClassify.trim();
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
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return TEMPLATE_CONTEXT
     */
    public String getTemplateContext() {
        return templateContext;
    }

    /**
     * @param templateContext
     */
    public void setTemplateContext(String templateContext) {
        this.templateContext = templateContext == null ? null : templateContext.trim();
    }

    /**
     * @return TEMPLATE_ASSIST
     */
    public String getTemplateAssist() {
        return templateAssist;
    }

    /**
     * @param templateAssist
     */
    public void setTemplateAssist(String templateAssist) {
        this.templateAssist = templateAssist == null ? null : templateAssist.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", organCode=").append(organCode);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", templateType=").append(templateType);
        sb.append(", isValid=").append(isValid);
        sb.append(", remark=").append(remark);
        sb.append(", templateClassify=").append(templateClassify);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", createTime=").append(createTime);
        sb.append(", templateContext=").append(templateContext);
        sb.append(", templateAssist=").append(templateAssist);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}