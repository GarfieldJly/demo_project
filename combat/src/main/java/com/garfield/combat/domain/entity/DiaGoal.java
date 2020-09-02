package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_DIA_GOAL")
public class DiaGoal implements Serializable {
    @Id
    @Column(name = "GOAL_ID")
    private Long goalId;

    @Column(name = "CATALOGUE_NAME")
    private String catalogueName;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "RESULT_ID")
    private Long resultId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    private static final long serialVersionUID = 1L;

    /**
     * @return GOAL_ID
     */
    public Long getGoalId() {
        return goalId;
    }

    /**
     * @param goalId
     */
    public void setGoalId(Long goalId) {
        this.goalId = goalId;
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
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    /**
     * @return SORT_NUM
     */
    public Long getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Long sortNum) {
        this.sortNum = sortNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goalId=").append(goalId);
        sb.append(", catalogueName=").append(catalogueName);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", remark=").append(remark);
        sb.append(", resultId=").append(resultId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}