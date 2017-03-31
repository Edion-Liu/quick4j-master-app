package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TCommentImage;
import com.eliteams.quick4j.web.model.TCommentImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCommentImageMapper {
    int countByExample(TCommentImageExample example);

    int deleteByExample(TCommentImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCommentImage record);

    int insertSelective(TCommentImage record);

    List<TCommentImage> selectByExample(TCommentImageExample example);

    TCommentImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCommentImage record, @Param("example") TCommentImageExample example);

    int updateByExample(@Param("record") TCommentImage record, @Param("example") TCommentImageExample example);

    int updateByPrimaryKeySelective(TCommentImage record);

    int updateByPrimaryKey(TCommentImage record);
}