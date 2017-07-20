package com.tata.competition.dao;

import java.util.List;

import com.tata.competition.domain.CompetitionVO;

public interface CompetitionVOExtMapper {
	public List<CompetitionVO> list()throws Throwable;//列出比赛列表
}
