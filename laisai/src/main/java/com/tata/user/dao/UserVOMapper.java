package com.tata.user.dao;

import com.tata.user.domain.UserVO;
import com.tata.user.domain.UserVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVOMapper {
    int countByExample(UserVOExample example);

    int deleteByExample(UserVOExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserVO record);

    int insertSelective(UserVO record);

    List<UserVO> selectByExample(UserVOExample example);

    UserVO selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserVO record, @Param("example") UserVOExample example);

    int updateByExample(@Param("record") UserVO record, @Param("example") UserVOExample example);

    int updateByPrimaryKeySelective(UserVO record);

    int updateByPrimaryKey(UserVO record);
}