package com.tata.gerenbaoming.dao;

import com.tata.gerenbaoming.domain.GerenbaomingVO;
import com.tata.gerenbaoming.domain.GerenbaomingVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GerenbaomingVOMapper {
    int countByExample(GerenbaomingVOExample example);

    int deleteByExample(GerenbaomingVOExample example);

    int deleteByPrimaryKey(Integer gerenbaomingid);

    int insert(GerenbaomingVO record);

    int insertSelective(GerenbaomingVO record);

    List<GerenbaomingVO> selectByExample(GerenbaomingVOExample example);

    GerenbaomingVO selectByPrimaryKey(Integer gerenbaomingid);

    int updateByExampleSelective(@Param("record") GerenbaomingVO record, @Param("example") GerenbaomingVOExample example);

    int updateByExample(@Param("record") GerenbaomingVO record, @Param("example") GerenbaomingVOExample example);

    int updateByPrimaryKeySelective(GerenbaomingVO record);

    int updateByPrimaryKey(GerenbaomingVO record);
}