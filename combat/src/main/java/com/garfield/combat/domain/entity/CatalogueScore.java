package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "T_C_CATALOGUE_SCORE")
public class CatalogueScore implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "SCORE_TYPE")
    private String scoreType;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "RESULT_CODE")
    private String resultCode;

    @Column(name = "PROPERTY_SCOPE")
    private String propertyScope;

    @Column(name = "PROPERTY_TYPE")
    private String propertyType;

    @Column(name = "SPREAD")
    private String spread;

    @Column(name = "OPTION_SCORE")
    private BigDecimal optionScore;

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
     * @return UNIQUE_CODE
     */
    public String getUniqueCode() {
        return uniqueCode;
    }

    /**
     * @param uniqueCode
     */
    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode == null ? null : uniqueCode.trim();
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
     * @return SCORE_TYPE
     */
    public String getScoreType() {
        return scoreType;
    }

    /**
     * @param scoreType
     */
    public void setScoreType(String scoreType) {
        this.scoreType = scoreType == null ? null : scoreType.trim();
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
     * @return RESULT_CODE
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * @return PROPERTY_SCOPE
     */
    public String getPropertyScope() {
        return propertyScope;
    }

    /**
     * @param propertyScope
     */
    public void setPropertyScope(String propertyScope) {
        this.propertyScope = propertyScope == null ? null : propertyScope.trim();
    }

    /**
     * @return PROPERTY_TYPE
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * @param propertyType
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType == null ? null : propertyType.trim();
    }

    /**
     * @return SPREAD
     */
    public String getSpread() {
        return spread;
    }

    /**
     * @param spread
     */
    public void setSpread(String spread) {
        this.spread = spread == null ? null : spread.trim();
    }

    /**
     * @return OPTION_SCORE
     */
    public BigDecimal getOptionScore() {
        return optionScore;
    }

    /**
     * @param optionScore
     */
    public void setOptionScore(BigDecimal optionScore) {
        this.optionScore = optionScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", scoreType=").append(scoreType);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", propertyScope=").append(propertyScope);
        sb.append(", propertyType=").append(propertyType);
        sb.append(", spread=").append(spread);
        sb.append(", optionScore=").append(optionScore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}