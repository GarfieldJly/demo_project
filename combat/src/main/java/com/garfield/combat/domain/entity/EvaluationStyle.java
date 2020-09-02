package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_STYLE")
public class EvaluationStyle implements Serializable {
    @Id
    @Column(name = "STYLE_ID")
    private Long styleId;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "GLOBAL_SETTING")
    private String globalSetting;

    @Column(name = "HEADLINE_SETTING")
    private String headlineSetting;

    @Column(name = "LABEL_SETTING")
    private String labelSetting;

    @Column(name = "QUESTION_SETTING")
    private String questionSetting;

    @Column(name = "OPTION_SETTING")
    private String optionSetting;

    @Column(name = "COMMENT_SETTING")
    private String commentSetting;

    private static final long serialVersionUID = 1L;

    /**
     * @return STYLE_ID
     */
    public Long getStyleId() {
        return styleId;
    }

    /**
     * @param styleId
     */
    public void setStyleId(Long styleId) {
        this.styleId = styleId;
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
     * @return GLOBAL_SETTING
     */
    public String getGlobalSetting() {
        return globalSetting;
    }

    /**
     * @param globalSetting
     */
    public void setGlobalSetting(String globalSetting) {
        this.globalSetting = globalSetting == null ? null : globalSetting.trim();
    }

    /**
     * @return HEADLINE_SETTING
     */
    public String getHeadlineSetting() {
        return headlineSetting;
    }

    /**
     * @param headlineSetting
     */
    public void setHeadlineSetting(String headlineSetting) {
        this.headlineSetting = headlineSetting == null ? null : headlineSetting.trim();
    }

    /**
     * @return LABEL_SETTING
     */
    public String getLabelSetting() {
        return labelSetting;
    }

    /**
     * @param labelSetting
     */
    public void setLabelSetting(String labelSetting) {
        this.labelSetting = labelSetting == null ? null : labelSetting.trim();
    }

    /**
     * @return QUESTION_SETTING
     */
    public String getQuestionSetting() {
        return questionSetting;
    }

    /**
     * @param questionSetting
     */
    public void setQuestionSetting(String questionSetting) {
        this.questionSetting = questionSetting == null ? null : questionSetting.trim();
    }

    /**
     * @return OPTION_SETTING
     */
    public String getOptionSetting() {
        return optionSetting;
    }

    /**
     * @param optionSetting
     */
    public void setOptionSetting(String optionSetting) {
        this.optionSetting = optionSetting == null ? null : optionSetting.trim();
    }

    /**
     * @return COMMENT_SETTING
     */
    public String getCommentSetting() {
        return commentSetting;
    }

    /**
     * @param commentSetting
     */
    public void setCommentSetting(String commentSetting) {
        this.commentSetting = commentSetting == null ? null : commentSetting.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", styleId=").append(styleId);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", globalSetting=").append(globalSetting);
        sb.append(", headlineSetting=").append(headlineSetting);
        sb.append(", labelSetting=").append(labelSetting);
        sb.append(", questionSetting=").append(questionSetting);
        sb.append(", optionSetting=").append(optionSetting);
        sb.append(", commentSetting=").append(commentSetting);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}