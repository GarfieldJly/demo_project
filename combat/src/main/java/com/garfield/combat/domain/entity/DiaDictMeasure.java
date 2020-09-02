package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_DIA_DICT_MEASURE")
public class DiaDictMeasure implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORGAN_CODE")
    private String organCode;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "PARENT_ID")
    private Long parentId;

    @Column(name = "PARENT_CODE")
    private String parentCode;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

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
     * @return CATALOGUE_NAME
     */
    public String getCatalogueName() {
        return catalogueName;
    }

    /**
     * @param catalogueName
     */
    public void setCatalogueName(String catalogueName) {
        this.catalogueName = catalogueName == null ? null : catalogueName.trim();
    }

    /**
     * @return PARENT_ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return PARENT_CODE
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * @param parentCode
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
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
     * @return MODIFY_TIME
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", organCode=").append(organCode);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentCode=").append(parentCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}