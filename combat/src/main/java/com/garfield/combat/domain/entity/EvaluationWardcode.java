package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_WARDCODE")
public class EvaluationWardcode implements Serializable {
    @Id
    @Column(name = "SERIAL_NO")
    private Long serialNo;

    @Column(name = "ORGAN_CODE")
    private String organCode;

    @Column(name = "WARD_CODE")
    private String wardCode;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "EVALUATION_LIST_TYPE")
    private String evaluationListType;

    @Column(name = "CATEGORY")
    private String category;

    private static final long serialVersionUID = 1L;

    /**
     * @return SERIAL_NO
     */
    public Long getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo
     */
    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
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

    /**
     * @return EVALUATION_LIST_ID
     */
    public Long getEvaluationListId() {
        return evaluationListId;
    }

    /**
     * @param evaluationListId
     */
    public void setEvaluationListId(Long evaluationListId) {
        this.evaluationListId = evaluationListId;
    }

    /**
     * @return EVALUATION_LIST_TYPE
     */
    public String getEvaluationListType() {
        return evaluationListType;
    }

    /**
     * @param evaluationListType
     */
    public void setEvaluationListType(String evaluationListType) {
        this.evaluationListType = evaluationListType == null ? null : evaluationListType.trim();
    }

    /**
     * @return CATEGORY
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialNo=").append(serialNo);
        sb.append(", organCode=").append(organCode);
        sb.append(", wardCode=").append(wardCode);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", evaluationListType=").append(evaluationListType);
        sb.append(", category=").append(category);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}