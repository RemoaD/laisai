package com.tata.competition.dao;

import com.tata.competition.domain.CompetitionVO;
import com.tata.competition.domain.CompetitionVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionVOMapper {
    int countByExample(CompetitionVOExample example);

    int deleteByExample(CompetitionVOExample example);

    int deleteByPrimaryKey(Integer competitionid);

    int insert(CompetitionVO record);

    int insertSelective(CompetitionVO record);

    List<CompetitionVO> selectByExample(CompetitionVOExample example);

    CompetitionVO selectByPrimaryKey(Integer competitionid);

    int updateByExampleSelective(@Param("record") CompetitionVO record, @Param("example") CompetitionVOExample example);

    int updateByExample(@Param("record") CompetitionVO record, @Param("example") CompetitionVOExample example);

    int updateByPrimaryKeySelective(CompetitionVO record);

    int updateByPrimaryKey(CompetitionVO record);
}