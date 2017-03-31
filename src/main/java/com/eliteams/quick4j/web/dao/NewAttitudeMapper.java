package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewAttitude;
import com.eliteams.quick4j.web.model.NewAttitudeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewAttitudeMapper {
    int countByExample(NewAttitudeExample example);

    int deleteByExample(NewAttitudeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewAttitude record);

    int insertSelective(NewAttitude record);

    List<NewAttitude> selectByExample(NewAttitudeExample example);

    NewAttitude selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewAttitude record, @Param("example") NewAttitudeExample example);

    int updateByExample(@Param("record") NewAttitude record, @Param("example") NewAttitudeExample example);

    int updateByPrimaryKeySelective(NewAttitude record);

    int updateByPrimaryKey(NewAttitude record);
}