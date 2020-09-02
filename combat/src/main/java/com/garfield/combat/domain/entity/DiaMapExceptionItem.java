package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_DIA_MAP_EXCEPTION_ITEM")
public class DiaMapExceptionItem implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORGAN_CODE")
    private String organCode;

    @Column(name = "EXCEPTION_CODE")
    private String exceptionCode;

    @Column(name = "EXCEPTION_NAME")
    private String exceptionName;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "PROPERTY_SCOPE")
    private String propertyScope;

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
     * @return EXCEPTION_CODE
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * @param exceptionCode
     */
    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode == null ? null : exceptionCode.trim();
    }

    /**
     * @return EXCEPTION_NAME
     */
    public String getExceptionName() {
        return exceptionName;
    }

    /**
     * @param exceptionName
     */
    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName == null ? null : exceptionName.trim();
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
     * @return PROPERTY_SCOPE
     */
    public String getPropertyScope() {
        return propertyScope;
    }

    /**
     * @param propertyScope
     */
    public void setPropertyScope(String propertyScope) {
        this.propertyScope = propertyScope == null ? null : propertyScope.trim();
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
        sb.append(", exceptionCode=").append(exceptionCode);
        sb.append(", exceptionName=").append(exceptionName);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", propertyScope=").append(propertyScope);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}