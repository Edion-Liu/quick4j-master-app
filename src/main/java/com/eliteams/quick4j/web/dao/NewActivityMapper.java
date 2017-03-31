package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewActivity;
import com.eliteams.quick4j.web.model.NewActivityExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface NewActivityMapper {
    int countByExample(NewActivityExample example);

    int deleteByExample(NewActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewActivity record);

    int insertSelective(NewActivity record);

    List<NewActivity> selectByExample(NewActivityExample example);

    NewActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewActivity record, @Param("example") NewActivityExample example);

    int updateByExample(@Param("record") NewActivity record, @Param("example") NewActivityExample example);

    int updateByPrimaryKeySelective(NewActivity record);

    int updateByPrimaryKey(NewActivity record);


    /***********自定义修改***********************/
    List<NewActivity>  get_latest(int type);

    /**
     * 给主键赋值
     * @param record
     * @return
     */
    int insertCustom(NewActivity record);

    /**
     *
     * @param longitude   经度
     * @param latitude    纬度
     * @return
     */
    List<NewActivity> findnearActivity( double longitude,double latitude );



}