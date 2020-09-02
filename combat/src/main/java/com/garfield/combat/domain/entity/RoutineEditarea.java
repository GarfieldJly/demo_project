package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_ROUTINE_EDITAREA")
public class RoutineEditarea implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "EVALUATION_ID")
    private Long evaluationId;

    @Column(name = "UNIQUE_STR")
    private String uniqueStr;

    @Column(name = "ROOT_UNIQUE_ID")
    private String rootUniqueId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "SORT")
    private Short sort;

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
     * @return UNIQUE_STR
     */
    public String getUniqueStr() {
        return uniqueStr;
    }

    /**
     * @param uniqueStr
     */
    public void setUniqueStr(String uniqueStr) {
        this.uniqueStr = uniqueStr == null ? null : uniqueStr.trim();
    }

    /**
     * @return ROOT_UNIQUE_ID
     */
    public String getRootUniqueId() {
        return rootUniqueId;
    }

    /**
     * @param rootUniqueId
     */
    public void setRootUniqueId(String rootUniqueId) {
        this.rootUniqueId = rootUniqueId == null ? null : rootUniqueId.trim();
    }

    /**
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return SORT
     */
    public Short getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Short sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", uniqueStr=").append(uniqueStr);
        sb.append(", rootUniqueId=").append(rootUniqueId);
        sb.append(", title=").append(title);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}