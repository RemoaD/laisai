package com.tata.group.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tata.application.dao.ApplicationVOExtMapper;
import com.tata.application.domain.ApplicationVO;
import com.tata.common.page.PageVO;
import com.tata.group.dao.ThegroupVOExtMapper;
import com.tata.group.domain.ThreeMan;
import com.tata.group.domain.ThreeManId;
import com.tata.group.domain.TwoMan;
import com.tata.group.domain.TwoManId;
import com.tata.user.domain.UserVO;

@Service
public class GroupServiceImp implements GroupService{
	@Autowired
	private ThegroupVOExtMapper groupextMapper;
	@Autowired 
	private ApplicationVOExtMapper applicationVOExtMapper;	

	@Override
	public TwoMan getTwoMan(int groupfirstmemberid, int groupsecondmemberid) throws Throwable {
		TwoMan twoMan = new TwoMan();
		System.out.println(groupextMapper.selectfirstMemberInfo(groupfirstmemberid));
		System.out.println(groupextMapper.selectsecondMemberInfo(groupsecondmemberid));
		twoMan.setUser1(groupextMapper.selectfirstMemberInfo(groupfirstmemberid));
		twoMan.setUser2(groupextMapper.selectsecondMemberInfo(groupsecondmemberid));
		return twoMan;
	}

	@Override
	public void showOneManPoolBianchengByPage(PageVO<UserVO> page) throws Throwable {
		List<UserVO> singleUserList = groupextMapper.listSingleBiancheng(page);
		page.setRecords(singleUserList);
		page.setTotalRecord(groupextMapper.countOneManFromBiancheng());
	}

	@Override
	public ThreeMan getThreeMan(int groupfirstmemberid, int groupsecondmemberid, int groupthirdmemberid)
			throws Throwable {
		ThreeMan threeMan = new ThreeMan();
		threeMan.setUser1(groupextMapper.selectfirstMemberInfo(groupfirstmemberid));
		threeMan.setUser2(groupextMapper.selectsecondMemberInfo(groupsecondmemberid));
		threeMan.setUser3(groupextMapper.selectthirdMemberInfo(groupthirdmemberid));
		return threeMan;
	}

	@Override
	public void showTwoManPoolJianmoByPage(PageVO<TwoManId> page) throws Throwable {
		List<TwoManId> twoManIdList = groupextMapper.getTwoManIdJianmo(page);
		page.setRecords(twoManIdList);
		page.setTotalRecord(groupextMapper.countTwoManFromJianmo());
	}

	@Override
	public List<ThreeMan> showThreeManPoolByPage(PageVO<UserVO> page) throws Throwable {
		List<ThreeMan> threeManList = new ArrayList<ThreeMan>();
		List<ThreeManId> threeManIdList = groupextMapper.getThreeManId();
		for(Iterator<ThreeManId> iter = threeManIdList.iterator(); iter.hasNext();){
			ThreeManId threeManid = iter.next();
			ThreeMan threeman = getThreeMan(threeManid.getGroupfirstmemberid(), threeManid.getGroupsecondmemberid(), threeManid.getGroupthirdmemberid());
			threeManList.add(threeman);
		}
		return threeManList;
	}

	@Override
	public void showOneManPoolXiezuoByPage(PageVO<UserVO> page) throws Throwable {
		List<UserVO> singleUserList = groupextMapper.listSingleXiezuo(page);
		page.setRecords(singleUserList);
		page.setTotalRecord(groupextMapper.countOneManFromXiezuo());
	}

	@Override
	public void showOneManPoolJianmoByPage(PageVO<UserVO> page) throws Throwable {
		List<UserVO> singleUserList = groupextMapper.listSingleJianmo(page);
		page.setRecords(singleUserList);
		page.setTotalRecord(groupextMapper.countOneManFromJianmo());
	}

	@Override
	public void showTwoManPoolBianchengByPage(PageVO<TwoManId> page) throws Throwable {
		List<TwoManId> twoManIdList = groupextMapper.getTwoManIdBiancheng(page);
		page.setRecords(twoManIdList);
		page.setTotalRecord(groupextMapper.countTwoManFromBiancheng());
	}

	@Override
	public void showTwoManPoolXiezuoByPage(PageVO<TwoManId> page) throws Throwable {
		List<TwoManId> twoManIdList = groupextMapper.getTwoManIdXiezuo(page);
		page.setRecords(twoManIdList);
		page.setTotalRecord(groupextMapper.countTwoManFromXiezuo());
	}

	@Override
	public void insertApplication(ApplicationVO application) throws Throwable {
		groupextMapper.insertApplication(application);
	}

	@Override
	public boolean sendapplication(int firstuserid, int seconduserid, int thirduserid) throws Throwable {
		List<ApplicationVO> applicationList = applicationVOExtMapper.selectAllApplication();
		boolean flag = true;
		for(Iterator<ApplicationVO> iter = applicationList.iterator(); iter.hasNext();){
			ApplicationVO application = iter.next();
			//在表中已经存在过了就不插入
			if(application.getFirstmemberid() == firstuserid && application.getSecondmemberid() == seconduserid && application.getSendapplicationid() == thirduserid){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
