package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewAdvertisement;
import com.eliteams.quick4j.web.model.NewAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewAdvertisementMapper {
    int countByExample(NewAdvertisementExample example);

    int deleteByExample(NewAdvertisementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewAdvertisement record);

    int insertSelective(NewAdvertisement record);

    List<NewAdvertisement> selectByExample(NewAdvertisementExample example);

    NewAdvertisement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewAdvertisement record, @Param("example") NewAdvertisementExample example);

    int updateByExample(@Param("record") NewAdvertisement record, @Param("example") NewAdvertisementExample example);

    int updateByPrimaryKeySelective(NewAdvertisement record);

    int updateByPrimaryKey(NewAdvertisement record);
}