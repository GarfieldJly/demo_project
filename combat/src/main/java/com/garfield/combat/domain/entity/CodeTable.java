package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "T_C_CODE_TABLE")
public class CodeTable implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "DOMAIN_CODE")
    private String domainCode;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Column(name = "CODE_VALUE")
    private String codeValue;

    @Column(name = "CODE_TEXT")
    private String codeText;

    @Column(name = "CODE_SCHEMA")
    private String codeSchema;

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
     * @return DOMAIN_CODE
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * @param domainCode
     */
    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode == null ? null : domainCode.trim();
    }

    /**
     * @return DOMAIN_NAME
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    /**
     * @return CODE_VALUE
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * @param codeValue
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    /**
     * @return CODE_TEXT
     */
    public String getCodeText() {
        return codeText;
    }

    /**
     * @param codeText
     */
    public void setCodeText(String codeText) {
        this.codeText = codeText == null ? null : codeText.trim();
    }

    /**
     * @return CODE_SCHEMA
     */
    public String getCodeSchema() {
        return codeSchema;
    }

    /**
     * @param codeSchema
     */
    public void setCodeSchema(String codeSchema) {
        this.codeSchema = codeSchema == null ? null : codeSchema.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", domainCode=").append(domainCode);
        sb.append(", domainName=").append(domainName);
        sb.append(", codeValue=").append(codeValue);
        sb.append(", codeText=").append(codeText);
        sb.append(", codeSchema=").append(codeSchema);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}