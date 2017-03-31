package com.eliteams.quick4j.web.controller.app_api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;

import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.cache.annotation.CacheWrite;
import com.eliteams.quick4j.web.cache.util.CacheKey;
import com.eliteams.quick4j.web.model.*;
import com.eliteams.quick4j.web.service.ActivityService;
import com.eliteams.quick4j.web.service.YuebanService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyDescriptor;
import java.io.*;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/4.
 */
@Controller
@RequestMapping("api/activity")
public class App_api_activityController {

    @Resource
    ActivityService activityService;
    private static final Logger logger= LoggerFactory.getLogger(App_api_activityController.class);

    /**
     * 获取图片url
     * @param id
     * @param file
     * @return
     */
    private String getImageUrl(Integer id,MultipartFile file) throws Exception{

        String Imageurl=null;
        if(   file !=null){

            String fileName = file.getOriginalFilename();

            if(fileName!=null && (!"".equals(fileName.trim()))){

                //文件名，加后缀名   活动消息为_b
                String prefixion = id + "_b" + System.currentTimeMillis() + RandomUtil.generateStringnumber(5);
                //   String prefixion=10000+"_a"+System.currentTimeMillis() +RandomUtil.generateStringnumber(5);
                String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
                if(fileSuffix.equals(".txt")){
                    Imageurl="";
                    logger.info("文本信息：{}",Imageurl);
                }else {
                    fileName = prefixion + fileSuffix;
                    String path = "E:/testimage/" + fileName;
                    File localFile = new File(path);
                    //写文件到本地
                    file.transferTo(localFile);
                    // 创建OSSClient实例
                    OSSClient ossClient = new OSSClient(CUSTOM_UTIL.endpoint, CUSTOM_UTIL.accessKeyId, CUSTOM_UTIL.accessKeySecret);
                    // 上传文件
                    ossClient.putObject(CUSTOM_UTIL.BucketName, fileName, localFile);
                    Imageurl= CUSTOM_UTIL.ImageBaseURL + fileName;
                    logger.info(Imageurl);
                    // 关闭client
                    ossClient.shutdown();
                }


            }

        }

        return  Imageurl;
    }


