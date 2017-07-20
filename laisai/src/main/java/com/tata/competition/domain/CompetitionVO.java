package com.tata.competition.domain;

import java.io.Serializable;
import java.util.Date;

public class CompetitionVO implements Serializable {
    private Integer competitionid;

    private String competitionname;

    private Date competitiontime;

    private Date groupdeadline;

    private String competitioncontent;

    private String competitionproperty;

    private String studentdemand;

    private String isrunning;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getCompetitionid() {
        return competitionid;
    }

    public void setCompetitionid(Integer competitionid) {
        this.competitionid = competitionid;
    }

    public String getCompetitionname() {
        return competitionname;
    }

    public void setCompetitionname(String competitionname) {
        this.competitionname = competitionname == null ? null : competitionname.trim();
    }

    public Date getCompetitiontime() {
        return competitiontime;
    }

    public void setCompetitiontime(Date competitiontime) {
        this.competitiontime = competitiontime;
    }

    public Date getGroupdeadline() {
        return groupdeadline;
    }

    public void setGroupdeadline(Date groupdeadline) {
        this.groupdeadline = groupdeadline;
    }

    public String getCompetitioncontent() {
        return competitioncontent;
    }

    public void setCompetitioncontent(String competitioncontent) {
        this.competitioncontent = competitioncontent == null ? null : competitioncontent.trim();
    }

    public String getCompetitionproperty() {
        return competitionproperty;
    }

    public void setCompetitionproperty(String competitionproperty) {
        this.competitionproperty = competitionproperty == null ? null : competitionproperty.trim();
    }

    public String getStudentdemand() {
        return studentdemand;
    }

    public void setStudentdemand(String studentdemand) {
        this.studentdemand = studentdemand == null ? null : studentdemand.trim();
    }

    public String getIsrunning() {
        return isrunning;
    }

    public void setIsrunning(String isrunning) {
        this.isrunning = isrunning == null ? null : isrunning.trim();
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
        sb.append(", competitionid=").append(competitionid);
        sb.append(", competitionname=").append(competitionname);
        sb.append(", competitiontime=").append(competitiontime);
        sb.append(", groupdeadline=").append(groupdeadline);
        sb.append(", competitioncontent=").append(competitioncontent);
        sb.append(", competitionproperty=").append(competitionproperty);
        sb.append(", studentdemand=").append(studentdemand);
        sb.append(", isrunning=").append(isrunning);
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
        CompetitionVO other = (CompetitionVO) that;
        return (this.getCompetitionid() == null ? other.getCompetitionid() == null : this.getCompetitionid().equals(other.getCompetitionid()))
            && (this.getCompetitionname() == null ? other.getCompetitionname() == null : this.getCompetitionname().equals(other.getCompetitionname()))
            && (this.getCompetitiontime() == null ? other.getCompetitiontime() == null : this.getCompetitiontime().equals(other.getCompetitiontime()))
            && (this.getGroupdeadline() == null ? other.getGroupdeadline() == null : this.getGroupdeadline().equals(other.getGroupdeadline()))
            && (this.getCompetitioncontent() == null ? other.getCompetitioncontent() == null : this.getCompetitioncontent().equals(other.getCompetitioncontent()))
            && (this.getCompetitionproperty() == null ? other.getCompetitionproperty() == null : this.getCompetitionproperty().equals(other.getCompetitionproperty()))
            && (this.getStudentdemand() == null ? other.getStudentdemand() == null : this.getStudentdemand().equals(other.getStudentdemand()))
            && (this.getIsrunning() == null ? other.getIsrunning() == null : this.getIsrunning().equals(other.getIsrunning()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompetitionid() == null) ? 0 : getCompetitionid().hashCode());
        result = prime * result + ((getCompetitionname() == null) ? 0 : getCompetitionname().hashCode());
        result = prime * result + ((getCompetitiontime() == null) ? 0 : getCompetitiontime().hashCode());
        result = prime * result + ((getGroupdeadline() == null) ? 0 : getGroupdeadline().hashCode());
        result = prime * result + ((getCompetitioncontent() == null) ? 0 : getCompetitioncontent().hashCode());
        result = prime * result + ((getCompetitionproperty() == null) ? 0 : getCompetitionproperty().hashCode());
        result = prime * result + ((getStudentdemand() == null) ? 0 : getStudentdemand().hashCode());
        result = prime * result + ((getIsrunning() == null) ? 0 : getIsrunning().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}