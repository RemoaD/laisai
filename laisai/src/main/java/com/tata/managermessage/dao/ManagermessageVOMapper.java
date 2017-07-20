package com.tata.managermessage.dao;

import com.tata.managermessage.domain.ManagermessageVO;
import com.tata.managermessage.domain.ManagermessageVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagermessageVOMapper {
    int countByExample(ManagermessageVOExample example);

    int deleteByExample(ManagermessageVOExample example);

    int deleteByPrimaryKey(Integer messageid);

    int insert(ManagermessageVO record);

    int insertSelective(ManagermessageVO record);

    List<ManagermessageVO> selectByExample(ManagermessageVOExample example);

    ManagermessageVO selectByPrimaryKey(Integer messageid);

    int updateByExampleSelective(@Param("record") ManagermessageVO record, @Param("example") ManagermessageVOExample example);

    int updateByExample(@Param("record") ManagermessageVO record, @Param("example") ManagermessageVOExample example);

    int updateByPrimaryKeySelective(ManagermessageVO record);

    int updateByPrimaryKey(ManagermessageVO record);
}