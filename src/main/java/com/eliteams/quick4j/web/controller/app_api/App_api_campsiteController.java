package com.eliteams.quick4j.web.controller.app_api;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;
import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.cache.annotation.CacheWrite;
import com.eliteams.quick4j.web.dao.TCampsiteMapper;
import com.eliteams.quick4j.web.model.*;
import com.eliteams.quick4j.web.model.VO.TCampsiteCustom;
import com.eliteams.quick4j.web.model.VO.TCampsiteVO;
import com.eliteams.quick4j.web.model.VO.TResortVO;
import com.eliteams.quick4j.web.service.*;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

import static com.alibaba.fastjson.JSON.toJSONString;


/**
 * @作者 刘宝军
 * Created by Edion on 2017/2/27.
 */
@Controller
@RequestMapping("/api/campsite")
public class App_api_campsiteController {


    @Resource
    CampsiteService campsiteService;
    @Resource
    TFriendService tFriendService;
    @Resource
    TUserService tUserService;
    @Resource
    TScoreService tScoreService;
    @Resource
    TCollectService tCollectService;

    @Resource
    TCommentService tCommentService;
    @Resource
    attitudeService attitudeservice;
    @Resource
    ResortService resortService;
    private static final Logger logger=LoggerFactory.getLogger(App_api_campsiteController.class);



    @Resource
    TUserMapperService tUserMapperService;


