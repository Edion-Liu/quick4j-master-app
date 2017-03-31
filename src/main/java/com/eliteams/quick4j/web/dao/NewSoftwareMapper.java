package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewSoftware;
import com.eliteams.quick4j.web.model.NewSoftwareExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewSoftwareMapper {
    int countByExample(NewSoftwareExample example);

    int deleteByExample(NewSoftwareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewSoftware record);

    int insertSelective(NewSoftware record);

    List<NewSoftware> selectByExample(NewSoftwareExample example);

    NewSoftware selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewSoftware record, @Param("example") NewSoftwareExample example);

    int updateByExample(@Param("record") NewSoftware record, @Param("example") NewSoftwareExample example);

    int updateByPrimaryKeySelective(NewSoftware record);

    int updateByPrimaryKey(NewSoftware record);
}