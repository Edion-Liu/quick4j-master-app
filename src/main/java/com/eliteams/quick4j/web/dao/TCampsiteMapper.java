package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TCampsite;
import com.eliteams.quick4j.web.model.TCampsiteExample;
import com.eliteams.quick4j.web.model.VO.TCampsiteVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCampsiteMapper {
    int countByExample(TCampsiteExample example);

    int deleteByExample(TCampsiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCampsite record);

    int insertSelective(TCampsite record);

    List<TCampsite> selectByExampleWithBLOBs(TCampsiteExample example);

    List<TCampsite> selectByExample(TCampsiteExample example);

    TCampsite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCampsite record, @Param("example") TCampsiteExample example);

    int updateByExampleWithBLOBs(@Param("record") TCampsite record, @Param("example") TCampsiteExample example);

    int updateByExample(@Param("record") TCampsite record, @Param("example") TCampsiteExample example);

    int updateByPrimaryKeySelective(TCampsite record);

    int updateByPrimaryKeyWithBLOBs(TCampsite record);

    int updateByPrimaryKey(TCampsite record);


    /*自定义修改*/
    List<TCampsite> nearly_has_campsite(double lat,double lng);


    void get_nearly_resort_mapper(Integer lat, Integer lng, Integer range, Integer user_id);


    List<TCampsiteVO> get_nearly_wowo_mapper(Double longitude, Double latitude , Integer type , Integer range);

    List<TCampsiteVO> get_nearly_wowoall_mapper(Double longitude,Double latitude,Integer range);
    List<TCampsiteVO> get_campsite_by_user_id_mapper(Integer user_id);
    List<TCampsiteVO> get_campsitescan_by_user_id_mapper(Integer user_id);

    List<TCampsiteVO> get_nearly_wowoall_offepage_mapper(Double longitude,Double latitude,Integer range);


    TCampsiteVO  get_campsiteByID_mapper(Integer campsiteId);

    List<TCampsiteVO> get_campsite_by_city_mapper(String city);
    List<TCampsiteVO> get_campsite_by_cityAndtype_mapper(String city,Integer type);

    List<TCampsite> get_campsite(Double longitude,Double latitude,Integer range,Integer type);

    List<TCampsite> get_campsite_alltype(Double longitude,Double latitude,Integer range);
    List<TCampsite> get_campsite_alltypemore(Double longitude,Double latitude,Integer range,Integer campsiteID);


   List<TCampsite> get_campsite_alltype_hot();
}