    /**
     * 发布窝窝
     * @param request
     * @param type
     * @param longitude
     * @param latitude
     * @param is_default_name
     * @param description
     * @param name
     * @param user_id
     * @param address
     * @param city
     * @param is_park_payment
     * @param is_can_park
     * @param is_can_trailer
     * @param is_has_water
     * @param is_has_electric
     * @param is_has_toilet
     * @param is_can_cooking
     * @param is_has_markets
     * @param is_can_fishing
     * @param is_can_swimming
     * @param is_can_tent
     * @param k_code
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/add_campsite_ios",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object add_campsite_ios(HttpServletRequest request,
                                   @RequestParam(value = "type",required = false) Integer type,
                                   @RequestParam(value = "longitude",required = false) double longitude,
                                   @RequestParam(value = "latitude",required = false) double latitude,
                                   @RequestParam(value = "is_default_name",required = false,defaultValue = "0") Integer is_default_name,
                                   @RequestParam(value = "description",required = false)String description,
                                   @RequestParam(value = "name",required = false)String name,
                                   @RequestParam(value = "user_id") Integer user_id,
                                   @RequestParam(value = "address",required = false) String address,
                                   @RequestParam(value = "city",required = false) String city,
                                   @RequestParam(value = "is_park_payment",required = false,defaultValue = "0") Integer is_park_payment,
                                   @RequestParam(value = "is_can_park",required = false,defaultValue = "0") Integer is_can_park,
                                   @RequestParam(value = "is_can_trailer",required = false,defaultValue = "0") Integer is_can_trailer,
                                   @RequestParam(value = "is_has_water",required = false,defaultValue = "0") Integer is_has_water,
                                   @RequestParam(value = "is_has_electric",required = false,defaultValue = "0") Integer is_has_electric,
                                   @RequestParam(value = "is_has_toilet",required = false,defaultValue = "0") Integer is_has_toilet,
                                   @RequestParam(value = "is_can_cooking",required = false,defaultValue = "0") Integer is_can_cooking,
                                   @RequestParam(value = "is_has_markets",required = false,defaultValue = "0") Integer is_has_markets,
                                   @RequestParam(value = "is_can_fishing",required = false,defaultValue = "0") Integer is_can_fishing,
                                   @RequestParam(value = "is_can_swimming",required = false,defaultValue = "0") Integer is_can_swimming,
                                   @RequestParam(value = "is_can_tent",required = false,defaultValue = "0") Integer is_can_tent,
                                   @RequestParam(value = "k_code",required = false)String k_code,

                                   @RequestParam(value = "style",required = false)String style,
                                   @RequestParam(value = "romanticTime",required = false)String romanticTime,
                                   @RequestParam(value = "romanticLong",required = false)String romanticLong,
                                   @RequestParam(value = "withDevice",required = false)String withDevice,
                                   @RequestParam(value = "romanticStartTime",required = false)String romanticStartTime,
                                   @RequestParam(value = "romanticEndTime",required = false)String romanticEndTime,
                                   @RequestParam(value = "ticketPrice",required = false)String ticketPrice,
                                   @RequestParam(value = "specialty",required = false)String specialty,
                                   @RequestParam(value = "consume",required = false)String consume,
                                   @RequestParam(value = "impression",required = false)String impression


          )throws Exception{



        if (description.length()<10){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.CAMPSITE_DESCRIPTION_ERROR);
        }

        if(type==0 || type==1 || type==3 || type==4 ){
            List<TCampsite> tCampsiteList=campsiteService.nearly_has_campsite(latitude,longitude);
            if(tCampsiteList.size()>=1){
              return   ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.CAMPSITE_FINDED);
            }
        }

        TCampsite tCampsite=new TCampsite();
        tCampsite.setUserId(user_id);
        tCampsite.setName(name);
        tCampsite.setDescription(description);
        tCampsite.setAddress(address);
        tCampsite.setCity(city);
        tCampsite.setType(type);
        tCampsite.setLongitude(longitude);
        tCampsite.setLatitude(latitude);


        tCampsite.setIsParkPayment(is_park_payment);
        tCampsite.setIsCanPark(is_can_park);
        tCampsite.setIsCanTrailer(is_can_trailer);
        tCampsite.setIsHasWater(is_has_water);
        tCampsite.setIsHasElectric(is_has_electric);
        tCampsite.setIsHasToilet(is_has_toilet);
        tCampsite.setIsCanCooking(is_can_cooking);
        tCampsite.setIsHasMarkets(is_has_markets);
        tCampsite.setIsCanFishing(is_can_fishing);
        tCampsite.setIsCanSwimming(is_can_swimming);
        tCampsite.setIsCanTent(is_can_tent);

        tCampsite.setIsDefaultName(is_default_name);
        tCampsite.setkCode(k_code);


        tCampsite.setStyle(style);
        tCampsite.setRomantictime(romanticTime);
        tCampsite.setRomanticlong(romanticLong);
        tCampsite.setWithdevice(withDevice);
        tCampsite.setRomanticstarttime(romanticStartTime);
        tCampsite.setRomanticendtime(romanticEndTime);
        tCampsite.setTicketprice(ticketPrice);
        tCampsite.setSpecialty(specialty);
        tCampsite.setConsume(consume);
        tCampsite.setImpression(impression);

        //默认审核过了
        tCampsite.setIsCheck(1);
        tCampsite.setScore(0);
        tCampsite.setIsValid(1);

        campsiteService.insert(tCampsite);



        //解析器解析request的上下文
        CommonsMultipartResolver multipartResolver =
                new CommonsMultipartResolver(request.getSession().getServletContext());
        //先判断request中是否包涵multipart类型的数据，
        if(multipartResolver.isMultipart(request)) {
            //再将request中的数据转化成multipart类型的数据
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            Iterator iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                MultipartFile file = multiRequest.getFile((String) iter.next());

                if (file != null) {
                    String fileName = file.getOriginalFilename();

                    if (fileName != null && (!"".equals(fileName.trim()))) {
                        //文件名，加后缀名wowo
                        String prefixion = user_id + "_wowo" + System.currentTimeMillis() + RandomUtil.generateStringnumber(5);
                        //   String prefixion=10000+"_a"+System.currentTimeMillis() +RandomUtil.generateStringnumber(5);
                        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
                        fileName = prefixion + fileSuffix;
                        String path = "E:/testimage/" + fileName;
                        File localFile = new File(path);

                        //写文件到本地
                        file.transferTo(localFile);

                        // 创建OSSClient实例
                        OSSClient ossClient = new OSSClient(CUSTOM_UTIL.endpoint, CUSTOM_UTIL.accessKeyId, CUSTOM_UTIL.accessKeySecret);
                        // 上传文件
                        ossClient.putObject(CUSTOM_UTIL.BucketName, fileName, localFile);
                        String Imageurl = CUSTOM_UTIL.ImageBaseURL + fileName;
                        logger.info(Imageurl);

                        //保存图片路径
                        if (Imageurl == null) {
                            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG, CUSTOM_UTIL.UPIMAGE_ERROR);
                        }
                        TCampsiteImage tCampsiteImage = new TCampsiteImage();
                        tCampsiteImage.setCreatedAt(ApplicationUtils.dateToStrLong(new Date()));
                        tCampsiteImage.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
                        tCampsiteImage.setCampsiteId(tCampsite.getId());
                        tCampsiteImage.setImageUrl(Imageurl);
                        tCampsiteImage.setIsValid("1");
                        campsiteService.insertImage(tCampsiteImage);
                        // 删除
                        //ossClient.deleteObject(CUSTOM_UTIL.BucketName, fileName);
                        // 关闭client
                        ossClient.shutdown();
                    }
                }
            }
        }



        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite_id",tCampsite.getId());
    }


    @RequestMapping(value = "/update_campsite",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object update_campsite( HttpServletRequest request,@RequestParam(value = "type",required = false) Integer type,
                                   @RequestParam(value = "longitude",required = false) double longitude,
                                   @RequestParam(value = "latitude",required = false) double latitude,
                                   @RequestParam(value = "is_default_name",required = false,defaultValue = "0") Integer is_default_name,
                                   @RequestParam(value = "description",required = false)String description,
                                   @RequestParam(value = "name",required = false)String name,
                                   @RequestParam(value = "user_id") Integer user_id,
                                   @RequestParam(value = "address",required = false) String address,
                                   @RequestParam(value = "city",required = false) String city,
                                   @RequestParam(value = "is_park_payment",required = false,defaultValue = "0") Integer is_park_payment,
                                   @RequestParam(value = "is_can_park",required = false,defaultValue = "0") Integer is_can_park,
                                   @RequestParam(value = "is_can_trailer",required = false,defaultValue = "0") Integer is_can_trailer,
                                   @RequestParam(value = "is_has_water",required = false,defaultValue = "0") Integer is_has_water,
                                   @RequestParam(value = "is_has_electric",required = false,defaultValue = "0") Integer is_has_electric,
                                   @RequestParam(value = "is_has_toilet",required = false,defaultValue = "0") Integer is_has_toilet,
                                   @RequestParam(value = "is_can_cooking",required = false,defaultValue = "0") Integer is_can_cooking,
                                   @RequestParam(value = "is_has_markets",required = false,defaultValue = "0") Integer is_has_markets,
                                   @RequestParam(value = "is_can_fishing",required = false,defaultValue = "0") Integer is_can_fishing,
                                   @RequestParam(value = "is_can_swimming",required = false,defaultValue = "0") Integer is_can_swimming,
                                   @RequestParam(value = "is_can_tent",required = false,defaultValue = "0") Integer is_can_tent,
                                   @RequestParam(value = "k_code",required = false)String k_code,


                                   @RequestParam(value = "style",required = false)String style,
                                   @RequestParam(value = "romanticTime",required = false)String romanticTime,
                                   @RequestParam(value = "romanticLong",required = false)String romanticLong,
                                   @RequestParam(value = "withDevice",required = false)String withDevice,
                                   @RequestParam(value = "romanticStartTime",required = false)String romanticStartTime,
                                   @RequestParam(value = "romanticEndTime",required = false)String romanticEndTime,
                                   @RequestParam(value = "ticketPrice",required = false)String ticketPrice,
                                   @RequestParam(value = "specialty",required = false)String specialty,
                                   @RequestParam(value = "consume",required = false)String consume,
                                   @RequestParam(value = "impression",required = false)String impression,

                                   @RequestParam(value = "campsite_id")String campsite_id)throws Exception{

        if (description.length()<10){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.CAMPSITE_DESCRIPTION_ERROR);
        }
        //删除图片
        campsiteService.delete_campsite_image(Integer.parseInt(campsite_id));


        TCampsite tCampsite=new TCampsite();
        tCampsite.setId(Integer.parseInt(campsite_id));
        tCampsite.setUserId(user_id);
        tCampsite.setName(name);
        tCampsite.setDescription(description);
        tCampsite.setAddress(address);
        tCampsite.setCity(city);
        tCampsite.setType(type);
        tCampsite.setLongitude(longitude);
        tCampsite.setLatitude(latitude);


        tCampsite.setIsParkPayment(is_park_payment);
        tCampsite.setIsCanPark(is_can_park);
        tCampsite.setIsCanTrailer(is_can_trailer);
        tCampsite.setIsHasWater(is_has_water);
        tCampsite.setIsHasElectric(is_has_electric);
        tCampsite.setIsHasToilet(is_has_toilet);
        tCampsite.setIsCanCooking(is_can_cooking);
        tCampsite.setIsHasMarkets(is_has_markets);
        tCampsite.setIsCanFishing(is_can_fishing);
        tCampsite.setIsCanSwimming(is_can_swimming);
        tCampsite.setIsCanTent(is_can_tent);

        tCampsite.setIsDefaultName(is_default_name);
        tCampsite.setkCode(k_code);


        tCampsite.setStyle(style);
        tCampsite.setRomantictime(romanticTime);
        tCampsite.setRomanticlong(romanticLong);
        tCampsite.setWithdevice(withDevice);
        tCampsite.setRomanticstarttime(romanticStartTime);
        tCampsite.setRomanticendtime(romanticEndTime);
        tCampsite.setTicketprice(ticketPrice);
        tCampsite.setSpecialty(specialty);
        tCampsite.setConsume(consume);
        tCampsite.setImpression(impression);


        //默认审核过了
        tCampsite.setIsCheck(1);
        tCampsite.setScore(0);
        tCampsite.setIsValid(1);

        campsiteService.update_campsite(tCampsite);

        List<String> imageList= ApplicationUtils.upImageToOss(request,Integer.toString(user_id),"_wowo");
        for (String imageurl:imageList){
            TCampsiteImage tCampsiteImage = new TCampsiteImage();
            tCampsiteImage.setCreatedAt(ApplicationUtils.dateToStrLong(new Date()));
            tCampsiteImage.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
            tCampsiteImage.setCampsiteId(tCampsite.getId());
            tCampsiteImage.setImageUrl(imageurl);
            tCampsiteImage.setIsValid("1");
            campsiteService.insertImage(tCampsiteImage);
        }
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }

    /**
     * 获取地图上显示的窝窝信息
     * @param longitude
     * @param latitude
     * @param type
     * @param range
     */
    @RequestMapping(value = "/get_nearly_campsite",produces = "text/html;charset=UTF-8")
    @ResponseBody

