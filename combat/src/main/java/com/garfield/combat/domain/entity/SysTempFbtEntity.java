package com.garfield.combat.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "SYS_TEMP_FBT")
public class SysTempFbtEntity implements Serializable {
    @Column(name = "SCHEMA")
    private String schema;

    @Column(name = "OBJECT_NAME")
    private String objectName;

    @Column(name = "OBJECT#")
    private Short object;

    @Column(name = "RID")
    private Object rid;

    @Column(name = "ACTION")
    private String action;

    private static final long serialVersionUID = 1L;

    /**
     * @return SCHEMA
     */
    public String getSchema() {
        return schema;
    }

    /**
     * @param schema
     */
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    /**
     * @return OBJECT_NAME
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    /**
     * @return OBJECT#
     */
    public Short getObject() {
        return object;
    }

    /**
     * @param object
     */
    public void setObject(Short object) {
        this.object = object;
    }

    /**
     * @return RID
     */
    public Object getRid() {
        return rid;
    }

    /**
     * @param rid
     */
    public void setRid(Object rid) {
        this.rid = rid;
    }

    /**
     * @return ACTION
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schema=").append(schema);
        sb.append(", objectName=").append(objectName);
        sb.append(", object=").append(object);
        sb.append(", rid=").append(rid);
        sb.append(", action=").append(action);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}