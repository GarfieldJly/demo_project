package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_CATALOGUE_TCM_UNIT")
public class CatalogueTcmUnit implements Serializable {
    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "UNIT_CODE")
    private String unitCode;

    @Column(name = "UNIT_STATUS")
    private String unitStatus;

    @Column(name = "UNIT_TYPE")
    private String unitType;

    @Column(name = "UNIT_TYPE_NAME")
    private String unitTypeName;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;

    @Column(name = "CATALOGUE_SPELL")
    private String catalogueSpell;

    @Column(name = "SORT_NUM")
    private Short sortNum;

    @Column(name = "CHINESE_TRADITIONAL")
    private String chineseTraditional;

    @Column(name = "ENGLISH_NAME")
    private String englishName;

    @Column(name = "UNIT_NAME")
    private Object unitName;

    @Column(name = "UNIT_REMARK")
    private String unitRemark;

    @Column(name = "ALIAS_UNIT_NAME")
    private String aliasUnitName;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

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
     * @return UNIT_CODE
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * @param unitCode
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
    }

    /**
     * @return UNIT_STATUS
     */
    public String getUnitStatus() {
        return unitStatus;
    }

    /**
     * @param unitStatus
     */
    public void setUnitStatus(String unitStatus) {
        this.unitStatus = unitStatus == null ? null : unitStatus.trim();
    }

    /**
     * @return UNIT_TYPE
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * @param unitType
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    /**
     * @return UNIT_TYPE_NAME
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }

    /**
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName == null ? null : unitTypeName.trim();
    }

    /**
     * @return UNIQUE_CODE
     */
    public String getUniqueCode() {
        return uniqueCode;
    }

    /**
     * @param uniqueCode
     */
    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode == null ? null : uniqueCode.trim();
    }

    /**
     * @return CATALOGUE_SPELL
     */
    public String getCatalogueSpell() {
        return catalogueSpell;
    }

    /**
     * @param catalogueSpell
     */
    public void setCatalogueSpell(String catalogueSpell) {
        this.catalogueSpell = catalogueSpell == null ? null : catalogueSpell.trim();
    }

    /**
     * @return SORT_NUM
     */
    public Short getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Short sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * @return CHINESE_TRADITIONAL
     */
    public String getChineseTraditional() {
        return chineseTraditional;
    }

    /**
     * @param chineseTraditional
     */
    public void setChineseTraditional(String chineseTraditional) {
        this.chineseTraditional = chineseTraditional == null ? null : chineseTraditional.trim();
    }

    /**
     * @return ENGLISH_NAME
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * @param englishName
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * @return UNIT_NAME
     */
    public Object getUnitName() {
        return unitName;
    }

    /**
     * @param unitName
     */
    public void setUnitName(Object unitName) {
        this.unitName = unitName;
    }

    /**
     * @return UNIT_REMARK
     */
    public String getUnitRemark() {
        return unitRemark;
    }

    /**
     * @param unitRemark
     */
    public void setUnitRemark(String unitRemark) {
        this.unitRemark = unitRemark == null ? null : unitRemark.trim();
    }

    /**
     * @return ALIAS_UNIT_NAME
     */
    public String getAliasUnitName() {
        return aliasUnitName;
    }

    /**
     * @param aliasUnitName
     */
    public void setAliasUnitName(String aliasUnitName) {
        this.aliasUnitName = aliasUnitName == null ? null : aliasUnitName.trim();
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
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", unitCode=").append(unitCode);
        sb.append(", unitStatus=").append(unitStatus);
        sb.append(", unitType=").append(unitType);
        sb.append(", unitTypeName=").append(unitTypeName);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", catalogueSpell=").append(catalogueSpell);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", chineseTraditional=").append(chineseTraditional);
        sb.append(", englishName=").append(englishName);
        sb.append(", unitName=").append(unitName);
        sb.append(", unitRemark=").append(unitRemark);
        sb.append(", aliasUnitName=").append(aliasUnitName);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}