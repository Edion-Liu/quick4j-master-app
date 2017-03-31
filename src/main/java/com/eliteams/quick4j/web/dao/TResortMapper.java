package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TComment;
import com.eliteams.quick4j.web.model.TResort;
import com.eliteams.quick4j.web.model.TResortExample;
import com.eliteams.quick4j.web.model.VO.TCampsiteVO;
import com.eliteams.quick4j.web.model.VO.TCommentVO;
import com.eliteams.quick4j.web.model.VO.TResortVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TResortMapper {
    int countByExample(TResortExample example);

    int deleteByExample(TResortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TResort record);

    int insertSelective(TResort record);

    List<TResort> selectByExampleWithBLOBs(TResortExample example);

    List<TResort> selectByExample(TResortExample example);

    TResort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TResort record, @Param("example") TResortExample example);

    int updateByExampleWithBLOBs(@Param("record") TResort record, @Param("example") TResortExample example);

    int updateByExample(@Param("record") TResort record, @Param("example") TResortExample example);

    int updateByPrimaryKeySelective(TResort record);

    int updateByPrimaryKeyWithBLOBs(TResort record);

    int updateByPrimaryKey(TResort record);


    /*自定义修改*/

    List<TResortVO> get_nearly_resort_mapper(Double longitude, Double latitude , Integer range);

    List<TResortVO> get_resort_mapper(Integer resort_id);

    List<TCommentVO> get_resort_comment_mapper(Integer id, Integer type);
}