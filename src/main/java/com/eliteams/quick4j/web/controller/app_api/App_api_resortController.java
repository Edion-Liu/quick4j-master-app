package com.eliteams.quick4j.web.controller.app_api;

import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.cache.annotation.CacheWipe;
import com.eliteams.quick4j.web.cache.annotation.CacheWrite;
import com.eliteams.quick4j.web.dao.TCollectMapper;
import com.eliteams.quick4j.web.model.NewAttitude;
import com.eliteams.quick4j.web.model.TCollect;
import com.eliteams.quick4j.web.model.TResort;
import com.eliteams.quick4j.web.model.VO.TCampsiteVO;
import com.eliteams.quick4j.web.model.VO.TResortVO;
import com.eliteams.quick4j.web.service.*;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/8.
 */
@Controller
@RequestMapping(value = "/api/resort")
public class App_api_resortController {

    @Resource
    ResortService  resortService;

    @Resource
    TFriendService tFriendService;
    @Resource
    TCollectService tCollectService;
    @Resource
    attitudeService attitudeservice;

    @Resource
    TScoreService tScoreService;
    private static final Logger logger= LoggerFactory.getLogger(App_api_resortController.class);

    @RequestMapping(value = "/add")
    @ResponseBody
    @Authorization
    public Object add(  @RequestParam(value = "subtype") String subtype,
                        @RequestParam(value = "name") String name,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "city") String city,
                        @RequestParam(value = "style") String style,
                        @RequestParam(value = "campsite_type") String campsite_type,
                        @RequestParam(value = "address") String address,
                        @RequestParam(value = "phone") String phone,
                        @RequestParam(value = "longitude") String longitude,
                        @RequestParam(value = "latitude") String latitude,
                        @RequestParam(value = "is_has_water") String is_has_water,
                        @RequestParam(value = "is_has_electric") String is_has_electric,
                        @RequestParam(value = "is_has_toilet") String is_has_toilet,
                        @RequestParam(value = "is_can_bathe") String is_can_bathe,
                        @RequestParam(value = "is_has_restaurant") String is_has_restaurant,
                        @RequestParam(value = "is_can_shopping") String is_can_shopping,
                        @RequestParam(value = "is_has_bar") String is_has_bar,
                        @RequestParam(value = "is_can_barbecue") String is_can_barbecue,
                        @RequestParam(value = "is_can_ski") String is_can_ski,
                        @RequestParam(value = "is_has_playground") String is_has_playground,
                        @RequestParam(value = "is_can_footpath") String is_can_footpath,
                        @RequestParam(value = "is_can_cycle") String is_can_cycle,
                        @RequestParam(value = "is_can_fishing") String is_can_fishing,
                        @RequestParam(value = "is_can_ride") String is_can_ride,
                        @RequestParam(value = "is_has_wifi") String is_has_wifi,
                        @RequestParam(value = "is_has_amusement") String is_has_amusement,
                        @RequestParam(value = "is_can_swimming") String is_can_swimming,
                        @RequestParam(value = "is_has_water_recreation") String is_has_water_recreation,
                        @RequestParam(value = "is_has_therma") String is_has_therma,
                        @RequestParam(value = "is_can_meeting") String is_can_meeting,
                        @RequestParam(value = "is_can_boating") String is_can_boating,
                        @RequestParam(value = "is_has_stay") String 	is_has_stay,
                        @RequestParam(value = "is_has_healthcare") String is_has_healthcare,
                        @RequestParam(value = "is_has_orchard") String is_has_orchard,
                         @RequestParam(value = "rv_parking_num") String rv_parking_num,
                        @RequestParam(value = "rv_parking_price") String rv_parking_price,
                        @RequestParam(value = "trailer_parking_num") String trailer_parking_num,
                        @RequestParam(value = "trailer_parking_price") String trailer_parking_price,
                        @RequestParam(value = "tent_num") String tent_num,
                        @RequestParam(value = "tent_price") String tent_price,
                        @RequestParam(value = "open_season") String open_season,
                        @RequestParam(value = "start_time") String start_time,
                        @RequestParam(value = "end_time") String end_time

    ){

        TResort tResort=new TResort();
        tResort.setSubtype(Integer.parseInt(subtype));
        tResort.setName(name);
        tResort.setDescription(description);
        tResort.setCity(city);
        tResort.setStyle(style);
        tResort.setCampsiteType(campsite_type);
        tResort.setAddress(address);
        tResort.setPhone(phone);
        tResort.setLongitude(Double.valueOf(longitude));
        tResort.setLatitude(Double.valueOf(latitude));
        tResort.setIsHasWater(Integer.parseInt(is_has_water));
        tResort.setIsHasElectric(Integer.parseInt(is_has_electric));
        tResort.setIsHasToilet(Integer.parseInt(is_has_toilet));
        tResort.setIsCanBathe(Integer.parseInt(is_can_bathe));
        tResort.setIsHasRestaurant(Integer.parseInt(is_has_restaurant));
        tResort.setIsCanShopping(Integer.parseInt(is_can_shopping));
        tResort.setIsHasBar(Integer.parseInt(is_has_bar));
        tResort.setIsCanBarbecue(Integer.parseInt(is_can_barbecue));
        tResort.setIsCanSki(Integer.parseInt(is_can_ski));
        tResort.setIsHasPlayground(Integer.parseInt(is_has_playground));
        tResort.setIsCanFootpath(Integer.parseInt(is_can_footpath));
        tResort.setIsCanCycle(Integer.parseInt(is_can_cycle));
        tResort.setIsCanFishing(Integer.parseInt(is_can_fishing));
        tResort.setIsCanRide(Integer.parseInt(is_can_ride));
        tResort.setIsHasWifi(Integer.parseInt(is_has_wifi));
        tResort.setIsHasAmusement(Integer.parseInt(is_has_amusement));
        tResort.setIsCanSwimming(Integer.parseInt(is_can_swimming));
        tResort.setIsHasWaterRecreation(Integer.parseInt(is_has_water_recreation));
        tResort.setIsHasTherma(Integer.parseInt(is_has_therma));
        tResort.setIsCanMeeting(Integer.parseInt(is_can_meeting));
        tResort.setIsCanBoating(Integer.parseInt(is_can_boating));
        tResort.setIsHasStay(Integer.parseInt(is_has_stay));
        tResort.setIsHasHealthcare(Integer.parseInt(is_has_healthcare));
        tResort.setIsHasOrchard(Integer.parseInt(is_has_orchard));
        tResort.setRvParkingNum(Integer.parseInt(rv_parking_num));
        tResort.setRvParkingPrice(Integer.parseInt(rv_parking_price));
        tResort.setTrailerParkingNum(Integer.parseInt(trailer_parking_num));
        tResort.setTrailerParkingPrice(Integer.parseInt(trailer_parking_price));
        tResort.setTentNum(Integer.parseInt(tent_num));
        tResort.setTentPrice(Integer.parseInt(tent_price));
        tResort.setOpenSeason(open_season);
        tResort.setStartTime(start_time);
        tResort.setEndTime(end_time);


        resortService.addDao(tResort);

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"resort_id",tResort.getId());
    }


    /**
     * 查看附近的营地
     * @param longitude
     * @param latitude
     * @param
     * @param range
     * @param offset
     * @return
     */

  /*  @RequestMapping(value = "/get_nearly_resort_map",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public  Object get_nearly_resort_map(
            @RequestParam(value = "longitude")String longitude,@RequestParam(value = "latitude") String latitude,
           @RequestParam(value = "range",required = false)String range, @RequestParam(value = "offset",required = false) String offset

    ){
        if(ApplicationUtils.Checknotnull(longitude,latitude)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        String rangeTemp= ApplicationUtils.Checknotnull(range) ? CUSTOM_UTIL.SETING_RANGE:range;
        String offsetTemp=ApplicationUtils.Checknotnull(offset) ? CUSTOM_UTIL.SETING_MAX_WOWO:offset;


        List<TResortVO> tResortVOList= resortService.get_nearly_resort_map(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt(rangeTemp));
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"resortlist",tResortVOList);
    }*/


   /* @RequestMapping(value = "/get_nearly_resort",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public  Object get_nearly_resort(
            @RequestParam(value = "longitude")String longitude,@RequestParam(value = "latitude") String latitude,
            @RequestParam(value = "range",required = false)String range, @RequestParam(value = "offset",required = false) String offset,
            @RequestParam(value = "offsetpage",required = false) String offsetpage,@RequestParam(value = "pagesize",required = false) String pagesize){

        if(ApplicationUtils.Checknotnull(longitude,latitude)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }


        String rangeTemp= ApplicationUtils.Checknotnull(range) ? CUSTOM_UTIL.SETING_RANGE:range;
        String offsetTemp=ApplicationUtils.Checknotnull(offset) ? CUSTOM_UTIL.SETING_MAX_WOWO:offset;


        List<TResortVO> tResortVOList= resortService.get_nearly_resort(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt(rangeTemp),Integer.parseInt(offsetpage),Integer.parseInt(pagesize));
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"resortlist",tResortVOList,CUSTOM_UTIL.PAGEINFO,new PageInfo<TResortVO>(tResortVOList));
    }*/


    /**
     * 查看营地详细
     * @param resort_id
     * @param user_id
     * @return
     */

    @RequestMapping(value = "/show",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object show(@RequestParam(value = "resort_id")String resort_id,@RequestParam(value = "user_id")String user_id){
         List<TResortVO> tResortList=resortService.get_resortImpl( Integer.parseInt(resort_id));

        if (tResortList.size()<=0){
           return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.RESORT_NO_EXIST);
        }
       int score= tScoreService.getScoreById(Integer.parseInt(resort_id));
        List<TCollect> tCollectList=tCollectService.getCollectStatus(Integer.parseInt(resort_id),Integer.parseInt(user_id));
        TCollect tCollect=null;
        if(tCollectList.size()>=1){
            tCollect=tCollectList.get(0);
        }
        List<NewAttitude> newAttitudeList=attitudeservice.getAttitude(Integer.parseInt(resort_id),1,Integer.parseInt(user_id),20);

        List<NewAttitude> newAttitudeList2=attitudeservice.getAttitude(Integer.parseInt(resort_id),2,Integer.parseInt(user_id),20);


        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"resortdetail",tResortList,
                "follow_status",ApplicationUtils.GetRelation(tResortList.get(0).getUserId(),Integer.parseInt(user_id),tFriendService),
                "score",score,"collect",tCollect,"supportcount",newAttitudeList.size(),"opposecount",newAttitudeList2.size());

    }

}
