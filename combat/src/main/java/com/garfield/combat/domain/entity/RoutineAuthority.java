package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_ROUTINE_AUTHORITY")
public class RoutineAuthority implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "STEP_ID")
    private Long stepId;

    @Column(name = "AREA_ID")
    private Long areaId;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "USER_ROLE")
    private String userRole;

    @Column(name = "ORGAN_CODE")
    private String organCode;

    @Column(name = "WARD_CODE_STR")
    private String wardCodeStr;

    @Column(name = "AUTHORITY")
    private Short authority;

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
     * @return STEP_ID
     */
    public Long getStepId() {
        return stepId;
    }

    /**
     * @param stepId
     */
    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    /**
     * @return AREA_ID
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * @param areaId
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
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
     * @return USER_ROLE
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * @param userRole
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    /**
     * @return ORGAN_CODE
     */
    public String getOrganCode() {
        return organCode;
    }

    /**
     * @param organCode
     */
    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    /**
     * @return WARD_CODE_STR
     */
    public String getWardCodeStr() {
        return wardCodeStr;
    }

    /**
     * @param wardCodeStr
     */
    public void setWardCodeStr(String wardCodeStr) {
        this.wardCodeStr = wardCodeStr == null ? null : wardCodeStr.trim();
    }

    /**
     * @return AUTHORITY
     */
    public Short getAuthority() {
        return authority;
    }

    /**
     * @param authority
     */
    public void setAuthority(Short authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stepId=").append(stepId);
        sb.append(", areaId=").append(areaId);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", userRole=").append(userRole);
        sb.append(", organCode=").append(organCode);
        sb.append(", wardCodeStr=").append(wardCodeStr);
        sb.append(", authority=").append(authority);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}