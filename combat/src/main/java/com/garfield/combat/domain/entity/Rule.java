package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_RULE")
public class Rule implements Serializable {
    @Column(name = "ID")
    private Long id;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "DEFAULT_TYPE")
    private Long defaultType;

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
     * @return DEFAULT_TYPE
     */
    public Long getDefaultType() {
        return defaultType;
    }

    /**
     * @param defaultType
     */
    public void setDefaultType(Long defaultType) {
        this.defaultType = defaultType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", defaultType=").append(defaultType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}