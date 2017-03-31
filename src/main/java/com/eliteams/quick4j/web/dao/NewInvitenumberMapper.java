package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewInvitenumber;
import com.eliteams.quick4j.web.model.NewInvitenumberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewInvitenumberMapper {
    int countByExample(NewInvitenumberExample example);

    int deleteByExample(NewInvitenumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewInvitenumber record);

    int insertSelective(NewInvitenumber record);

    List<NewInvitenumber> selectByExample(NewInvitenumberExample example);

    NewInvitenumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewInvitenumber record, @Param("example") NewInvitenumberExample example);

    int updateByExample(@Param("record") NewInvitenumber record, @Param("example") NewInvitenumberExample example);

    int updateByPrimaryKeySelective(NewInvitenumber record);

    int updateByPrimaryKey(NewInvitenumber record);
}