    /**
     * 发布活动信息
     * @param request
     * @return
     * @throws IllegalStateException
     * @throws IOException
     * @throws Exception
     */
    @RequestMapping(value = "/publish",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object publish(HttpServletRequest request)throws IllegalStateException, IOException,Exception {
        NewActivity newActivity =null;
        String test = request.getParameter("release");
        newActivity = JSON.parseObject(test, NewActivity.class);

        //校验指定字段
        if(ApplicationUtils.Checknotnull(newActivity.getStarttime(),newActivity.getEndtime(),
                newActivity.getSuPhone(),newActivity.getChargename(),
                newActivity.getImageurl(),newActivity.getName()) ||ApplicationUtils.Checknotnull_int(newActivity.getCharge(),newActivity.getUserid())){

            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        newActivity.setPublishtime(ApplicationUtils.dateToStrLong(new Date()));
        newActivity.setSmReimbursetype(3);
        newActivity.setSuEndtime(2);
        newActivity.setSuNametype(1);
        newActivity.setSuPhonetype(1);
        newActivity.setSuWechattype(1);
        newActivity.setSuQqtype(1);
        newActivity.setPersontype(2);
        newActivity.setPersonmax(0);
        newActivity.setScancount(0);
        newActivity.setSharecount(0);
        newActivity.setJoinstatus(1);
        newActivity.setGoodactivity(2);
        activityService.publish(newActivity);


        //解析器解析request的上下文
        CommonsMultipartResolver multipartResolver =
                new CommonsMultipartResolver(request.getSession().getServletContext());
        //先判断request中是否包涵multipart类型的数据，
        if(multipartResolver.isMultipart(request)){
            //再将request中的数据转化成multipart类型的数据
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            List<MultipartFile> multipartFileList=multiRequest.getFiles("imagefile");
            String[] imageArrary=multiRequest.getParameterValues("imagedes");

            MultipartFile multipartFiletheme=multiRequest.getFile("imagetheme");
            if(multipartFiletheme!=null){
                String ThemeURL=getImageUrl(newActivity.getId(),multipartFiletheme);
                newActivity.setId(newActivity.getId());
                newActivity.setActivitytheme(ThemeURL);
                activityService.updateactivity(newActivity);
            }


                    if(multipartFileList.size()>=imageArrary.length){


                        for (int li=0;li<multipartFileList.size();li++){
                            NewActivitydetail newActivitydetail=new NewActivitydetail();
                            newActivitydetail.setActivityid(newActivity.getId());
                            MultipartFile file = multipartFileList.get(li);
                            newActivitydetail.setImageurl(getImageUrl(newActivity.getId(),file));
                            if(imageArrary.length>li) {
                                newActivitydetail.setImagedetail(imageArrary[li]);
                                logger.info("图片描述:{}：{}",li,imageArrary[li]);
                            }

                            //保存到数据库中
                            activityService.publishimage(newActivitydetail);
                        }

                    }else if(multipartFileList.size()<imageArrary.length){


                        for (int li=0;li<imageArrary.length;li++){

                            NewActivitydetail newActivitydetail=new NewActivitydetail();

                            newActivitydetail.setActivityid(newActivity.getId());
                            newActivitydetail.setImagedetail(imageArrary[li]);
                            logger.info("图片描述:{}：{}",li,imageArrary[li]);
                            if(multipartFileList.size()>li){
                                MultipartFile file = multipartFileList.get(li);
                                newActivitydetail.setImageurl(getImageUrl(newActivity.getId(),file));
                            }
                            //保存到数据库中
                            activityService.publishimage(newActivitydetail);
                        }

                    }


        }

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);


    }


    /**
     * 获取活动信息
     * @param
     * @param offsetpage
     * @param pagesize
     * @param type
     * @return
     * @throws Exception
     */


    @RequestMapping(value = "/getactivity",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    /**
     * 注：方法执行后，程序会根据类、方法、参数值生成一个方法KEY，并且将方法的结果写入缓存，并设置validTime有效时长，默认10秒，下次调用直接返回缓存，不会进入方法代码逻辑。
     */

    public Object getactivity(@RequestParam(value = "offsetpage",required = false) String offsetpage,
                              @RequestParam(value = "pagesize",required = false) String pagesize,
                              @RequestParam(value = "type",required = false) String  type) throws Exception{

                                  if(ApplicationUtils.Checknotnull(offsetpage,pagesize,type)){
                                      return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
                                  }
                                  int offsetpageint =Integer.parseInt(offsetpage);
                                  int pagesizeint=Integer.parseInt(pagesize);
                                  int typeint=Integer.parseInt(type);


        List<NewActivity> newActivityList= activityService.getactivity(offsetpageint,pagesizeint,typeint);
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.PAGEINFO,new PageInfo<NewActivity>(newActivityList),"activity",newActivityList);
    }


    /**
     * 同步代码块，避免高并发数据错乱
     * @param newActivityCustom
     */
    private void syn(NewActivityCustom newActivityCustom){
        synchronized(newActivityCustom){
            int scancount =newActivityCustom.getNewActivity().getScancount();
            scancount++;
            newActivityCustom.getNewActivity().setScancount(scancount);
            activityService.updateactivity(newActivityCustom.getNewActivity());

        }
    }

    /**
     * 掉转到发布活动信息页            测试
     * @param request
     * @return
     */
    @RequestMapping(value = "/getactivityweb")
    @Authorization
    public ModelAndView publishactivity(HttpServletRequest request,@RequestParam(value = "activityid",required = false) Integer activityid) throws  Exception{
        logger.info("活动id :"+activityid);
        if(activityid==null){
            ModelAndView modelAndView=new ModelAndView("500");
            return modelAndView;
        }
       // activityid=55;
        ModelAndView modelAndView=new ModelAndView("app_activity");
        NewActivityCustom newActivityCustom=activityService.getactivityByid(activityid);
        syn(newActivityCustom);
        modelAndView.addObject("activity",newActivityCustom);
        return  modelAndView;
    }


    /**
     * 根据id 获取一条活动信息
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getactivitydetail",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object getactivitydetail(@RequestParam(value = "id",required = false)String id) throws Exception{

        if(ApplicationUtils.Checknotnull(id)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        int idint=Integer.parseInt(id);
        NewActivityCustom newActivityCustom=activityService.getactivityByid(idint);
        syn(newActivityCustom);
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"activityinformation",newActivityCustom,"id",id);
    }


    /**
     * 报名参加活动
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/join",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object join(HttpServletRequest request,NewJoin newJoin) throws Exception{


//         InputStream in=request.getInputStream();
//        BufferedReader br=new BufferedReader(new InputStreamReader(in));
//        String str =br.readLine();
//        JSONObject ob=JSONObject.parseObject(str);

/*




        String test = request.getParameter("NewJoin");
        NewJoin newJoin= JSON.parseObject(test, NewJoin.class);
*/


        if(ApplicationUtils.Checknotnull(newJoin.getUsernickname(), newJoin.getUsername(),newJoin.getPhone())||
                ApplicationUtils.Checknotnull_int(newJoin.getActivityid(),newJoin.getUserId())){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }

        NewActivity newActivity=activityService.getactivityByidold(newJoin.getActivityid());
        List<NewJoin> newJoinList=activityService.getJoinByid(newJoin.getActivityid());
        int max=newActivity.getPersonmax();
        int count=newJoinList.size();

        //遍历是否已经参加报名
        for(NewJoin newJoinTemp:newJoinList){

            if(newJoinTemp.getUserId().equals(newJoin.getUserId())){
                return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.JOINED);
            }
        }

