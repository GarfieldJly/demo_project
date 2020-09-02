package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_DIA_MEASURE")
public class DiaMeasure implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "MEASURE_SORT")
    private Long measureSort;

    @Column(name = "CUSTOMIZE_ID")
    private Long customizeId;

    @Column(name = "RESULT_ID")
    private Long resultId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

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
     * @return CATALOGUE_CODE
     */
    public String getCatalogueCode() {
        return catalogueCode;
    }

    /**
     * @param catalogueCode
     */
    public void setCatalogueCode(String catalogueCode) {
        this.catalogueCode = catalogueCode == null ? null : catalogueCode.trim();
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
     * @return CATALOGUE_NAME
     */
    public String getCatalogueName() {
        return catalogueName;
    }

    /**
     * @param catalogueName
     */
    public void setCatalogueName(String catalogueName) {
        this.catalogueName = catalogueName == null ? null : catalogueName.trim();
    }

    /**
     * @return MEASURE_SORT
     */
    public Long getMeasureSort() {
        return measureSort;
    }

    /**
     * @param measureSort
     */
    public void setMeasureSort(Long measureSort) {
        this.measureSort = measureSort;
    }

    /**
     * @return CUSTOMIZE_ID
     */
    public Long getCustomizeId() {
        return customizeId;
    }

    /**
     * @param customizeId
     */
    public void setCustomizeId(Long customizeId) {
        this.customizeId = customizeId;
    }

    /**
     * @return RESULT_ID
     */
    public Long getResultId() {
        return resultId;
    }

    /**
     * @param resultId
     */
    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return MODIFY_TIME
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", measureSort=").append(measureSort);
        sb.append(", customizeId=").append(customizeId);
        sb.append(", resultId=").append(resultId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}