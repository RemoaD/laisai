package com.tata.user.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.tata.application.domain.ApplicationVO;
import com.tata.common.page.PageVO;
import com.tata.common.util.EmailUtil;
import com.tata.common.util.MD5Util;
import com.tata.competition.domain.CompetitionVO;
import com.tata.gerenbaoming.domain.GerenbaomingVO;
import com.tata.group.domain.ThegroupVO;
import com.tata.invitation.domain.InvitationId;
import com.tata.invitation.domain.InvitationVO;
import com.tata.managermessage.domain.ManagermessageVO;
import com.tata.singleentry.domain.SingleentryVO;
import com.tata.user.domain.ChangePasswordValidate;
import com.tata.user.domain.ForgetValidate;
import com.tata.user.domain.UserInfoValidate;
import com.tata.user.domain.UserVO;
import com.tata.user.domain.UserValidate;
import com.tata.user.service.UserService;
import com.tata.usermessage.domain.UsermessageVO;

@Controller
@RequestMapping("/user")
public class UserAction {
	@Autowired
	private UserService service;

	@Test
	@RequestMapping("toregister.action")
	public String toRegister(HttpSession session){
		long time = new Date().getTime();
		session.setAttribute("time", time);
		return "user/register";
	}
	
	@RequestMapping(value="doregister.action", method=RequestMethod.POST)
	public String register(@Valid @ModelAttribute("registerModel") UserValidate validate, BindingResult result, Model model, HttpSession session, HttpServletRequest request)throws Throwable{
		UserVO user = new UserVO();
		System.out.println("----------------进入到完成注册操作的doregister.action了------------");
		session.setAttribute("validate", validate);
		String emailCode = request.getParameter("mailyanzhengma");
		session.setAttribute("emailCode", emailCode);
		if(result.hasErrors()){
			return "user/register";
		}else{
			String password = validate.getUserpassword();
			String checkPassword = validate.getCheckpassword();
			if(password.equals(checkPassword)){
				user.setUserpassword(password);
				model.addAttribute("passwordNotMatch", null);
			}else{
				model.addAttribute("passwordNotMatch", "两次密码输入不匹配");
				return "user/register";
			}
			String yanzhengma = validate.getYanzhengma().toLowerCase();
			String checkYanzhengma = (String)session.getAttribute("checkYanzhengma");
			if(yanzhengma.equals(checkYanzhengma)){
				model.addAttribute("yanzhengmaNotMatch", null);
			}else{
				model.addAttribute("yanzhengmaNotMatch", "验证码输入错误");
				return "user/register";
			}
			String message = null;
			//Calendar now=Calendar.getInstance();
			//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//String nowtime=sdf.format(now.getTimeInMillis());
			long nowtime = new Date().getTime();
			long time =(long)session.getAttribute("time");
			String code_ =(String)session.getAttribute("code");
			System.out.println(code_);
			UserVO users = service.selectUserByMail(validate.getUsermail());
			if(users!=null){
				message = "该邮箱已被注册";
				model.addAttribute("message", message);
				return "user/register";
			}
			if(nowtime - time > 3000 * 60 || validate.getMailyanzhengma().compareTo(code_)!=0){
				message = "注册码错误或者过时！";
				model.addAttribute("message", message);
				return "user/register";
			}
			else message = "";
			user.setUsermail(validate.getUsermail());
			user.setUserisin(0);
			service.register(user);
			model.addAttribute("message", message);
			session.setAttribute("validate", null);
			return "redirect:/user/login.action";
		}
	}
	
