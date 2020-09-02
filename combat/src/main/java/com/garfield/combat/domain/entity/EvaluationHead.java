package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_HEAD")
public class EvaluationHead implements Serializable {
    @Id
    @Column(name = "HEAD_ID")
    private Long headId;

    @Column(name = "HEAD_NAME")
    private String headName;

    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "COLUMN_ID")
    private Long columnId;

    @Column(name = "COLUMN_TYPE")
    private String columnType;

    @Column(name = "CATALOGUE_RULE")
    private String catalogueRule;

    @Column(name = "CATALOGUE_CODE")
    private String catalogueCode;

    @Column(name = "SORT_NUM")
    private Long sortNum;

    @Column(name = "PARENT_HEAD_ID")
    private Long parentHeadId;

    @Column(name = "HEADCONTENT")
    private Object headcontent;

    @Column(name = "HEAD_WIDTH")
    private Long headWidth;

    @Column(name = "HEAD_TYPE")
    private Long headType;

    @Column(name = "HEAD_EXC")
    private String headExc;

    @Column(name = "HIERARCHY_NUM")
    private Long hierarchyNum;

    @Column(name = "HEAD_LINE")
    private Long headLine;

    @Column(name = "DISPLAY_TYPE")
    private Long displayType;

    @Column(name = "READ_FLAG")
    private Long readFlag;

    @Column(name = "ALIGN_TYPE")
    private Short alignType;

    private static final long serialVersionUID = 1L;

    /**
     * @return HEAD_ID
     */
    public Long getHeadId() {
        return headId;
    }

    /**
     * @param headId
     */
    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    /**
     * @return HEAD_NAME
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * @param headName
     */
    public void setHeadName(String headName) {
        this.headName = headName == null ? null : headName.trim();
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
     * @return CATALOGUE_RULE
     */
    public String getCatalogueRule() {
        return catalogueRule;
    }

    /**
     * @param catalogueRule
     */
    public void setCatalogueRule(String catalogueRule) {
        this.catalogueRule = catalogueRule == null ? null : catalogueRule.trim();
    }

    /**
     * @return CATALOGUE_CODE
     */
    public String getCatalogueCode() {
        return catalogueCode;
    }

    /**
     * @param catalogueCode
     */
    public void setCatalogueCode(String catalogueCode) {
        this.catalogueCode = catalogueCode == null ? null : catalogueCode.trim();
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

    /**
     * @return PARENT_HEAD_ID
     */
    public Long getParentHeadId() {
        return parentHeadId;
    }

    /**
     * @param parentHeadId
     */
    public void setParentHeadId(Long parentHeadId) {
        this.parentHeadId = parentHeadId;
    }

    /**
     * @return HEADCONTENT
     */
    public Object getHeadcontent() {
        return headcontent;
    }

    /**
     * @param headcontent
     */
    public void setHeadcontent(Object headcontent) {
        this.headcontent = headcontent;
    }

    /**
     * @return HEAD_WIDTH
     */
    public Long getHeadWidth() {
        return headWidth;
    }

    /**
     * @param headWidth
     */
    public void setHeadWidth(Long headWidth) {
        this.headWidth = headWidth;
    }

    /**
     * @return HEAD_TYPE
     */
    public Long getHeadType() {
        return headType;
    }

    /**
     * @param headType
     */
    public void setHeadType(Long headType) {
        this.headType = headType;
    }

    /**
     * @return HEAD_EXC
     */
    public String getHeadExc() {
        return headExc;
    }

    /**
     * @param headExc
     */
    public void setHeadExc(String headExc) {
        this.headExc = headExc == null ? null : headExc.trim();
    }

    /**
     * @return HIERARCHY_NUM
     */
    public Long getHierarchyNum() {
        return hierarchyNum;
    }

    /**
     * @param hierarchyNum
     */
    public void setHierarchyNum(Long hierarchyNum) {
        this.hierarchyNum = hierarchyNum;
    }

    /**
     * @return HEAD_LINE
     */
    public Long getHeadLine() {
        return headLine;
    }

    /**
     * @param headLine
     */
    public void setHeadLine(Long headLine) {
        this.headLine = headLine;
    }

    /**
     * @return DISPLAY_TYPE
     */
    public Long getDisplayType() {
        return displayType;
    }

    /**
     * @param displayType
     */
    public void setDisplayType(Long displayType) {
        this.displayType = displayType;
    }

    /**
     * @return READ_FLAG
     */
    public Long getReadFlag() {
        return readFlag;
    }

    /**
     * @param readFlag
     */
    public void setReadFlag(Long readFlag) {
        this.readFlag = readFlag;
    }

    /**
     * @return ALIGN_TYPE
     */
    public Short getAlignType() {
        return alignType;
    }

    /**
     * @param alignType
     */
    public void setAlignType(Short alignType) {
        this.alignType = alignType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", headId=").append(headId);
        sb.append(", headName=").append(headName);
        sb.append(", tableId=").append(tableId);
        sb.append(", columnId=").append(columnId);
        sb.append(", columnType=").append(columnType);
        sb.append(", catalogueRule=").append(catalogueRule);
        sb.append(", catalogueCode=").append(catalogueCode);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", parentHeadId=").append(parentHeadId);
        sb.append(", headcontent=").append(headcontent);
        sb.append(", headWidth=").append(headWidth);
        sb.append(", headType=").append(headType);
        sb.append(", headExc=").append(headExc);
        sb.append(", hierarchyNum=").append(hierarchyNum);
        sb.append(", headLine=").append(headLine);
        sb.append(", displayType=").append(displayType);
        sb.append(", readFlag=").append(readFlag);
        sb.append(", alignType=").append(alignType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}