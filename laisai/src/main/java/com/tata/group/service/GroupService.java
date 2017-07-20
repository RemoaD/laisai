package com.tata.group.service;

import java.util.List;

import com.tata.application.domain.ApplicationVO;
import com.tata.common.page.PageVO;
import com.tata.group.domain.ThreeMan;
import com.tata.group.domain.TwoMan;
import com.tata.group.domain.TwoManId;
import com.tata.user.domain.UserVO;

public interface GroupService {
	public void showOneManPoolBianchengByPage(PageVO<UserVO> page)throws Throwable;//显示单人组队池意向为编程
	public void showOneManPoolXiezuoByPage(PageVO<UserVO> page)throws Throwable;//显示单人组队池意向为写作
	public void showOneManPoolJianmoByPage(PageVO<UserVO> page)throws Throwable;//显示单人组队池意向为建模
	public TwoMan getTwoMan(int groupfirstmemberid, int groupsecondmemberid)throws Throwable;//找出双人组队池用户信息
	public ThreeMan getThreeMan(int groupfirstmemberid, int groupsecondmemberid, int groupthirdmemberid)throws Throwable;//找出三人组队池用户信息
	public void showTwoManPoolBianchengByPage(PageVO<TwoManId> page)throws Throwable;//显示双人组队池
	public void showTwoManPoolXiezuoByPage(PageVO<TwoManId> page)throws Throwable;
	public void showTwoManPoolJianmoByPage(PageVO<TwoManId> page)throws Throwable;
	public List<ThreeMan> showThreeManPoolByPage(PageVO<UserVO> page)throws Throwable;//显示三人组队池
	public void insertApplication(ApplicationVO application)throws Throwable;
	public boolean sendapplication(int firstuserid, int seconduserid, int thirduserid) throws Throwable;//处理发送申请
}
