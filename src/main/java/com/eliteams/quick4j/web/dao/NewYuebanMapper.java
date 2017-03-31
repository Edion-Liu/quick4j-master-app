package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewYueban;
import com.eliteams.quick4j.web.model.NewYuebanCoustom;
import com.eliteams.quick4j.web.model.NewYuebanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewYuebanMapper {
    int countByExample(NewYuebanExample example);

    int deleteByExample(NewYuebanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewYueban record);

    int insertSelective(NewYueban record);

    List<NewYueban> selectByExample(NewYuebanExample example);

    NewYueban selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewYueban record, @Param("example") NewYuebanExample example);

    int updateByExample(@Param("record") NewYueban record, @Param("example") NewYuebanExample example);

    int updateByPrimaryKeySelective(NewYueban record);

    int updateByPrimaryKey(NewYueban record);


    List<NewYuebanCoustom> get_latest(int offset, int pagesize);

    List<NewYuebanCoustom> get_latest_pagehelper(int area);

    List<NewYuebanCoustom> get_latest_pagehelperByUser(int yuebanuser_id);
    int get_recordcount();

    void test();
}