	@RequestMapping(value="getCode.action",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody List<String> getCode(String usermail, HttpServletRequest request, HttpSession session){
		String message = "已发送";
		System.out.println("----"+usermail);
		Calendar now=Calendar.getInstance();
		now.add(Calendar.MINUTE,5);
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//String dateStr=sdf.format(now.getTimeInMillis());
		long time = new Date().getTime();
		session.setAttribute("time", time);
		System.out.println(time);
		String str = "";
		str += (int)(Math.random()*9+1);
		for(int i = 0; i < 5; i++){
			str += (int)(Math.random()*10);
		}
		session.setAttribute("code", str);
		System.out.println(usermail);
		EmailUtil.send(usermail, str);
		List<String> list= new ArrayList<String>();
		list.add(message);
		return list;
	}
	@RequestMapping("login.action")
	public String login(HttpSession session){
		long time = new Date().getTime();
		session.setAttribute("time", time);
		return "user/login";
	}
	
	@RequestMapping("checklogin.action")
	public String checkLogin(String usermail, String userpassword, HttpSession session, Model model)throws Throwable{
		UserVO user = service.checkLogin(usermail, userpassword);
		if(user != null){
			session.setAttribute("user", user);
			if(user.getUsertruename() != null){
				session.setAttribute("property", "jianmo");
				//return "redirect:/group/tosingle.action?userproperty=jianmo";
				return "redirect:/user/person.action";
			}
			return "redirect:/user/userinfo.action";
		}else{
			model.addAttribute("msg", "邮箱或密码错误");
			return "user/login";
		}
	}
	
	@RequestMapping(value="/loginlang.action", method=RequestMethod.GET)
	public String loginLang(String locale,HttpSession session){
		Locale lo = null;
		if("zh".equals(locale)){
			lo = new Locale("zh", "CN");
		}else{
			lo = new Locale("en", "US");
		}
		session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, lo);
		return "user/login";
	}
	
