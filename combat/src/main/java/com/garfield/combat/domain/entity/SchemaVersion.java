package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "SCHEMA_VERSION")
public class SchemaVersion implements Serializable {
    @Column(name = "VERSION_RANK")
    private Short versionRank;

    @Column(name = "INSTALLED_RANK")
    private Short installedRank;

    @Column(name = "VERSION")
    private String version;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SCRIPT")
    private String script;

    @Column(name = "CHECKSUM")
    private Short checksum;

    @Column(name = "INSTALLED_BY")
    private String installedBy;

    @Column(name = "INSTALLED_ON")
    private Date installedOn;

    @Column(name = "EXECUTION_TIME")
    private Short executionTime;

    @Column(name = "SUCCESS")
    private String success;

    private static final long serialVersionUID = 1L;

    /**
     * @return VERSION_RANK
     */
    public Short getVersionRank() {
        return versionRank;
    }

    /**
     * @param versionRank
     */
    public void setVersionRank(Short versionRank) {
        this.versionRank = versionRank;
    }

    /**
     * @return INSTALLED_RANK
     */
    public Short getInstalledRank() {
        return installedRank;
    }

    /**
     * @param installedRank
     */
    public void setInstalledRank(Short installedRank) {
        this.installedRank = installedRank;
    }

    /**
     * @return VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return SCRIPT
     */
    public String getScript() {
        return script;
    }

    /**
     * @param script
     */
    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }

    /**
     * @return CHECKSUM
     */
    public Short getChecksum() {
        return checksum;
    }

    /**
     * @param checksum
     */
    public void setChecksum(Short checksum) {
        this.checksum = checksum;
    }

    /**
     * @return INSTALLED_BY
     */
    public String getInstalledBy() {
        return installedBy;
    }

    /**
     * @param installedBy
     */
    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy == null ? null : installedBy.trim();
    }

    /**
     * @return INSTALLED_ON
     */
    public Date getInstalledOn() {
        return installedOn;
    }

    /**
     * @param installedOn
     */
    public void setInstalledOn(Date installedOn) {
        this.installedOn = installedOn;
    }

    /**
     * @return EXECUTION_TIME
     */
    public Short getExecutionTime() {
        return executionTime;
    }

    /**
     * @param executionTime
     */
    public void setExecutionTime(Short executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * @return SUCCESS
     */
    public String getSuccess() {
        return success;
    }

    /**
     * @param success
     */
    public void setSuccess(String success) {
        this.success = success == null ? null : success.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", versionRank=").append(versionRank);
        sb.append(", installedRank=").append(installedRank);
        sb.append(", version=").append(version);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", script=").append(script);
        sb.append(", checksum=").append(checksum);
        sb.append(", installedBy=").append(installedBy);
        sb.append(", installedOn=").append(installedOn);
        sb.append(", executionTime=").append(executionTime);
        sb.append(", success=").append(success);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}