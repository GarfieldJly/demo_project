package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_STYLE")
public class CustomizeStyle implements Serializable {
    @Id
    @Column(name = "STYLE_ID")
    private Long styleId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "LINK")
    private Long link;

    @Column(name = "WIDTH")
    private Long width;

    @Column(name = "HEIGHT")
    private Long height;

    @Column(name = "MAX_LENGTH")
    private Long maxLength;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "MARGIN")
    private Long margin;

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
     * @return LINK
     */
    public Long getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(Long link) {
        this.link = link;
    }

    /**
     * @return WIDTH
     */
    public Long getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(Long width) {
        this.width = width;
    }

    /**
     * @return HEIGHT
     */
    public Long getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * @return MAX_LENGTH
     */
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * @param maxLength
     */
    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
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
     * @return MARGIN
     */
    public Long getMargin() {
        return margin;
    }

    /**
     * @param margin
     */
    public void setMargin(Long margin) {
        this.margin = margin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", styleId=").append(styleId);
        sb.append(", questionId=").append(questionId);
        sb.append(", link=").append(link);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", maxLength=").append(maxLength);
        sb.append(", optionId=").append(optionId);
        sb.append(", margin=").append(margin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}