package com.tata.user.domain;

import javax.validation.constraints.Size;

public class ChangePasswordValidate {
	@Size(max=16,min=8,message="{userpassword.error}")
	private String oldpassword;
	@Size(max=16,min=8,message="{userpassword.error}")
	private String newpassword;
	@Size(max=16,min=8,message="{checkpassword.error}")
	private String checkpassword;
	public String getOldpassword() {
		return oldpassword;
	}
	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getCheckpassword() {
		return checkpassword;
	}
	public void setCheckpassword(String checkpassword) {
		this.checkpassword = checkpassword;
	}
	@Override
	public String toString() {
		return "ChangePasswordValidate [oldpassword=" + oldpassword + ", newpassword=" + newpassword
				+ ", checkpassword=" + checkpassword + "]";
	}
}
