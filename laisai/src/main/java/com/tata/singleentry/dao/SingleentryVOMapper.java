package com.tata.singleentry.dao;

import com.tata.singleentry.domain.SingleentryVO;
import com.tata.singleentry.domain.SingleentryVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingleentryVOMapper {
    int countByExample(SingleentryVOExample example);

    int deleteByExample(SingleentryVOExample example);

    int deleteByPrimaryKey(Integer singleentryid);

    int insert(SingleentryVO record);

    int insertSelective(SingleentryVO record);

    List<SingleentryVO> selectByExample(SingleentryVOExample example);

    SingleentryVO selectByPrimaryKey(Integer singleentryid);

    int updateByExampleSelective(@Param("record") SingleentryVO record, @Param("example") SingleentryVOExample example);

    int updateByExample(@Param("record") SingleentryVO record, @Param("example") SingleentryVOExample example);

    int updateByPrimaryKeySelective(SingleentryVO record);

    int updateByPrimaryKey(SingleentryVO record);
}