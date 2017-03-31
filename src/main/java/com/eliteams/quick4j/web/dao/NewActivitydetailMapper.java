package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewActivitydetail;
import com.eliteams.quick4j.web.model.NewActivitydetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewActivitydetailMapper {
    int countByExample(NewActivitydetailExample example);

    int deleteByExample(NewActivitydetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewActivitydetail record);

    int insertSelective(NewActivitydetail record);

    List<NewActivitydetail> selectByExample(NewActivitydetailExample example);

    NewActivitydetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewActivitydetail record, @Param("example") NewActivitydetailExample example);

    int updateByExample(@Param("record") NewActivitydetail record, @Param("example") NewActivitydetailExample example);

    int updateByPrimaryKeySelective(NewActivitydetail record);

    int updateByPrimaryKey(NewActivitydetail record);
}