package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewYuebanimage;
import com.eliteams.quick4j.web.model.NewYuebanimageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewYuebanimageMapper {
    int countByExample(NewYuebanimageExample example);

    int deleteByExample(NewYuebanimageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewYuebanimage record);

    int insertSelective(NewYuebanimage record);

    List<NewYuebanimage> selectByExample(NewYuebanimageExample example);

    NewYuebanimage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewYuebanimage record, @Param("example") NewYuebanimageExample example);

    int updateByExample(@Param("record") NewYuebanimage record, @Param("example") NewYuebanimageExample example);

    int updateByPrimaryKeySelective(NewYuebanimage record);

    int updateByPrimaryKey(NewYuebanimage record);
}