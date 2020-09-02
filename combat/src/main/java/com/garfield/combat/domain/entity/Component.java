package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_COMPONENT")
public class Component implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TEMPLATE_ID")
    private String templateId;

    @Column(name = "CHILD_TEMPLATE_ID")
    private String childTemplateId;

    @Column(name = "REPOSITORY")
    private Short repository;

    @Column(name = "GROUP_TYPE")
    private Short groupType;

    @Column(name = "ORIENTATION")
    private Short orientation;

    @Column(name = "SHOW_STYLE")
    private Short showStyle;

    @Column(name = "ROOT_QUESTION_ID")
    private Long rootQuestionId;

    @Column(name = "PRESET_TYPE")
    private Short presetType;

    @Column(name = "CREATE_TIME")
    private Date createTime;

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
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
     * @return REPOSITORY
     */
    public Short getRepository() {
        return repository;
    }

    /**
     * @param repository
     */
    public void setRepository(Short repository) {
        this.repository = repository;
    }

    /**
     * @return GROUP_TYPE
     */
    public Short getGroupType() {
        return groupType;
    }

    /**
     * @param groupType
     */
    public void setGroupType(Short groupType) {
        this.groupType = groupType;
    }

    /**
     * @return ORIENTATION
     */
    public Short getOrientation() {
        return orientation;
    }

    /**
     * @param orientation
     */
    public void setOrientation(Short orientation) {
        this.orientation = orientation;
    }

    /**
     * @return SHOW_STYLE
     */
    public Short getShowStyle() {
        return showStyle;
    }

    /**
     * @param showStyle
     */
    public void setShowStyle(Short showStyle) {
        this.showStyle = showStyle;
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
     * @return PRESET_TYPE
     */
    public Short getPresetType() {
        return presetType;
    }

    /**
     * @param presetType
     */
    public void setPresetType(Short presetType) {
        this.presetType = presetType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", templateId=").append(templateId);
        sb.append(", childTemplateId=").append(childTemplateId);
        sb.append(", repository=").append(repository);
        sb.append(", groupType=").append(groupType);
        sb.append(", orientation=").append(orientation);
        sb.append(", showStyle=").append(showStyle);
        sb.append(", rootQuestionId=").append(rootQuestionId);
        sb.append(", presetType=").append(presetType);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}