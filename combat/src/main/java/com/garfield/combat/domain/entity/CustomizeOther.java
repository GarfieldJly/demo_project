package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_OTHER")
public class CustomizeOther implements Serializable {
    @Id
    @Column(name = "OTHER_ID")
    private Long otherId;

    @Column(name = "OTHER_TYPE")
    private String otherType;

    @Column(name = "OTHER_ITEM")
    private String otherItem;

    @Column(name = "OTHER_DESCRIPTION")
    private String otherDescription;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "OTHER_VALUE")
    private Object otherValue;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "FILE_PATH")
    private String filePath;

    @Column(name = "SENTENCE_TYPE")
    private String sentenceType;

    @Column(name = "DISPLAY_TYPE")
    private String displayType;

    @Column(name = "EXTEND_VALUE")
    private String extendValue;

    private static final long serialVersionUID = 1L;

    /**
     * @return OTHER_ID
     */
    public Long getOtherId() {
        return otherId;
    }

    /**
     * @param otherId
     */
    public void setOtherId(Long otherId) {
        this.otherId = otherId;
    }

    /**
     * @return OTHER_TYPE
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * @param otherType
     */
    public void setOtherType(String otherType) {
        this.otherType = otherType == null ? null : otherType.trim();
    }

    /**
     * @return OTHER_ITEM
     */
    public String getOtherItem() {
        return otherItem;
    }

    /**
     * @param otherItem
     */
    public void setOtherItem(String otherItem) {
        this.otherItem = otherItem == null ? null : otherItem.trim();
    }

    /**
     * @return OTHER_DESCRIPTION
     */
    public String getOtherDescription() {
        return otherDescription;
    }

    /**
     * @param otherDescription
     */
    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription == null ? null : otherDescription.trim();
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
     * @return OTHER_VALUE
     */
    public Object getOtherValue() {
        return otherValue;
    }

    /**
     * @param otherValue
     */
    public void setOtherValue(Object otherValue) {
        this.otherValue = otherValue;
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
     * @return SENTENCE_TYPE
     */
    public String getSentenceType() {
        return sentenceType;
    }

    /**
     * @param sentenceType
     */
    public void setSentenceType(String sentenceType) {
        this.sentenceType = sentenceType == null ? null : sentenceType.trim();
    }

    /**
     * @return DISPLAY_TYPE
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * @param displayType
     */
    public void setDisplayType(String displayType) {
        this.displayType = displayType == null ? null : displayType.trim();
    }

    /**
     * @return EXTEND_VALUE
     */
    public String getExtendValue() {
        return extendValue;
    }

    /**
     * @param extendValue
     */
    public void setExtendValue(String extendValue) {
        this.extendValue = extendValue == null ? null : extendValue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", otherId=").append(otherId);
        sb.append(", otherType=").append(otherType);
        sb.append(", otherItem=").append(otherItem);
        sb.append(", otherDescription=").append(otherDescription);
        sb.append(", questionId=").append(questionId);
        sb.append(", otherValue=").append(otherValue);
        sb.append(", optionId=").append(optionId);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", filePath=").append(filePath);
        sb.append(", sentenceType=").append(sentenceType);
        sb.append(", displayType=").append(displayType);
        sb.append(", extendValue=").append(extendValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}