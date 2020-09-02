package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_MUTEX")
public class EvaluationMutex implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "UNIQUE_ID")
    private Long uniqueId;

    @Column(name = "MUTEX_ID")
    private Long mutexId;

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
     * @return MUTEX_ID
     */
    public Long getMutexId() {
        return mutexId;
    }

    /**
     * @param mutexId
     */
    public void setMutexId(Long mutexId) {
        this.mutexId = mutexId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uniqueId=").append(uniqueId);
        sb.append(", mutexId=").append(mutexId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}