package com.eliteams.quick4j.web.controller.app_api;


import com.alibaba.fastjson.JSONObject;
import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;

import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.authorization.tokenManager.TokenManager;
import com.eliteams.quick4j.web.authorization.tokenModel.TokenModel;
import com.eliteams.quick4j.web.model.TFriend;
import com.eliteams.quick4j.web.model.TUser;
import com.eliteams.quick4j.web.model.VO.TFriendVO;
import com.eliteams.quick4j.web.service.NewInvitenumberService;
import com.eliteams.quick4j.web.service.TFriendService;
import com.eliteams.quick4j.web.service.TUserMapperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.alibaba.fastjson.JSON.toJSON;
import static com.alibaba.fastjson.JSON.toJSONString;

/**
 * app 开发接口
 *
 * @author StarZou
 * @since 2014年5月28日 下午3:54:00
 **/
@Controller
@RequestMapping(value = "/api/user")
public class App_api_UserController {

    @Autowired
    private TokenManager tokenManager;

    @Autowired
    private RedisTemplate<Long,String> redisTemplate;

    @Resource
    private TUserMapperService tUserMapperService;
    @Resource
    private NewInvitenumberService newInvitenumberService;

    @Resource
    private TFriendService tFriendService;

    private static final Logger logger = LoggerFactory.getLogger(App_api_UserController.class);
    private String status;
    private String error_msg;

    //初始化函数
  /*  @ModelAttribute
    public void setReqAndRes() {

//        logger.info("服务器下发到至手机设备1:{},发送数据:{}",phonenumber,s);
        // logger.info("run 1");
        logger.info("运行1");

    }*/

    /**
     * 初始化响应数据
     * @param status
     * @param error_msg
     * @param tUser    响应数据信息
     * @return
     */
    private String InitResponse(String status,String error_msg,TUser tUser)
    {
        String     result;
        JSONObject resJSONObj= new JSONObject();
        resJSONObj.put("status",status);
        if(error_msg!=null)
        {
            resJSONObj.put("error_msg",error_msg);
        }else {
            if(tUser!=null)
                resJSONObj.put("user",tUser);
        }

        result= toJSONString(resJSONObj);

        return result;

    }

