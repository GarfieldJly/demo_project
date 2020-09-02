package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_OPTION")
public class CustomizeOption implements Serializable {
    @Id
    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "DEFAULT_TYPE")
    private String defaultType;

    @Column(name = "ALIAS_TYPE")
    private String aliasType;

    @Column(name = "ALIAS_NAME")
    private String aliasName;

    @Column(name = "OPTION_TYPE")
    private String optionType;

    @Column(name = "SWITCH_TYPE")
    private String switchType;

    @Column(name = "HELP_CONTENT")
    private String helpContent;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "OPTION_REMARK")
    private String optionRemark;

    @Column(name = "CATALOGUE_SPELL")
    private String catalogueSpell;

    @Column(name = "TIME_FORMAT")
    private String timeFormat;

    @Column(name = "QUANTITY")
    private String quantity;

    @Column(name = "ADD_TYPE")
    private String addType;

    @Column(name = "DEFAULT_TIME_TYPE")
    private Long defaultTimeType;

    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;

    @Column(name = "PLACE_HOLDER")
    private String placeHolder;

    @Column(name = "IMPLANT_STYLE")
    private String implantStyle;

    @Column(name = "TIME_FLAG")
    private String timeFlag;

    @Column(name = "AGE_LIMIT")
    private String ageLimit;

    @Column(name = "LIMIT_TYPE")
    private String limitType;

    @Column(name = "TIME_LIMIT")
    private String timeLimit;

    @Column(name = "LINE_FEED")
    private Short lineFeed;

    @Column(name = "FREE_TEXT")
    private String freeText;

    private static final long serialVersionUID = 1L;

    /**
     * @return OPTION_ID
     */
    public Long getOptionId() {
        return optionId;
    }

    /**
     * @param optionId
     */
    public void setOptionId(Long optionId) {
        this.optionId = optionId;
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
     * @return DEFAULT_TYPE
     */
    public String getDefaultType() {
        return defaultType;
    }

    /**
     * @param defaultType
     */
    public void setDefaultType(String defaultType) {
        this.defaultType = defaultType == null ? null : defaultType.trim();
    }

    /**
     * @return ALIAS_TYPE
     */
    public String getAliasType() {
        return aliasType;
    }

    /**
     * @param aliasType
     */
    public void setAliasType(String aliasType) {
        this.aliasType = aliasType == null ? null : aliasType.trim();
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
     * @return OPTION_TYPE
     */
    public String getOptionType() {
        return optionType;
    }

    /**
     * @param optionType
     */
    public void setOptionType(String optionType) {
        this.optionType = optionType == null ? null : optionType.trim();
    }

    /**
     * @return SWITCH_TYPE
     */
    public String getSwitchType() {
        return switchType;
    }

    /**
     * @param switchType
     */
    public void setSwitchType(String switchType) {
        this.switchType = switchType == null ? null : switchType.trim();
    }

    /**
     * @return HELP_CONTENT
     */
    public String getHelpContent() {
        return helpContent;
    }

    /**
     * @param helpContent
     */
    public void setHelpContent(String helpContent) {
        this.helpContent = helpContent == null ? null : helpContent.trim();
    }

    /**
     * @return SORT_NUM
     */
    public Long getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Long sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * @return OPTION_REMARK
     */
    public String getOptionRemark() {
        return optionRemark;
    }

    /**
     * @param optionRemark
     */
    public void setOptionRemark(String optionRemark) {
        this.optionRemark = optionRemark == null ? null : optionRemark.trim();
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
     * @return TIME_FORMAT
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * @param timeFormat
     */
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat == null ? null : timeFormat.trim();
    }

    /**
     * @return QUANTITY
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    /**
     * @return ADD_TYPE
     */
    public String getAddType() {
        return addType;
    }

    /**
     * @param addType
     */
    public void setAddType(String addType) {
        this.addType = addType == null ? null : addType.trim();
    }

    /**
     * @return DEFAULT_TIME_TYPE
     */
    public Long getDefaultTimeType() {
        return defaultTimeType;
    }

    /**
     * @param defaultTimeType
     */
    public void setDefaultTimeType(Long defaultTimeType) {
        this.defaultTimeType = defaultTimeType;
    }

    /**
     * @return DEFAULT_VALUE
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * @param defaultValue
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    /**
     * @return PLACE_HOLDER
     */
    public String getPlaceHolder() {
        return placeHolder;
    }

    /**
     * @param placeHolder
     */
    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder == null ? null : placeHolder.trim();
    }

    /**
     * @return IMPLANT_STYLE
     */
    public String getImplantStyle() {
        return implantStyle;
    }

    /**
     * @param implantStyle
     */
    public void setImplantStyle(String implantStyle) {
        this.implantStyle = implantStyle == null ? null : implantStyle.trim();
    }

    /**
     * @return TIME_FLAG
     */
    public String getTimeFlag() {
        return timeFlag;
    }

    /**
     * @param timeFlag
     */
    public void setTimeFlag(String timeFlag) {
        this.timeFlag = timeFlag == null ? null : timeFlag.trim();
    }

    /**
     * @return AGE_LIMIT
     */
    public String getAgeLimit() {
        return ageLimit;
    }

    /**
     * @param ageLimit
     */
    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit == null ? null : ageLimit.trim();
    }

    /**
     * @return LIMIT_TYPE
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * @param limitType
     */
    public void setLimitType(String limitType) {
        this.limitType = limitType == null ? null : limitType.trim();
    }

    /**
     * @return TIME_LIMIT
     */
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * @param timeLimit
     */
    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    /**
     * @return LINE_FEED
     */
    public Short getLineFeed() {
        return lineFeed;
    }

    /**
     * @param lineFeed
     */
    public void setLineFeed(Short lineFeed) {
        this.lineFeed = lineFeed;
    }

    /**
     * @return FREE_TEXT
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * @param freeText
     */
    public void setFreeText(String freeText) {
        this.freeText = freeText == null ? null : freeText.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", optionId=").append(optionId);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", questionId=").append(questionId);
        sb.append(", defaultType=").append(defaultType);
        sb.append(", aliasType=").append(aliasType);
        sb.append(", aliasName=").append(aliasName);
        sb.append(", optionType=").append(optionType);
        sb.append(", switchType=").append(switchType);
        sb.append(", helpContent=").append(helpContent);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", optionRemark=").append(optionRemark);
        sb.append(", catalogueSpell=").append(catalogueSpell);
        sb.append(", timeFormat=").append(timeFormat);
        sb.append(", quantity=").append(quantity);
        sb.append(", addType=").append(addType);
        sb.append(", defaultTimeType=").append(defaultTimeType);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", placeHolder=").append(placeHolder);
        sb.append(", implantStyle=").append(implantStyle);
        sb.append(", timeFlag=").append(timeFlag);
        sb.append(", ageLimit=").append(ageLimit);
        sb.append(", limitType=").append(limitType);
        sb.append(", timeLimit=").append(timeLimit);
        sb.append(", lineFeed=").append(lineFeed);
        sb.append(", freeText=").append(freeText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}