package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_TEMPLATE")
public class Template implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "TEMPLATE_ID")
    private String templateId;

    @Column(name = "CHILD_TEMPLATE_ID")
    private String childTemplateId;

    @Column(name = "TEMPLATE_NAME")
    private String templateName;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "ROOT_QUESTION_ID")
    private Long rootQuestionId;

    @Column(name = "TEMPLATE_STYLE")
    private Short templateStyle;

    @Column(name = "TEMPLATE_TYPE")
    private Short templateType;

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
     * @return TEMPLATE_ID
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    /**
     * @return CHILD_TEMPLATE_ID
     */
    public String getChildTemplateId() {
        return childTemplateId;
    }

    /**
     * @param childTemplateId
     */
    public void setChildTemplateId(String childTemplateId) {
        this.childTemplateId = childTemplateId == null ? null : childTemplateId.trim();
    }

    /**
     * @return TEMPLATE_NAME
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
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
     * @return TEMPLATE_STYLE
     */
    public Short getTemplateStyle() {
        return templateStyle;
    }

    /**
     * @param templateStyle
     */
    public void setTemplateStyle(Short templateStyle) {
        this.templateStyle = templateStyle;
    }

    /**
     * @return TEMPLATE_TYPE
     */
    public Short getTemplateType() {
        return templateType;
    }

    /**
     * @param templateType
     */
    public void setTemplateType(Short templateType) {
        this.templateType = templateType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", templateId=").append(templateId);
        sb.append(", childTemplateId=").append(childTemplateId);
        sb.append(", templateName=").append(templateName);
        sb.append(", createTime=").append(createTime);
        sb.append(", rootQuestionId=").append(rootQuestionId);
        sb.append(", templateStyle=").append(templateStyle);
        sb.append(", templateType=").append(templateType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}