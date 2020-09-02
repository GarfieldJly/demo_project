package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_IOLIQUID_DETAIL")
public class IoliquidDetail implements Serializable {
    @Id
    @Column(name = "IOLIQUID_DETAIL_ID")
    private Long ioliquidDetailId;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "ALIAS_NAME")
    private String aliasName;

    @Column(name = "RELATE_KEY")
    private String relateKey;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "IOLIQUID_RELATE_ID")
    private Long ioliquidRelateId;

    private static final long serialVersionUID = 1L;

    /**
     * @return IOLIQUID_DETAIL_ID
     */
    public Long getIoliquidDetailId() {
        return ioliquidDetailId;
    }

    /**
     * @param ioliquidDetailId
     */
    public void setIoliquidDetailId(Long ioliquidDetailId) {
        this.ioliquidDetailId = ioliquidDetailId;
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
     * @return ALIAS_NAME
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * @param aliasName
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ioliquidDetailId=").append(ioliquidDetailId);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", aliasName=").append(aliasName);
        sb.append(", relateKey=").append(relateKey);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", ioliquidRelateId=").append(ioliquidRelateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}