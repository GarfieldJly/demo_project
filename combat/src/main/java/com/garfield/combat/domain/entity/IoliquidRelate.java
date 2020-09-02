package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_IOLIQUID_RELATE")
public class IoliquidRelate implements Serializable {
    @Id
    @Column(name = "IOLIQUID_RELATE_ID")
    private Long ioliquidRelateId;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "IOLIQUID_RELATE_NAME")
    private String ioliquidRelateName;

    @Column(name = "IOLIQUID_TYPE")
    private String ioliquidType;

    @Column(name = "IOLIQUID_RELATE_TYPE")
    private String ioliquidRelateType;

    private static final long serialVersionUID = 1L;

    /**
     * @return IOLIQUID_RELATE_ID
     */
    public Long getIoliquidRelateId() {
        return ioliquidRelateId;
    }

    /**
     * @param ioliquidRelateId
     */
    public void setIoliquidRelateId(Long ioliquidRelateId) {
        this.ioliquidRelateId = ioliquidRelateId;
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
     * @return IOLIQUID_RELATE_NAME
     */
    public String getIoliquidRelateName() {
        return ioliquidRelateName;
    }

    /**
     * @param ioliquidRelateName
     */
    public void setIoliquidRelateName(String ioliquidRelateName) {
        this.ioliquidRelateName = ioliquidRelateName == null ? null : ioliquidRelateName.trim();
    }

    /**
     * @return IOLIQUID_TYPE
     */
    public String getIoliquidType() {
        return ioliquidType;
    }

    /**
     * @param ioliquidType
     */
    public void setIoliquidType(String ioliquidType) {
        this.ioliquidType = ioliquidType == null ? null : ioliquidType.trim();
    }

    /**
     * @return IOLIQUID_RELATE_TYPE
     */
    public String getIoliquidRelateType() {
        return ioliquidRelateType;
    }

    /**
     * @param ioliquidRelateType
     */
    public void setIoliquidRelateType(String ioliquidRelateType) {
        this.ioliquidRelateType = ioliquidRelateType == null ? null : ioliquidRelateType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ioliquidRelateId=").append(ioliquidRelateId);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", ioliquidRelateName=").append(ioliquidRelateName);
        sb.append(", ioliquidType=").append(ioliquidType);
        sb.append(", ioliquidRelateType=").append(ioliquidRelateType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}