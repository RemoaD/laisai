package com.tata.singleentry.domain;

import java.io.Serializable;
import java.util.Date;

public class SingleentryVO implements Serializable {
    private Integer singleentryid;

    private Integer userid;

    private Integer competitionid;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getSingleentryid() {
        return singleentryid;
    }

    public void setSingleentryid(Integer singleentryid) {
        this.singleentryid = singleentryid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCompetitionid() {
        return competitionid;
    }

    public void setCompetitionid(Integer competitionid) {
        this.competitionid = competitionid;
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
        sb.append(", singleentryid=").append(singleentryid);
        sb.append(", userid=").append(userid);
        sb.append(", competitionid=").append(competitionid);
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
        SingleentryVO other = (SingleentryVO) that;
        return (this.getSingleentryid() == null ? other.getSingleentryid() == null : this.getSingleentryid().equals(other.getSingleentryid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getCompetitionid() == null ? other.getCompetitionid() == null : this.getCompetitionid().equals(other.getCompetitionid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSingleentryid() == null) ? 0 : getSingleentryid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCompetitionid() == null) ? 0 : getCompetitionid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}