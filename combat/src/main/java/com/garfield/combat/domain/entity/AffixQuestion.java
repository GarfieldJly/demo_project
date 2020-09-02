package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_D_AFFIX_QUESTION")
public class AffixQuestion implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "PAT_INDEX_NO")
    private String patIndexNo;

    @Column(name = "EVALUTION_LIST_ID")
    private Long evalutionListId;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "SORT_NUM")
    private Integer sortNum;

    @Column(name = "ORGAN_CODE")
    private String organCode;

    @Column(name = "WARD_CODE")
    private String wardCode;

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
     * @return PAT_INDEX_NO
     */
    public String getPatIndexNo() {
        return patIndexNo;
    }

    /**
     * @param patIndexNo
     */
    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo == null ? null : patIndexNo.trim();
    }

    /**
     * @return EVALUTION_LIST_ID
     */
    public Long getEvalutionListId() {
        return evalutionListId;
    }

    /**
     * @param evalutionListId
     */
    public void setEvalutionListId(Long evalutionListId) {
        this.evalutionListId = evalutionListId;
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
     * @return SORT_NUM
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
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
     * @return WARD_CODE
     */
    public String getWardCode() {
        return wardCode;
    }

    /**
     * @param wardCode
     */
    public void setWardCode(String wardCode) {
        this.wardCode = wardCode == null ? null : wardCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", patIndexNo=").append(patIndexNo);
        sb.append(", evalutionListId=").append(evalutionListId);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", organCode=").append(organCode);
        sb.append(", wardCode=").append(wardCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}