    public void get_nearly_campsite(@RequestParam(value = "longitude")String longitude,@RequestParam(value = "latitude") String latitude,
                                    @RequestParam(value = "type")String type,@RequestParam(value = "range")String range){

        String rangeTemp= ApplicationUtils.Checknotnull(range) ? "200" :range;

        if(Integer.parseInt(type)==20){

        }


    }

    /**
     * 给窝窝点赞踩
     * @param userId
     * @param campsiteId
     * @param type
     * @param typeCampsite
     * @return
     */
    @RequestMapping(value = "/myAttitude",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public Object myAttitude(@RequestParam(value = "userId")String userId,@RequestParam(value = "campsiteId")String campsiteId,
                           @RequestParam(value = "type")String type,@RequestParam(value = "typeCampsite")String typeCampsite){



        List<NewAttitude> newAttitudeList=attitudeservice.getAttitude(Integer.parseInt(campsiteId),Integer.parseInt(type),Integer.parseInt(userId),Integer.parseInt(typeCampsite));
       if(newAttitudeList.size()>=1){
           //已经点过赞
           if(type.equals("2"))
           return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.SUCCESS_MSG_KEY,"已踩");


           if(type.equals("1"))
               return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.SUCCESS_MSG_KEY,"已赞");
       }


        NewAttitude newAttitude=new NewAttitude();
        newAttitude.settCampsiteId(Integer.parseInt(campsiteId));
        newAttitude.setType(Integer.parseInt(type));
        newAttitude.setUserId(Integer.parseInt(userId));
        newAttitude.setTypeCampsite(Integer.parseInt(typeCampsite));

