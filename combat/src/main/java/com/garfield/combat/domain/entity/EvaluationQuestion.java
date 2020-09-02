package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_QUESTION")
public class EvaluationQuestion implements Serializable {
    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "QUESTION_TYPE")
    private Short questionType;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "ALIAS_TYPE")
    private Short aliasType;

    @Column(name = "ALIAS_NAME")
    private String aliasName;

    @Column(name = "SHORT_SPELL")
    private String shortSpell;

    @Column(name = "TEMPLATE_ID")
    private String templateId;

    @Column(name = "OTHER_PROP")
    private String otherProp;

    @Column(name = "COMMON_FLAG")
    private Long commonFlag;

    @Column(name = "OPTION_TEXT")
    private String optionText;

    @Column(name = "CHECK_TEXT")
    private String checkText;

    @Column(name = "STORAGE_TEXT")
    private String storageText;

    @Column(name = "STYLE_TEXT")
    private String styleText;

    private static final long serialVersionUID = 1L;

    /**
     * @return QUESTION_ID
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * @return QUESTION_TYPE
     */
    public Short getQuestionType() {
        return questionType;
    }

    /**
     * @param questionType
     */
    public void setQuestionType(Short questionType) {
        this.questionType = questionType;
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
     * @return ALIAS_TYPE
     */
    public Short getAliasType() {
        return aliasType;
    }

    /**
     * @param aliasType
     */
    public void setAliasType(Short aliasType) {
        this.aliasType = aliasType;
    }

    /**
     * @return ALIAS_NAME
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * @param aliasName
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    /**
     * @return SHORT_SPELL
     */
    public String getShortSpell() {
        return shortSpell;
    }

    /**
     * @param shortSpell
     */
    public void setShortSpell(String shortSpell) {
        this.shortSpell = shortSpell == null ? null : shortSpell.trim();
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
     * @return OTHER_PROP
     */
    public String getOtherProp() {
        return otherProp;
    }

    /**
     * @param otherProp
     */
    public void setOtherProp(String otherProp) {
        this.otherProp = otherProp == null ? null : otherProp.trim();
    }

    /**
     * @return COMMON_FLAG
     */
    public Long getCommonFlag() {
        return commonFlag;
    }

    /**
     * @param commonFlag
     */
    public void setCommonFlag(Long commonFlag) {
        this.commonFlag = commonFlag;
    }

    /**
     * @return OPTION_TEXT
     */
    public String getOptionText() {
        return optionText;
    }

    /**
     * @param optionText
     */
    public void setOptionText(String optionText) {
        this.optionText = optionText == null ? null : optionText.trim();
    }

    /**
     * @return CHECK_TEXT
     */
    public String getCheckText() {
        return checkText;
    }

    /**
     * @param checkText
     */
    public void setCheckText(String checkText) {
        this.checkText = checkText == null ? null : checkText.trim();
    }

    /**
     * @return STORAGE_TEXT
     */
    public String getStorageText() {
        return storageText;
    }

    /**
     * @param storageText
     */
    public void setStorageText(String storageText) {
        this.storageText = storageText == null ? null : storageText.trim();
    }

    /**
     * @return STYLE_TEXT
     */
    public String getStyleText() {
        return styleText;
    }

    /**
     * @param styleText
     */
    public void setStyleText(String styleText) {
        this.styleText = styleText == null ? null : styleText.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", questionType=").append(questionType);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", aliasType=").append(aliasType);
        sb.append(", aliasName=").append(aliasName);
        sb.append(", shortSpell=").append(shortSpell);
        sb.append(", templateId=").append(templateId);
        sb.append(", otherProp=").append(otherProp);
        sb.append(", commonFlag=").append(commonFlag);
        sb.append(", optionText=").append(optionText);
        sb.append(", checkText=").append(checkText);
        sb.append(", storageText=").append(storageText);
        sb.append(", styleText=").append(styleText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}