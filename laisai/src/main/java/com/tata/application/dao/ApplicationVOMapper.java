package com.tata.application.dao;

import com.tata.application.domain.ApplicationVO;
import com.tata.application.domain.ApplicationVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationVOMapper {
    int countByExample(ApplicationVOExample example);

    int deleteByExample(ApplicationVOExample example);

    int deleteByPrimaryKey(Integer applicationid);

    int insert(ApplicationVO record);

    int insertSelective(ApplicationVO record);

    List<ApplicationVO> selectByExample(ApplicationVOExample example);

    ApplicationVO selectByPrimaryKey(Integer applicationid);

    int updateByExampleSelective(@Param("record") ApplicationVO record, @Param("example") ApplicationVOExample example);

    int updateByExample(@Param("record") ApplicationVO record, @Param("example") ApplicationVOExample example);

    int updateByPrimaryKeySelective(ApplicationVO record);

    int updateByPrimaryKey(ApplicationVO record);
}