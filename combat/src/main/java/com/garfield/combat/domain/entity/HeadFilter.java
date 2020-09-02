package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_HEAD_FILTER")
public class HeadFilter implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "HEAD_ID")
    private Short headId;

    @Column(name = "UNIQUE_ID")
    private Short uniqueId;

    @Column(name = "OPTION_ID")
    private Short optionId;

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
     * @return TABLE_ID
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * @param tableId
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
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
     * @return HEAD_ID
     */
    public Short getHeadId() {
        return headId;
    }

    /**
     * @param headId
     */
    public void setHeadId(Short headId) {
        this.headId = headId;
    }

    /**
     * @return UNIQUE_ID
     */
    public Short getUniqueId() {
        return uniqueId;
    }

    /**
     * @param uniqueId
     */
    public void setUniqueId(Short uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * @return OPTION_ID
     */
    public Short getOptionId() {
        return optionId;
    }

    /**
     * @param optionId
     */
    public void setOptionId(Short optionId) {
        this.optionId = optionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tableId=").append(tableId);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", headId=").append(headId);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", optionId=").append(optionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}