package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_LIST_CONFIG")
public class EvaluationListConfig implements Serializable {
    @Id
    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "ORGAN_CODE")
    private String organCode;

    @Column(name = "EVALUATION_LIST_NAME")
    private String evaluationListName;

    @Column(name = "EVALUATION_LIST_TYPE")
    private String evaluationListType;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "IS_DEL")
    private String isDel;

    @Column(name = "OPERATION_CODE")
    private String operationCode;

    @Column(name = "OPERATION_NAME")
    private String operationName;

    @Column(name = "EVALUATION_STATUS")
    private String evaluationStatus;

    @Column(name = "QUOTE_EVALUATION_LIST_ID")
    private Long quoteEvaluationListId;

    @Column(name = "IS_TEMPLATE")
    private String isTemplate;

    @Column(name = "EVALUATION_LIST_CLASSIFY")
    private String evaluationListClassify;

    @Column(name = "DYNAMIC_FLAG")
    private Short dynamicFlag;

    @Column(name = "TABLE_FLAG")
    private Short tableFlag;

    @Column(name = "SPECIAL_FLAG")
    private Short specialFlag;

    @Column(name = "EVALUATION_LIST_SUBCLASS")
    private String evaluationListSubclass;

    @Column(name = "STATISTIC_TYPE")
    private String statisticType;

    @Column(name = "DETAIL_TYPE")
    private String detailType;

    @Column(name = "INIT_POSITION")
    private String initPosition;

    @Column(name = "ROUTINE_FLAG")
    private Short routineFlag;

    @Column(name = "IS_ARCHIVE")
    private String isArchive;

    @Column(name = "MEASURE_TYPE")
    private Short measureType;

    @Column(name = "FLOW_WORD")
    private Short flowWord;

    @Column(name = "FLOW_TEXT")
    private String flowText;

    @Column(name = "OTHER_SETTING")
    private String otherSetting;

    @Column(name = "NAME_SPELL")
    private String nameSpell;

    @Column(name = "IS_AUTHENTICATION")
    private String isAuthentication;

    private static final long serialVersionUID = 1L;

    /**
     * @return EVALUATION_LIST_ID
     */
    public Long getEvaluationListId() {
        return evaluationListId;
    }

    /**
     * @param evaluationListId
     */
    public void setEvaluationListId(Long evaluationListId) {
        this.evaluationListId = evaluationListId;
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
     * @return EVALUATION_LIST_NAME
     */
    public String getEvaluationListName() {
        return evaluationListName;
    }

    /**
     * @param evaluationListName
     */
    public void setEvaluationListName(String evaluationListName) {
        this.evaluationListName = evaluationListName == null ? null : evaluationListName.trim();
    }

    /**
     * @return EVALUATION_LIST_TYPE
     */
    public String getEvaluationListType() {
        return evaluationListType;
    }

    /**
     * @param evaluationListType
     */
    public void setEvaluationListType(String evaluationListType) {
        this.evaluationListType = evaluationListType == null ? null : evaluationListType.trim();
    }

    /**
     * @return CATEGORY
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
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
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return IS_DEL
     */
    public String getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    /**
     * @return OPERATION_CODE
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * @param operationCode
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    /**
     * @return OPERATION_NAME
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    /**
     * @return EVALUATION_STATUS
     */
    public String getEvaluationStatus() {
        return evaluationStatus;
    }

    /**
     * @param evaluationStatus
     */
    public void setEvaluationStatus(String evaluationStatus) {
        this.evaluationStatus = evaluationStatus == null ? null : evaluationStatus.trim();
    }

    /**
     * @return QUOTE_EVALUATION_LIST_ID
     */
    public Long getQuoteEvaluationListId() {
        return quoteEvaluationListId;
    }

    /**
     * @param quoteEvaluationListId
     */
    public void setQuoteEvaluationListId(Long quoteEvaluationListId) {
        this.quoteEvaluationListId = quoteEvaluationListId;
    }

    /**
     * @return IS_TEMPLATE
     */
    public String getIsTemplate() {
        return isTemplate;
    }

    /**
     * @param isTemplate
     */
    public void setIsTemplate(String isTemplate) {
        this.isTemplate = isTemplate == null ? null : isTemplate.trim();
    }

    /**
     * @return EVALUATION_LIST_CLASSIFY
     */
    public String getEvaluationListClassify() {
        return evaluationListClassify;
    }

    /**
     * @param evaluationListClassify
     */
    public void setEvaluationListClassify(String evaluationListClassify) {
        this.evaluationListClassify = evaluationListClassify == null ? null : evaluationListClassify.trim();
    }

    /**
     * @return DYNAMIC_FLAG
     */
    public Short getDynamicFlag() {
        return dynamicFlag;
    }

    /**
     * @param dynamicFlag
     */
    public void setDynamicFlag(Short dynamicFlag) {
        this.dynamicFlag = dynamicFlag;
    }

    /**
     * @return TABLE_FLAG
     */
    public Short getTableFlag() {
        return tableFlag;
    }

    /**
     * @param tableFlag
     */
    public void setTableFlag(Short tableFlag) {
        this.tableFlag = tableFlag;
    }

    /**
     * @return SPECIAL_FLAG
     */
    public Short getSpecialFlag() {
        return specialFlag;
    }

    /**
     * @param specialFlag
     */
    public void setSpecialFlag(Short specialFlag) {
        this.specialFlag = specialFlag;
    }

    /**
     * @return EVALUATION_LIST_SUBCLASS
     */
    public String getEvaluationListSubclass() {
        return evaluationListSubclass;
    }

    /**
     * @param evaluationListSubclass
     */
    public void setEvaluationListSubclass(String evaluationListSubclass) {
        this.evaluationListSubclass = evaluationListSubclass == null ? null : evaluationListSubclass.trim();
    }

    /**
     * @return STATISTIC_TYPE
     */
    public String getStatisticType() {
        return statisticType;
    }

    /**
     * @param statisticType
     */
    public void setStatisticType(String statisticType) {
        this.statisticType = statisticType == null ? null : statisticType.trim();
    }

    /**
     * @return DETAIL_TYPE
     */
    public String getDetailType() {
        return detailType;
    }

    /**
     * @param detailType
     */
    public void setDetailType(String detailType) {
        this.detailType = detailType == null ? null : detailType.trim();
    }

    /**
     * @return INIT_POSITION
     */
    public String getInitPosition() {
        return initPosition;
    }

    /**
     * @param initPosition
     */
    public void setInitPosition(String initPosition) {
        this.initPosition = initPosition == null ? null : initPosition.trim();
    }

    /**
     * @return ROUTINE_FLAG
     */
    public Short getRoutineFlag() {
        return routineFlag;
    }

    /**
     * @param routineFlag
     */
    public void setRoutineFlag(Short routineFlag) {
        this.routineFlag = routineFlag;
    }

    /**
     * @return IS_ARCHIVE
     */
    public String getIsArchive() {
        return isArchive;
    }

    /**
     * @param isArchive
     */
    public void setIsArchive(String isArchive) {
        this.isArchive = isArchive == null ? null : isArchive.trim();
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
     * @return FLOW_WORD
     */
    public Short getFlowWord() {
        return flowWord;
    }

    /**
     * @param flowWord
     */
    public void setFlowWord(Short flowWord) {
        this.flowWord = flowWord;
    }

    /**
     * @return FLOW_TEXT
     */
    public String getFlowText() {
        return flowText;
    }

    /**
     * @param flowText
     */
    public void setFlowText(String flowText) {
        this.flowText = flowText == null ? null : flowText.trim();
    }

    /**
     * @return OTHER_SETTING
     */
    public String getOtherSetting() {
        return otherSetting;
    }

    /**
     * @param otherSetting
     */
    public void setOtherSetting(String otherSetting) {
        this.otherSetting = otherSetting == null ? null : otherSetting.trim();
    }

    /**
     * @return NAME_SPELL
     */
    public String getNameSpell() {
        return nameSpell;
    }

    /**
     * @param nameSpell
     */
    public void setNameSpell(String nameSpell) {
        this.nameSpell = nameSpell == null ? null : nameSpell.trim();
    }

    /**
     * @return IS_AUTHENTICATION
     */
    public String getIsAuthentication() {
        return isAuthentication;
    }

    /**
     * @param isAuthentication
     */
    public void setIsAuthentication(String isAuthentication) {
        this.isAuthentication = isAuthentication == null ? null : isAuthentication.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", organCode=").append(organCode);
        sb.append(", evaluationListName=").append(evaluationListName);
        sb.append(", evaluationListType=").append(evaluationListType);
        sb.append(", category=").append(category);
        sb.append(", remark=").append(remark);
        sb.append(", createDate=").append(createDate);
        sb.append(", isDel=").append(isDel);
        sb.append(", operationCode=").append(operationCode);
        sb.append(", operationName=").append(operationName);
        sb.append(", evaluationStatus=").append(evaluationStatus);
        sb.append(", quoteEvaluationListId=").append(quoteEvaluationListId);
        sb.append(", isTemplate=").append(isTemplate);
        sb.append(", evaluationListClassify=").append(evaluationListClassify);
        sb.append(", dynamicFlag=").append(dynamicFlag);
        sb.append(", tableFlag=").append(tableFlag);
        sb.append(", specialFlag=").append(specialFlag);
        sb.append(", evaluationListSubclass=").append(evaluationListSubclass);
        sb.append(", statisticType=").append(statisticType);
        sb.append(", detailType=").append(detailType);
        sb.append(", initPosition=").append(initPosition);
        sb.append(", routineFlag=").append(routineFlag);
        sb.append(", isArchive=").append(isArchive);
        sb.append(", measureType=").append(measureType);
        sb.append(", flowWord=").append(flowWord);
        sb.append(", flowText=").append(flowText);
        sb.append(", otherSetting=").append(otherSetting);
        sb.append(", nameSpell=").append(nameSpell);
        sb.append(", isAuthentication=").append(isAuthentication);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}