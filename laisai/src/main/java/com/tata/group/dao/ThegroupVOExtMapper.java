package com.tata.group.dao;

import java.util.List;

import com.tata.application.domain.ApplicationVO;
import com.tata.common.page.PageVO;
import com.tata.group.domain.ThreeManId;
import com.tata.group.domain.TwoManId;
import com.tata.user.domain.UserVO;

public interface ThegroupVOExtMapper {
	public List<UserVO> listSingleJianmo(PageVO<UserVO> page)throws Throwable;//列出单人池中有建模意向的成员信息
	public List<UserVO> listSingleBiancheng(PageVO<UserVO> page)throws Throwable;//列出单人池中有编程意向的成员信息
	public List<UserVO> listSingleXiezuo(PageVO<UserVO> page)throws Throwable;//列出单人池中有写作意向的成员信息
	public UserVO selectfirstMemberInfo(int groupfirstmemberid)throws Throwable;//列出第一位成员的信息
	public UserVO selectsecondMemberInfo(int groupsecondmemberid)throws Throwable;//列出第二位成员信息
	public UserVO selectthirdMemberInfo(int groupthridmemberid)throws Throwable;//列出第三位成员信息
	public List<TwoManId> getTwoManIdJianmo(PageVO<TwoManId> page)throws Throwable;//得到包含双人池用户ID的list
	public List<TwoManId> getTwoManIdBiancheng(PageVO<TwoManId> page)throws Throwable;//得到包含双人池用户ID的list
	public List<TwoManId> getTwoManIdXiezuo(PageVO<TwoManId> page)throws Throwable;//得到包含双人池用户ID的list
	public List<ThreeManId> getThreeManId()throws Throwable;//得到包含三人池用户ID的list
	public int countOneManFromJianmo()throws Throwable;//统计单人池中建模人数
	public int countOneManFromBiancheng()throws Throwable;//统计单人池中编程人数
	public int countTwoManFromXiezuo()throws Throwable;
	public int countTwoManFromJianmo()throws Throwable;
	public int countTwoManFromBiancheng()throws Throwable;
	public int countOneManFromXiezuo()throws Throwable;//统计单人池中写作人数
	public void insertApplication(ApplicationVO application)throws Throwable;
}
