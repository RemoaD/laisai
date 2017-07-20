package com.tata.gerenbaoming.domain;

import java.io.Serializable;

public class GerenbaomingVO implements Serializable {
    private Integer gerenbaomingid;

    private String usertruename;

    private String userpinyin;

    private String userschool;

    private String userdepartment;

    private String usermajor;

    private String usergrade;

    private String userstudentnumber;

    private String usersex;

    private String usertel;

    private static final long serialVersionUID = 1L;

    public Integer getGerenbaomingid() {
        return gerenbaomingid;
    }

    public void setGerenbaomingid(Integer gerenbaomingid) {
        this.gerenbaomingid = gerenbaomingid;
    }

    public String getUsertruename() {
        return usertruename;
    }

    public void setUsertruename(String usertruename) {
        this.usertruename = usertruename == null ? null : usertruename.trim();
    }

    public String getUserpinyin() {
        return userpinyin;
    }

    public void setUserpinyin(String userpinyin) {
        this.userpinyin = userpinyin == null ? null : userpinyin.trim();
    }

    public String getUserschool() {
        return userschool;
    }

    public void setUserschool(String userschool) {
        this.userschool = userschool == null ? null : userschool.trim();
    }

    public String getUserdepartment() {
        return userdepartment;
    }

    public void setUserdepartment(String userdepartment) {
        this.userdepartment = userdepartment == null ? null : userdepartment.trim();
    }

    public String getUsermajor() {
        return usermajor;
    }

    public void setUsermajor(String usermajor) {
        this.usermajor = usermajor == null ? null : usermajor.trim();
    }

    public String getUsergrade() {
        return usergrade;
    }

    public void setUsergrade(String usergrade) {
        this.usergrade = usergrade == null ? null : usergrade.trim();
    }

    public String getUserstudentnumber() {
        return userstudentnumber;
    }

    public void setUserstudentnumber(String userstudentnumber) {
        this.userstudentnumber = userstudentnumber == null ? null : userstudentnumber.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gerenbaomingid=").append(gerenbaomingid);
        sb.append(", usertruename=").append(usertruename);
        sb.append(", userpinyin=").append(userpinyin);
        sb.append(", userschool=").append(userschool);
        sb.append(", userdepartment=").append(userdepartment);
        sb.append(", usermajor=").append(usermajor);
        sb.append(", usergrade=").append(usergrade);
        sb.append(", userstudentnumber=").append(userstudentnumber);
        sb.append(", usersex=").append(usersex);
        sb.append(", usertel=").append(usertel);
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
        GerenbaomingVO other = (GerenbaomingVO) that;
        return (this.getGerenbaomingid() == null ? other.getGerenbaomingid() == null : this.getGerenbaomingid().equals(other.getGerenbaomingid()))
            && (this.getUsertruename() == null ? other.getUsertruename() == null : this.getUsertruename().equals(other.getUsertruename()))
            && (this.getUserpinyin() == null ? other.getUserpinyin() == null : this.getUserpinyin().equals(other.getUserpinyin()))
            && (this.getUserschool() == null ? other.getUserschool() == null : this.getUserschool().equals(other.getUserschool()))
            && (this.getUserdepartment() == null ? other.getUserdepartment() == null : this.getUserdepartment().equals(other.getUserdepartment()))
            && (this.getUsermajor() == null ? other.getUsermajor() == null : this.getUsermajor().equals(other.getUsermajor()))
            && (this.getUsergrade() == null ? other.getUsergrade() == null : this.getUsergrade().equals(other.getUsergrade()))
            && (this.getUserstudentnumber() == null ? other.getUserstudentnumber() == null : this.getUserstudentnumber().equals(other.getUserstudentnumber()))
            && (this.getUsersex() == null ? other.getUsersex() == null : this.getUsersex().equals(other.getUsersex()))
            && (this.getUsertel() == null ? other.getUsertel() == null : this.getUsertel().equals(other.getUsertel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGerenbaomingid() == null) ? 0 : getGerenbaomingid().hashCode());
        result = prime * result + ((getUsertruename() == null) ? 0 : getUsertruename().hashCode());
        result = prime * result + ((getUserpinyin() == null) ? 0 : getUserpinyin().hashCode());
        result = prime * result + ((getUserschool() == null) ? 0 : getUserschool().hashCode());
        result = prime * result + ((getUserdepartment() == null) ? 0 : getUserdepartment().hashCode());
        result = prime * result + ((getUsermajor() == null) ? 0 : getUsermajor().hashCode());
        result = prime * result + ((getUsergrade() == null) ? 0 : getUsergrade().hashCode());
        result = prime * result + ((getUserstudentnumber() == null) ? 0 : getUserstudentnumber().hashCode());
        result = prime * result + ((getUsersex() == null) ? 0 : getUsersex().hashCode());
        result = prime * result + ((getUsertel() == null) ? 0 : getUsertel().hashCode());
        return result;
    }
}