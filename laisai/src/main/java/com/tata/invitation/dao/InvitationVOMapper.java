package com.tata.invitation.dao;

import com.tata.invitation.domain.InvitationVO;
import com.tata.invitation.domain.InvitationVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvitationVOMapper {
    int countByExample(InvitationVOExample example);

    int deleteByExample(InvitationVOExample example);

    int deleteByPrimaryKey(Integer invitationid);

    int insert(InvitationVO record);

    int insertSelective(InvitationVO record);

    List<InvitationVO> selectByExample(InvitationVOExample example);

    InvitationVO selectByPrimaryKey(Integer invitationid);

    int updateByExampleSelective(@Param("record") InvitationVO record, @Param("example") InvitationVOExample example);

    int updateByExample(@Param("record") InvitationVO record, @Param("example") InvitationVOExample example);

    int updateByPrimaryKeySelective(InvitationVO record);

    int updateByPrimaryKey(InvitationVO record);
}