package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CATALOGUE_HIERARCHY")
public class CatalogueHierarchy implements Serializable {
    @Id
    @Column(name = "HIERARCHY_ID")
    private Long hierarchyId;

    @Column(name = "HIERARCHY_NAME")
    private String hierarchyName;

    @Column(name = "HIERARCHY_NUM")
    private Short hierarchyNum;

    @Column(name = "CHILD_HIERARCHY_ID")
    private Long childHierarchyId;

    @Column(name = "ROOT_HIERARCHY_ID")
    private Long rootHierarchyId;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;

    @Column(name = "PARENT_HIERARCHY_ID")
    private Long parentHierarchyId;

    private static final long serialVersionUID = 1L;

    /**
     * @return HIERARCHY_ID
     */
    public Long getHierarchyId() {
        return hierarchyId;
    }

    /**
     * @param hierarchyId
     */
    public void setHierarchyId(Long hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * @return HIERARCHY_NAME
     */
    public String getHierarchyName() {
        return hierarchyName;
    }

    /**
     * @param hierarchyName
     */
    public void setHierarchyName(String hierarchyName) {
        this.hierarchyName = hierarchyName == null ? null : hierarchyName.trim();
    }

    /**
     * @return HIERARCHY_NUM
     */
    public Short getHierarchyNum() {
        return hierarchyNum;
    }

    /**
     * @param hierarchyNum
     */
    public void setHierarchyNum(Short hierarchyNum) {
        this.hierarchyNum = hierarchyNum;
    }

    /**
     * @return CHILD_HIERARCHY_ID
     */
    public Long getChildHierarchyId() {
        return childHierarchyId;
    }

    /**
     * @param childHierarchyId
     */
    public void setChildHierarchyId(Long childHierarchyId) {
        this.childHierarchyId = childHierarchyId;
    }

    /**
     * @return ROOT_HIERARCHY_ID
     */
    public Long getRootHierarchyId() {
        return rootHierarchyId;
    }

    /**
     * @param rootHierarchyId
     */
    public void setRootHierarchyId(Long rootHierarchyId) {
        this.rootHierarchyId = rootHierarchyId;
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
     * @return PARENT_HIERARCHY_ID
     */
    public Long getParentHierarchyId() {
        return parentHierarchyId;
    }

    /**
     * @param parentHierarchyId
     */
    public void setParentHierarchyId(Long parentHierarchyId) {
        this.parentHierarchyId = parentHierarchyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hierarchyId=").append(hierarchyId);
        sb.append(", hierarchyName=").append(hierarchyName);
        sb.append(", hierarchyNum=").append(hierarchyNum);
        sb.append(", childHierarchyId=").append(childHierarchyId);
        sb.append(", rootHierarchyId=").append(rootHierarchyId);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", parentHierarchyId=").append(parentHierarchyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}