        attitudeservice.insertAttitude(newAttitude);

        if(type.equals("2"))
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.SUCCESS_MSG_KEY,"点踩成功");


            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.SUCCESS_MSG_KEY,"点赞成功");


    }


    /**
     * 获取附近的窝窝  地图模式
     * @param longitude
     * @param latitude
     * @param type
     * @param range
     * @param
     * @return
     */
    @RequestMapping(value = "/get_nearly_wowo_map",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    @CacheWrite(validTime = 60)
    public  Object get_nearly_wowo_map(@RequestParam(value = "longitude")String longitude,@RequestParam(value = "latitude") String latitude,
            @RequestParam(value = "type",required = false)String type,@RequestParam(value = "range",required = false)String range
    ){

        if(ApplicationUtils.Checknotnull(longitude,latitude)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        String rangeTemp= ApplicationUtils.Checknotnull(range) ? CUSTOM_UTIL.SETING_RANGE:range;
        List<TCampsiteVO> tCampsiteVOList=null;

        if("20".equals(type)){
            List<TResortVO> tResortVOList= resortService.get_nearly_resort_map(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt(rangeTemp));
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"resortlist",tResortVOList);
        }

        if(type==null||type.equals("")){
            //显示全部类型窝窝
            List<TResortVO> tResortVOList= resortService.get_nearly_resort_map(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt(rangeTemp));
            tCampsiteVOList =campsiteService.get_nearly_wowoall(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt(rangeTemp));
            return  ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite",tCampsiteVOList,"resortlist",tResortVOList);
        }else {
            //按种类显示窝窝
            tCampsiteVOList =campsiteService.get_nearly_wowo(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt(type),Integer.parseInt(rangeTemp));
        }
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite",tCampsiteVOList);

    }


    /**
     * 获取附近的窝窝  列表模式
     * @param longitude
     * @param latitude
     * @param
     * @param range
     * @param
     * @return
     */
    @RequestMapping(value = "/get_nearly_wowo",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public  Object get_nearly_wowo(@RequestParam(value = "longitude")String longitude,@RequestParam(value = "latitude") String latitude,
                                      @RequestParam(value = "range",required = false)String range, @RequestParam(value = "offsetpage") String offsetpage,
                                   @RequestParam(value = "pagesize")String pagesize,@RequestParam(value = "type",required = false)String type
    ){
        String rangeTemp= ApplicationUtils.Checknotnull(range) ? CUSTOM_UTIL.SETING_RANGE:range;
        List<TCampsiteCustom> tCampsiteCustomList=null;
        //显示全部类型窝窝
        //营地
        if(type.equals("20")){

            List<TResortVO> tResortVOList= resortService.get_nearly_resort(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt(rangeTemp),Integer.parseInt(offsetpage),Integer.parseInt(pagesize));
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"resortlist",tResortVOList,"pageinfoResort",new PageInfo<TResortVO>(tResortVOList));

        }
        /**
         * 所有类别
         */
        if(type==null ||type.equals("")){

            List<TResortVO> tResortVOList= resortService.get_nearly_resort(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt(rangeTemp),Integer.parseInt(offsetpage),Integer.parseInt(pagesize));
            tCampsiteCustomList =campsiteService.get_nearly_wowoall_offsetpage(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt("5000"),Integer.parseInt(rangeTemp),Integer.parseInt(offsetpage),Integer.parseInt(pagesize),type);
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"resortlist",tResortVOList,"pageinfoResort",new PageInfo<TResortVO>(tResortVOList),"campsite",tCampsiteCustomList,"pageinfoCampsite",new PageInfo<TCampsiteCustom>(tCampsiteCustomList));
        }


        tCampsiteCustomList =campsiteService.get_nearly_wowoall_offsetpage(Double.valueOf(longitude),Double.valueOf(latitude),Integer.parseInt("5000"),Integer.parseInt(rangeTemp),Integer.parseInt(offsetpage),Integer.parseInt(pagesize),type);

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite",tCampsiteCustomList,"pageinfoCampsite",new PageInfo<TCampsiteCustom>(tCampsiteCustomList));

    }

    /**
     * 给窝窝评论
     * @param request
     * @param tComment
     * @return
     */
    @RequestMapping(value = "/campsite_comment",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object campsite_comment(HttpServletRequest request,TComment tComment){

        if(tComment==null){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }

        tComment.setStatus(1);
        tComment.setCreatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tComment.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tCommentService.insertcomment(tComment);

        try {
         List<String> imageList=   ApplicationUtils.upImageToOss(request,Integer.toString(tComment.getId()),"campsite_comment");
            for (String url:imageList){
                TCommentImage tCommentImage=new TCommentImage();
                tCommentImage.setCommentId(tComment.getId());
                tCommentImage.setCommentUrl(url);
                tCommentService.insertcommentimage(tCommentImage);
            }


        } catch (Exception e) {
            e.printStackTrace();
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.UPIMAGE_FAIL);

        }

          return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }


    /**
     * 获取所有评论信息
     * @param campsiteId
     * @return
     */
    @RequestMapping(value = "/campsite_comment_all",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object campsite_comment_all(@RequestParam(value = "campsiteId") String campsiteId ){

        TCampsiteCustom  tCampsiteCustom  =campsiteService.get_campsiteByID(Integer.parseInt(campsiteId));
        if(tCampsiteCustom==null){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.WOWO_NO_EXIST);
        }

        List<TUser> TUsercommentlist=new ArrayList<TUser>();
        JSONObject mapimageS= new JSONObject();
        for (int i=0;i<tCampsiteCustom.gettCommentList().size();i++){
            List<TUser> TUsercommentlistTmpS=null;
            TUsercommentlistTmpS=tUserService.getTUserByidService(tCampsiteCustom.gettCommentList().get(i).getUserId());
            if(TUsercommentlistTmpS.size()>=1)
                TUsercommentlist.add(TUsercommentlistTmpS.get(0));

            List<TCommentImage> tCommentImageList= tCommentService.getImageByCommentId(tCampsiteCustom.gettCommentList().get(i).getId());
            /*if(tCommentImageList.size()>=1)*/
            mapimageS.put( Integer.toString(tCampsiteCustom.gettCommentList().get(i).getId()),tCommentImageList);

        }

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"mapimage",mapimageS,"TUsercommentlist",TUsercommentlist,"TUsercontent",tCampsiteCustom.gettCommentList());
    }




    /**
     * 通过wowo id 查询窝窝详细信息
     * @param campsite_id
     * @return
     */
    @RequestMapping(value = "/get_campsite",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object get_campsite(@RequestParam(value = "campsite_id")String campsite_id,@RequestParam(value = "user_id")String user_id,@RequestParam(value = "typeCampsite")String typeCampsite,
                               @RequestParam(value = "longitude")String longitude,@RequestParam(value = "latitude") String latitude){
        TCampsiteCustom  tCampsiteCustom  =campsiteService.get_campsiteByID(Integer.parseInt(campsite_id));
        if(tCampsiteCustom==null){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.WOWO_NO_EXIST);
        }

        List<TUser> TUsercommentlist=new ArrayList<TUser>();


        JSONObject mapimage= new JSONObject();

        for (int i=0;i<tCampsiteCustom.gettCommentList().size();i++){
            List<TUser> TUsercommentlistTmp=null;
            TUsercommentlistTmp=tUserService.getTUserByidService(tCampsiteCustom.gettCommentList().get(i).getUserId());
            if(TUsercommentlistTmp.size()>=1)
            TUsercommentlist.add(TUsercommentlistTmp.get(0));

            List<TCommentImage> tCommentImageList= tCommentService.getImageByCommentId(tCampsiteCustom.gettCommentList().get(i).getId());
            /*if(tCommentImageList.size()>=1)*/
            mapimage.put( Integer.toString(tCampsiteCustom.gettCommentList().get(i).getId()),tCommentImageList);

        }

        String Flag="0";
        String Flag2="0";
        String Follow="0";
        //查找本窝窝作者的粉丝
        List<TFriend> tFriendList=tFriendService.getFriendByUserId(tCampsiteCustom.gettUser().getId());
        for(TFriend f:tFriendList){
               if(f.getFriendId().equals(user_id)){
                   Flag="1";
                   break;
               }
        }
        //查看本玩家粉丝
        List<TFriend> tFriendList2=tFriendService.getFriendByUserId(Integer.parseInt(user_id));
        for(TFriend f:tFriendList2){
            if(f.getFriendId().equals(tCampsiteCustom.gettUser().getId())){
                Flag2="1";
                break;
            }
        }
        //不互相关注
        if(Flag.equals("0") && Flag2.equals("0")){
            Follow=CUSTOM_UTIL.follow_status_key_none;
        }
        //窝窝作者是 玩家粉丝
        if(Flag.equals("0") && Flag2.equals("1")){
            Follow=CUSTOM_UTIL.follow_status_key_oneIOC;
        }
        //玩家是窝窝作者的粉丝  （已关注）
        if(Flag.equals("1") && Flag2.equals("0")){
            Follow=CUSTOM_UTIL.follow_status_key_one;
        }

         //两者互相关注
        if(Flag.equals("1") && Flag2.equals("1")){
            Follow=CUSTOM_UTIL.follow_status_key_two;

        }

        int score=tScoreService.getScoreById(Integer.parseInt(campsite_id));
        int myscore=tScoreService.getScoreByUser_idAndCampsiteid(Integer.parseInt(user_id),Integer.parseInt(campsite_id));
        List<TCollect> tCollectList=tCollectService.getCollectStatus(Integer.parseInt(campsite_id),Integer.parseInt(user_id));
        TCollect tCollect=null;
        //点赞
        List<NewAttitude> newAttitudeList= attitudeservice.getAttitudecount(Integer.parseInt(campsite_id),1,Integer.parseInt(typeCampsite));

        //踩
        List<NewAttitude> newAttitudeList2= attitudeservice.getAttitudecount(Integer.parseInt(campsite_id),2,Integer.parseInt(typeCampsite));


        List<TCampsiteCustom> tCampsiteCustomList=null;
        tCampsiteCustomList =campsiteService.get_nearly_wowomore(Double.valueOf(longitude),Double.valueOf(latitude),20,Integer.parseInt(campsite_id));

        if(tCollectList.size()>=1){
            tCollect=tCollectList.get(0);
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsitedetail",tCampsiteCustom,
                    CUSTOM_UTIL.FANS_MANAGE,Follow,"tcommentuser",TUsercommentlist,"score",score,"collect",tCollect,
                    "supportcount",newAttitudeList.size(),"opposecount",newAttitudeList2.size(),"campsitehot",tCampsiteCustomList,"mapimage",mapimage,"myscore",myscore);
        }
        JSONObject resJSONObj= new JSONObject();
        resJSONObj.put("status","2");
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsitedetail", tCampsiteCustom,
                CUSTOM_UTIL.FANS_MANAGE,Follow,"tcommentuser",TUsercommentlist,
                "score",score, "collect",resJSONObj,
                "supportcount",newAttitudeList.size(),
                "opposecount",newAttitudeList2.size(),
                "campsitehot",tCampsiteCustomList,
                "mapimage",mapimage,"myscore",myscore);



    }


    /**
     * 根据城市位置 获取本城市窝窝
     * @param city
     * @return
     */
   /* @RequestMapping(value = "/get_campsite_by_city",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object get_campsite_by_city(@RequestParam(value = "city")String city,@RequestParam(value = "type",required = false)String type){

        List<TCampsiteVO> tCampsiteVOList=null;
        *//**
         * 获取全部类型窝窝营地
         *//*
       if(type==null || type.equals("")){
           tCampsiteVOList=campsiteService.get_campsite_by_city(city);
           return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite",tCampsiteVOList);
       }

        tCampsiteVOList=campsiteService.get_campsite_by_cityAndtype(city,Integer.parseInt(type));
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite",tCampsiteVOList);
    }*/


    /**
     * 举报
     * @param tReport
     * @return
     */
    @RequestMapping(value = "/report",produces="text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object report(TReport tReport){
        if(tReport==null){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        tReport.setIsValid(1);
        tReport.setCreatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tReport.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
        campsiteService.insertreportCampsite(tReport);
        return  ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.SUCCESS_MSG_KEY,CUSTOM_UTIL.REPORT_OK);
    }


    @RequestMapping(value = "/delete_campsite",produces="text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object delete_campsite(@RequestParam(value = "campsite_id")String campsite_id){
        campsiteService.delete_campsite(Integer.parseInt(campsite_id));
        return  ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.SUCCESS_MSG_KEY,CUSTOM_UTIL.DELECT_OK);
    }



    @RequestMapping(value = "/test",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public Object test(
            @RequestParam(value = "longitude")String lng,@RequestParam(value = "latitude") String lat){


      List<TCampsite>  tCampsiteList= campsiteService.nearly_has_campsite(Double.valueOf(lat),Double.valueOf(lng));
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite",tCampsiteList);

    }


    /**
     * 对。。。进行评分
     * @param tScore
     * @return
     */
    @RequestMapping(value = "/grade",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object grade(TScore tScore){

        if(ApplicationUtils.Checknotnull_int(tScore.getUserId(),tScore.getCampsiteId(),tScore.getScore(),tScore.getType())){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        tScoreService.InsertScore(tScore);
        int score=tScoreService.getScoreById(tScore.getCampsiteId());
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"score",score);

    }


    /**
     * 收藏窝窝
     * @param tCollect
     * @return
     */
    @RequestMapping(value = "/collect",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object collect(TCollect tCollect) {

        if(ApplicationUtils.Checknotnull_int(tCollect.getUserId(),tCollect.getCampsiteId(),tCollect.getStatus(),tCollect.getType())){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }



        tCollect.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tCollect.setCreatedAt(ApplicationUtils.dateToStrLong(new Date()));
        List<TCollect> tCollectList=tCollectService.getCollectStatus(tCollect.getCampsiteId(),tCollect.getUserId());
        if(tCollectList.size()>=1){
            TCollect tCollect1=tCollectList.get(0);
            if(tCollect1.getCampsiteId().equals(tCollect.getCampsiteId()) && tCollect1.getUserId().equals(tCollect.getUserId())){
                tCollect.setId(tCollect1.getId());
                tCollectService.updateCollect(tCollect);
                return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
            }

        }

        tCollectService.insertCollect(tCollect);
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }

    /**
     * 分享页面
     * @param id
     * @param type
     * @return
     */
    @RequestMapping(value = "/share",produces = "text/html;charset=UTF-8")
    @Authorization
    public ModelAndView share(@RequestParam(value = "id")String id,@RequestParam(value = "type")String type){

        /**
         * 营地
         */
        ModelAndView modelAndView=new ModelAndView("share");
        if(type.equals("20")){
            List<TResortVO> tResortList=resortService.get_resortImpl( Integer.parseInt(id));
            if(tResortList.size()==1){
                modelAndView.addObject("type","20");
                modelAndView.addObject("resortdetail",tResortList.get(0));
                return modelAndView;
            }
        }

        /**
         * 窝窝详情
         */
        TCampsiteCustom  tCampsiteCustom  =campsiteService.get_campsiteByID(Integer.parseInt(id));
        modelAndView.addObject("type",type);
        modelAndView.addObject("campsitedetail",tCampsiteCustom);
        return modelAndView;
    }


    /**
     * 获取我的足迹
     * @param user_id
     * @return
     */
    @RequestMapping(value = "/my_footprint",produces="text/html;charset=UTF-8")
    @Authorization
    @ResponseBody
    public Object my_footprint(@RequestParam(value = "userId")String user_id){
        List<TCampsiteVO>  tCampsiteVOList=  campsiteService.get_campsite_by_user_id(Integer.parseInt(user_id));
        List<TCampsiteVO>  tCampsiteVOListscan= campsiteService.get_campsitescan_by_user_id(Integer.parseInt(user_id));
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite",tCampsiteVOList,"campsitescan",tCampsiteVOListscan);
    }


    /**
     * 获取更多热门窝窝
     * @param
     * @param pagesize
     * @return
     */
    @RequestMapping(value = "/recommend_campsite",produces="text/html;charset=UTF-8")
    @Authorization
    @ResponseBody
    public Object recommend_campsite(@RequestParam(value = "offsetpage")String offsetpage,@RequestParam(value = "pagesize")String pagesize){

        List<TCampsiteCustom> tCampsiteCustomList=campsiteService.get_nearly_wowohot(Integer.parseInt(offsetpage),Integer.parseInt(pagesize));
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"campsite",tCampsiteCustomList,"pageinfoCampsite",new PageInfo<TCampsiteCustom>(tCampsiteCustomList));


    }




}
