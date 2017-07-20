package com.tata.application.dao;

import java.util.List;

import com.tata.application.domain.ApplicationVO;

public interface ApplicationVOExtMapper {
	public List<ApplicationVO> selectAllApplication()throws Throwable;//查找出所有的申请
} 
