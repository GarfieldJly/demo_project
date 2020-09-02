package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_SHARE_VITAL")
public class ShareVital implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "VITAL_SIGN_NAME")
    private String vitalSignName;

    @Column(name = "VITAL_SIGN_UNIT")
    private String vitalSignUnit;

    @Column(name = "VITAL_SIGN_TYPE")
    private String vitalSignType;

    @Column(name = "DATA_FORMAT")
    private String dataFormat;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "EXPLICIT_TO")
    private String explicitTo;

    @Column(name = "VITAL_SIGN_SVAL1")
    private String vitalSignSval1;

    @Column(name = "REMARK")
    private String remark;

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
     * @return VITAL_SIGN_NAME
     */
    public String getVitalSignName() {
        return vitalSignName;
    }

    /**
     * @param vitalSignName
     */
    public void setVitalSignName(String vitalSignName) {
        this.vitalSignName = vitalSignName == null ? null : vitalSignName.trim();
    }

    /**
     * @return VITAL_SIGN_UNIT
     */
    public String getVitalSignUnit() {
        return vitalSignUnit;
    }

    /**
     * @param vitalSignUnit
     */
    public void setVitalSignUnit(String vitalSignUnit) {
        this.vitalSignUnit = vitalSignUnit == null ? null : vitalSignUnit.trim();
    }

    /**
     * @return VITAL_SIGN_TYPE
     */
    public String getVitalSignType() {
        return vitalSignType;
    }

    /**
     * @param vitalSignType
     */
    public void setVitalSignType(String vitalSignType) {
        this.vitalSignType = vitalSignType == null ? null : vitalSignType.trim();
    }

    /**
     * @return DATA_FORMAT
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * @param dataFormat
     */
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat == null ? null : dataFormat.trim();
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
     * @return EXPLICIT_TO
     */
    public String getExplicitTo() {
        return explicitTo;
    }

    /**
     * @param explicitTo
     */
    public void setExplicitTo(String explicitTo) {
        this.explicitTo = explicitTo == null ? null : explicitTo.trim();
    }

    /**
     * @return VITAL_SIGN_SVAL1
     */
    public String getVitalSignSval1() {
        return vitalSignSval1;
    }

    /**
     * @param vitalSignSval1
     */
    public void setVitalSignSval1(String vitalSignSval1) {
        this.vitalSignSval1 = vitalSignSval1 == null ? null : vitalSignSval1.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vitalSignName=").append(vitalSignName);
        sb.append(", vitalSignUnit=").append(vitalSignUnit);
        sb.append(", vitalSignType=").append(vitalSignType);
        sb.append(", dataFormat=").append(dataFormat);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", explicitTo=").append(explicitTo);
        sb.append(", vitalSignSval1=").append(vitalSignSval1);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}