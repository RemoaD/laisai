package com.tata.group.domain;

public class TwoManId {
	private int groupfirstmemberid;
	private String groupfirsttruename;
	private String groupfirstproperty;
	private int groupsecondmemberid;
	private String groupsecondtruename;
	private String groupsecondproperty;
	public int getGroupfirstmemberid() {
		return groupfirstmemberid;
	}
	public void setGroupfirstmemberid(int groupfirstmemberid) {
		this.groupfirstmemberid = groupfirstmemberid;
	}
	public String getGroupfirsttruename() {
		return groupfirsttruename;
	}
	public void setGroupfirsttruename(String groupfirsttruename) {
		this.groupfirsttruename = groupfirsttruename;
	}
	public String getGroupfirstproperty() {
		return groupfirstproperty;
	}
	public void setGroupfirstproperty(String groupfirstproperty) {
		this.groupfirstproperty = groupfirstproperty;
	}
	public int getGroupsecondmemberid() {
		return groupsecondmemberid;
	}
	public void setGroupsecondmemberid(int groupsecondmemberid) {
		this.groupsecondmemberid = groupsecondmemberid;
	}
	public String getGroupsecondtruename() {
		return groupsecondtruename;
	}
	public void setGroupsecondtruename(String groupsecondtruename) {
		this.groupsecondtruename = groupsecondtruename;
	}
	public String getGroupsecondproperty() {
		return groupsecondproperty;
	}
	public void setGroupsecondproperty(String groupsecondproperty) {
		this.groupsecondproperty = groupsecondproperty;
	}
	@Override
	public String toString() {
		return "TwoManId [groupfirstmemberid=" + groupfirstmemberid + ", groupfirsttruename=" + groupfirsttruename
				+ ", groupfirstproperty=" + groupfirstproperty + ", groupsecondmemberid=" + groupsecondmemberid
				+ ", groupsecondtruename=" + groupsecondtruename + ", groupsecondproperty=" + groupsecondproperty + "]";
	}
	
}
