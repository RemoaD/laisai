package com.tata.teacher.dao;

import com.tata.teacher.domain.TeacherVO;
import com.tata.teacher.domain.TeacherVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherVOMapper {
    int countByExample(TeacherVOExample example);

    int deleteByExample(TeacherVOExample example);

    int deleteByPrimaryKey(Integer groupteacherid);

    int insert(TeacherVO record);

    int insertSelective(TeacherVO record);

    List<TeacherVO> selectByExample(TeacherVOExample example);

    TeacherVO selectByPrimaryKey(Integer groupteacherid);

    int updateByExampleSelective(@Param("record") TeacherVO record, @Param("example") TeacherVOExample example);

    int updateByExample(@Param("record") TeacherVO record, @Param("example") TeacherVOExample example);

    int updateByPrimaryKeySelective(TeacherVO record);

    int updateByPrimaryKey(TeacherVO record);
}