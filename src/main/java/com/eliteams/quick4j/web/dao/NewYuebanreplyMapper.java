package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewYuebanreply;
import com.eliteams.quick4j.web.model.NewYuebanreplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewYuebanreplyMapper {
    int countByExample(NewYuebanreplyExample example);

    int deleteByExample(NewYuebanreplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewYuebanreply record);

    int insertSelective(NewYuebanreply record);

    List<NewYuebanreply> selectByExample(NewYuebanreplyExample example);

    NewYuebanreply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewYuebanreply record, @Param("example") NewYuebanreplyExample example);

    int updateByExample(@Param("record") NewYuebanreply record, @Param("example") NewYuebanreplyExample example);

    int updateByPrimaryKeySelective(NewYuebanreply record);

    int updateByPrimaryKey(NewYuebanreply record);
}