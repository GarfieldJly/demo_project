package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_TIME")
public class CustomizeTime implements Serializable {
    @Id
    @Column(name = "TIME_ID")
    private Long timeId;

    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(name = "IS_DATE")
    private Long isDate;

    @Column(name = "IS_TIME")
    private Long isTime;

    @Column(name = "DEFAULT_TIME")
    private Long defaultTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return TIME_ID
     */
    public Long getTimeId() {
        return timeId;
    }

    /**
     * @param timeId
     */
    public void setTimeId(Long timeId) {
        this.timeId = timeId;
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
     * @return IS_DATE
     */
    public Long getIsDate() {
        return isDate;
    }

    /**
     * @param isDate
     */
    public void setIsDate(Long isDate) {
        this.isDate = isDate;
    }

    /**
     * @return IS_TIME
     */
    public Long getIsTime() {
        return isTime;
    }

    /**
     * @param isTime
     */
    public void setIsTime(Long isTime) {
        this.isTime = isTime;
    }

    /**
     * @return DEFAULT_TIME
     */
    public Long getDefaultTime() {
        return defaultTime;
    }

    /**
     * @param defaultTime
     */
    public void setDefaultTime(Long defaultTime) {
        this.defaultTime = defaultTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeId=").append(timeId);
        sb.append(", questionId=").append(questionId);
        sb.append(", isDate=").append(isDate);
        sb.append(", isTime=").append(isTime);
        sb.append(", defaultTime=").append(defaultTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}