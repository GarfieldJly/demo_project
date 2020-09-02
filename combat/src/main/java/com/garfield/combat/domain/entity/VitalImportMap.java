package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_VITAL_IMPORT_MAP")
public class VitalImportMap implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Id
    @Column(name = "OPTION_ID")
    private Long optionId;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "VITAL_TYPE")
    private Long vitalType;

    @Column(name = "SUB_TYPE")
    private String subType;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "HIERARCHY_CODE")
    private String hierarchyCode;

    @Column(name = "OPTION_NAME")
    private String optionName;

    @Column(name = "ITEM_LOCATE")
    private Short itemLocate;

    @Column(name = "VITAL_KIND")
    private Long vitalKind;

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
     * @return VITAL_TYPE
     */
    public Long getVitalType() {
        return vitalType;
    }

    /**
     * @param vitalType
     */
    public void setVitalType(Long vitalType) {
        this.vitalType = vitalType;
    }

    /**
     * @return SUB_TYPE
     */
    public String getSubType() {
        return subType;
    }

    /**
     * @param subType
     */
    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
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
     * @return HIERARCHY_CODE
     */
    public String getHierarchyCode() {
        return hierarchyCode;
    }

    /**
     * @param hierarchyCode
     */
    public void setHierarchyCode(String hierarchyCode) {
        this.hierarchyCode = hierarchyCode == null ? null : hierarchyCode.trim();
    }

    /**
     * @return OPTION_NAME
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * @param optionName
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    /**
     * @return ITEM_LOCATE
     */
    public Short getItemLocate() {
        return itemLocate;
    }

    /**
     * @param itemLocate
     */
    public void setItemLocate(Short itemLocate) {
        this.itemLocate = itemLocate;
    }

    /**
     * @return VITAL_KIND
     */
    public Long getVitalKind() {
        return vitalKind;
    }

    /**
     * @param vitalKind
     */
    public void setVitalKind(Long vitalKind) {
        this.vitalKind = vitalKind;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", optionId=").append(optionId);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", vitalType=").append(vitalType);
        sb.append(", subType=").append(subType);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", hierarchyCode=").append(hierarchyCode);
        sb.append(", optionName=").append(optionName);
        sb.append(", itemLocate=").append(itemLocate);
        sb.append(", vitalKind=").append(vitalKind);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}