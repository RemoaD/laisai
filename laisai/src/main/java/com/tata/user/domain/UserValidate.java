package com.tata.user.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UserValidate {
	@Pattern(regexp="^\\w+([+-.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", message="{Pattern.usermail.error}")
	private String usermail;
	@Size(max=16,min=8,message="{userpassword.error}")
    private String userpassword;
	@Size(max=16,min=8,message="{checkpassword.error}")
    private String checkpassword;
	@NotEmpty(message="{yanzhengma.error}")
	private String yanzhengma;
	@NotEmpty(message="{mailyanzhengma.error}")
	private String mailyanzhengma;
	public String getMailyanzhengma() {
		return mailyanzhengma;
	}
	public void setMailyanzhengma(String mailyanzhengma) {
		this.mailyanzhengma = mailyanzhengma;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getCheckpassword() {
		return checkpassword;
	}
	public void setCheckpassword(String checkpassword) {
		this.checkpassword = checkpassword;
	}
	public String getYanzhengma() {
		return yanzhengma;
	}
	public void setYanzhengma(String yanzhengma) {
		this.yanzhengma = yanzhengma;
	}
	@Override
	public String toString() {
		return "UserValidate [usermail=" + usermail + ", userpassword=" + userpassword + ", checkpassword="
				+ checkpassword + ", yanzhengma=" + yanzhengma + "]";
	}
}
