package com.tata.user.service;

import java.util.List;

import com.tata.application.domain.ApplicationVO;
import com.tata.common.page.PageVO;
import com.tata.competition.domain.CompetitionVO;
import com.tata.gerenbaoming.domain.GerenbaomingVO;
import com.tata.group.domain.ThegroupVO;
import com.tata.groupbaoming.domain.GroupbaomingVO;
import com.tata.invitation.domain.InvitationId;
import com.tata.invitation.domain.InvitationVO;
import com.tata.managermessage.domain.ManagermessageVO;
import com.tata.singleentry.domain.SingleentryVO;
import com.tata.teacher.domain.TeacherVO;
import com.tata.user.domain.UserVO;
import com.tata.usermessage.domain.UsermessageVO;

public interface UserService {
	public void updateUserInfo(UserVO user) throws Throwable;//根据用户输入的个人信息对用户信息进行完善
	public UserVO checkLogin(String email, String password) throws Throwable;//用户登录检测
	public void inviteToGroupById(int userid)throws Throwable;//邀请组队
	public void joinInGroupById(int userid)throws Throwable;//申请组队
	public UserVO showUserMessage(int userid)throws Throwable;//显示用户消息
	public void register(UserVO user)throws Throwable;//用户注册
	public UserVO selectUserByMail(String usermail) throws Throwable ;//根据用户邮箱返回list
	public List<CompetitionVO> listCompetition()throws Throwable;//列出竞赛列表
	public List<ManagermessageVO> listManagerMessage()throws Throwable;//列出管理员通知列表
	public UserVO selectUserByuseridFromSingleEntry(int userid)throws Throwable;//根据用户id查询单人报名比赛里的该用户信息
	public void insertSingleentry(SingleentryVO singleentry)throws Throwable;//插入一条单人比赛的报名信息
	public InvitationVO selectInvitation(InvitationId invitationid)throws Throwable;//查找是否已经发送了邀请
	public void insertInvitation(InvitationVO invitation)throws Throwable;//插入邀请
	public List<UsermessageVO> listUsermessage(int receiveinviteid)throws Throwable;
	public ThegroupVO isexist(int userid)throws Throwable;
	public void deletebysendinviteid(int sendinviteid)throws Throwable;
	public void deletebyreceiveinviteid(int receiveinviteid)throws Throwable;
	public void insertThirdmember(ThegroupVO group)throws Throwable;
	public void insertTwain(ThegroupVO group)throws Throwable;
	public void updateUserisin(int userid)throws Throwable;
	public UserVO selectUserByUserid(int userid)throws Throwable;
	public List<UsermessageVO> listFirstUsermessage(int firstmemberid)throws Throwable;
	public List<UsermessageVO> listSecondUsermessage(int secondmemberid)throws Throwable;
	public List<Integer> checkfirstmemberid(int userid)throws Throwable;
	public List<Integer> checksecondmemberid(int userid) throws Throwable;
	public void updategroupthirdmemberid(ThegroupVO group)throws Throwable;
	public void deletebyuserid(int userid)throws Throwable;
	public void deletebysendapplicationid(int userid)throws Throwable;
	public void deletebyApplication(ApplicationVO application)throws Throwable;
	public void deletebyInvitation(InvitationVO invitation)throws Throwable;
	public List<TeacherVO> listTeacher()throws Throwable;
	public Integer selectgroupteacheridBygroupid(int groupid)throws Throwable;
	public TeacherVO selectTeacher(int groupteacherid)throws Throwable;
	public void deleteGroupByfirstmemberid(int firstmemberid)throws Throwable;
	public void updateGroupteacher(ThegroupVO group)throws Throwable;
	public void updateGroupbaomingTeacher(GroupbaomingVO groupbaoming)throws Throwable;
	public void updateteacher(TeacherVO teacher)throws Throwable;
	public void updategroupteacher(TeacherVO teacher)throws Throwable;
	public CompetitionVO selectCompetition(int competitionid)throws Throwable;
	public void updateUserisinto0(int userid)throws Throwable;
	public void updatePasswordByMail(UserVO user)throws Throwable;
	public void insertGroupBaoming(ThegroupVO group)throws Throwable;
	public GroupbaomingVO selectGroupbaomingVOByGroupid(int groupid)throws Throwable;
	public void deleteGroupbaomingVOBYgroupid(int groupid)throws Throwable;
	public void insertGerenBaoming(GerenbaomingVO gerenbaoming)throws Throwable;
	public void search(PageVO<UserVO> page, String keyword)throws Throwable;
	public boolean updateFirstMemberInfoFromGroupBaoming(UserVO user) throws Throwable;
	public boolean updateSecondMemberInfoFromGroupBaoming(UserVO user) throws Throwable;
	public boolean updateThirdMemberInfoFromGroupBaoming(UserVO user) throws Throwable;
}
