package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TCollect;
import com.eliteams.quick4j.web.model.TCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCollectMapper {
    int countByExample(TCollectExample example);

    int deleteByExample(TCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCollect record);

    int insertSelective(TCollect record);

    List<TCollect> selectByExample(TCollectExample example);

    TCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCollect record, @Param("example") TCollectExample example);

    int updateByExample(@Param("record") TCollect record, @Param("example") TCollectExample example);

    int updateByPrimaryKeySelective(TCollect record);

    int updateByPrimaryKey(TCollect record);
}