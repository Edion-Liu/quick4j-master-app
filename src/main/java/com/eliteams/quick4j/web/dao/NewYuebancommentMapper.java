package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewYuebancomment;
import com.eliteams.quick4j.web.model.NewYuebancommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewYuebancommentMapper {
    int countByExample(NewYuebancommentExample example);

    int deleteByExample(NewYuebancommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewYuebancomment record);

    int insertSelective(NewYuebancomment record);

    List<NewYuebancomment> selectByExample(NewYuebancommentExample example);

    NewYuebancomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewYuebancomment record, @Param("example") NewYuebancommentExample example);

    int updateByExample(@Param("record") NewYuebancomment record, @Param("example") NewYuebancommentExample example);

    int updateByPrimaryKeySelective(NewYuebancomment record);

    int updateByPrimaryKey(NewYuebancomment record);
}