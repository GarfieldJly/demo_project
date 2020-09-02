package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_SPECIAL_SHARE")
public class SpecialShare implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "RELATE_TYPE")
    private String relateType;

    @Column(name = "IS_ONCE")
    private Long isOnce;

    @Column(name = "IS_DYNAMIC")
    private Long isDynamic;

    @Column(name = "POPUP_TYPE")
    private Long popupType;

    @Column(name = "FETCH_CODE")
    private String fetchCode;

    @Column(name = "FETCH_URL")
    private String fetchUrl;

    @Column(name = "SPECIAL_TYPE")
    private Long specialType;

    @Column(name = "SPECIAL_URL")
    private String specialUrl;

    @Column(name = "RELATE_NAME")
    private String relateName;

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
     * @return RELATE_TYPE
     */
    public String getRelateType() {
        return relateType;
    }

    /**
     * @param relateType
     */
    public void setRelateType(String relateType) {
        this.relateType = relateType == null ? null : relateType.trim();
    }

    /**
     * @return IS_ONCE
     */
    public Long getIsOnce() {
        return isOnce;
    }

    /**
     * @param isOnce
     */
    public void setIsOnce(Long isOnce) {
        this.isOnce = isOnce;
    }

    /**
     * @return IS_DYNAMIC
     */
    public Long getIsDynamic() {
        return isDynamic;
    }

    /**
     * @param isDynamic
     */
    public void setIsDynamic(Long isDynamic) {
        this.isDynamic = isDynamic;
    }

    /**
     * @return POPUP_TYPE
     */
    public Long getPopupType() {
        return popupType;
    }

    /**
     * @param popupType
     */
    public void setPopupType(Long popupType) {
        this.popupType = popupType;
    }

    /**
     * @return FETCH_CODE
     */
    public String getFetchCode() {
        return fetchCode;
    }

    /**
     * @param fetchCode
     */
    public void setFetchCode(String fetchCode) {
        this.fetchCode = fetchCode == null ? null : fetchCode.trim();
    }

    /**
     * @return FETCH_URL
     */
    public String getFetchUrl() {
        return fetchUrl;
    }

    /**
     * @param fetchUrl
     */
    public void setFetchUrl(String fetchUrl) {
        this.fetchUrl = fetchUrl == null ? null : fetchUrl.trim();
    }

    /**
     * @return SPECIAL_TYPE
     */
    public Long getSpecialType() {
        return specialType;
    }

    /**
     * @param specialType
     */
    public void setSpecialType(Long specialType) {
        this.specialType = specialType;
    }

    /**
     * @return SPECIAL_URL
     */
    public String getSpecialUrl() {
        return specialUrl;
    }

    /**
     * @param specialUrl
     */
    public void setSpecialUrl(String specialUrl) {
        this.specialUrl = specialUrl == null ? null : specialUrl.trim();
    }

    /**
     * @return RELATE_NAME
     */
    public String getRelateName() {
        return relateName;
    }

    /**
     * @param relateName
     */
    public void setRelateName(String relateName) {
        this.relateName = relateName == null ? null : relateName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionId=").append(questionId);
        sb.append(", optionId=").append(optionId);
        sb.append(", relateType=").append(relateType);
        sb.append(", isOnce=").append(isOnce);
        sb.append(", isDynamic=").append(isDynamic);
        sb.append(", popupType=").append(popupType);
        sb.append(", fetchCode=").append(fetchCode);
        sb.append(", fetchUrl=").append(fetchUrl);
        sb.append(", specialType=").append(specialType);
        sb.append(", specialUrl=").append(specialUrl);
        sb.append(", relateName=").append(relateName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}