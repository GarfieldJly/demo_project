package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_SHARE_FILTER")
public class ShareFilter implements Serializable {
    @Id
    @Column(name = "FILTER_ID")
    private Long filterId;

    @Column(name = "INFO_ID")
    private Long infoId;

    @Column(name = "FILTER_TYPE")
    private String filterType;

    @Column(name = "FILTER_CONTEXT")
    private String filterContext;

    @Column(name = "SCOPE")
    private String scope;

    @Column(name = "MATH_TYPE")
    private Short mathType;

    @Column(name = "GROUP_NUM")
    private Short groupNum;

    private static final long serialVersionUID = 1L;

    /**
     * @return FILTER_ID
     */
    public Long getFilterId() {
        return filterId;
    }

    /**
     * @param filterId
     */
    public void setFilterId(Long filterId) {
        this.filterId = filterId;
    }

    /**
     * @return INFO_ID
     */
    public Long getInfoId() {
        return infoId;
    }

    /**
     * @param infoId
     */
    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    /**
     * @return FILTER_TYPE
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * @param filterType
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType == null ? null : filterType.trim();
    }

    /**
     * @return FILTER_CONTEXT
     */
    public String getFilterContext() {
        return filterContext;
    }

    /**
     * @param filterContext
     */
    public void setFilterContext(String filterContext) {
        this.filterContext = filterContext == null ? null : filterContext.trim();
    }

    /**
     * @return SCOPE
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope
     */
    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    /**
     * @return MATH_TYPE
     */
    public Short getMathType() {
        return mathType;
    }

    /**
     * @param mathType
     */
    public void setMathType(Short mathType) {
        this.mathType = mathType;
    }

    /**
     * @return GROUP_NUM
     */
    public Short getGroupNum() {
        return groupNum;
    }

    /**
     * @param groupNum
     */
    public void setGroupNum(Short groupNum) {
        this.groupNum = groupNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", filterId=").append(filterId);
        sb.append(", infoId=").append(infoId);
        sb.append(", filterType=").append(filterType);
        sb.append(", filterContext=").append(filterContext);
        sb.append(", scope=").append(scope);
        sb.append(", mathType=").append(mathType);
        sb.append(", groupNum=").append(groupNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}