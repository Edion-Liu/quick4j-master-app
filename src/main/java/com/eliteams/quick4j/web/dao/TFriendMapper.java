package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TFriend;
import com.eliteams.quick4j.web.model.TFriendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TFriendMapper {
    int countByExample(TFriendExample example);

    int deleteByExample(TFriendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TFriend record);

    int insertSelective(TFriend record);

    List<TFriend> selectByExample(TFriendExample example);

    TFriend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TFriend record, @Param("example") TFriendExample example);

    int updateByExample(@Param("record") TFriend record, @Param("example") TFriendExample example);

    int updateByPrimaryKeySelective(TFriend record);

    int updateByPrimaryKey(TFriend record);


}