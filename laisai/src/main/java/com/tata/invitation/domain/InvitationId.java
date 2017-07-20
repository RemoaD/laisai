package com.tata.invitation.domain;

public class InvitationId {
	private int sendinviteid;
	private int receiveinviteid;
	public int getSendinviteid() {
		return sendinviteid;
	}
	public void setSendinviteid(int sendinviteid) {
		this.sendinviteid = sendinviteid;
	}
	public int getReceiveinviteid() {
		return receiveinviteid;
	}
	public void setReceiveinviteid(int receiveinviteid) {
		this.receiveinviteid = receiveinviteid;
	}
	@Override
	public String toString() {
		return "InvitationId [sendinviteid=" + sendinviteid + ", receiveinviteid=" + receiveinviteid + "]";
	}
	
}
