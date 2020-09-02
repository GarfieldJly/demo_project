package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_SCORE_CONFIGURE")
public class ScoreConfigure implements Serializable {
    @Id
    @Column(name = "CONFIGURE_ITEM_ID")
    private Long configureItemId;

    @Column(name = "CONFIGURE_TOOL")
    private String configureTool;

    @Column(name = "CONFIGURE_LEVEL")
    private String configureLevel;

    @Column(name = "CONFIGURE_DESCRIBE")
    private String configureDescribe;

    @Column(name = "CONFIGURE_STATUS")
    private String configureStatus;

    @Column(name = "CONFIGURE_LEVEL_NAME")
    private String configureLevelName;

    @Column(name = "CONFIGURE_EXPRESSION")
    private String configureExpression;

    @Column(name = "CONFIGURE_TYPE")
    private Short configureType;

    @Column(name = "COLOR")
    private String color;

    private static final long serialVersionUID = 1L;

    /**
     * @return CONFIGURE_ITEM_ID
     */
    public Long getConfigureItemId() {
        return configureItemId;
    }

    /**
     * @param configureItemId
     */
    public void setConfigureItemId(Long configureItemId) {
        this.configureItemId = configureItemId;
    }

    /**
     * @return CONFIGURE_TOOL
     */
    public String getConfigureTool() {
        return configureTool;
    }

    /**
     * @param configureTool
     */
    public void setConfigureTool(String configureTool) {
        this.configureTool = configureTool == null ? null : configureTool.trim();
    }

    /**
     * @return CONFIGURE_LEVEL
     */
    public String getConfigureLevel() {
        return configureLevel;
    }

    /**
     * @param configureLevel
     */
    public void setConfigureLevel(String configureLevel) {
        this.configureLevel = configureLevel == null ? null : configureLevel.trim();
    }

    /**
     * @return CONFIGURE_DESCRIBE
     */
    public String getConfigureDescribe() {
        return configureDescribe;
    }

    /**
     * @param configureDescribe
     */
    public void setConfigureDescribe(String configureDescribe) {
        this.configureDescribe = configureDescribe == null ? null : configureDescribe.trim();
    }

    /**
     * @return CONFIGURE_STATUS
     */
    public String getConfigureStatus() {
        return configureStatus;
    }

    /**
     * @param configureStatus
     */
    public void setConfigureStatus(String configureStatus) {
        this.configureStatus = configureStatus == null ? null : configureStatus.trim();
    }

    /**
     * @return CONFIGURE_LEVEL_NAME
     */
    public String getConfigureLevelName() {
        return configureLevelName;
    }

    /**
     * @param configureLevelName
     */
    public void setConfigureLevelName(String configureLevelName) {
        this.configureLevelName = configureLevelName == null ? null : configureLevelName.trim();
    }

    /**
     * @return CONFIGURE_EXPRESSION
     */
    public String getConfigureExpression() {
        return configureExpression;
    }

    /**
     * @param configureExpression
     */
    public void setConfigureExpression(String configureExpression) {
        this.configureExpression = configureExpression == null ? null : configureExpression.trim();
    }

    /**
     * @return CONFIGURE_TYPE
     */
    public Short getConfigureType() {
        return configureType;
    }

    /**
     * @param configureType
     */
    public void setConfigureType(Short configureType) {
        this.configureType = configureType;
    }

    /**
     * @return COLOR
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", configureItemId=").append(configureItemId);
        sb.append(", configureTool=").append(configureTool);
        sb.append(", configureLevel=").append(configureLevel);
        sb.append(", configureDescribe=").append(configureDescribe);
        sb.append(", configureStatus=").append(configureStatus);
        sb.append(", configureLevelName=").append(configureLevelName);
        sb.append(", configureExpression=").append(configureExpression);
        sb.append(", configureType=").append(configureType);
        sb.append(", color=").append(color);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}