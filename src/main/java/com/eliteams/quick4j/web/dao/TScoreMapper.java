package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TScore;
import com.eliteams.quick4j.web.model.TScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TScoreMapper {
    int countByExample(TScoreExample example);

    int deleteByExample(TScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TScore record);

    int insertSelective(TScore record);

    List<TScore> selectByExample(TScoreExample example);

    TScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TScore record, @Param("example") TScoreExample example);

    int updateByExample(@Param("record") TScore record, @Param("example") TScoreExample example);

    int updateByPrimaryKeySelective(TScore record);

    int updateByPrimaryKey(TScore record);

   /* 自定义*/
   List<TScore>  get_user_score_mapper(Integer user_id,Integer resort_id,Integer type);
}