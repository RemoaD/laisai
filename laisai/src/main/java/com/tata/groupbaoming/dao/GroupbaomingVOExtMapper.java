package com.tata.groupbaoming.dao;

import com.tata.groupbaoming.domain.GroupbaomingVO;

public interface GroupbaomingVOExtMapper {
	public GroupbaomingVO selectGroupbaomingBygroupid(int groupid);//通过groupid来找到对应的队伍报名信息
}
