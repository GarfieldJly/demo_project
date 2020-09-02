package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_CATALOGUE_BAK")
public class CatalogueBak implements Serializable {
    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "BASIC_TYPE")
    private String basicType;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "CATALOGUE_STATUS")
    private String catalogueStatus;

    @Column(name = "CATALOGUE_REMARK")
    private String catalogueRemark;

    @Column(name = "SORT_NUM")
    private Short sortNum;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "CATALOGUE_SPELL")
    private String catalogueSpell;

    @Column(name = "ENGLISH_NAME")
    private String englishName;

    @Column(name = "CHINESE_TRADITIONAL")
    private String chineseTraditional;

    @Column(name = "CATALOGUE_ALIAS")
    private String catalogueAlias;

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
     * @return BASIC_TYPE
     */
    public String getBasicType() {
        return basicType;
    }

    /**
     * @param basicType
     */
    public void setBasicType(String basicType) {
        this.basicType = basicType == null ? null : basicType.trim();
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
     * @return CATALOGUE_STATUS
     */
    public String getCatalogueStatus() {
        return catalogueStatus;
    }

    /**
     * @param catalogueStatus
     */
    public void setCatalogueStatus(String catalogueStatus) {
        this.catalogueStatus = catalogueStatus == null ? null : catalogueStatus.trim();
    }

    /**
     * @return CATALOGUE_REMARK
     */
    public String getCatalogueRemark() {
        return catalogueRemark;
    }

    /**
     * @param catalogueRemark
     */
    public void setCatalogueRemark(String catalogueRemark) {
        this.catalogueRemark = catalogueRemark == null ? null : catalogueRemark.trim();
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
     * @return CATALOGUE_ALIAS
     */
    public String getCatalogueAlias() {
        return catalogueAlias;
    }

    /**
     * @param catalogueAlias
     */
    public void setCatalogueAlias(String catalogueAlias) {
        this.catalogueAlias = catalogueAlias == null ? null : catalogueAlias.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", basicType=").append(basicType);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", catalogueStatus=").append(catalogueStatus);
        sb.append(", catalogueRemark=").append(catalogueRemark);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", catalogueSpell=").append(catalogueSpell);
        sb.append(", englishName=").append(englishName);
        sb.append(", chineseTraditional=").append(chineseTraditional);
        sb.append(", catalogueAlias=").append(catalogueAlias);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}