	@RequestMapping(value="/registerlang.action", method=RequestMethod.GET)
	public String registerLang(String locale,HttpSession session){
		Locale lo = null;
		if("zh".equals(locale)){
			lo = new Locale("zh", "CN");
		}else{
			lo = new Locale("en", "US");
		}
		session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, lo);
		return "user/register";
	}
	
	@RequestMapping("changeyzm.action")
	public void demo(HttpSession session, HttpServletResponse response, HttpServletRequest request) throws Throwable{
		String check_code="";
		int width = 110;
		int height = 35;
		//1. 创建一章内存中缓冲图片
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//2. 背景色
		Graphics graphics = bufferedImage.getGraphics();
		//设置颜色
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, width, height);
		//3.边框
		graphics.setColor(Color.BLUE);
		graphics.drawRect(0, 0, width-1, height-1);
		//4.写验证码的内容
		Graphics2D graphics2d = (Graphics2D) graphics;
		String content = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		//设置字体
		graphics2d.setFont(new Font("Arial", Font.BOLD, 20));
		Random random = new Random();
		int x = 10;
		int y = 20;
		for(int i=0;i<4;i++){
			//为字生成旋转角度 -30---30
			int jiaodu = random.nextInt(60)-30;
			double theta = jiaodu / 360.0 * 2 * Math.PI;
			int index = random.nextInt(content.length());
			Color c = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
			graphics.setColor(c);
			char letter = content.charAt(index);
			check_code=check_code+letter;
			graphics2d.rotate(theta,x,y);
			graphics2d.drawString(""+letter, x, y);
			//将角度还原
			graphics2d.rotate(-theta,x,y);
			x+=20;
			
		}
		graphics2d.setColor(Color.LIGHT_GRAY);
		for(int i=0;i<10;i++){
			Color c = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
			graphics2d.setColor(c);
			graphics2d.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
		}
		check_code=check_code.toLowerCase();
		session.setAttribute("checkYanzhengma",check_code);
		ImageIO.write(bufferedImage, "jpg",response.getOutputStream());
	}
	
	@RequestMapping("register.action")
	public String register(){
		return "user/register";
	}

	@RequestMapping("userinfo.action")
	public String updateUserInfo(HttpSession session){
		System.out.println("-----------进入到修改用户信息的action了-------------");
		UserVO user = (UserVO)session.getAttribute("user");
		session.setAttribute("userInfoValidate", user);
		return "user/userinfo";
	}
	
	@RequestMapping("doupdateuser.action")
	public String doupdateUser(@Valid @ModelAttribute("userInfoModel") UserInfoValidate userInfoValidate, BindingResult result, Model model, @ModelAttribute("file") MultipartFile file, HttpSession session, HttpServletRequest request) throws Throwable{
		UserVO user = (UserVO)session.getAttribute("user");
		System.out.println(user);
		session.setAttribute("userInfoValidate", userInfoValidate);
		String uploadMessage = null;
		if(result.hasErrors()){
			return "user/userinfo";
		}else{
			if(userInfoValidate.getUserintroduce().equals("".toString())){
				model.addAttribute("textareaMess", "个人简介不能为空");
				return "user/userinfo";
			}else{
				model.addAttribute("textareaMess", null);
				String orginName = file.getOriginalFilename();
				String saveName = "";
				String path = "";
				//文件上传为空
				if(orginName.equals("")){
					saveName = "default.jpg";
				}
				//文件上传不为空
				else{
					String type = orginName.indexOf('.') != -1 ? orginName.substring(orginName.lastIndexOf('.'), orginName.length()) : null;
					if(type!= null){
						type = type.toLowerCase();
					}
					if(type.equals(".jpg") || type.equals(".png") || type.equals(".gif") || type.equals(".bmp")){
						saveName = UUID.randomUUID().toString() + orginName.substring(orginName.lastIndexOf('.'));
						Properties prop = new Properties();
				        InputStream is = UserAction.class.getClassLoader().getResourceAsStream("/LinuxImagePath.properties");
				        prop.load(is);  
				        is.close();  
						path = prop.getProperty("ImagePath");
						file.transferTo(new File(path + saveName));
					}
					else{
						uploadMessage = "亲,头像仅支持jpg png gif bmp等格式上传噢";
						model.addAttribute("uploadMessage", uploadMessage);
						return "user/userinfo";
					}
				}
				user.setUsertruename(userInfoValidate.getUsertruename());
				user.setUserpinyin(userInfoValidate.getUserpinyin());
				user.setUserschool(userInfoValidate.getUserschool());
				user.setUserdepartment(userInfoValidate.getUserdepartment());
				user.setUsermajor(userInfoValidate.getUsermajor());
				user.setUsergrade(userInfoValidate.getUsergrade());
				user.setUserstudentnumber(userInfoValidate.getUserstudentnumber());
				user.setUsersex(userInfoValidate.getUsersex());
				user.setUsertel(userInfoValidate.getUsertel());
				user.setUserheadimg(saveName);
				user.setUserproperty(userInfoValidate.getUserproperty());
				user.setUserintroduce(userInfoValidate.getUserintroduce());
				Timestamp date = new Timestamp(System.currentTimeMillis());
				user.setCreatetime(date);
				//如果用户已经在队伍里了或者已经报名了单人比赛了然后想修改个人信息
				if(user.getUserisin() != null){
					if(user.getUserisin() == 1){
						boolean flag = service.updateFirstMemberInfoFromGroupBaoming(user);
						if(flag == false){
							flag = service.updateSecondMemberInfoFromGroupBaoming(user);
							if(flag == false){
								service.updateThirdMemberInfoFromGroupBaoming(user);
							}
						}
					}
				}else{
					user.setUserisin(0);
				}
				user.setUserprize("无");
				service.updateUserInfo(user);
				session.setAttribute("user", user);
				return "redirect:/user/person.action";
			}
		}
	}
	
	@RequestMapping("index.action")
	public String index(){
		return "index";
	}
	
	@RequestMapping("checkgeren.action")
	public String checkgeren(HttpSession session){
		if(((UserVO)session.getAttribute("user")).getUsertruename() != null){
			return "redirect:/user/person.action";
		}else{
			return "redirect:/user/userinfo.action";
		}
	}
	
	@RequestMapping("checkzutuan.action")
	public String checkzutuan(HttpSession session){
		if(((UserVO)session.getAttribute("user")).getUsertruename() != null){
			session.setAttribute("property", "jianmo");
			session.setAttribute("pool", "danren");
			return "redirect:/group/pool.action?userproperty=jianmo&pool=danren";
		}else{
			return "redirect:/user/userinfo.action";
		}
	}
	
	@RequestMapping("checkxunsai.action")
	public String checkxunsai(HttpSession session){
		if(((UserVO)session.getAttribute("user")).getUsertruename() == null){
			return "redirect:/user/userinfo.action";
		}else{
			return "redirect:/user/competition.action";
		}
	}
	
	@RequestMapping("checkduiwu.action")
	public String checkduiwu(HttpSession session){
		if(((UserVO)session.getAttribute("user")).getUsertruename() == null){
			return "redirect:/user/userinfo.action";
		}else{
			
			return "redirect:/group/group.action";
		}
	}
	
	@RequestMapping("logout.action")
	public String logout(HttpSession session){
		session.removeAttribute("user");
		session.removeAttribute("baominggerenbisai");
		session.removeAttribute("forgetvalidate");
		session.removeAttribute("thegroupid");
		return "redirect:/user/login.action";
	}
	
	@RequestMapping("checktongzhi.action")
	public String checktongzhi(HttpSession session){
		if(((UserVO)session.getAttribute("user")).getUsertruename() == null){
			return "redirect:/user/userinfo.action";
		}else{
			return "redirect:/user/inform.action";
		}
	}
	
	@RequestMapping("person.action")
	public String person(){
		return "user/person";
	}
	
	@RequestMapping("changepassword.action")
	public String changepassword(){
		return "user/changepassword";
	}
	
	@RequestMapping("dochangepassword.action")
	public String dochangepassword(@Valid @ModelAttribute("passwordModel") ChangePasswordValidate changePasswordValidate, BindingResult result, Model model, HttpSession session) throws Throwable{
		UserVO user = (UserVO)session.getAttribute("user");
		model.addAttribute("changePasswordValidate", changePasswordValidate);
		if(result.hasErrors()){
			return "user/changepassword";
		}else{
			if(!(changePasswordValidate.getNewpassword().equals(changePasswordValidate.getCheckpassword()))){
				model.addAttribute("passwordMess", "两次密码输入不匹配");
				return "user/changepassword";
			}else{
				model.addAttribute("passwordMess", null);
				if(!(((UserVO)session.getAttribute("user")).getUserpassword().equals(MD5Util.md5(changePasswordValidate.getOldpassword())))){
					model.addAttribute("passwordMess", "旧密码输入错误");
					return "user/changepassword";
				}else{
					model.addAttribute("passwordMess", null);
					model.addAttribute("ChangePasswordValidate", null);
					user.setUserpassword(MD5Util.md5(changePasswordValidate.getNewpassword()));
					service.updateUserInfo(user);
					session.setAttribute("user", user);
					session.setAttribute("property", "jiammo");
					session.setAttribute("pool", "daren");
					return "redirect:/user/person.action";
				}
			}
		}
	}
	
	@RequestMapping("competition.action")
	public String competition(Model model, HttpSession session) throws Throwable{
		UserVO user = (UserVO)session.getAttribute("user");
		int userid = user.getUserid();
		if(service.selectUserByuseridFromSingleEntry(userid) != null){
			session.setAttribute("baominggerenbisai", "恭喜您，您已经成功报名了该比赛");
		}
		List<CompetitionVO> competitionList = service.listCompetition();
		model.addAttribute("competitionList", competitionList);
		return "user/competition";
	}
	
	@RequestMapping("inform.action")
	public String tongzhi(HttpSession session) throws Throwable{
		List<ManagermessageVO> managermessageList = service.listManagerMessage();
		List<UsermessageVO> usermessageList = service.listUsermessage(((UserVO)session.getAttribute("user")).getUserid());
		List<UsermessageVO> usermessageList2;
		if(service.checkfirstmemberid(((UserVO)session.getAttribute("user")).getUserid()) != null){
			usermessageList2 = service.listFirstUsermessage(((UserVO)session.getAttribute("user")).getUserid());
		}else if(service.checksecondmemberid(((UserVO)session.getAttribute("user")).getUserid()) != null){
			usermessageList2 = service.listSecondUsermessage(((UserVO)session.getAttribute("user")).getUserid());
		}else{
			usermessageList2 = null;
		}
		session.setAttribute("managermessageList", managermessageList);
		session.setAttribute("usermessageList", usermessageList);
		session.setAttribute("usermessageList2", usermessageList2);
		return "user/inform";
	}
	
	@RequestMapping("look.action")
	public String look(HttpServletRequest request, HttpSession session) throws Throwable{
		int userid = Integer.valueOf(request.getParameter("userid"));
		session.setAttribute("property", request.getParameter("userproperty"));
		session.setAttribute("pool", request.getParameter("pool"));
		UserVO lookuser = service.showUserMessage(userid);
		request.setAttribute("lookuser", lookuser);
		return "group/single";
	}
	
	@RequestMapping("gerenbaoming.action")
	public String gerenbaoming(HttpSession session, HttpServletRequest request) throws Throwable{
		UserVO user = (UserVO)session.getAttribute("user");
		int userid = user.getUserid();
		int competitionid = Integer.valueOf(request.getParameter("competitionid"));
		Timestamp date = new Timestamp(System.currentTimeMillis());
		session.setAttribute("baominggerenbisai", "恭喜您，您已经成功报名了该比赛");
		//判断是否已经报名,根据userid查看报名的比赛
		if(service.selectUserByuseridFromSingleEntry(userid) != null){
			return "redirect:/user/checkxunsai.action";
		}else{
			SingleentryVO singleentry = new SingleentryVO();
			singleentry.setCreatetime(date);
			singleentry.setCompetitionid(competitionid);
			singleentry.setUserid(userid);
			service.insertSingleentry(singleentry);
			GerenbaomingVO gerenbaoming = new GerenbaomingVO();
			gerenbaoming.setUsertruename(user.getUsertruename());
			gerenbaoming.setUserpinyin(user.getUserpinyin());
			gerenbaoming.setUserschool(user.getUserschool());
			gerenbaoming.setUserdepartment(user.getUserdepartment());
			gerenbaoming.setUsermajor(user.getUsermajor());
			gerenbaoming.setUsergrade(user.getUsergrade());
			gerenbaoming.setUserstudentnumber(user.getUserstudentnumber());
			gerenbaoming.setUsersex(user.getUsersex());
			gerenbaoming.setUsertel(user.getUsertel());
			service.insertGerenBaoming(gerenbaoming);
			return "redirect:/user/checkxunsai.action";
		}
	}
	
	//发出邀请
	@RequestMapping("invite.action")
	public String invite(HttpSession session, HttpServletRequest request) throws Throwable{
		int sendinviteid = ((UserVO)session.getAttribute("user")).getUserid();//发送邀请的用户id
		int receiveinviteid = Integer.valueOf(request.getParameter("userid"));//接受邀请的用户id
		//同一个人邀请自己，直接返回
		if(sendinviteid == receiveinviteid){
			return "redirect:/user/checkzutuan.action";
		}
		InvitationId invitationid = new InvitationId();
		invitationid.setReceiveinviteid(receiveinviteid);
		invitationid.setSendinviteid(sendinviteid);
		//该邀请已经发过了
		if(service.selectInvitation(invitationid) != null){
			return "redirect:/user/checkzutuan.action";
		}
		//该邀请没有发过
		else{
			Timestamp date = new Timestamp(System.currentTimeMillis());
			//如果发邀请的人已经在队伍里了
			if(service.isexist(sendinviteid) != null){
				//如果被邀请的人不在队伍里且发邀请的人的队伍只有两个人，发送成功
				ThegroupVO group = service.isexist(sendinviteid);
				if(service.isexist(receiveinviteid) == null && group.getGroupthirdmemberid() == null){
					InvitationVO invitation = new InvitationVO();
					invitation.setCreatetime(date);
					invitation.setReceiveinviteid(receiveinviteid);
					invitation.setSendinviteid(sendinviteid);
					service.insertInvitation(invitation);
					return "redirect:/user/checkzutuan.action";
				}
				//如果被邀请的人不在队伍里且发邀请的队伍满人了
				else if(service.isexist(receiveinviteid) == null && group.getGroupthirdmemberid() != null){
					service.deletebysendinviteid(sendinviteid);
					return "redirect:/user/checkzutuan.action";
				}
				//被邀请的人在队伍里且发邀请的队伍满人了
				else if(service.isexist(receiveinviteid) != null && group.getGroupthirdmemberid() != null){
					service.deletebyreceiveinviteid(receiveinviteid);
					service.deletebysendinviteid(sendinviteid);
					return "redirect:/user/checkzutuan.action";
				}
				//被邀请的人在队伍里且发邀请的队伍不满人
				else{
					service.deletebyreceiveinviteid(receiveinviteid);
					return "redirect:/user/checkzutuan.action";
				}
			}
			//如果发邀请的人不在队伍里了
			else{
				//重复发送邀请
				if(service.selectInvitation(invitationid) != null){
					return "redirect:/user/checkzutuan.action";
				}else{
					InvitationVO invitation = new InvitationVO();
					invitation.setCreatetime(date);
					invitation.setReceiveinviteid(receiveinviteid);
					invitation.setSendinviteid(sendinviteid);
					service.insertInvitation(invitation);
					return "redirect:/user/checkzutuan.action";
				}
			}
		}
	}
	
	@RequestMapping("accept.action")
	public String accept(HttpServletRequest request, HttpSession session) throws Throwable{
		int sendinviteid = Integer.valueOf(request.getParameter("sendinviteid"));
		int receiveinviteid = ((UserVO)session.getAttribute("user")).getUserid();
		//二者都已经存在于队伍中了
		if(service.isexist(sendinviteid) != null && service.isexist(receiveinviteid) != null){
			service.deletebyreceiveinviteid(receiveinviteid);
			service.deletebysendinviteid(sendinviteid);
			return "redirect:/user/inform.action";
		}
		//发通知的在队伍中了，接收通知的不在队伍中(包含两种情况)
		else if(service.isexist(sendinviteid) != null && service.isexist(receiveinviteid) == null){
			ThegroupVO group = service.isexist(sendinviteid);
			//如果第三位成员的位置为空，则插入
			if(group.getGroupthirdmemberid() == null){
				group.setGroupthirdmemberid(receiveinviteid);
				String userturename = ((UserVO)session.getAttribute("user")).getUsertruename();
				String userproperty = ((UserVO)session.getAttribute("user")).getUserproperty();
				group.setGroupthirdproperty(userproperty);
				group.setGroupthirdtruename(userturename);
				service.insertThirdmember(group);
				service.insertGroupBaoming(group);
				service.updateUserisin(sendinviteid);
				service.updateUserisin(receiveinviteid);
				service.deletebyreceiveinviteid(receiveinviteid);
				UserVO user = (UserVO)session.getAttribute("user");
				user.setUserisin(1);
				session.setAttribute("user", user);
				return "redirect:/user/checkduiwu.action";
			}
			//如果第三位成员的位置不为空，则说明队伍已经满员，可以删除这位发通知的成员所发出的邀请通知了
			else{
				service.deletebysendinviteid(sendinviteid);
				return "redirect:/user/inform.action";
			}
		}
		//发通知的不在队伍中了，接收通知的已经在队伍中
		else if(service.isexist(sendinviteid) == null && service.isexist(receiveinviteid) != null){
			service.deletebyreceiveinviteid(receiveinviteid);
			return "redirect:/user/inform.action";
		}
		//二者都不在队伍中
		else{
			ThegroupVO group = new ThegroupVO();
			Timestamp date = new Timestamp(System.currentTimeMillis());
			group.setCreatetime(date);
			group.setGroupfirstmemberid(sendinviteid);
			String groupsecondtruename = ((UserVO)session.getAttribute("user")).getUsertruename();
			String groupsecondproperty = ((UserVO)session.getAttribute("user")).getUserproperty();
			group.setGroupsecondmemberid(receiveinviteid);
			group.setGroupsecondproperty(groupsecondproperty);
			group.setGroupsecondtruename(groupsecondtruename);
			UserVO firstUser = service.selectUserByUserid(sendinviteid);
			group.setGroupfirsttruename(firstUser.getUsertruename());
			group.setGroupfirstproperty(firstUser.getUserproperty());
			service.insertTwain(group);
			service.deletebyreceiveinviteid(receiveinviteid);
			service.deletebysendinviteid(sendinviteid);
			service.updateUserisin(receiveinviteid);
			service.updateUserisin(sendinviteid);
			UserVO user = (UserVO)session.getAttribute("user");
			user.setUserisin(1);
			session.setAttribute("user", user);
			return "redirect:/user/checkduiwu.action";
		}
	}
	
	@RequestMapping("acceptshenqing.action")
	public String acceptshenqing(HttpSession session, HttpServletRequest request) throws Throwable{
		int sendapplicationid = Integer.valueOf(request.getParameter("sendapplicationid"));
		int userid = ((UserVO)session.getAttribute("user")).getUserid();
		//当我在队伍里而申请者不在(包含两种情况，一为第三个位置为空，插入进来，二为第三个位置不为空，删除此条信息)
		if(service.isexist(userid) != null && service.isexist(sendapplicationid) == null){
			ThegroupVO group = service.isexist(userid);
			if(group.getGroupthirdmemberid() == null){
				group.setGroupthirdmemberid(sendapplicationid);
				service.updateUserisin(sendapplicationid);
				service.insertGroupBaoming(group);
				service.updategroupthirdmemberid(group);
				service.deletebyuserid(userid);
				service.deletebysendapplicationid(sendapplicationid);
				return "redirect:/user/checkduiwu.action";
			}else{
				service.deletebyuserid(userid);
				return "redirect:/user/inform.action";
			}
		}
		//当我不在队伍里，直接删除
		else if(service.isexist(userid) == null){
			service.deletebyuserid(userid);
			return "redirect:/user/inform.action";
		}
		//当我在队伍里，申请者也在队伍里，直接删除。
		else{
			service.deletebyuserid(userid);
			service.deletebysendapplicationid(sendapplicationid);
			return "redirect:/user/inform.action";
		}
	}
	
	@RequestMapping("deleteshenqing.action")
	public String deleteshenqing(HttpSession session, HttpServletRequest request) throws Throwable{
		int sendapplicationid = Integer.valueOf(request.getParameter("sendapplicationid"));
		int userid = ((UserVO)session.getAttribute("user")).getUserid();
		ApplicationVO application = new ApplicationVO();
		application.setSendapplicationid(sendapplicationid);
		application.setFirstmemberid(userid);
		service.deletebyApplication(application);
		return "redirect:/user/inform.action";
	}
	
	@RequestMapping("deleteinvite.action")
	public String deleteinvite(HttpSession session, HttpServletRequest request) throws Throwable{
		int sendinviteid = Integer.valueOf(request.getParameter("sendinviteid"));
		int userid = ((UserVO)session.getAttribute("user")).getUserid();
		InvitationVO invitation = new InvitationVO();
		invitation.setReceiveinviteid(userid);
		invitation.setSendinviteid(sendinviteid);
		service.deletebyInvitation(invitation);
		return "redirect:/user/inform.action";
	}
	
	@RequestMapping("toonegame.action")
	public String toonegame(HttpSession session, HttpServletRequest request) throws Throwable{
		int competitionid = Integer.valueOf(request.getParameter("competitionid"));
		CompetitionVO lookcompetition = service.selectCompetition(competitionid);
		session.setAttribute("lookcompetition", lookcompetition);
		return "user/onegame";
	}
	
	@RequestMapping("forgetpassword.action")
	public String forgetpassword(){
		return "user/forget";
	}
	
	@RequestMapping(value="/resetlang.action", method=RequestMethod.GET)
	public String resetlang(String locale,HttpSession session){
		Locale lo = null;
		if("zh".equals(locale)){
			lo = new Locale("zh", "CN");
		}else{
			lo = new Locale("en", "US");
		}
		session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, lo);
		return "user/forget";
	}
	
	@RequestMapping(value="doforgetpassword.action",method=RequestMethod.POST)
	public String register(@Valid @ModelAttribute("forgetModel") ForgetValidate validate, BindingResult result, Model model, HttpSession session, HttpServletRequest request)throws Throwable{
		UserVO user = new UserVO();
		System.out.println("----------------进入到密码重置操作的doregister.action了------------");
		session.setAttribute("forgetvalidate", validate);
		String emailCode = request.getParameter("mailyanzhengma");
		session.setAttribute("emailCode", emailCode);
		if(result.hasErrors()){
			return "user/forget";
		}else{
			String password = validate.getUserpassword();
			String checkPassword = validate.getCheckpassword();
			if(password.equals(checkPassword)){
				user.setUserpassword(password);
				model.addAttribute("passwordNotMatch", null);
			}else{
				model.addAttribute("passwordNotMatch", "两次密码输入不匹配");
				return "user/forget";
			}
			String message = null;
			long nowtime = new Date().getTime();
			long time =(long)session.getAttribute("time");
			String code_ =(String)session.getAttribute("code");
			UserVO users = service.selectUserByMail(validate.getUsermail());
			if(nowtime - time > 3000 * 60 || validate.getMailyanzhengma().compareTo(code_)!=0){
				message = "注册码错误或者过时！";
				model.addAttribute("message", message);
				return "user/forget";
			}
			else{
				message = "";
			}
			//已经注册了
			if(users!=null){
				System.out.println("原密码为：" + users.getUserpassword());
				users.setUserpassword(MD5Util.md5(password));
				System.out.println("新密码为：" + users.getUserpassword());
				service.updatePasswordByMail(users);
				model.addAttribute("message", message);
				model.addAttribute("validate", null);
				return "redirect:/user/login.action";
			}
			//还没有注册
			else{
				message="该邮箱用户还未注册，请先注册！";
				model.addAttribute("message", message);
				return "user/forget";
			}
		}
	}
	
	@RequestMapping("dosearch.action")
	public String dosearch(PageVO<UserVO> page, HttpServletRequest request,Model model, HttpSession session) throws Throwable{
		String keyword = request.getParameter("keyword");
		service.search(page, keyword);
		model.addAttribute("page", page);
		session.setAttribute("poolkeyword", keyword);
		return "user/search";
	}

}




















