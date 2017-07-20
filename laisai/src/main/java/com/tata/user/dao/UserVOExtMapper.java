package com.tata.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tata.application.domain.ApplicationVO;
import com.tata.common.page.PageVO;
import com.tata.competition.domain.CompetitionVO;
import com.tata.group.domain.ThegroupVO;
import com.tata.groupbaoming.domain.GroupbaomingVO;
import com.tata.invitation.domain.InvitationId;
import com.tata.invitation.domain.InvitationVO;
import com.tata.managermessage.domain.ManagermessageVO;
import com.tata.singleentry.domain.SingleentryVO;
import com.tata.teacher.domain.TeacherVO;
import com.tata.user.domain.UserVO;

public interface UserVOExtMapper {
	public UserVO selectByEmail(String email)throws Throwable;//通过邮箱得到用户
	public List<UserVO> list()throws Throwable;//展示用户列表
	public void insertUser(UserVO user)throws Throwable;//创建新用户
	public List<ManagermessageVO> listManagerMessage()throws Throwable;//得到管理员通知列表
	public UserVO selectUserVOFromSingleEntry(int userid)throws Throwable;//根据用户id查询单人报名比赛里的该用户信息
	public void insertSingleentry(SingleentryVO singleentry)throws Throwable;//插入一条单人比赛的报名信息
	public InvitationVO selectInvitation(InvitationId invitationid)throws Throwable;//查找是否有相应的邀请 
	public void insertInvitation(InvitationVO invitation)throws Throwable;//插入邀请
	public List<Integer> selectSendInviteidByreceiveInviteid(int receiveinviteid)throws Throwable;
	public ThegroupVO isexist(int userid)throws Throwable;
	public void deletebysendinviteid(int sendinviteid)throws Throwable;
	public void deletebyreceiveinviteid(int receiveinviteid)throws Throwable;
	public void insertThirdmember(ThegroupVO group)throws Throwable;
	public void insertTwain(ThegroupVO group)throws Throwable;
	public void updateUserisin(int userid)throws Throwable;
	public List<Integer> selectsendapplicationidByfirstmemberid(int firstmemberid)throws Throwable;
	public List<Integer> selectsendapplicationidBysecondmemberid(int secondmemberid)throws Throwable;
	public List<Integer> checkfirstmemberid(int userid) throws Throwable;
	public List<Integer> checksecondmemberid(int userid) throws Throwable;
	public void updategroupthirdmemberid(ThegroupVO group)throws Throwable;
	public void deletebyuserid(int userid)throws Throwable;
	public void deletebysendapplicationid(int userid)throws Throwable;
	public void deletebyApplication(ApplicationVO application)throws Throwable;
	public void deletebyInvitation(InvitationVO invitation)throws Throwable;
	public List<TeacherVO> listTeacher()throws Throwable;
	public Integer selectgroupteacheridBygroupid(int groupid)throws Throwable;
	public void deleteGroupByfirstmemberid(int firstmemberid)throws Throwable;
	public void updateGroupteacher(ThegroupVO group)throws Throwable;
	public void updateteacher(TeacherVO teacher)throws Throwable;
	public void updateGroupbaomingTeacher(GroupbaomingVO groupbaoming)throws Throwable;
	public CompetitionVO selectCompetition(int competitionid)throws Throwable;
	public void updateUserisinto0(int userid)throws Throwable;
	public void updatePasswordByMail(UserVO user)throws Throwable;
	public GroupbaomingVO selectGroupbaomingVOByGroupid(int groupid)throws Throwable;
	public void deleteGroupbaomingVOBYgroupid(int groupid)throws Throwable;
	public List<UserVO> showSearchUserVOPage(@Param("page") PageVO<UserVO> page, @Param("keyword") String keyword)throws Throwable;
	public int countUserVOSearch(@Param("keyword") String keyword)throws Throwable;
	public Integer selectGroupidByFirstMemberIdFromGroup(int userid)throws Throwable;
	public Integer selectGroupidBySecondMemberIdFromGroup(int userid)throws Throwable;
	public Integer selectGroupidByThirdMemberIdFromGroup(int userid)throws Throwable;
}
