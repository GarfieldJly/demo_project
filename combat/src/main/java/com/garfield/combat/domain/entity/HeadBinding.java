package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_HEAD_BINDING")
public class HeadBinding implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "HEAD_ID")
    private Long headId;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "DATA_TYPE")
    private Long dataType;

    @Column(name = "DATA_KEYWORD")
    private String dataKeyword;

    @Column(name = "QUESTION_NAME")
    private String questionName;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "DISPLAY_TYPE")
    private Long displayType;

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
     * @return TABLE_ID
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * @param tableId
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

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
     * @return HEAD_ID
     */
    public Long getHeadId() {
        return headId;
    }

    /**
     * @param headId
     */
    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    /**
     * @return UNIQUE_ID
     */
    public Long getUniqueId() {
        return uniqueId;
    }

    /**
     * @param uniqueId
     */
    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
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
     * @return DATA_TYPE
     */
    public Long getDataType() {
        return dataType;
    }

    /**
     * @param dataType
     */
    public void setDataType(Long dataType) {
        this.dataType = dataType;
    }

    /**
     * @return DATA_KEYWORD
     */
    public String getDataKeyword() {
        return dataKeyword;
    }

    /**
     * @param dataKeyword
     */
    public void setDataKeyword(String dataKeyword) {
        this.dataKeyword = dataKeyword == null ? null : dataKeyword.trim();
    }

    /**
     * @return QUESTION_NAME
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * @param questionName
     */
    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

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
     * @return DISPLAY_TYPE
     */
    public Long getDisplayType() {
        return displayType;
    }

    /**
     * @param displayType
     */
    public void setDisplayType(Long displayType) {
        this.displayType = displayType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tableId=").append(tableId);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", headId=").append(headId);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", dataType=").append(dataType);
        sb.append(", dataKeyword=").append(dataKeyword);
        sb.append(", questionName=").append(questionName);
        sb.append(", optionId=").append(optionId);
        sb.append(", displayType=").append(displayType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}