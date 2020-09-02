package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_CATALOGUE")
public class Catalogue implements Serializable {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Id
    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "RULE")
    private String rule;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "SPELL")
    private String spell;

    @Column(name = "DEFINITION")
    private String definition;

    @Column(name = "DEFINITION_SPELL")
    private String definitionSpell;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CONTENTS")
    private String contents;

    @Column(name = "ACTIVITY_TYPE")
    private String activityType;

    @Column(name = "CHECK_CODE")
    private String checkCode;

    @Column(name = "STANDARD_CODE")
    private String standardCode;

    @Column(name = "OTHER_CODE")
    private String otherCode;

    @Column(name = "ALIAS")
    private String alias;

    @Column(name = "SEARCH_NAME")
    private String searchName;

    @Column(name = "SORT_NUM")
    private Short sortNum;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;

    @Column(name = "CLASSIFY")
    private String classify;

    @Column(name = "CLASSIFY_CODE")
    private String classifyCode;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    @Column(name = "TYPE")
    private Short type;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
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
     * @return RULE
     */
    public String getRule() {
        return rule;
    }

    /**
     * @param rule
     */
    public void setRule(String rule) {
        this.rule = rule == null ? null : rule.trim();
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
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return SPELL
     */
    public String getSpell() {
        return spell;
    }

    /**
     * @param spell
     */
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    /**
     * @return DEFINITION
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * @param definition
     */
    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    /**
     * @return DEFINITION_SPELL
     */
    public String getDefinitionSpell() {
        return definitionSpell;
    }

    /**
     * @param definitionSpell
     */
    public void setDefinitionSpell(String definitionSpell) {
        this.definitionSpell = definitionSpell == null ? null : definitionSpell.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return CONTENTS
     */
    public String getContents() {
        return contents;
    }

    /**
     * @param contents
     */
    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    /**
     * @return ACTIVITY_TYPE
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * @param activityType
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    /**
     * @return CHECK_CODE
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * @param checkCode
     */
    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode == null ? null : checkCode.trim();
    }

    /**
     * @return STANDARD_CODE
     */
    public String getStandardCode() {
        return standardCode;
    }

    /**
     * @param standardCode
     */
    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode == null ? null : standardCode.trim();
    }

    /**
     * @return OTHER_CODE
     */
    public String getOtherCode() {
        return otherCode;
    }

    /**
     * @param otherCode
     */
    public void setOtherCode(String otherCode) {
        this.otherCode = otherCode == null ? null : otherCode.trim();
    }

    /**
     * @return ALIAS
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * @return SEARCH_NAME
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * @param searchName
     */
    public void setSearchName(String searchName) {
        this.searchName = searchName == null ? null : searchName.trim();
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
     * @return CLASSIFY
     */
    public String getClassify() {
        return classify;
    }

    /**
     * @param classify
     */
    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    /**
     * @return CLASSIFY_CODE
     */
    public String getClassifyCode() {
        return classifyCode;
    }

    /**
     * @param classifyCode
     */
    public void setClassifyCode(String classifyCode) {
        this.classifyCode = classifyCode == null ? null : classifyCode.trim();
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

    /**
     * @return TYPE
     */
    public Short getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Short type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", rule=").append(rule);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", status=").append(status);
        sb.append(", spell=").append(spell);
        sb.append(", definition=").append(definition);
        sb.append(", definitionSpell=").append(definitionSpell);
        sb.append(", description=").append(description);
        sb.append(", contents=").append(contents);
        sb.append(", activityType=").append(activityType);
        sb.append(", checkCode=").append(checkCode);
        sb.append(", standardCode=").append(standardCode);
        sb.append(", otherCode=").append(otherCode);
        sb.append(", alias=").append(alias);
        sb.append(", searchName=").append(searchName);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", classify=").append(classify);
        sb.append(", classifyCode=").append(classifyCode);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}