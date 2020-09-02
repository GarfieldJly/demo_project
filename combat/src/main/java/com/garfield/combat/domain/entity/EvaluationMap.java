package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_MAP")
public class EvaluationMap implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "MAP_TYPE")
    private Long mapType;

    @Column(name = "RELATED_ID")
    private Long relatedId;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "MAP_INTERVAL")
    private Long mapInterval;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "MODIFIED_TIME")
    private Date modifiedTime;

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
     * @return MAP_TYPE
     */
    public Long getMapType() {
        return mapType;
    }

    /**
     * @param mapType
     */
    public void setMapType(Long mapType) {
        this.mapType = mapType;
    }

    /**
     * @return RELATED_ID
     */
    public Long getRelatedId() {
        return relatedId;
    }

    /**
     * @param relatedId
     */
    public void setRelatedId(Long relatedId) {
        this.relatedId = relatedId;
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
     * @return MAP_INTERVAL
     */
    public Long getMapInterval() {
        return mapInterval;
    }

    /**
     * @param mapInterval
     */
    public void setMapInterval(Long mapInterval) {
        this.mapInterval = mapInterval;
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
     * @return MODIFIED_TIME
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * @param modifiedTime
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mapType=").append(mapType);
        sb.append(", relatedId=").append(relatedId);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", mapInterval=").append(mapInterval);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}