package com.tata.application.domain;

import java.io.Serializable;
import java.util.Date;

public class ApplicationVO implements Serializable {
    private Integer applicationid;

    private Integer sendapplicationid;

    private Integer firstmemberid;

    private Integer secondmemberid;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(Integer applicationid) {
        this.applicationid = applicationid;
    }

    public Integer getSendapplicationid() {
        return sendapplicationid;
    }

    public void setSendapplicationid(Integer sendapplicationid) {
        this.sendapplicationid = sendapplicationid;
    }

    public Integer getFirstmemberid() {
        return firstmemberid;
    }

    public void setFirstmemberid(Integer firstmemberid) {
        this.firstmemberid = firstmemberid;
    }

    public Integer getSecondmemberid() {
        return secondmemberid;
    }

    public void setSecondmemberid(Integer secondmemberid) {
        this.secondmemberid = secondmemberid;
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
        sb.append(", applicationid=").append(applicationid);
        sb.append(", sendapplicationid=").append(sendapplicationid);
        sb.append(", firstmemberid=").append(firstmemberid);
        sb.append(", secondmemberid=").append(secondmemberid);
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
        ApplicationVO other = (ApplicationVO) that;
        return (this.getApplicationid() == null ? other.getApplicationid() == null : this.getApplicationid().equals(other.getApplicationid()))
            && (this.getSendapplicationid() == null ? other.getSendapplicationid() == null : this.getSendapplicationid().equals(other.getSendapplicationid()))
            && (this.getFirstmemberid() == null ? other.getFirstmemberid() == null : this.getFirstmemberid().equals(other.getFirstmemberid()))
            && (this.getSecondmemberid() == null ? other.getSecondmemberid() == null : this.getSecondmemberid().equals(other.getSecondmemberid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplicationid() == null) ? 0 : getApplicationid().hashCode());
        result = prime * result + ((getSendapplicationid() == null) ? 0 : getSendapplicationid().hashCode());
        result = prime * result + ((getFirstmemberid() == null) ? 0 : getFirstmemberid().hashCode());
        result = prime * result + ((getSecondmemberid() == null) ? 0 : getSecondmemberid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}