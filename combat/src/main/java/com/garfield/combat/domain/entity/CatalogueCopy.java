package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CATALOGUE_COPY")
public class CatalogueCopy implements Serializable {
    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;

    @Column(name = "OLD_NAME")
    private String oldName;

    private static final long serialVersionUID = 1L;

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
     * @return OLD_NAME
     */
    public String getOldName() {
        return oldName;
    }

    /**
     * @param oldName
     */
    public void setOldName(String oldName) {
        this.oldName = oldName == null ? null : oldName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", oldName=").append(oldName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}