package com.tata.groupbaoming.dao;

import com.tata.groupbaoming.domain.GroupbaomingVO;
import com.tata.groupbaoming.domain.GroupbaomingVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupbaomingVOMapper {
    int countByExample(GroupbaomingVOExample example);

    int deleteByExample(GroupbaomingVOExample example);

    int deleteByPrimaryKey(Integer baomingid);

    int insert(GroupbaomingVO record);

    int insertSelective(GroupbaomingVO record);

    List<GroupbaomingVO> selectByExample(GroupbaomingVOExample example);

    GroupbaomingVO selectByPrimaryKey(Integer baomingid);

    int updateByExampleSelective(@Param("record") GroupbaomingVO record, @Param("example") GroupbaomingVOExample example);

    int updateByExample(@Param("record") GroupbaomingVO record, @Param("example") GroupbaomingVOExample example);

    int updateByPrimaryKeySelective(GroupbaomingVO record);

    int updateByPrimaryKey(GroupbaomingVO record);
}