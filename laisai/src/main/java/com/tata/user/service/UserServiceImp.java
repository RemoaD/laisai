package com.tata.user.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tata.application.domain.ApplicationVO;
import com.tata.common.page.PageVO;
import com.tata.common.util.MD5Util;
import com.tata.competition.dao.CompetitionVOExtMapper;
import com.tata.competition.domain.CompetitionVO;
import com.tata.gerenbaoming.dao.GerenbaomingVOMapper;
import com.tata.gerenbaoming.domain.GerenbaomingVO;
import com.tata.group.dao.ThegroupVOMapper;
import com.tata.group.domain.ThegroupVO;
import com.tata.groupbaoming.dao.GroupbaomingVOExtMapper;
import com.tata.groupbaoming.dao.GroupbaomingVOMapper;
import com.tata.groupbaoming.domain.GroupbaomingVO;
import com.tata.invitation.domain.InvitationId;
import com.tata.invitation.domain.InvitationVO;
import com.tata.managermessage.domain.ManagermessageVO;
import com.tata.singleentry.domain.SingleentryVO;
import com.tata.teacher.dao.TeacherVOMapper;
import com.tata.teacher.domain.TeacherVO;
import com.tata.user.dao.UserVOExtMapper;
import com.tata.user.dao.UserVOMapper;
import com.tata.user.domain.UserVO;
import com.tata.usermessage.domain.UsermessageVO;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private ThegroupVOMapper thegroupVOMapper;
	@Autowired
	private UserVOMapper mapper; 
	@Autowired
	private UserVOExtMapper extMapper;
	@Autowired 
	private TeacherVOMapper teacherMapper;
	@Autowired
	private CompetitionVOExtMapper competitionVOExtMapper;
	@Autowired
	private TeacherVOMapper teacherVOMapper;
	@Autowired
	private GroupbaomingVOMapper groupbaomingVOMapper;
	@Autowired
	private GerenbaomingVOMapper gerenbaomingVOMapper;
	@Autowired
	private GroupbaomingVOExtMapper groupbaomingVOExtMapper;
	
	@Override
	public void updateUserInfo(UserVO user) throws Throwable {
		mapper.updateByPrimaryKey(user);
	}

	@Override
	public UserVO checkLogin(String email, String password) throws Throwable {
		System.out.println(email);
		UserVO user = extMapper.selectByEmail(email);
		System.out.println(user);
		if(user != null){
			if(user.getUserpassword().equals(MD5Util.md5(password))){
				return user;
			}
		}
		return null;
	}

	@Override
	public void inviteToGroupById(int userid) throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void joinInGroupById(int userid) throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserVO showUserMessage(int userid) throws Throwable {
		UserVO user = mapper.selectByPrimaryKey(userid);
		return user;
	}

	@Transactional(propagation=Propagation.NESTED,rollbackFor=Exception.class)
	@Override
	public void register(UserVO user) throws Throwable {
		user.setUserpassword(MD5Util.md5(user.getUserpassword()));
		extMapper.insertUser(user);
	}

	@Override
	public UserVO selectUserByMail(String usermail) throws Throwable {
		UserVO user = extMapper.selectByEmail(usermail);
		return user;
	}

	@Override
	public List<CompetitionVO> listCompetition() throws Throwable {
		List<CompetitionVO> list = competitionVOExtMapper.list();
		return list;
	}

	@Override
	public List<ManagermessageVO> listManagerMessage() throws Throwable {
		List<ManagermessageVO> list = extMapper.listManagerMessage();
		return list;
	}

	@Override
	public UserVO selectUserByuseridFromSingleEntry(int userid) throws Throwable {
		UserVO user = extMapper.selectUserVOFromSingleEntry(userid);
		return user;
	}

	@Override
	public void insertSingleentry(SingleentryVO singleentry) throws Throwable {
		extMapper.insertSingleentry(singleentry);
	}

	@Override
	public InvitationVO selectInvitation(InvitationId invitationid) throws Throwable {
		InvitationVO invitation = extMapper.selectInvitation(invitationid);
		return invitation;
	}

	@Override
	public void insertInvitation(InvitationVO invitation) throws Throwable {
		extMapper.insertInvitation(invitation);
	}

	@Override
	public List<UsermessageVO> listUsermessage(int receiveinviteid)throws Throwable {
		List<UsermessageVO> usermessageList = new ArrayList<UsermessageVO>();
		List<Integer> sendinviteidList = extMapper.selectSendInviteidByreceiveInviteid(receiveinviteid);
		for(Iterator<Integer> iter = sendinviteidList.iterator(); iter.hasNext();){
			int sendinviteid = iter.next();
			UserVO user = mapper.selectByPrimaryKey(sendinviteid);
			String usertruename = user.getUsertruename();
			String message = usertruename + " 向您发出组队邀请";
			UsermessageVO usermessage = new UsermessageVO();
			usermessage.setMessagecontent(message);
			Timestamp date = new Timestamp(System.currentTimeMillis());
			usermessage.setCreatetime(date);
			usermessage.setSendinviteid(sendinviteid);
			usermessageList.add(usermessage);
		}
		return usermessageList;
	}

	@Override
	public ThegroupVO isexist(int userid) throws Throwable {
		ThegroupVO group = extMapper.isexist(userid);
		return group;
	}

	@Override
	public void deletebysendinviteid(int sendinviteid) throws Throwable {
		extMapper.deletebysendinviteid(sendinviteid);
	}

	@Override
	public void deletebyreceiveinviteid(int receiveinviteid) throws Throwable {
		extMapper.deletebyreceiveinviteid(receiveinviteid);
	}

	@Override
	public void insertThirdmember(ThegroupVO group) throws Throwable {
		extMapper.insertThirdmember(group);
	}

	@Override
	public void insertTwain(ThegroupVO group) throws Throwable {
		extMapper.insertTwain(group);
	}

	@Override
	public void updateUserisin(int userid) throws Throwable {
		extMapper.updateUserisin(userid);
	}

	@Override
	public UserVO selectUserByUserid(int userid) throws Throwable {
		UserVO user = mapper.selectByPrimaryKey(userid);
		return user;
	}

	@Override
	public List<UsermessageVO> listFirstUsermessage(int firstmemberid) throws Throwable {
		List<UsermessageVO> usermessageList = new ArrayList<UsermessageVO>();
		List<Integer> sendapplicationidList = extMapper.selectsendapplicationidByfirstmemberid(firstmemberid);
		for(Iterator<Integer> iter = sendapplicationidList.iterator(); iter.hasNext();){
			int sendapplicationid = iter.next();
			UserVO user = mapper.selectByPrimaryKey(sendapplicationid);
			String usertruename = user.getUsertruename();
			String message = usertruename + " 向您发出入队申请";
			UsermessageVO usermessage = new UsermessageVO();
			usermessage.setMessagecontent(message);
			Timestamp date = new Timestamp(System.currentTimeMillis());
			usermessage.setCreatetime(date);
			usermessage.setSendapplicationid(sendapplicationid);
			usermessage.setBesendapplicationid(firstmemberid);
			usermessageList.add(usermessage);
		}
		return usermessageList;
	}

	@Override
	public List<UsermessageVO> listSecondUsermessage(int secondmemberid) throws Throwable {
		List<UsermessageVO> usermessageList = new ArrayList<UsermessageVO>();
		List<Integer> sendapplicationidList = extMapper.selectsendapplicationidBysecondmemberid(secondmemberid);
		for(Iterator<Integer> iter = sendapplicationidList.iterator(); iter.hasNext();){
			int sendapplicationid = iter.next();
			UserVO user = mapper.selectByPrimaryKey(sendapplicationid);
			String usertruename = user.getUsertruename();
			String message = usertruename + " 向您发出入队申请";
			UsermessageVO usermessage = new UsermessageVO();
			usermessage.setMessagecontent(message);
			Timestamp date = new Timestamp(System.currentTimeMillis());
			usermessage.setCreatetime(date);
			usermessage.setSendapplicationid(sendapplicationid);
			usermessage.setBesendapplicationid(secondmemberid);
			usermessageList.add(usermessage);
		}
		return usermessageList;
	}

	@Override
	public List<Integer> checkfirstmemberid(int userid) throws Throwable {
		List<Integer> firstmemberidList =  extMapper.checkfirstmemberid(userid);
		return firstmemberidList;
	}

	@Override
	public List<Integer> checksecondmemberid(int userid) throws Throwable {
		List<Integer> secondmemberidList =  extMapper.checksecondmemberid(userid);
		return secondmemberidList;
	}

	@Override
	public void updategroupthirdmemberid(ThegroupVO group) throws Throwable {
		extMapper.updategroupthirdmemberid(group);	
	}

	@Override
	public void deletebyuserid(int userid) throws Throwable {
		extMapper.deletebyuserid(userid);
	}

	@Override
	public void deletebysendapplicationid(int userid) throws Throwable {
		extMapper.deletebysendapplicationid(userid);
	}

	@Override
	public void deletebyApplication(ApplicationVO application) throws Throwable {
		extMapper.deletebyApplication(application);
	}

	@Override
	public void deletebyInvitation(InvitationVO invitation) throws Throwable {
		extMapper.deletebyInvitation(invitation);
	}

	@Override
	public List<TeacherVO> listTeacher() throws Throwable {
		List<TeacherVO> list = extMapper.listTeacher();
		return list;
	}

	@Override
	public Integer selectgroupteacheridBygroupid(int groupid) throws Throwable {
		Integer teacherid = extMapper.selectgroupteacheridBygroupid(groupid);
		return teacherid;
	}

	@Override
	public TeacherVO selectTeacher(int groupteacherid) throws Throwable {
		TeacherVO teacher = teacherVOMapper.selectByPrimaryKey(groupteacherid);
		return teacher;
	}

	@Override
	public void deleteGroupByfirstmemberid(int firstmemberid) throws Throwable {
		extMapper.deleteGroupByfirstmemberid(firstmemberid);
	}

	@Override
	public void updateGroupteacher(ThegroupVO group) throws Throwable {
		extMapper.updateGroupteacher(group);
	}

	@Override
	public void updateteacher(TeacherVO teacher) throws Throwable {
		extMapper.updateteacher(teacher);
	}

	@Override
	public CompetitionVO selectCompetition(int competitionid) throws Throwable {
		CompetitionVO competition = extMapper.selectCompetition(competitionid);
		return competition;
	}

	@Override
	public void updategroupteacher(TeacherVO teacher) throws Throwable {
		teacherMapper.updateByPrimaryKey(teacher);
	}

	@Override
	public void updateUserisinto0(int userid) throws Throwable {
		extMapper.updateUserisinto0(userid);
		
	}

	@Override
	public void updatePasswordByMail(UserVO user) throws Throwable {
		extMapper.updatePasswordByMail(user);
	}

	@Override
	public void insertGroupBaoming(ThegroupVO group) throws Throwable {
		GroupbaomingVO groupbaoming = new GroupbaomingVO();
		UserVO user1 = mapper.selectByPrimaryKey(group.getGroupfirstmemberid());
		UserVO user2 = mapper.selectByPrimaryKey(group.getGroupsecondmemberid());
		UserVO user3 = mapper.selectByPrimaryKey(group.getGroupthirdmemberid());
		groupbaoming.setGroupid(group.getGroupid());
		//老师存在
		if(group.getGroupteacherid() != null){
			TeacherVO teacher = teacherMapper.selectByPrimaryKey(group.getGroupteacherid());
			String teachername = teacher.getGroupteachername();
			groupbaoming.setUserteacher1(teachername);
			groupbaoming.setUserteacher2(teachername);
			groupbaoming.setUserteacher3(teachername);
		}
		groupbaoming.setUserdepartment1(user1.getUserdepartment());
		groupbaoming.setUsergrade1(user1.getUsergrade());
		groupbaoming.setUsermajor1(user1.getUsermajor());
		groupbaoming.setUserpinyin1(user1.getUserpinyin());
		groupbaoming.setUserschool1(user1.getUserschool());
		groupbaoming.setUsersex1(user1.getUsersex());
		groupbaoming.setUserstudentnumber1(user1.getUserstudentnumber());
		groupbaoming.setUsertel1(user1.getUsertel());
		groupbaoming.setUsertruename1(user1.getUsertruename());
		groupbaoming.setUserdepartment2(user2.getUserdepartment());
		groupbaoming.setUsergrade2(user2.getUsergrade());
		groupbaoming.setUsermajor2(user2.getUsermajor());
		groupbaoming.setUserpinyin2(user2.getUserpinyin());
		groupbaoming.setUserschool2(user2.getUserschool());
		groupbaoming.setUsersex2(user2.getUsersex());
		groupbaoming.setUserstudentnumber2(user2.getUserstudentnumber());
		groupbaoming.setUsertel2(user2.getUsertel());
		groupbaoming.setUsertruename2(user2.getUsertruename());
		groupbaoming.setUserdepartment3(user3.getUserdepartment());
		groupbaoming.setUsergrade3(user3.getUsergrade());
		groupbaoming.setUsermajor3(user3.getUsermajor());
		groupbaoming.setUserpinyin3(user3.getUserpinyin());
		groupbaoming.setUserschool3(user3.getUserschool());
		groupbaoming.setUsersex3(user3.getUsersex());
		groupbaoming.setUserstudentnumber3(user3.getUserstudentnumber());
		groupbaoming.setUsertel3(user3.getUsertel());
		groupbaoming.setUsertruename3(user3.getUsertruename());
		groupbaomingVOMapper.insert(groupbaoming);
	}

	@Override
	public GroupbaomingVO selectGroupbaomingVOByGroupid(int groupid) throws Throwable {
		GroupbaomingVO groupbaoming = extMapper.selectGroupbaomingVOByGroupid(groupid);
		return groupbaoming;
	}

	@Override
	public void deleteGroupbaomingVOBYgroupid(int groupid) throws Throwable {
		extMapper.deleteGroupbaomingVOBYgroupid(groupid);
	}

	@Override
	public void updateGroupbaomingTeacher(GroupbaomingVO groupbaoming) throws Throwable {
		extMapper.updateGroupbaomingTeacher(groupbaoming);
	}

	@Override
	public void insertGerenBaoming(GerenbaomingVO gerenbaoming) throws Throwable {
		gerenbaomingVOMapper.insert(gerenbaoming);
	}

	@Override
	public void search(PageVO<UserVO> page, String keyword) throws Throwable {
		List<UserVO> list = extMapper.showSearchUserVOPage(page, keyword);
		page.setRecords(list);
		page.setTotalRecord(extMapper.countUserVOSearch(keyword));
	}

	//是组队队伍中的第一个成员，则更新其信息
	@Override
	public boolean updateFirstMemberInfoFromGroupBaoming(UserVO user) throws Throwable {
		System.out.println("进来方法一了");
		Integer groupid = extMapper.selectGroupidByFirstMemberIdFromGroup(user.getUserid());
		if(groupid != null){
			ThegroupVO group = thegroupVOMapper.selectByPrimaryKey(groupid);
			group.setGroupfirsttruename(user.getUsertruename());
			group.setGroupfirstproperty(user.getUserproperty());
			thegroupVOMapper.updateByPrimaryKey(group);
			GroupbaomingVO groupbaoming = groupbaomingVOExtMapper.selectGroupbaomingBygroupid(groupid);
			if(groupbaoming != null){
				groupbaoming.setUsertruename1(user.getUsertruename());
				groupbaoming.setUserpinyin1(user.getUserpinyin());
				groupbaoming.setUserschool1(user.getUserschool());
				groupbaoming.setUserdepartment1(user.getUserdepartment());
				groupbaoming.setUsermajor1(user.getUsermajor());
				groupbaoming.setUsergrade1(user.getUsergrade());
				groupbaoming.setUserstudentnumber1(user.getUserstudentnumber());
				groupbaoming.setUsersex1(user.getUsersex());
				groupbaoming.setUsertel1(user.getUsertel());
				groupbaomingVOMapper.updateByPrimaryKey(groupbaoming);
				return true;
			}
			return false;
		}else{
			return false;
		}
	}

	//是组队队伍中的第二个成员，则更新其信息,true表示修改成功，false表示没有做任何修改，即该用户不是队伍中的第二个成员
	@Override
	public boolean updateSecondMemberInfoFromGroupBaoming(UserVO user) throws Throwable {
		System.out.println("进来方法二了");
		Integer groupid = extMapper.selectGroupidBySecondMemberIdFromGroup(user.getUserid());
		if(groupid != null){
			ThegroupVO group = thegroupVOMapper.selectByPrimaryKey(groupid);
			group.setGroupsecondtruename(user.getUsertruename());
			group.setGroupsecondproperty(user.getUserproperty());
			thegroupVOMapper.updateByPrimaryKey(group);
			GroupbaomingVO groupbaoming = groupbaomingVOExtMapper.selectGroupbaomingBygroupid(groupid);
			if(groupbaoming != null){
				groupbaoming.setUsertruename2(user.getUsertruename());
				groupbaoming.setUserpinyin2(user.getUserpinyin());
				groupbaoming.setUserschool2(user.getUserschool());
				groupbaoming.setUserdepartment2(user.getUserdepartment());
				groupbaoming.setUsermajor2(user.getUsermajor());
				groupbaoming.setUsergrade2(user.getUsergrade());
				groupbaoming.setUserstudentnumber2(user.getUserstudentnumber());
				groupbaoming.setUsersex2(user.getUsersex());
				groupbaoming.setUsertel2(user.getUsertel());
				groupbaomingVOMapper.updateByPrimaryKey(groupbaoming);
				return true;
			}
			return false;
		}else{
			return false;
		}
	}

	//是组队队伍中的第三个成员，则更新其信息
	@Override
	public boolean updateThirdMemberInfoFromGroupBaoming(UserVO user) throws Throwable {
		System.out.println("进来方法三了");
		Integer groupid = extMapper.selectGroupidByThirdMemberIdFromGroup(user.getUserid());
		if(groupid != null){
			ThegroupVO group = thegroupVOMapper.selectByPrimaryKey(groupid);
			group.setGroupthirdtruename(user.getUsertruename());
			group.setGroupthirdproperty(user.getUserproperty());
			thegroupVOMapper.updateByPrimaryKey(group);
			GroupbaomingVO groupbaoming = groupbaomingVOExtMapper.selectGroupbaomingBygroupid(groupid);
			if(groupbaoming != null){
				groupbaoming.setUsertruename3(user.getUsertruename());
				groupbaoming.setUserpinyin3(user.getUserpinyin());
				groupbaoming.setUserschool3(user.getUserschool());
				groupbaoming.setUserdepartment3(user.getUserdepartment());
				groupbaoming.setUsermajor3(user.getUsermajor());
				groupbaoming.setUsergrade3(user.getUsergrade());
				groupbaoming.setUserstudentnumber3(user.getUserstudentnumber());
				groupbaoming.setUsersex3(user.getUsersex());
				groupbaoming.setUsertel3(user.getUsertel());
				groupbaomingVOMapper.updateByPrimaryKey(groupbaoming);
				return true;
			}
			return false;
		}else{
			return false;
		}
	}
}
