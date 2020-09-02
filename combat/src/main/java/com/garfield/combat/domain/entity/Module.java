package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_MODULE")
public class Module implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "MODULE_NAME")
    private String moduleName;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "MODULE_TYPE")
    private String moduleType;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "MODULE_INTERVAL")
    private String moduleInterval;

    @Column(name = "IS_DEL")
    private Long isDel;

    @Column(name = "ALIAS_TYPE")
    private String aliasType;

    @Column(name = "SWITCH_MODULE_TYPE")
    private Long switchModuleType;

    @Column(name = "BUTTON_NAME")
    private String buttonName;

    @Column(name = "SWITCH_MODULE_ID")
    private Long switchModuleId;

    @Column(name = "SWITCH_MODULE_NAME")
    private String switchModuleName;

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
     * @return MODULE_NAME
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * @param moduleName
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
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
     * @return MODULE_TYPE
     */
    public String getModuleType() {
        return moduleType;
    }

    /**
     * @param moduleType
     */
    public void setModuleType(String moduleType) {
        this.moduleType = moduleType == null ? null : moduleType.trim();
    }

    /**
     * @return CREATETIME
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
     * @return MODULE_INTERVAL
     */
    public String getModuleInterval() {
        return moduleInterval;
    }

    /**
     * @param moduleInterval
     */
    public void setModuleInterval(String moduleInterval) {
        this.moduleInterval = moduleInterval == null ? null : moduleInterval.trim();
    }

    /**
     * @return IS_DEL
     */
    public Long getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Long isDel) {
        this.isDel = isDel;
    }

    /**
     * @return ALIAS_TYPE
     */
    public String getAliasType() {
        return aliasType;
    }

    /**
     * @param aliasType
     */
    public void setAliasType(String aliasType) {
        this.aliasType = aliasType == null ? null : aliasType.trim();
    }

    /**
     * @return SWITCH_MODULE_TYPE
     */
    public Long getSwitchModuleType() {
        return switchModuleType;
    }

    /**
     * @param switchModuleType
     */
    public void setSwitchModuleType(Long switchModuleType) {
        this.switchModuleType = switchModuleType;
    }

    /**
     * @return BUTTON_NAME
     */
    public String getButtonName() {
        return buttonName;
    }

    /**
     * @param buttonName
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName == null ? null : buttonName.trim();
    }

    /**
     * @return SWITCH_MODULE_ID
     */
    public Long getSwitchModuleId() {
        return switchModuleId;
    }

    /**
     * @param switchModuleId
     */
    public void setSwitchModuleId(Long switchModuleId) {
        this.switchModuleId = switchModuleId;
    }

    /**
     * @return SWITCH_MODULE_NAME
     */
    public String getSwitchModuleName() {
        return switchModuleName;
    }

    /**
     * @param switchModuleName
     */
    public void setSwitchModuleName(String switchModuleName) {
        this.switchModuleName = switchModuleName == null ? null : switchModuleName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", moduleType=").append(moduleType);
        sb.append(", createtime=").append(createtime);
        sb.append(", remark=").append(remark);
        sb.append(", moduleInterval=").append(moduleInterval);
        sb.append(", isDel=").append(isDel);
        sb.append(", aliasType=").append(aliasType);
        sb.append(", switchModuleType=").append(switchModuleType);
        sb.append(", buttonName=").append(buttonName);
        sb.append(", switchModuleId=").append(switchModuleId);
        sb.append(", switchModuleName=").append(switchModuleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}