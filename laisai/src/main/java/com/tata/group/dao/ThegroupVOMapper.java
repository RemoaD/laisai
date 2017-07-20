package com.tata.group.dao;

import com.tata.group.domain.ThegroupVO;
import com.tata.group.domain.ThegroupVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThegroupVOMapper {
    int countByExample(ThegroupVOExample example);

    int deleteByExample(ThegroupVOExample example);

    int deleteByPrimaryKey(Integer groupid);

    int insert(ThegroupVO record);

    int insertSelective(ThegroupVO record);

    List<ThegroupVO> selectByExample(ThegroupVOExample example);

    ThegroupVO selectByPrimaryKey(Integer groupid);

    int updateByExampleSelective(@Param("record") ThegroupVO record, @Param("example") ThegroupVOExample example);

    int updateByExample(@Param("record") ThegroupVO record, @Param("example") ThegroupVOExample example);

    int updateByPrimaryKeySelective(ThegroupVO record);

    int updateByPrimaryKey(ThegroupVO record);
}