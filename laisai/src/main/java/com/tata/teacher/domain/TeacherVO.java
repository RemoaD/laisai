package com.tata.teacher.domain;

import java.io.Serializable;

public class TeacherVO implements Serializable {
    private Integer groupteacherid;

    private String groupteachername;

    private Integer studentnumber;

    private Integer yidainumber;

    private Integer remainnumber;

    private static final long serialVersionUID = 1L;

    public Integer getGroupteacherid() {
        return groupteacherid;
    }

    public void setGroupteacherid(Integer groupteacherid) {
        this.groupteacherid = groupteacherid;
    }

    public String getGroupteachername() {
        return groupteachername;
    }

    public void setGroupteachername(String groupteachername) {
        this.groupteachername = groupteachername == null ? null : groupteachername.trim();
    }

    public Integer getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(Integer studentnumber) {
        this.studentnumber = studentnumber;
    }

    public Integer getYidainumber() {
        return yidainumber;
    }

    public void setYidainumber(Integer yidainumber) {
        this.yidainumber = yidainumber;
    }

    public Integer getRemainnumber() {
        return remainnumber;
    }

    public void setRemainnumber(Integer remainnumber) {
        this.remainnumber = remainnumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupteacherid=").append(groupteacherid);
        sb.append(", groupteachername=").append(groupteachername);
        sb.append(", studentnumber=").append(studentnumber);
        sb.append(", yidainumber=").append(yidainumber);
        sb.append(", remainnumber=").append(remainnumber);
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
        TeacherVO other = (TeacherVO) that;
        return (this.getGroupteacherid() == null ? other.getGroupteacherid() == null : this.getGroupteacherid().equals(other.getGroupteacherid()))
            && (this.getGroupteachername() == null ? other.getGroupteachername() == null : this.getGroupteachername().equals(other.getGroupteachername()))
            && (this.getStudentnumber() == null ? other.getStudentnumber() == null : this.getStudentnumber().equals(other.getStudentnumber()))
            && (this.getYidainumber() == null ? other.getYidainumber() == null : this.getYidainumber().equals(other.getYidainumber()))
            && (this.getRemainnumber() == null ? other.getRemainnumber() == null : this.getRemainnumber().equals(other.getRemainnumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupteacherid() == null) ? 0 : getGroupteacherid().hashCode());
        result = prime * result + ((getGroupteachername() == null) ? 0 : getGroupteachername().hashCode());
        result = prime * result + ((getStudentnumber() == null) ? 0 : getStudentnumber().hashCode());
        result = prime * result + ((getYidainumber() == null) ? 0 : getYidainumber().hashCode());
        result = prime * result + ((getRemainnumber() == null) ? 0 : getRemainnumber().hashCode());
        return result;
    }
}