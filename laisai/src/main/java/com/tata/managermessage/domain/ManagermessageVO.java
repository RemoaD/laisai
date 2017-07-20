package com.tata.managermessage.domain;

import java.io.Serializable;
import java.util.Date;

public class ManagermessageVO implements Serializable {
    private Integer messageid;

    private String messagecontent;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageid=").append(messageid);
        sb.append(", messagecontent=").append(messagecontent);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ManagermessageVO other = (ManagermessageVO) that;
        return (this.getMessageid() == null ? other.getMessageid() == null : this.getMessageid().equals(other.getMessageid()))
            && (this.getMessagecontent() == null ? other.getMessagecontent() == null : this.getMessagecontent().equals(other.getMessagecontent()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMessageid() == null) ? 0 : getMessageid().hashCode());
        result = prime * result + ((getMessagecontent() == null) ? 0 : getMessagecontent().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}