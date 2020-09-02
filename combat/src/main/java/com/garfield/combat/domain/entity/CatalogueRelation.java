package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CATALOGUE_RELATION")
public class CatalogueRelation implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;

    @Column(name = "RELATE_KEY")
    private String relateKey;

    @Column(name = "RELATE_VALUE")
    private String relateValue;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

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
     * @return RELATE_KEY
     */
    public String getRelateKey() {
        return relateKey;
    }

    /**
     * @param relateKey
     */
    public void setRelateKey(String relateKey) {
        this.relateKey = relateKey == null ? null : relateKey.trim();
    }

    /**
     * @return RELATE_VALUE
     */
    public String getRelateValue() {
        return relateValue;
    }

    /**
     * @param relateValue
     */
    public void setRelateValue(String relateValue) {
        this.relateValue = relateValue == null ? null : relateValue.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", relateKey=").append(relateKey);
        sb.append(", relateValue=").append(relateValue);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}