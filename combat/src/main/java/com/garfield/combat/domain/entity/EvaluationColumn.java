package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_COLUMN")
public class EvaluationColumn implements Serializable {
    @Id
    @Column(name = "COLUMN_ID")
    private Long columnId;

    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "COLUMN_TYPE")
    private String columnType;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    private static final long serialVersionUID = 1L;

    /**
     * @return COLUMN_ID
     */
    public Long getColumnId() {
        return columnId;
    }

    /**
     * @param columnId
     */
    public void setColumnId(Long columnId) {
        this.columnId = columnId;
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
     * @return COLUMN_TYPE
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * @param columnType
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
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
        sb.append(", columnId=").append(columnId);
        sb.append(", tableId=").append(tableId);
        sb.append(", columnType=").append(columnType);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}