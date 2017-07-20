package com.tata.invitation.domain;

import java.io.Serializable;
import java.util.Date;

public class InvitationVO implements Serializable {
    private Integer invitationid;

    private Integer sendinviteid;

    private Integer receiveinviteid;

    private String success;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getInvitationid() {
        return invitationid;
    }

    public void setInvitationid(Integer invitationid) {
        this.invitationid = invitationid;
    }

    public Integer getSendinviteid() {
        return sendinviteid;
    }

    public void setSendinviteid(Integer sendinviteid) {
        this.sendinviteid = sendinviteid;
    }

    public Integer getReceiveinviteid() {
        return receiveinviteid;
    }

    public void setReceiveinviteid(Integer receiveinviteid) {
        this.receiveinviteid = receiveinviteid;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success == null ? null : success.trim();
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
        sb.append(", invitationid=").append(invitationid);
        sb.append(", sendinviteid=").append(sendinviteid);
        sb.append(", receiveinviteid=").append(receiveinviteid);
        sb.append(", success=").append(success);
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
        InvitationVO other = (InvitationVO) that;
        return (this.getInvitationid() == null ? other.getInvitationid() == null : this.getInvitationid().equals(other.getInvitationid()))
            && (this.getSendinviteid() == null ? other.getSendinviteid() == null : this.getSendinviteid().equals(other.getSendinviteid()))
            && (this.getReceiveinviteid() == null ? other.getReceiveinviteid() == null : this.getReceiveinviteid().equals(other.getReceiveinviteid()))
            && (this.getSuccess() == null ? other.getSuccess() == null : this.getSuccess().equals(other.getSuccess()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInvitationid() == null) ? 0 : getInvitationid().hashCode());
        result = prime * result + ((getSendinviteid() == null) ? 0 : getSendinviteid().hashCode());
        result = prime * result + ((getReceiveinviteid() == null) ? 0 : getReceiveinviteid().hashCode());
        result = prime * result + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}