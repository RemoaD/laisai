package com.tata.group.action;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tata.application.domain.ApplicationVO;
import com.tata.common.page.PageVO;
import com.tata.group.domain.ThegroupVO;
import com.tata.group.domain.TwoManId;
import com.tata.group.service.GroupService;
import com.tata.groupbaoming.domain.GroupbaomingVO;
import com.tata.teacher.domain.TeacherVO;
import com.tata.user.domain.UserVO;
import com.tata.user.service.UserService;

@Controller
@RequestMapping("group")
public class GroupAction {
	@Autowired
	private GroupService groupservice;
	@Autowired
	private UserService userservice;
	
	@RequestMapping("twain.action")
	public String twainGroup(PageVO<TwoManId> page, Model model, HttpSession session, HttpServletRequest request)throws Throwable{
		System.out.println("----------------twain.action--------------");
		String property = request.getParameter("userproperty");
		String pool = request.getParameter("pool");
		System.out.println(property + " " + pool);
		session.setAttribute("property", property);
		session.setAttribute("pool", pool);
		if(property.equals("xiezuo")){
			groupservice.showTwoManPoolXiezuoByPage(page);
		}else if(property.equals("biancheng")){
			groupservice.showTwoManPoolBianchengByPage(page);
		}else{
			groupservice.showTwoManPoolJianmoByPage(page);
		}
		model.addAttribute("page", page);
		return "group/twain";
	}
	
	@RequestMapping("pool.action")     
	public String single(PageVO<UserVO> page, Model model, HttpServletRequest request, HttpSession session)throws Throwable{
		System.out.println("--------------单身池中根据意向选择的action----------");
		String property = request.getParameter("userproperty");
		System.out.println(property);
		String pool = request.getParameter("pool");
		session.setAttribute("property", property);
		session.setAttribute("pool", pool);
		if(property.equals("xiezuo")){
			groupservice.showOneManPoolXiezuoByPage(page);
		}else if(property.equals("biancheng")){
			groupservice.showOneManPoolBianchengByPage(page);
		}else{
			groupservice.showOneManPoolJianmoByPage(page);
		}
		System.out.println(page);
		model.addAttribute("page", page);
		return "group/pool";
	}
	
	@RequestMapping("group.action")
	public String group(HttpSession session) throws Throwable{
		String yibaomingMsg = "";
		UserVO user = (UserVO)session.getAttribute("user");
		int userid = user.getUserid();
		ThegroupVO group = userservice.isexist(userid);
		UserVO user1 = null;
		UserVO user2 = null;
		UserVO user3 = null;
		if(group!= null){
			user1 = userservice.selectUserByUserid(group.getGroupfirstmemberid());
			user2 = userservice.selectUserByUserid(group.getGroupsecondmemberid());
			if(group.getGroupthirdmemberid() != null){
				user3 = userservice.selectUserByUserid(group.getGroupthirdmemberid());
				yibaomingMsg = "(已报名) ";
			}
		}
		session.setAttribute("user1", user1);
		session.setAttribute("user2", user2);
		session.setAttribute("user3", user3);
		if(user3 != null){
			String thegroupid =String.valueOf(group.getGroupid());
			session.setAttribute("thegroupid", thegroupid);
		}
		session.setAttribute("yibaomingMsg", yibaomingMsg);
		List<TeacherVO> teacherList = userservice.listTeacher();
		session.setAttribute("teacherList", teacherList);
		TeacherVO teacher = null;
		if(group != null && group.getGroupteacherid() != null){
			if(userservice.selectgroupteacheridBygroupid(group.getGroupid()) != null){
				int groupteacherid = userservice.selectgroupteacheridBygroupid(group.getGroupid()); 
				teacher = userservice.selectTeacher(groupteacherid);
			}
		}
		session.setAttribute("teacher", teacher);
		return "group/myteam";
	}
	
	@RequestMapping("todouble.action")
	public String todouble(HttpServletRequest request, HttpSession session) throws Throwable{
		int groupfirstmemberid = Integer.valueOf((String)request.getParameter("id1"));
		int groupsecondmemberid = Integer.valueOf((String)request.getParameter("id2"));
		UserVO firstUser = userservice.selectUserByUserid(groupfirstmemberid);
		UserVO secondUser = userservice.selectUserByUserid(groupsecondmemberid);
		session.setAttribute("firstUser", firstUser);
		session.setAttribute("secondUser", secondUser);
		return "group/double";
	}
	
	@RequestMapping("shenqing.action")
	public String shenqing(HttpServletRequest request, HttpSession session) throws Throwable{
		//已经在队伍中了，不给它申请
		if(userservice.isexist(((UserVO)session.getAttribute("user")).getUserid()) != null){
			return "redirect:/group/twain.action?userproperty=jianmo&pool=shuangren";
		}else{
			int firstuserid = Integer.valueOf((String)request.getParameter("firstuserid"));
			int seconduserid = Integer.valueOf((String)request.getParameter("seconduserid"));
			UserVO user = (UserVO)session.getAttribute("user");
			int thirduserid = user.getUserid();
			if(groupservice.sendapplication(firstuserid, seconduserid, thirduserid)){
				Timestamp date = new Timestamp(System.currentTimeMillis());
				ApplicationVO application = new ApplicationVO();
				application.setCreatetime(date);
				application.setFirstmemberid(firstuserid);
				application.setSecondmemberid(seconduserid);
				application.setSendapplicationid(thirduserid);
				groupservice.insertApplication(application);
			}
			return "redirect:/group/twain.action?userproperty=jianmo&pool=shuangren";
		}
	}
	
