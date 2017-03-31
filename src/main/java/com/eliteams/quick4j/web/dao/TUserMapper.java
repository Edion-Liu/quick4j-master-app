package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TUser;
import com.eliteams.quick4j.web.model.TUserExample;
import com.eliteams.quick4j.web.model.VO.TFriendVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

   /* 自定义修改*/

   List<TUser> getTUserByid(Integer id);

  List<TFriendVO> getMyFans(Integer user_id);
}