        if(count>=max && max !=0 ){
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.ERROR_MSG_KEY,CUSTOM_UTIL.JOIN_ACTIVITYMAX);
        }

        //判断活动是否关闭
        if( newActivity.getJoinstatus().equals("2")){
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.ERROR_MSG_KEY,CUSTOM_UTIL.JOIN_CLOSE);
        }

        count++;
        newJoin.setJointime(ApplicationUtils.dateToStrLong(new Date()));
        activityService.joinactivity(newJoin);
        newActivity.setPersoncount(count);
        activityService.updateactivity(newActivity);
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }

    /**
     * 根据活动id 查找活动报名人数
     * @param id
     * @return
     */
    @RequestMapping(value = "/joinperson",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object joinperson(@RequestParam(value = "id",required = false)String id){

        if(ApplicationUtils.Checknotnull(id)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        int idint =Integer.parseInt(id);
        List<NewJoin> newJoinList=activityService.getJoinByid(idint);
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"newJoinList",newJoinList,CUSTOM_UTIL.PAGEINFO,new PageInfo<NewJoin>(newJoinList));
    }

    /**
     * 报名审核
     * @param id  报名活动用户id
     * @param cmd
     * @return
     */
    @RequestMapping(value = "/check",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object check(@RequestParam(value = "id",required = false)String id,
                        @RequestParam(value = "cmd",required = false)String cmd){

        if(ApplicationUtils.Checknotnull(id,cmd)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        int idint=Integer.parseInt(id);
        int cmdint =Integer.parseInt(cmd);
        NewJoin newJoin=activityService.getoneJoin(idint);
        newJoin.setJoinstatus(cmdint);
        activityService.updateoneJoin(newJoin);
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }

    /**
     * 活动报名开关
     * @param id   活动信息id
     * @param cmd
     * @return
     */
    @RequestMapping(value = "/openorclose",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public  Object openorclose(@RequestParam(value = "id",required = false)String id,
                               @RequestParam(value = "cmd",required = false)String cmd){

        if(ApplicationUtils.Checknotnull(id,cmd)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        int idint=Integer.parseInt(id);
        int cmdint =Integer.parseInt(cmd);

        NewActivity newActivity=activityService.getactivityByidold(idint);

            newActivity.setJoinstatus(cmdint);
                activityService.updateactivity(newActivity);


        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);

    }


    /**
     * 附近的活动
     * @param longitude   当前经度
     * @param latitude    当前纬度
     * @param offsetpage
     * @param pagesize
     * @return
     */
    @RequestMapping(value = "/nearlyactivity",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public  Object test(@RequestParam(value = "longitude",required = false)double longitude,
                               @RequestParam(value = "latitude",required = false)double latitude,
                        @RequestParam(value = "offsetpage",required = false) Integer offsetpage,
                        @RequestParam(value = "pagesize",required = false) Integer pagesize){

        if(ApplicationUtils.Checknotnull_int(offsetpage,pagesize)){
          return   ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }

      List<NewActivity> newActivityList=activityService.findNearlyActivity(offsetpage,pagesize,longitude,latitude);

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.PAGEINFO,new PageInfo<NewActivity>(newActivityList),"nearlyactivity",newActivityList);

    }



}
