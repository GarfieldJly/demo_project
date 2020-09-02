package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_CHECK")
public class CustomizeCheck implements Serializable {
    @Id
    @Column(name = "CHECK_ID")
    private Long checkId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "CHECK_TYPE")
    private String checkType;

    @Column(name = "CHECK_CONTEXT")
    private String checkContext;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "PICTURE_SIZE")
    private String pictureSize;

    @Column(name = "PICTURE_FORMAT")
    private String pictureFormat;

    @Column(name = "PICTURE_COUNT")
    private Long pictureCount;

    @Column(name = "INPUT_TYPE")
    private Long inputType;

    @Column(name = "REMIND_TYPE")
    private Long remindType;

    @Column(name = "SCOPE")
    private String scope;

    @Column(name = "MATH_TYPE")
    private Long mathType;

    @Column(name = "CHECK_LEVEL")
    private String checkLevel;

    @Column(name = "MARKED_WORDS")
    private String markedWords;

    @Column(name = "GROUP_NUM")
    private Short groupNum;

    private static final long serialVersionUID = 1L;

    /**
     * @return CHECK_ID
     */
    public Long getCheckId() {
        return checkId;
    }

    /**
     * @param checkId
     */
    public void setCheckId(Long checkId) {
        this.checkId = checkId;
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
     * @return CHECK_CONTEXT
     */
    public String getCheckContext() {
        return checkContext;
    }

    /**
     * @param checkContext
     */
    public void setCheckContext(String checkContext) {
        this.checkContext = checkContext == null ? null : checkContext.trim();
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
     * @return PICTURE_SIZE
     */
    public String getPictureSize() {
        return pictureSize;
    }

    /**
     * @param pictureSize
     */
    public void setPictureSize(String pictureSize) {
        this.pictureSize = pictureSize == null ? null : pictureSize.trim();
    }

    /**
     * @return PICTURE_FORMAT
     */
    public String getPictureFormat() {
        return pictureFormat;
    }

    /**
     * @param pictureFormat
     */
    public void setPictureFormat(String pictureFormat) {
        this.pictureFormat = pictureFormat == null ? null : pictureFormat.trim();
    }

    /**
     * @return PICTURE_COUNT
     */
    public Long getPictureCount() {
        return pictureCount;
    }

    /**
     * @param pictureCount
     */
    public void setPictureCount(Long pictureCount) {
        this.pictureCount = pictureCount;
    }

    /**
     * @return INPUT_TYPE
     */
    public Long getInputType() {
        return inputType;
    }

    /**
     * @param inputType
     */
    public void setInputType(Long inputType) {
        this.inputType = inputType;
    }

    /**
     * @return REMIND_TYPE
     */
    public Long getRemindType() {
        return remindType;
    }

    /**
     * @param remindType
     */
    public void setRemindType(Long remindType) {
        this.remindType = remindType;
    }

    /**
     * @return SCOPE
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope
     */
    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    /**
     * @return MATH_TYPE
     */
    public Long getMathType() {
        return mathType;
    }

    /**
     * @param mathType
     */
    public void setMathType(Long mathType) {
        this.mathType = mathType;
    }

    /**
     * @return CHECK_LEVEL
     */
    public String getCheckLevel() {
        return checkLevel;
    }

    /**
     * @param checkLevel
     */
    public void setCheckLevel(String checkLevel) {
        this.checkLevel = checkLevel == null ? null : checkLevel.trim();
    }

    /**
     * @return MARKED_WORDS
     */
    public String getMarkedWords() {
        return markedWords;
    }

    /**
     * @param markedWords
     */
    public void setMarkedWords(String markedWords) {
        this.markedWords = markedWords == null ? null : markedWords.trim();
    }

    /**
     * @return GROUP_NUM
     */
    public Short getGroupNum() {
        return groupNum;
    }

    /**
     * @param groupNum
     */
    public void setGroupNum(Short groupNum) {
        this.groupNum = groupNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkId=").append(checkId);
        sb.append(", questionId=").append(questionId);
        sb.append(", optionId=").append(optionId);
        sb.append(", checkType=").append(checkType);
        sb.append(", checkContext=").append(checkContext);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", pictureSize=").append(pictureSize);
        sb.append(", pictureFormat=").append(pictureFormat);
        sb.append(", pictureCount=").append(pictureCount);
        sb.append(", inputType=").append(inputType);
        sb.append(", remindType=").append(remindType);
        sb.append(", scope=").append(scope);
        sb.append(", mathType=").append(mathType);
        sb.append(", checkLevel=").append(checkLevel);
        sb.append(", markedWords=").append(markedWords);
        sb.append(", groupNum=").append(groupNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}