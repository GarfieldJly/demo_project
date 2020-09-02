package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_EVALUATION_TABLE")
public class EvaluationTable implements Serializable {
    @Id
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "EVALUATION_LIST_ID")
    private Long evaluationListId;

    @Column(name = "TABLE_TYPE")
    private String tableType;

    @Column(name = "TABLE_CLASSIFY")
    private Long tableClassify;

    @Column(name = "TABLE_HEIGHT")
    private Short tableHeight;

    @Column(name = "FIXED_ROWS")
    private String fixedRows;

    @Column(name = "FIXED_OPERATIONTOOL")
    private String fixedOperationtool;

    @Column(name = "CONTENT_MODIFICATION")
    private String contentModification;

    @Column(name = "CONTENT_EXAMINE")
    private String contentExamine;

    @Column(name = "CONTENT_DELETE")
    private String contentDelete;

    @Column(name = "FIXED_HEADER")
    private String fixedHeader;

    @Column(name = "ALIGN_TYPE")
    private Integer alignType;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "DATA_UNION_FLAG")
    private Short dataUnionFlag;

    @Column(name = "PATIENT_FILTRATE")
    private Short patientFiltrate;

    @Column(name = "OTHER_SET")
    private String otherSet;

    private static final long serialVersionUID = 1L;

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
     * @return TABLE_TYPE
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * @param tableType
     */
    public void setTableType(String tableType) {
        this.tableType = tableType == null ? null : tableType.trim();
    }

    /**
     * @return TABLE_CLASSIFY
     */
    public Long getTableClassify() {
        return tableClassify;
    }

    /**
     * @param tableClassify
     */
    public void setTableClassify(Long tableClassify) {
        this.tableClassify = tableClassify;
    }

    /**
     * @return TABLE_HEIGHT
     */
    public Short getTableHeight() {
        return tableHeight;
    }

    /**
     * @param tableHeight
     */
    public void setTableHeight(Short tableHeight) {
        this.tableHeight = tableHeight;
    }

    /**
     * @return FIXED_ROWS
     */
    public String getFixedRows() {
        return fixedRows;
    }

    /**
     * @param fixedRows
     */
    public void setFixedRows(String fixedRows) {
        this.fixedRows = fixedRows == null ? null : fixedRows.trim();
    }

    /**
     * @return FIXED_OPERATIONTOOL
     */
    public String getFixedOperationtool() {
        return fixedOperationtool;
    }

    /**
     * @param fixedOperationtool
     */
    public void setFixedOperationtool(String fixedOperationtool) {
        this.fixedOperationtool = fixedOperationtool == null ? null : fixedOperationtool.trim();
    }

    /**
     * @return CONTENT_MODIFICATION
     */
    public String getContentModification() {
        return contentModification;
    }

    /**
     * @param contentModification
     */
    public void setContentModification(String contentModification) {
        this.contentModification = contentModification == null ? null : contentModification.trim();
    }

    /**
     * @return CONTENT_EXAMINE
     */
    public String getContentExamine() {
        return contentExamine;
    }

    /**
     * @param contentExamine
     */
    public void setContentExamine(String contentExamine) {
        this.contentExamine = contentExamine == null ? null : contentExamine.trim();
    }

    /**
     * @return CONTENT_DELETE
     */
    public String getContentDelete() {
        return contentDelete;
    }

    /**
     * @param contentDelete
     */
    public void setContentDelete(String contentDelete) {
        this.contentDelete = contentDelete == null ? null : contentDelete.trim();
    }

    /**
     * @return FIXED_HEADER
     */
    public String getFixedHeader() {
        return fixedHeader;
    }

    /**
     * @param fixedHeader
     */
    public void setFixedHeader(String fixedHeader) {
        this.fixedHeader = fixedHeader == null ? null : fixedHeader.trim();
    }

    /**
     * @return ALIGN_TYPE
     */
    public Integer getAlignType() {
        return alignType;
    }

    /**
     * @param alignType
     */
    public void setAlignType(Integer alignType) {
        this.alignType = alignType;
    }

    /**
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * @return DATA_UNION_FLAG
     */
    public Short getDataUnionFlag() {
        return dataUnionFlag;
    }

    /**
     * @param dataUnionFlag
     */
    public void setDataUnionFlag(Short dataUnionFlag) {
        this.dataUnionFlag = dataUnionFlag;
    }

    /**
     * @return PATIENT_FILTRATE
     */
    public Short getPatientFiltrate() {
        return patientFiltrate;
    }

    /**
     * @param patientFiltrate
     */
    public void setPatientFiltrate(Short patientFiltrate) {
        this.patientFiltrate = patientFiltrate;
    }

    /**
     * @return OTHER_SET
     */
    public String getOtherSet() {
        return otherSet;
    }

    /**
     * @param otherSet
     */
    public void setOtherSet(String otherSet) {
        this.otherSet = otherSet == null ? null : otherSet.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableId=").append(tableId);
        sb.append(", evaluationListId=").append(evaluationListId);
        sb.append(", tableType=").append(tableType);
        sb.append(", tableClassify=").append(tableClassify);
        sb.append(", tableHeight=").append(tableHeight);
        sb.append(", fixedRows=").append(fixedRows);
        sb.append(", fixedOperationtool=").append(fixedOperationtool);
        sb.append(", contentModification=").append(contentModification);
        sb.append(", contentExamine=").append(contentExamine);
        sb.append(", contentDelete=").append(contentDelete);
        sb.append(", fixedHeader=").append(fixedHeader);
        sb.append(", alignType=").append(alignType);
        sb.append(", tableName=").append(tableName);
        sb.append(", dataUnionFlag=").append(dataUnionFlag);
        sb.append(", patientFiltrate=").append(patientFiltrate);
        sb.append(", otherSet=").append(otherSet);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}