package com.tata.usermessage.dao;

import com.tata.usermessage.domain.UsermessageVO;
import com.tata.usermessage.domain.UsermessageVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsermessageVOMapper {
    int countByExample(UsermessageVOExample example);

    int deleteByExample(UsermessageVOExample example);

    int deleteByPrimaryKey(Integer messageid);

    int insert(UsermessageVO record);

    int insertSelective(UsermessageVO record);

    List<UsermessageVO> selectByExample(UsermessageVOExample example);

    UsermessageVO selectByPrimaryKey(Integer messageid);

    int updateByExampleSelective(@Param("record") UsermessageVO record, @Param("example") UsermessageVOExample example);

    int updateByExample(@Param("record") UsermessageVO record, @Param("example") UsermessageVOExample example);

    int updateByPrimaryKeySelective(UsermessageVO record);

    int updateByPrimaryKey(UsermessageVO record);
}