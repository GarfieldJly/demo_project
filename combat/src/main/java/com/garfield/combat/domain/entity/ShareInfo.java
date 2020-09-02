package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_SHARE_INFO")
public class ShareInfo implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "SHARE_ENABLE")
    private Short shareEnable;

    @Column(name = "SHARE_PATH_ID")
    private Long sharePathId;

    @Column(name = "IMPORT_SHARE")
    private Short importShare;

    @Column(name = "IMPORT_PATH_ID")
    private Long importPathId;

    @Column(name = "SYNC_TYPE")
    private Short syncType;

    @Column(name = "DATA_TYPE")
    private Short dataType;

    @Column(name = "SYNC_MODE")
    private Short syncMode;

    @Column(name = "GENERATE_ENR")
    private Short generateEnr;

    @Column(name = "GENERATE_SENTENCE")
    private Short generateSentence;

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
     * @return EVALUATION_ID
     */
    public Long getEvaluationId() {
        return evaluationId;
    }

    /**
     * @param evaluationId
     */
    public void setEvaluationId(Long evaluationId) {
        this.evaluationId = evaluationId;
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
     * @return SHARE_ENABLE
     */
    public Short getShareEnable() {
        return shareEnable;
    }

    /**
     * @param shareEnable
     */
    public void setShareEnable(Short shareEnable) {
        this.shareEnable = shareEnable;
    }

    /**
     * @return SHARE_PATH_ID
     */
    public Long getSharePathId() {
        return sharePathId;
    }

    /**
     * @param sharePathId
     */
    public void setSharePathId(Long sharePathId) {
        this.sharePathId = sharePathId;
    }

    /**
     * @return IMPORT_SHARE
     */
    public Short getImportShare() {
        return importShare;
    }

    /**
     * @param importShare
     */
    public void setImportShare(Short importShare) {
        this.importShare = importShare;
    }

    /**
     * @return IMPORT_PATH_ID
     */
    public Long getImportPathId() {
        return importPathId;
    }

    /**
     * @param importPathId
     */
    public void setImportPathId(Long importPathId) {
        this.importPathId = importPathId;
    }

    /**
     * @return SYNC_TYPE
     */
    public Short getSyncType() {
        return syncType;
    }

    /**
     * @param syncType
     */
    public void setSyncType(Short syncType) {
        this.syncType = syncType;
    }

    /**
     * @return DATA_TYPE
     */
    public Short getDataType() {
        return dataType;
    }

    /**
     * @param dataType
     */
    public void setDataType(Short dataType) {
        this.dataType = dataType;
    }

    /**
     * @return SYNC_MODE
     */
    public Short getSyncMode() {
        return syncMode;
    }

    /**
     * @param syncMode
     */
    public void setSyncMode(Short syncMode) {
        this.syncMode = syncMode;
    }

    /**
     * @return GENERATE_ENR
     */
    public Short getGenerateEnr() {
        return generateEnr;
    }

    /**
     * @param generateEnr
     */
    public void setGenerateEnr(Short generateEnr) {
        this.generateEnr = generateEnr;
    }

    /**
     * @return GENERATE_SENTENCE
     */
    public Short getGenerateSentence() {
        return generateSentence;
    }

    /**
     * @param generateSentence
     */
    public void setGenerateSentence(Short generateSentence) {
        this.generateSentence = generateSentence;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", questionId=").append(questionId);
        sb.append(", optionId=").append(optionId);
        sb.append(", shareEnable=").append(shareEnable);
        sb.append(", sharePathId=").append(sharePathId);
        sb.append(", importShare=").append(importShare);
        sb.append(", importPathId=").append(importPathId);
        sb.append(", syncType=").append(syncType);
        sb.append(", dataType=").append(dataType);
        sb.append(", syncMode=").append(syncMode);
        sb.append(", generateEnr=").append(generateEnr);
        sb.append(", generateSentence=").append(generateSentence);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}