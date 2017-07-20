package com.tata.user.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class UserInfoValidate {
	@NotEmpty(message="真实姓名填写不能为空")
	@Pattern(regexp="^[\\u4E00-\\u9FA5]{2,5}(?:·[\\u4E00-\\u9FA5]{2,5})*$", message="请输入正确的真实姓名")
	private String usertruename;
	@NotEmpty(message="拼音填写不能为空")
	@Pattern(regexp="^[a-z|A-Z|\\s]+$", message="请输入正确的拼音")
    private String userpinyin;
	@NotEmpty(message="学校填写不能为空")
	@Pattern(regexp="^[\\u4E00-\\u9FA5]+$", message="请输入正确的学校名称")
    private String userschool;
	@NotEmpty(message="学院填写不能为空")
	@Pattern(regexp="^[\\u4E00-\\u9FA5]+$", message="请输入正确的学院名称")
    private String userdepartment;
	@NotEmpty(message="专业填写不能为空")
	@Pattern(regexp="^[\\u4E00-\\u9FA5]+$", message="请输入正确的专业名称")
    private String usermajor;
	@NotNull(message="年级不能为空")
    private String usergrade;
	@NotEmpty(message="学号填写不能为空")
	@Pattern(regexp="^[0-9]+$",message="请输入正确的学号")
    private String userstudentnumber;
	@NotNull(message="性别不能为空")
    private String usersex;
	@NotEmpty(message="手机号码填写不能为空")
	@Pattern(regexp="^1[3|4|5|7|8][0-9]{9}$",message="请输入正确的手机号码")
    private String usertel;
	@NotEmpty(message="必须选择至少一项意向职能")
    private String userproperty;
    private String userintroduce;
	
	public String getUsertruename() {
		return usertruename;
	}

	public void setUsertruename(String usertruename) {
		this.usertruename = usertruename;
	}

	public String getUserpinyin() {
		return userpinyin;
	}

	public void setUserpinyin(String userpinyin) {
		this.userpinyin = userpinyin;
	}

	public String getUserschool() {
		return userschool;
	}

	public void setUserschool(String userschool) {
		this.userschool = userschool;
	}

	public String getUserdepartment() {
		return userdepartment;
	}

	public void setUserdepartment(String userdepartment) {
		this.userdepartment = userdepartment;
	}

	public String getUsermajor() {
		return usermajor;
	}

	public void setUsermajor(String usermajor) {
		this.usermajor = usermajor;
	}

	public String getUsergrade() {
		return usergrade;
	}

	public void setUsergrade(String usergrade) {
		this.usergrade = usergrade;
	}

	public String getUserstudentnumber() {
		return userstudentnumber;
	}

	public void setUserstudentnumber(String userstudentnumber) {
		this.userstudentnumber = userstudentnumber;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUsertel() {
		return usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}

	public String getUserproperty() {
		return userproperty;
	}

	public void setUserproperty(String userproperty) {
		this.userproperty = userproperty;
	}

	public String getUserintroduce() {
		return userintroduce;
	}

	public void setUserintroduce(String userintroduce) {
		this.userintroduce = userintroduce;
	}
    

}
