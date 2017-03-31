package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TComment;
import com.eliteams.quick4j.web.model.TCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCommentMapper {
    int countByExample(TCommentExample example);

    int deleteByExample(TCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TComment record);

    int insertSelective(TComment record);

    List<TComment> selectByExample(TCommentExample example);

    TComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TComment record, @Param("example") TCommentExample example);

    int updateByExample(@Param("record") TComment record, @Param("example") TCommentExample example);

    int updateByPrimaryKeySelective(TComment record);

    int updateByPrimaryKey(TComment record);
}