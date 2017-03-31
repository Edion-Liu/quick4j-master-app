package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TReport;
import com.eliteams.quick4j.web.model.TReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TReportMapper {
    int countByExample(TReportExample example);

    int deleteByExample(TReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TReport record);

    int insertSelective(TReport record);

    List<TReport> selectByExample(TReportExample example);

    TReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TReport record, @Param("example") TReportExample example);

    int updateByExample(@Param("record") TReport record, @Param("example") TReportExample example);

    int updateByPrimaryKeySelective(TReport record);

    int updateByPrimaryKey(TReport record);
}