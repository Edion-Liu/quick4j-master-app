package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TResortImage;
import com.eliteams.quick4j.web.model.TResortImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TResortImageMapper {
    int countByExample(TResortImageExample example);

    int deleteByExample(TResortImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TResortImage record);

    int insertSelective(TResortImage record);

    List<TResortImage> selectByExample(TResortImageExample example);

    TResortImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TResortImage record, @Param("example") TResortImageExample example);

    int updateByExample(@Param("record") TResortImage record, @Param("example") TResortImageExample example);

    int updateByPrimaryKeySelective(TResortImage record);

    int updateByPrimaryKey(TResortImage record);
}