    /**
     * 生成新的token
     * @return
     */
    private String new_access_token()
    {
        String $access_token = null;

        try {
            do{
                $access_token = RandomUtil.generateString(9);
    
            }while(tUserMapperService.access_token_exists($access_token));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return $access_token;

    }

    /**
     * 生产唯一TOKEN
     * @return
     */
    private String new_access_uniqtoken()
    {
        String $access_token = null;

        try {
            do{
                $access_token ="w"+ RandomUtil.generateStringnumber(8);

            }while(tUserMapperService.access_uinqtoken_exists($access_token));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return $access_token;

    }


    /**
     * 初始化插入数据
     * @param tUser
     * @return
     */
    private TUser iniTUser(TUser tUser){


        tUser.setIsPhoneAuth(1);
        tUser.setIsShare(1);
        tUser.setIsVisible(1);
        tUser.setWowoCount(0);
        tUser.setAttractionCount(0);
        tUser.setStayCount(0);
        tUser.setEnterainmentCount(0);
        tUser.setFoodCount(0);
        tUser.setPoints(0);
        tUser.setLicenseAuthStatus(1);
        tUser.setRole(1);
        tUser.setIsValid(1);
        tUser.setIsBlack(0);


        tUser.setAccessToken(new_access_token());
        tUser.setUniqueToken(new_access_uniqtoken());
        tUser.setIcon(CUSTOM_UTIL.DEFAULT_ICON);
        tUser.setCreatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tUser.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tUser.setLastLoginDate(ApplicationUtils.dateToStrLong(new Date()));

        return tUser;

    }


    /**
     * 用户登录
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/new_login",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public Object login(HttpServletRequest request) {
        logger.info("运行2");
        String result=null;
        JSONObject resJSONObj = new JSONObject();
        List<TUser> tUserList;



        String login_id= request.getParameter("login_id");
        String password= request.getParameter("password");
        // request.getSession().setAttribute("userInfo", authUserInfo);

        if(login_id==null||password==null)
        {
            result=InitResponse(CUSTOM_UTIL.STATUS_NG, CUSTOM_UTIL.PASSWORD_NULL,null);
            return result;

        }


        try {
            tUserList= tUserMapperService.function_selectByExample(login_id);


            if(tUserList.size()>1|| tUserList.size()==0)
            {//用户不存在
                result=InitResponse(CUSTOM_UTIL.STATUS_NG, CUSTOM_UTIL.USER_NULL,null);
                return result;

            }

            if(tUserList.size()==1)
            {
                TUser tUser=tUserList.get(0);
                if(tUser.getPassword().equals(ApplicationUtils.md5Hex(password)))
                {
                 // String new_token=new_access_token();
                    TokenModel tokenModel=tokenManager.createToken(tUser.getId());
                    //tUser.setAccessToken(new_token);
                    tUser.setAccessToken(tokenModel.getToken());
                    tUser.setLastLoginDate(ApplicationUtils.dateToStrLong(new Date()));
                   tUser.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
                    tUserMapperService.function_updateByExample(tUser);
                    tUser.setPassword(null);

                    result=InitResponse(CUSTOM_UTIL.STATUS_OK,null,tUser);
                    return result;

                }else
                {//密码错误
                    result=InitResponse(CUSTOM_UTIL.STATUS_NG, CUSTOM_UTIL.PASSWORD_ERROR,null);
                    return result;

                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;


    }

    /**
     * 第三方登录
     * @param request
     * @return
     */
    @RequestMapping(value = "/login",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public  Object loginother(HttpServletRequest request,
                              @RequestParam(value = "name",required = false ) String name,
                              @RequestParam(value = "sns_id",required = false) String sns_id,
                              @RequestParam(value = "sns_type",required = false) Integer sns_type,
                              @RequestParam(value = "icon",required = false)String icon) throws  Exception{

        TUser tUser=tUserMapperService.findTuerBySns(sns_id,sns_type);
        if(tUser==null){


            for(int i = 2; i<=100; i++) {
                Boolean nameflag = tUserMapperService.name_exists(name);
                if(nameflag) {
                    name = name+i;
                }else{
                    break;
                }
            }


            TUser tUser2=iniTUser(new TUser());
            tUser2.setName(name);
            tUser2.setSnsId(sns_id);
            tUser2.setSnsType(sns_type);
            tUser2.setIcon(icon);

            try {
                //插入用户
                tUserMapperService.function_insert(tUser2);
                TokenModel tokenModel=tokenManager.createToken(tUser2.getId());
                tUser2.setAccessToken(tokenModel.getToken());
                tUser2.setLastLoginDate(ApplicationUtils.dateToStrLong(new Date()));
                tUser2.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
                tUserMapperService.function_updateByExample(tUser2);

            } catch (Exception e) {
                e.printStackTrace();
            }

          return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"user",tUser2);


        }

        TokenModel tokenModel=tokenManager.createToken(tUser.getId());
        tUser.setAccessToken(tokenModel.getToken());
        tUser.setLastLoginDate(ApplicationUtils.dateToStrLong(new Date()));
        tUser.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tUserMapperService.function_updateByExample(tUser);

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"user",tUser);


    }
    /**
     * 用户注册
     * @param request
     * @return
     */

    @RequestMapping(value = "/new_regist",produces = "text/html;charset=UTF-8")
    public  @ResponseBody Object new_regist(HttpServletRequest request){
        String result=null;

        String phone= request.getParameter("phone");
        String name= request.getParameter("name");
        String password= request.getParameter("password");
        String invitenumber=request.getParameter("invitenumber");


            if( name==null||"窝友之家".equals(name.trim()) || "".equals(name.trim())) {//用户名不合法
                result=InitResponse(CUSTOM_UTIL.STATUS_NG, CUSTOM_UTIL.USER_ILLEGAL,null);
                return result;
            }

        try {
            if(tUserMapperService.name_exists(name))
            {//用户名已经存在
                result=InitResponse(CUSTOM_UTIL.STATUS_NG, CUSTOM_UTIL.USER_NAME_EXIST,null);
                return result;
    
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //校验手机是否存在
            if(tUserMapperService.phone_exists(phone))
            {
                result=InitResponse(CUSTOM_UTIL.STATUS_NG, CUSTOM_UTIL.PHONE_EXIST,null);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //邀请码注册  给邀请者 加积分
        if(invitenumber.length()==10 &&invitenumber!=null){

            try {
              String User_unique_token=  newInvitenumberService.finduserByinvitenumber(invitenumber);
              List<TUser> list= tUserMapperService.function_selectByExample_User_unique_token(User_unique_token);
                if(list.size()==1)
                {
                   TUser tUser= list.get(0);
                   tUser.setPoints(tUser.getPoints()+CUSTOM_UTIL.ADD_POINTS_INVITEFRIEND);
                    tUserMapperService.function_updateByExample(tUser);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        TUser tUser=iniTUser(new TUser());
        tUser.setPhone(phone);
        tUser.setName(name);
        tUser.setPassword(ApplicationUtils.md5Hex(password));

        try {
            //插入用户
            tUserMapperService.function_insert(tUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        result=InitResponse(CUSTOM_UTIL.STATUS_OK,null,null);


        return result;
    }


  /**
     * 重新设置密码
     * @param request
     * @return
     */
    @RequestMapping(value = "/reset_phone_password",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public Object reset_phone_password(HttpServletRequest request) throws  Exception{
          String phone=request.getParameter("phone");
          String password=request.getParameter("password");
           List<TUser> tUserList=tUserMapperService.function_selectByExample(phone);

        if(tUserList.size()==1){
            TUser tUser=tUserList.get(0);
            tUser.setPassword(ApplicationUtils.md5Hex(password));
            tUserMapperService.function_updateByExample(tUser);

        }else {
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.USER_NULL);
        }

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }


    /**
     * 退出登录
     * @param request
     * @return
     */
    @RequestMapping(value="/delete",produces="text/html;charset=UTF-8")
    @ResponseBody
    public Object delete(HttpServletRequest request){
        String access_token=request.getParameter("access_token");
        Assert.notNull(access_token, "access_token 为空！");

        String[] param = access_token.split("_");
        if (param.length != 2) {
            return null;
        }
        long userId = Long.parseLong(param[0]);
        String token = param[1];

        String token2 = redisTemplate.boundValueOps(userId).get();
        if (token2 == null || !token2.equals(token)) {
          return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.TOKEN_ERROR);
        }
        tokenManager.deleteToken(userId);
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }


    /**
     * 商户认证
     * @param user_id
     * @param shopPhone
     * @param shopName
     * @param shopAddress
     * @param kCode
     * @param shopLng
     * @param shopLat
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user_auth",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public Object user_auth(
            @RequestParam(value = "user_id",required = false)String user_id,
            @RequestParam(value = "shopPhone",required = false)String shopPhone,
            @RequestParam(value = "shopName",required = false)String shopName,
            @RequestParam(value = "shopAddress",required = false)String shopAddress,
            @RequestParam(value = "kCode",required = false)String kCode,
            @RequestParam(value = "shopLng",required = false)String shopLng,
            @RequestParam(value = "shopLat",required = false)String shopLat,
            HttpServletRequest request
    )throws  Exception{

        if(ApplicationUtils.Checknotnull(user_id,shopPhone,shopName,shopAddress,shopLng,shopLat)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        TUser tUser=    tUserMapperService.FindUserById(Integer.parseInt(user_id));
        //审核成功
        if(tUser.getLicenseAuthStatus()==3){
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.MSG_KEY,CUSTOM_UTIL.BUSINESS_AUDITED);
        }
        //审核中
        if(tUser.getLicenseAuthStatus()==2){
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.MSG_KEY,CUSTOM_UTIL.BUSINESS_AUDITING);
        }

        //未审核 未通过
        if(tUser.getLicenseAuthStatus()==1 ||tUser.getLicenseAuthStatus()==4){

            tUser.setShopPhone(shopPhone);
            if(tUser.getPhone()==null ||tUser.getPhone().trim()==""){
                tUser.setPhone(shopPhone);
                tUser.setIsPhoneAuth(1);
            }
            tUser.setShopName(shopName);
            tUser.setShopAddress(shopAddress);
            tUser.setkCode(kCode);
            tUser.setShopLng(Double.valueOf(shopLng));
            tUser.setShopLat(Double.valueOf(shopLat));
            List<String> imageList=   ApplicationUtils.upImageToOss(request,user_id,CUSTOM_UTIL.BUSINESS_AUTH);
            if(imageList.size()>=1)
                tUser.setLicense(imageList.get(0));
            tUserMapperService.function_updateByExample(tUser);
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
        }

        return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.LICENSE_AUTH_STATUS);
    }


    /**
     * 我的粉丝
     * @param user_id
     * @return
     */
    @RequestMapping(value = "/my_fans",produces = "text/html;charset=UTF-8")
    @Authorization
    @ResponseBody
    public Object my_fans(@RequestParam(value = "user_id")String user_id){
        List<TFriendVO> tFriendVOList=tUserMapperService.getMyFans(Integer.parseInt(user_id));

   /*  List<TFriend> tFriendList= tFriendService.getFriendByUserId(Integer.parseInt(user_id));*/
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"fans",tFriendVOList);
    }


}
