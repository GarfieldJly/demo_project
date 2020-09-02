package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_QUESTION")
public class CustomizeQuestion implements Serializable {
    @Id
    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "ALIAS_TYPE")
    private String aliasType;

    @Column(name = "ALIAS_NAME")
    private String aliasName;

    @Column(name = "SEX_TYPE")
    private String sexType;

    @Column(name = "QUESTION_TYPE")
    private String questionType;

    @Column(name = "PAPER_TEMPLATE_ID")
    private String paperTemplateId;

    @Column(name = "HELP_CONTENT")
    private String helpContent;

    @Column(name = "QUESTION_REMARK")
    private String questionRemark;

    @Column(name = "TEMPLATE_TYPE")
    private String templateType;

    @Column(name = "IS_DEL")
    private Short isDel;

    @Column(name = "REFER_QUESTION_ID")
    private Long referQuestionId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EDIT_LOGIC_TYPE")
    private Short editLogicType;

    @Column(name = "MAIN_TYPE")
    private Long mainType;

    @Column(name = "AGE_LIMIT")
    private String ageLimit;

    @Column(name = "FILE_PATH")
    private String filePath;

    @Column(name = "CATALOGUE_SPELL")
    private String catalogueSpell;

    @Column(name = "IS_SWITCH")
    private String isSwitch;

    @Column(name = "CHECK_TYPE")
    private String checkType;

    @Column(name = "CHILD_TEMPLATE_ID")
    private String childTemplateId;

    @Column(name = "HELP_DISPLAY_TYPE")
    private Long helpDisplayType;

    @Column(name = "GROUP_TYPE")
    private Long groupType;

    @Column(name = "CONSULTATION_TYPE")
    private Long consultationType;

    @Column(name = "IMPORT_SHARE_TYPE")
    private Long importShareType;

    @Column(name = "IS_SHARE")
    private Long isShare;

    @Column(name = "WHOLE_WIDTH")
    private Long wholeWidth;

    @Column(name = "COMMON_TYPE")
    private String commonType;

    @Column(name = "RIGHT_TYPE")
    private String rightType;

    @Column(name = "ALIAS_SORT_NUMBER")
    private Long aliasSortNumber;

    @Column(name = "SWITCH_QUESTION")
    private String switchQuestion;

    @Column(name = "VALUE_URL")
    private String valueUrl;

    @Column(name = "VALUE_METHOD")
    private String valueMethod;

    @Column(name = "EXTEND_REMARK")
    private String extendRemark;

    @Column(name = "SORT_TYPE")
    private String sortType;

    @Column(name = "SORT_FIELD")
    private String sortField;

    @Column(name = "SPECIAL_FLAG")
    private String specialFlag;

    @Column(name = "LINK_FLAG")
    private String linkFlag;

    @Column(name = "AGE_SWITCH")
    private String ageSwitch;

    @Column(name = "OPTION_DOMAIN")
    private String optionDomain;

    @Column(name = "PAPER_TEMPLATE_TYPE")
    private String paperTemplateType;

    @Column(name = "LINE_FEED")
    private Short lineFeed;

    @Column(name = "NAV_LOCATION")
    private Short navLocation;

    @Column(name = "MUD")
    private Short mud;

    @Column(name = "REAL_TIME")
    private Short realTime;

    @Column(name = "SCORE_TYPE")
    private String scoreType;

    @Column(name = "START_TIME")
    private String startTime;

    @Column(name = "TIME_INTERVAL")
    private String timeInterval;

    @Column(name = "CLASSES")
    private String classes;

    @Column(name = "IMAGE_REMARK")
    private String imageRemark;

    @Column(name = "MEASURE_TYPE")
    private Short measureType;

    @Column(name = "FIXED_NAME")
    private String fixedName;

    @Column(name = "OTHER_PROP")
    private String otherProp;

    @Column(name = "BACKGROUND")
    private String background;

    @Column(name = "REMARKS_CONTENT")
    private String remarksContent;

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
     * @return SEX_TYPE
     */
    public String getSexType() {
        return sexType;
    }

    /**
     * @param sexType
     */
    public void setSexType(String sexType) {
        this.sexType = sexType == null ? null : sexType.trim();
    }

    /**
     * @return QUESTION_TYPE
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * @param questionType
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    /**
     * @return PAPER_TEMPLATE_ID
     */
    public String getPaperTemplateId() {
        return paperTemplateId;
    }

    /**
     * @param paperTemplateId
     */
    public void setPaperTemplateId(String paperTemplateId) {
        this.paperTemplateId = paperTemplateId == null ? null : paperTemplateId.trim();
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
     * @return QUESTION_REMARK
     */
    public String getQuestionRemark() {
        return questionRemark;
    }

    /**
     * @param questionRemark
     */
    public void setQuestionRemark(String questionRemark) {
        this.questionRemark = questionRemark == null ? null : questionRemark.trim();
    }

    /**
     * @return TEMPLATE_TYPE
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * @param templateType
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * @return IS_DEL
     */
    public Short getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }

    /**
     * @return REFER_QUESTION_ID
     */
    public Long getReferQuestionId() {
        return referQuestionId;
    }

    /**
     * @param referQuestionId
     */
    public void setReferQuestionId(Long referQuestionId) {
        this.referQuestionId = referQuestionId;
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
     * @return EDIT_LOGIC_TYPE
     */
    public Short getEditLogicType() {
        return editLogicType;
    }

    /**
     * @param editLogicType
     */
    public void setEditLogicType(Short editLogicType) {
        this.editLogicType = editLogicType;
    }

    /**
     * @return MAIN_TYPE
     */
    public Long getMainType() {
        return mainType;
    }

    /**
     * @param mainType
     */
    public void setMainType(Long mainType) {
        this.mainType = mainType;
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
     * @return FILE_PATH
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
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
     * @return IS_SWITCH
     */
    public String getIsSwitch() {
        return isSwitch;
    }

    /**
     * @param isSwitch
     */
    public void setIsSwitch(String isSwitch) {
        this.isSwitch = isSwitch == null ? null : isSwitch.trim();
    }

    /**
     * @return CHECK_TYPE
     */
    public String getCheckType() {
        return checkType;
    }

    /**
     * @param checkType
     */
    public void setCheckType(String checkType) {
        this.checkType = checkType == null ? null : checkType.trim();
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
     * @return HELP_DISPLAY_TYPE
     */
    public Long getHelpDisplayType() {
        return helpDisplayType;
    }

    /**
     * @param helpDisplayType
     */
    public void setHelpDisplayType(Long helpDisplayType) {
        this.helpDisplayType = helpDisplayType;
    }

    /**
     * @return GROUP_TYPE
     */
    public Long getGroupType() {
        return groupType;
    }

    /**
     * @param groupType
     */
    public void setGroupType(Long groupType) {
        this.groupType = groupType;
    }

    /**
     * @return CONSULTATION_TYPE
     */
    public Long getConsultationType() {
        return consultationType;
    }

    /**
     * @param consultationType
     */
    public void setConsultationType(Long consultationType) {
        this.consultationType = consultationType;
    }

    /**
     * @return IMPORT_SHARE_TYPE
     */
    public Long getImportShareType() {
        return importShareType;
    }

    /**
     * @param importShareType
     */
    public void setImportShareType(Long importShareType) {
        this.importShareType = importShareType;
    }

    /**
     * @return IS_SHARE
     */
    public Long getIsShare() {
        return isShare;
    }

    /**
     * @param isShare
     */
    public void setIsShare(Long isShare) {
        this.isShare = isShare;
    }

    /**
     * @return WHOLE_WIDTH
     */
    public Long getWholeWidth() {
        return wholeWidth;
    }

    /**
     * @param wholeWidth
     */
    public void setWholeWidth(Long wholeWidth) {
        this.wholeWidth = wholeWidth;
    }

    /**
     * @return COMMON_TYPE
     */
    public String getCommonType() {
        return commonType;
    }

    /**
     * @param commonType
     */
    public void setCommonType(String commonType) {
        this.commonType = commonType == null ? null : commonType.trim();
    }

    /**
     * @return RIGHT_TYPE
     */
    public String getRightType() {
        return rightType;
    }

    /**
     * @param rightType
     */
    public void setRightType(String rightType) {
        this.rightType = rightType == null ? null : rightType.trim();
    }

    /**
     * @return ALIAS_SORT_NUMBER
     */
    public Long getAliasSortNumber() {
        return aliasSortNumber;
    }

    /**
     * @param aliasSortNumber
     */
    public void setAliasSortNumber(Long aliasSortNumber) {
        this.aliasSortNumber = aliasSortNumber;
    }

    /**
     * @return SWITCH_QUESTION
     */
    public String getSwitchQuestion() {
        return switchQuestion;
    }

    /**
     * @param switchQuestion
     */
    public void setSwitchQuestion(String switchQuestion) {
        this.switchQuestion = switchQuestion == null ? null : switchQuestion.trim();
    }

    /**
     * @return VALUE_URL
     */
    public String getValueUrl() {
        return valueUrl;
    }

    /**
     * @param valueUrl
     */
    public void setValueUrl(String valueUrl) {
        this.valueUrl = valueUrl == null ? null : valueUrl.trim();
    }

    /**
     * @return VALUE_METHOD
     */
    public String getValueMethod() {
        return valueMethod;
    }

    /**
     * @param valueMethod
     */
    public void setValueMethod(String valueMethod) {
        this.valueMethod = valueMethod == null ? null : valueMethod.trim();
    }

    /**
     * @return EXTEND_REMARK
     */
    public String getExtendRemark() {
        return extendRemark;
    }

    /**
     * @param extendRemark
     */
    public void setExtendRemark(String extendRemark) {
        this.extendRemark = extendRemark == null ? null : extendRemark.trim();
    }

    /**
     * @return SORT_TYPE
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * @param sortType
     */
    public void setSortType(String sortType) {
        this.sortType = sortType == null ? null : sortType.trim();
    }

    /**
     * @return SORT_FIELD
     */
    public String getSortField() {
        return sortField;
    }

    /**
     * @param sortField
     */
    public void setSortField(String sortField) {
        this.sortField = sortField == null ? null : sortField.trim();
    }

    /**
     * @return SPECIAL_FLAG
     */
    public String getSpecialFlag() {
        return specialFlag;
    }

    /**
     * @param specialFlag
     */
    public void setSpecialFlag(String specialFlag) {
        this.specialFlag = specialFlag == null ? null : specialFlag.trim();
    }

    /**
     * @return LINK_FLAG
     */
    public String getLinkFlag() {
        return linkFlag;
    }

    /**
     * @param linkFlag
     */
    public void setLinkFlag(String linkFlag) {
        this.linkFlag = linkFlag == null ? null : linkFlag.trim();
    }

    /**
     * @return AGE_SWITCH
     */
    public String getAgeSwitch() {
        return ageSwitch;
    }

    /**
     * @param ageSwitch
     */
    public void setAgeSwitch(String ageSwitch) {
        this.ageSwitch = ageSwitch == null ? null : ageSwitch.trim();
    }

    /**
     * @return OPTION_DOMAIN
     */
    public String getOptionDomain() {
        return optionDomain;
    }

    /**
     * @param optionDomain
     */
    public void setOptionDomain(String optionDomain) {
        this.optionDomain = optionDomain == null ? null : optionDomain.trim();
    }

    /**
     * @return PAPER_TEMPLATE_TYPE
     */
    public String getPaperTemplateType() {
        return paperTemplateType;
    }

    /**
     * @param paperTemplateType
     */
    public void setPaperTemplateType(String paperTemplateType) {
        this.paperTemplateType = paperTemplateType == null ? null : paperTemplateType.trim();
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
     * @return NAV_LOCATION
     */
    public Short getNavLocation() {
        return navLocation;
    }

    /**
     * @param navLocation
     */
    public void setNavLocation(Short navLocation) {
        this.navLocation = navLocation;
    }

    /**
     * @return MUD
     */
    public Short getMud() {
        return mud;
    }

    /**
     * @param mud
     */
    public void setMud(Short mud) {
        this.mud = mud;
    }

    /**
     * @return REAL_TIME
     */
    public Short getRealTime() {
        return realTime;
    }

    /**
     * @param realTime
     */
    public void setRealTime(Short realTime) {
        this.realTime = realTime;
    }

    /**
     * @return SCORE_TYPE
     */
    public String getScoreType() {
        return scoreType;
    }

    /**
     * @param scoreType
     */
    public void setScoreType(String scoreType) {
        this.scoreType = scoreType == null ? null : scoreType.trim();
    }

    /**
     * @return START_TIME
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * @return TIME_INTERVAL
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * @param timeInterval
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval == null ? null : timeInterval.trim();
    }

    /**
     * @return CLASSES
     */
    public String getClasses() {
        return classes;
    }

    /**
     * @param classes
     */
    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    /**
     * @return IMAGE_REMARK
     */
    public String getImageRemark() {
        return imageRemark;
    }

    /**
     * @param imageRemark
     */
    public void setImageRemark(String imageRemark) {
        this.imageRemark = imageRemark == null ? null : imageRemark.trim();
    }

    /**
     * @return MEASURE_TYPE
     */
    public Short getMeasureType() {
        return measureType;
    }

    /**
     * @param measureType
     */
    public void setMeasureType(Short measureType) {
        this.measureType = measureType;
    }

    /**
     * @return FIXED_NAME
     */
    public String getFixedName() {
        return fixedName;
    }

    /**
     * @param fixedName
     */
    public void setFixedName(String fixedName) {
        this.fixedName = fixedName == null ? null : fixedName.trim();
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
     * @return BACKGROUND
     */
    public String getBackground() {
        return background;
    }

    /**
     * @param background
     */
    public void setBackground(String background) {
        this.background = background == null ? null : background.trim();
    }

    /**
     * @return REMARKS_CONTENT
     */
    public String getRemarksContent() {
        return remarksContent;
    }

    /**
     * @param remarksContent
     */
    public void setRemarksContent(String remarksContent) {
        this.remarksContent = remarksContent == null ? null : remarksContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", aliasType=").append(aliasType);
        sb.append(", aliasName=").append(aliasName);
        sb.append(", sexType=").append(sexType);
        sb.append(", questionType=").append(questionType);
        sb.append(", paperTemplateId=").append(paperTemplateId);
        sb.append(", helpContent=").append(helpContent);
        sb.append(", questionRemark=").append(questionRemark);
        sb.append(", templateType=").append(templateType);
        sb.append(", isDel=").append(isDel);
        sb.append(", referQuestionId=").append(referQuestionId);
        sb.append(", createTime=").append(createTime);
        sb.append(", editLogicType=").append(editLogicType);
        sb.append(", mainType=").append(mainType);
        sb.append(", ageLimit=").append(ageLimit);
        sb.append(", filePath=").append(filePath);
        sb.append(", catalogueSpell=").append(catalogueSpell);
        sb.append(", isSwitch=").append(isSwitch);
        sb.append(", checkType=").append(checkType);
        sb.append(", childTemplateId=").append(childTemplateId);
        sb.append(", helpDisplayType=").append(helpDisplayType);
        sb.append(", groupType=").append(groupType);
        sb.append(", consultationType=").append(consultationType);
        sb.append(", importShareType=").append(importShareType);
        sb.append(", isShare=").append(isShare);
        sb.append(", wholeWidth=").append(wholeWidth);
        sb.append(", commonType=").append(commonType);
        sb.append(", rightType=").append(rightType);
        sb.append(", aliasSortNumber=").append(aliasSortNumber);
        sb.append(", switchQuestion=").append(switchQuestion);
        sb.append(", valueUrl=").append(valueUrl);
        sb.append(", valueMethod=").append(valueMethod);
        sb.append(", extendRemark=").append(extendRemark);
        sb.append(", sortType=").append(sortType);
        sb.append(", sortField=").append(sortField);
        sb.append(", specialFlag=").append(specialFlag);
        sb.append(", linkFlag=").append(linkFlag);
        sb.append(", ageSwitch=").append(ageSwitch);
        sb.append(", optionDomain=").append(optionDomain);
        sb.append(", paperTemplateType=").append(paperTemplateType);
        sb.append(", lineFeed=").append(lineFeed);
        sb.append(", navLocation=").append(navLocation);
        sb.append(", mud=").append(mud);
        sb.append(", realTime=").append(realTime);
        sb.append(", scoreType=").append(scoreType);
        sb.append(", startTime=").append(startTime);
        sb.append(", timeInterval=").append(timeInterval);
        sb.append(", classes=").append(classes);
        sb.append(", imageRemark=").append(imageRemark);
        sb.append(", measureType=").append(measureType);
        sb.append(", fixedName=").append(fixedName);
        sb.append(", otherProp=").append(otherProp);
        sb.append(", background=").append(background);
        sb.append(", remarksContent=").append(remarksContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}