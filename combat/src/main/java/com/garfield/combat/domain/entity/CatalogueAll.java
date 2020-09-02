package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_CATALOGUE_ALL")
public class CatalogueAll implements Serializable {
    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "BASIC_TYPE")
    private String basicType;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "BASIC_CLASSIFY")
    private String basicClassify;

    @Column(name = "SECOND_CLASSIFY")
    private String secondClassify;

    @Column(name = "THIRD_CLASSIFY")
    private String thirdClassify;

    @Column(name = "FOURTH_CLASSIFY")
    private String fourthClassify;

    @Column(name = "FIFTH_CLASSIFY")
    private String fifthClassify;

    @Column(name = "CATALOGUE_STATUS")
    private String catalogueStatus;

    @Column(name = "CATALOGUE_REMARK")
    private String catalogueRemark;

    @Column(name = "CATALOGUE_REMARK_SPELL")
    private String catalogueRemarkSpell;

    @Column(name = "SORT_NUM")
    private Short sortNum;

    @Column(name = "AUDIT_TIME")
    private Date auditTime;

    @Column(name = "APPLICANTOR")
    private String applicantor;

    @Column(name = "APPROVER")
    private String approver;

    @Column(name = "APPROVAL_STATUS")
    private String approvalStatus;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "APPLICANTOR_ID")
    private String applicantorId;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;

    @Column(name = "SUGGESTION")
    private String suggestion;

    @Column(name = "RELATE_CODE")
    private String relateCode;

    @Column(name = "RELATE_KEY")
    private String relateKey;

    @Column(name = "RELATE_VALUE")
    private String relateValue;

    @Column(name = "HIERARCHY")
    private String hierarchy;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "CATALOGUE_SPELL")
    private String catalogueSpell;

    @Column(name = "ENGLISH_NAME")
    private String englishName;

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
     * @return BASIC_CLASSIFY
     */
    public String getBasicClassify() {
        return basicClassify;
    }

    /**
     * @param basicClassify
     */
    public void setBasicClassify(String basicClassify) {
        this.basicClassify = basicClassify == null ? null : basicClassify.trim();
    }

    /**
     * @return SECOND_CLASSIFY
     */
    public String getSecondClassify() {
        return secondClassify;
    }

    /**
     * @param secondClassify
     */
    public void setSecondClassify(String secondClassify) {
        this.secondClassify = secondClassify == null ? null : secondClassify.trim();
    }

    /**
     * @return THIRD_CLASSIFY
     */
    public String getThirdClassify() {
        return thirdClassify;
    }

    /**
     * @param thirdClassify
     */
    public void setThirdClassify(String thirdClassify) {
        this.thirdClassify = thirdClassify == null ? null : thirdClassify.trim();
    }

    /**
     * @return FOURTH_CLASSIFY
     */
    public String getFourthClassify() {
        return fourthClassify;
    }

    /**
     * @param fourthClassify
     */
    public void setFourthClassify(String fourthClassify) {
        this.fourthClassify = fourthClassify == null ? null : fourthClassify.trim();
    }

    /**
     * @return FIFTH_CLASSIFY
     */
    public String getFifthClassify() {
        return fifthClassify;
    }

    /**
     * @param fifthClassify
     */
    public void setFifthClassify(String fifthClassify) {
        this.fifthClassify = fifthClassify == null ? null : fifthClassify.trim();
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
     * @return CATALOGUE_REMARK_SPELL
     */
    public String getCatalogueRemarkSpell() {
        return catalogueRemarkSpell;
    }

    /**
     * @param catalogueRemarkSpell
     */
    public void setCatalogueRemarkSpell(String catalogueRemarkSpell) {
        this.catalogueRemarkSpell = catalogueRemarkSpell == null ? null : catalogueRemarkSpell.trim();
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
     * @return AUDIT_TIME
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * @param auditTime
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * @return APPLICANTOR
     */
    public String getApplicantor() {
        return applicantor;
    }

    /**
     * @param applicantor
     */
    public void setApplicantor(String applicantor) {
        this.applicantor = applicantor == null ? null : applicantor.trim();
    }

    /**
     * @return APPROVER
     */
    public String getApprover() {
        return approver;
    }

    /**
     * @param approver
     */
    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    /**
     * @return APPROVAL_STATUS
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * @param approvalStatus
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus == null ? null : approvalStatus.trim();
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
     * @return APPLICANTOR_ID
     */
    public String getApplicantorId() {
        return applicantorId;
    }

    /**
     * @param applicantorId
     */
    public void setApplicantorId(String applicantorId) {
        this.applicantorId = applicantorId == null ? null : applicantorId.trim();
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
     * @return SUGGESTION
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * @param suggestion
     */
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }

    /**
     * @return RELATE_CODE
     */
    public String getRelateCode() {
        return relateCode;
    }

    /**
     * @param relateCode
     */
    public void setRelateCode(String relateCode) {
        this.relateCode = relateCode == null ? null : relateCode.trim();
    }

    /**
     * @return RELATE_KEY
     */
    public String getRelateKey() {
        return relateKey;
    }

    /**
     * @param relateKey
     */
    public void setRelateKey(String relateKey) {
        this.relateKey = relateKey == null ? null : relateKey.trim();
    }

    /**
     * @return RELATE_VALUE
     */
    public String getRelateValue() {
        return relateValue;
    }

    /**
     * @param relateValue
     */
    public void setRelateValue(String relateValue) {
        this.relateValue = relateValue == null ? null : relateValue.trim();
    }

    /**
     * @return HIERARCHY
     */
    public String getHierarchy() {
        return hierarchy;
    }

    /**
     * @param hierarchy
     */
    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy == null ? null : hierarchy.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", basicType=").append(basicType);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", basicClassify=").append(basicClassify);
        sb.append(", secondClassify=").append(secondClassify);
        sb.append(", thirdClassify=").append(thirdClassify);
        sb.append(", fourthClassify=").append(fourthClassify);
        sb.append(", fifthClassify=").append(fifthClassify);
        sb.append(", catalogueStatus=").append(catalogueStatus);
        sb.append(", catalogueRemark=").append(catalogueRemark);
        sb.append(", catalogueRemarkSpell=").append(catalogueRemarkSpell);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", applicantor=").append(applicantor);
        sb.append(", approver=").append(approver);
        sb.append(", approvalStatus=").append(approvalStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", applicantorId=").append(applicantorId);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", suggestion=").append(suggestion);
        sb.append(", relateCode=").append(relateCode);
        sb.append(", relateKey=").append(relateKey);
        sb.append(", relateValue=").append(relateValue);
        sb.append(", hierarchy=").append(hierarchy);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", catalogueSpell=").append(catalogueSpell);
        sb.append(", englishName=").append(englishName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}