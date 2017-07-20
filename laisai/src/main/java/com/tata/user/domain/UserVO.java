package com.tata.user.domain;

import java.io.Serializable;
import java.util.Date;

public class UserVO implements Serializable {
    private Integer userid;

    private String usermail;

    private String userpassword;

    private String usertruename;

    private String userpinyin;

    private String userschool;

    private String userdepartment;

    private String usermajor;

    private String usergrade;

    private String userstudentnumber;

    private String usersex;

    private String usertel;

    private String userheadimg;

    private String userproperty;

    private String userintroduce;

    private Integer userisin;

    private String userprize;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail == null ? null : usermail.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
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

    public String getUserheadimg() {
        return userheadimg;
    }

    public void setUserheadimg(String userheadimg) {
        this.userheadimg = userheadimg == null ? null : userheadimg.trim();
    }

    public String getUserproperty() {
        return userproperty;
    }

    public void setUserproperty(String userproperty) {
        this.userproperty = userproperty == null ? null : userproperty.trim();
    }

    public String getUserintroduce() {
        return userintroduce;
    }

    public void setUserintroduce(String userintroduce) {
        this.userintroduce = userintroduce == null ? null : userintroduce.trim();
    }

    public Integer getUserisin() {
        return userisin;
    }

    public void setUserisin(Integer userisin) {
        this.userisin = userisin;
    }

    public String getUserprize() {
        return userprize;
    }

    public void setUserprize(String userprize) {
        this.userprize = userprize == null ? null : userprize.trim();
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
        sb.append(", userid=").append(userid);
        sb.append(", usermail=").append(usermail);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", usertruename=").append(usertruename);
        sb.append(", userpinyin=").append(userpinyin);
        sb.append(", userschool=").append(userschool);
        sb.append(", userdepartment=").append(userdepartment);
        sb.append(", usermajor=").append(usermajor);
        sb.append(", usergrade=").append(usergrade);
        sb.append(", userstudentnumber=").append(userstudentnumber);
        sb.append(", usersex=").append(usersex);
        sb.append(", usertel=").append(usertel);
        sb.append(", userheadimg=").append(userheadimg);
        sb.append(", userproperty=").append(userproperty);
        sb.append(", userintroduce=").append(userintroduce);
        sb.append(", userisin=").append(userisin);
        sb.append(", userprize=").append(userprize);
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
        UserVO other = (UserVO) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsermail() == null ? other.getUsermail() == null : this.getUsermail().equals(other.getUsermail()))
            && (this.getUserpassword() == null ? other.getUserpassword() == null : this.getUserpassword().equals(other.getUserpassword()))
            && (this.getUsertruename() == null ? other.getUsertruename() == null : this.getUsertruename().equals(other.getUsertruename()))
            && (this.getUserpinyin() == null ? other.getUserpinyin() == null : this.getUserpinyin().equals(other.getUserpinyin()))
            && (this.getUserschool() == null ? other.getUserschool() == null : this.getUserschool().equals(other.getUserschool()))
            && (this.getUserdepartment() == null ? other.getUserdepartment() == null : this.getUserdepartment().equals(other.getUserdepartment()))
            && (this.getUsermajor() == null ? other.getUsermajor() == null : this.getUsermajor().equals(other.getUsermajor()))
            && (this.getUsergrade() == null ? other.getUsergrade() == null : this.getUsergrade().equals(other.getUsergrade()))
            && (this.getUserstudentnumber() == null ? other.getUserstudentnumber() == null : this.getUserstudentnumber().equals(other.getUserstudentnumber()))
            && (this.getUsersex() == null ? other.getUsersex() == null : this.getUsersex().equals(other.getUsersex()))
            && (this.getUsertel() == null ? other.getUsertel() == null : this.getUsertel().equals(other.getUsertel()))
            && (this.getUserheadimg() == null ? other.getUserheadimg() == null : this.getUserheadimg().equals(other.getUserheadimg()))
            && (this.getUserproperty() == null ? other.getUserproperty() == null : this.getUserproperty().equals(other.getUserproperty()))
            && (this.getUserintroduce() == null ? other.getUserintroduce() == null : this.getUserintroduce().equals(other.getUserintroduce()))
            && (this.getUserisin() == null ? other.getUserisin() == null : this.getUserisin().equals(other.getUserisin()))
            && (this.getUserprize() == null ? other.getUserprize() == null : this.getUserprize().equals(other.getUserprize()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsermail() == null) ? 0 : getUsermail().hashCode());
        result = prime * result + ((getUserpassword() == null) ? 0 : getUserpassword().hashCode());
        result = prime * result + ((getUsertruename() == null) ? 0 : getUsertruename().hashCode());
        result = prime * result + ((getUserpinyin() == null) ? 0 : getUserpinyin().hashCode());
        result = prime * result + ((getUserschool() == null) ? 0 : getUserschool().hashCode());
        result = prime * result + ((getUserdepartment() == null) ? 0 : getUserdepartment().hashCode());
        result = prime * result + ((getUsermajor() == null) ? 0 : getUsermajor().hashCode());
        result = prime * result + ((getUsergrade() == null) ? 0 : getUsergrade().hashCode());
        result = prime * result + ((getUserstudentnumber() == null) ? 0 : getUserstudentnumber().hashCode());
        result = prime * result + ((getUsersex() == null) ? 0 : getUsersex().hashCode());
        result = prime * result + ((getUsertel() == null) ? 0 : getUsertel().hashCode());
        result = prime * result + ((getUserheadimg() == null) ? 0 : getUserheadimg().hashCode());
        result = prime * result + ((getUserproperty() == null) ? 0 : getUserproperty().hashCode());
        result = prime * result + ((getUserintroduce() == null) ? 0 : getUserintroduce().hashCode());
        result = prime * result + ((getUserisin() == null) ? 0 : getUserisin().hashCode());
        result = prime * result + ((getUserprize() == null) ? 0 : getUserprize().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}