	@RequestMapping("deletegroup.action")
	public String deletegroup(HttpServletRequest request) throws Throwable{
		int groupfirstmemberid =  Integer.valueOf((String)request.getParameter("groupfirstmemberid"));
		ThegroupVO jieshangroup = userservice.isexist(groupfirstmemberid);
		int groupfirstid = jieshangroup.getGroupfirstmemberid();
		userservice.updateUserisinto0(groupfirstid);
		int groupsecondid = jieshangroup.getGroupsecondmemberid();
		userservice.updateUserisinto0(groupsecondid);
		//是一个三人队伍
		if(jieshangroup.getGroupthirdmemberid() != null){
			int groupthirdid = jieshangroup.getGroupthirdmemberid();
			userservice.updateUserisinto0(groupthirdid);
		}
		//已经选择了老师的队伍
		if(jieshangroup.getGroupteacherid() != null){
			TeacherVO oldteacher = userservice.selectTeacher(jieshangroup.getGroupteacherid());
			oldteacher.setRemainnumber(oldteacher.getRemainnumber() + 1);
			oldteacher.setYidainumber(oldteacher.getYidainumber() - 1);
			userservice.updategroupteacher(oldteacher);
		}
		userservice.deleteGroupByfirstmemberid(groupfirstmemberid);
		//如果在队伍报名表中存在这条记录
		if(userservice.selectGroupbaomingVOByGroupid(jieshangroup.getGroupid()) != null){
			userservice.deleteGroupbaomingVOBYgroupid(jieshangroup.getGroupid());
		}
		return "redirect:/group/group.action";
	}
	
	@RequestMapping(value="selectteacher.action", method = RequestMethod.POST)
	public String selectteacher(HttpServletRequest request) throws Throwable{
		int groupteacherid = Integer.valueOf((String)request.getParameter("groupteacherid"));
		System.out.println(groupteacherid);
		int groupfirstmemberid = Integer.valueOf((String)request.getParameter("groupfirstmemberid"));
		System.out.println("进入selectteacher.action了");
		//小于等于零，不给选
		if(Integer.valueOf(request.getParameter("remainnumber")) <= 0){
			System.out.println("进来小于等于0的地方了");
			return "redirect:/group/group.action";
		}
		//并不是小于等于0
		else{
			ThegroupVO group = userservice.isexist(groupfirstmemberid);
			System.out.println(group);
			//还没有选择老师
			if(group.getGroupteacherid() == null){
				System.out.println("进入到还没有选择老师");
				group.setGroupfirstmemberid(groupfirstmemberid);
				group.setGroupteacherid(groupteacherid);
				userservice.updateGroupteacher(group);
				TeacherVO teacher = userservice.selectTeacher(groupteacherid);
				GroupbaomingVO groupbaoming = new GroupbaomingVO();
				groupbaoming.setGroupid(group.getGroupid());
				groupbaoming.setUserteacher1(teacher.getGroupteachername());
				groupbaoming.setUserteacher2(teacher.getGroupteachername());
				groupbaoming.setUserteacher3(teacher.getGroupteachername());
				userservice.updateGroupbaomingTeacher(groupbaoming);
				teacher.setRemainnumber(teacher.getRemainnumber() - 1);
				teacher.setYidainumber(teacher.getYidainumber() + 1);
				System.out.println("这是新的老师" + teacher);
				userservice.updategroupteacher(teacher);
				return "redirect:/group/group.action";
			}
			//如果已经选择了老师
			else {
				//选择的为同一老师
				if(group.getGroupteacherid() == groupteacherid){
					System.out.println("选择的为同一老师");
					return "redirect:/group/group.action";
				}
				//选择的为不同的老师
				else{
					System.out.println("选择的为不同的老师");
					int groupoldteacherid = group.getGroupteacherid();
					TeacherVO oldteacher = userservice.selectTeacher(groupoldteacherid);//旧的老师
					oldteacher.setRemainnumber(oldteacher.getRemainnumber() + 1);
					oldteacher.setYidainumber(oldteacher.getYidainumber() - 1);
					userservice.updategroupteacher(oldteacher);
					group.setGroupfirstmemberid(groupfirstmemberid);
					group.setGroupteacherid(groupteacherid);
					userservice.updateGroupteacher(group);
					TeacherVO newteacher = userservice.selectTeacher(groupteacherid);
					GroupbaomingVO groupbaoming = new GroupbaomingVO();
					groupbaoming.setGroupid(group.getGroupid());
					groupbaoming.setUserteacher1(newteacher.getGroupteachername());
					groupbaoming.setUserteacher2(newteacher.getGroupteachername());
					groupbaoming.setUserteacher3(newteacher.getGroupteachername());
					userservice.updateGroupbaomingTeacher(groupbaoming);
					newteacher.setRemainnumber(newteacher.getRemainnumber() - 1);
					newteacher.setYidainumber(newteacher.getYidainumber() + 1);
					userservice.updategroupteacher(newteacher);
					return "redirect:/group/group.action";
				}
			}
		}
	}
}















