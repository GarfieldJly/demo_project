package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CUSTOMIZE_CONCLUSION")
public class CustomizeConclusion implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "LOGIC_ID")
    private Long logicId;

    @Column(name = "RELATE_QUESTION_ID")
    private Long relateQuestionId;

    @Column(name = "RELATE_UNIQUE_ID")
    private Long relateUniqueId;

    @Column(name = "RELATE_HIERARCHY_CODE")
    private String relateHierarchyCode;

    @Column(name = "RELATE_OPTION_ID")
    private Long relateOptionId;

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
     * @return LOGIC_ID
     */
    public Long getLogicId() {
        return logicId;
    }

    /**
     * @param logicId
     */
    public void setLogicId(Long logicId) {
        this.logicId = logicId;
    }

    /**
     * @return RELATE_QUESTION_ID
     */
    public Long getRelateQuestionId() {
        return relateQuestionId;
    }

    /**
     * @param relateQuestionId
     */
    public void setRelateQuestionId(Long relateQuestionId) {
        this.relateQuestionId = relateQuestionId;
    }

    /**
     * @return RELATE_UNIQUE_ID
     */
    public Long getRelateUniqueId() {
        return relateUniqueId;
    }

    /**
     * @param relateUniqueId
     */
    public void setRelateUniqueId(Long relateUniqueId) {
        this.relateUniqueId = relateUniqueId;
    }

    /**
     * @return RELATE_HIERARCHY_CODE
     */
    public String getRelateHierarchyCode() {
        return relateHierarchyCode;
    }

    /**
     * @param relateHierarchyCode
     */
    public void setRelateHierarchyCode(String relateHierarchyCode) {
        this.relateHierarchyCode = relateHierarchyCode == null ? null : relateHierarchyCode.trim();
    }

    /**
     * @return RELATE_OPTION_ID
     */
    public Long getRelateOptionId() {
        return relateOptionId;
    }

    /**
     * @param relateOptionId
     */
    public void setRelateOptionId(Long relateOptionId) {
        this.relateOptionId = relateOptionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logicId=").append(logicId);
        sb.append(", relateQuestionId=").append(relateQuestionId);
        sb.append(", relateUniqueId=").append(relateUniqueId);
        sb.append(", relateHierarchyCode=").append(relateHierarchyCode);
        sb.append(", relateOptionId=").append(relateOptionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}