package com.tata.group.domain;

import java.io.Serializable;
import java.util.Date;

public class ThegroupVO implements Serializable {
    private Integer groupid;

    private Integer groupfirstmemberid;

    private String groupfirsttruename;

    private String groupfirstproperty;

    private Integer groupsecondmemberid;

    private String groupsecondtruename;

    private String groupsecondproperty;

    private Integer groupthirdmemberid;

    private String groupthirdtruename;

    private String groupthirdproperty;

    private String groupintroduce;

    private Integer groupteacherid;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getGroupfirstmemberid() {
        return groupfirstmemberid;
    }

    public void setGroupfirstmemberid(Integer groupfirstmemberid) {
        this.groupfirstmemberid = groupfirstmemberid;
    }

    public String getGroupfirsttruename() {
        return groupfirsttruename;
    }

    public void setGroupfirsttruename(String groupfirsttruename) {
        this.groupfirsttruename = groupfirsttruename == null ? null : groupfirsttruename.trim();
    }

    public String getGroupfirstproperty() {
        return groupfirstproperty;
    }

    public void setGroupfirstproperty(String groupfirstproperty) {
        this.groupfirstproperty = groupfirstproperty == null ? null : groupfirstproperty.trim();
    }

    public Integer getGroupsecondmemberid() {
        return groupsecondmemberid;
    }

    public void setGroupsecondmemberid(Integer groupsecondmemberid) {
        this.groupsecondmemberid = groupsecondmemberid;
    }

    public String getGroupsecondtruename() {
        return groupsecondtruename;
    }

    public void setGroupsecondtruename(String groupsecondtruename) {
        this.groupsecondtruename = groupsecondtruename == null ? null : groupsecondtruename.trim();
    }

    public String getGroupsecondproperty() {
        return groupsecondproperty;
    }

    public void setGroupsecondproperty(String groupsecondproperty) {
        this.groupsecondproperty = groupsecondproperty == null ? null : groupsecondproperty.trim();
    }

    public Integer getGroupthirdmemberid() {
        return groupthirdmemberid;
    }

    public void setGroupthirdmemberid(Integer groupthirdmemberid) {
        this.groupthirdmemberid = groupthirdmemberid;
    }

    public String getGroupthirdtruename() {
        return groupthirdtruename;
    }

    public void setGroupthirdtruename(String groupthirdtruename) {
        this.groupthirdtruename = groupthirdtruename == null ? null : groupthirdtruename.trim();
    }

    public String getGroupthirdproperty() {
        return groupthirdproperty;
    }

    public void setGroupthirdproperty(String groupthirdproperty) {
        this.groupthirdproperty = groupthirdproperty == null ? null : groupthirdproperty.trim();
    }

    public String getGroupintroduce() {
        return groupintroduce;
    }

    public void setGroupintroduce(String groupintroduce) {
        this.groupintroduce = groupintroduce == null ? null : groupintroduce.trim();
    }

    public Integer getGroupteacherid() {
        return groupteacherid;
    }

    public void setGroupteacherid(Integer groupteacherid) {
        this.groupteacherid = groupteacherid;
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
        sb.append(", groupid=").append(groupid);
        sb.append(", groupfirstmemberid=").append(groupfirstmemberid);
        sb.append(", groupfirsttruename=").append(groupfirsttruename);
        sb.append(", groupfirstproperty=").append(groupfirstproperty);
        sb.append(", groupsecondmemberid=").append(groupsecondmemberid);
        sb.append(", groupsecondtruename=").append(groupsecondtruename);
        sb.append(", groupsecondproperty=").append(groupsecondproperty);
        sb.append(", groupthirdmemberid=").append(groupthirdmemberid);
        sb.append(", groupthirdtruename=").append(groupthirdtruename);
        sb.append(", groupthirdproperty=").append(groupthirdproperty);
        sb.append(", groupintroduce=").append(groupintroduce);
        sb.append(", groupteacherid=").append(groupteacherid);
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
        ThegroupVO other = (ThegroupVO) that;
        return (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getGroupfirstmemberid() == null ? other.getGroupfirstmemberid() == null : this.getGroupfirstmemberid().equals(other.getGroupfirstmemberid()))
            && (this.getGroupfirsttruename() == null ? other.getGroupfirsttruename() == null : this.getGroupfirsttruename().equals(other.getGroupfirsttruename()))
            && (this.getGroupfirstproperty() == null ? other.getGroupfirstproperty() == null : this.getGroupfirstproperty().equals(other.getGroupfirstproperty()))
            && (this.getGroupsecondmemberid() == null ? other.getGroupsecondmemberid() == null : this.getGroupsecondmemberid().equals(other.getGroupsecondmemberid()))
            && (this.getGroupsecondtruename() == null ? other.getGroupsecondtruename() == null : this.getGroupsecondtruename().equals(other.getGroupsecondtruename()))
            && (this.getGroupsecondproperty() == null ? other.getGroupsecondproperty() == null : this.getGroupsecondproperty().equals(other.getGroupsecondproperty()))
            && (this.getGroupthirdmemberid() == null ? other.getGroupthirdmemberid() == null : this.getGroupthirdmemberid().equals(other.getGroupthirdmemberid()))
            && (this.getGroupthirdtruename() == null ? other.getGroupthirdtruename() == null : this.getGroupthirdtruename().equals(other.getGroupthirdtruename()))
            && (this.getGroupthirdproperty() == null ? other.getGroupthirdproperty() == null : this.getGroupthirdproperty().equals(other.getGroupthirdproperty()))
            && (this.getGroupintroduce() == null ? other.getGroupintroduce() == null : this.getGroupintroduce().equals(other.getGroupintroduce()))
            && (this.getGroupteacherid() == null ? other.getGroupteacherid() == null : this.getGroupteacherid().equals(other.getGroupteacherid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getGroupfirstmemberid() == null) ? 0 : getGroupfirstmemberid().hashCode());
        result = prime * result + ((getGroupfirsttruename() == null) ? 0 : getGroupfirsttruename().hashCode());
        result = prime * result + ((getGroupfirstproperty() == null) ? 0 : getGroupfirstproperty().hashCode());
        result = prime * result + ((getGroupsecondmemberid() == null) ? 0 : getGroupsecondmemberid().hashCode());
        result = prime * result + ((getGroupsecondtruename() == null) ? 0 : getGroupsecondtruename().hashCode());
        result = prime * result + ((getGroupsecondproperty() == null) ? 0 : getGroupsecondproperty().hashCode());
        result = prime * result + ((getGroupthirdmemberid() == null) ? 0 : getGroupthirdmemberid().hashCode());
        result = prime * result + ((getGroupthirdtruename() == null) ? 0 : getGroupthirdtruename().hashCode());
        result = prime * result + ((getGroupthirdproperty() == null) ? 0 : getGroupthirdproperty().hashCode());
        result = prime * result + ((getGroupintroduce() == null) ? 0 : getGroupintroduce().hashCode());
        result = prime * result + ((getGroupteacherid() == null) ? 0 : getGroupteacherid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}