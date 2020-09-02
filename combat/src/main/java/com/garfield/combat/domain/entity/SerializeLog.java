package com.garfield.combat.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_D_SERIALIZE_LOG")
public class SerializeLog implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "FROM_ID")
    private Long fromId;

    @Column(name = "TO_ID")
    private Long toId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LOG")
    private String log;

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
     * @return FROM_ID
     */
    public Long getFromId() {
        return fromId;
    }

    /**
     * @param fromId
     */
    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    /**
     * @return TO_ID
     */
    public Long getToId() {
        return toId;
    }

    /**
     * @param toId
     */
    public void setToId(Long toId) {
        this.toId = toId;
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
     * @return LOG
     */
    public String getLog() {
        return log;
    }

    /**
     * @param log
     */
    public void setLog(String log) {
        this.log = log == null ? null : log.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", createTime=").append(createTime);
        sb.append(", log=").append(log);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}