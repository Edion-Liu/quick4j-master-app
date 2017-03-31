package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewJoin;
import com.eliteams.quick4j.web.model.NewJoinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewJoinMapper {
    int countByExample(NewJoinExample example);

    int deleteByExample(NewJoinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewJoin record);

    int insertSelective(NewJoin record);

    List<NewJoin> selectByExample(NewJoinExample example);

    NewJoin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewJoin record, @Param("example") NewJoinExample example);

    int updateByExample(@Param("record") NewJoin record, @Param("example") NewJoinExample example);

    int updateByPrimaryKeySelective(NewJoin record);

    int updateByPrimaryKey(NewJoin record);
}