package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_SHARE_PATH")
public class SharePath implements Serializable {
    @Id
    @Column(name = "PATH_ID")
    private Long pathId;

    @Column(name = "PATH_NAME")
    private String pathName;

    @Column(name = "EVALUTION_ID")
    private Long evalutionId;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "INTERNAL_CODE")
    private String internalCode;

    private static final long serialVersionUID = 1L;

    /**
     * @return PATH_ID
     */
    public Long getPathId() {
        return pathId;
    }

    /**
     * @param pathId
     */
    public void setPathId(Long pathId) {
        this.pathId = pathId;
    }

    /**
     * @return PATH_NAME
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * @param pathName
     */
    public void setPathName(String pathName) {
        this.pathName = pathName == null ? null : pathName.trim();
    }

    /**
     * @return EVALUTION_ID
     */
    public Long getEvalutionId() {
        return evalutionId;
    }

    /**
     * @param evalutionId
     */
    public void setEvalutionId(Long evalutionId) {
        this.evalutionId = evalutionId;
    }

    /**
     * @return UNIQUE_ID
     */
    public Long getUniqueId() {
        return uniqueId;
    }

    /**
     * @param uniqueId
     */
    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
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
     * @return INTERNAL_CODE
     */
    public String getInternalCode() {
        return internalCode;
    }

    /**
     * @param internalCode
     */
    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode == null ? null : internalCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pathId=").append(pathId);
        sb.append(", pathName=").append(pathName);
        sb.append(", evalutionId=").append(evalutionId);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", optionId=").append(optionId);
        sb.append(", internalCode=").append(internalCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}