package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TCampsiteImage;
import com.eliteams.quick4j.web.model.TCampsiteImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCampsiteImageMapper {
    int countByExample(TCampsiteImageExample example);

    int deleteByExample(TCampsiteImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCampsiteImage record);

    int insertSelective(TCampsiteImage record);

    List<TCampsiteImage> selectByExample(TCampsiteImageExample example);

    TCampsiteImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCampsiteImage record, @Param("example") TCampsiteImageExample example);

    int updateByExample(@Param("record") TCampsiteImage record, @Param("example") TCampsiteImageExample example);

    int updateByPrimaryKeySelective(TCampsiteImage record);

    int updateByPrimaryKey(TCampsiteImage record);


}