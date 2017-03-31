package com.eliteams.quick4j.web.controller.app_api;

import com.alibaba.fastjson.JSONObject;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;
import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.dao.NewInvitenumberMapper;
import com.eliteams.quick4j.web.model.NewInvitenumber;
import com.eliteams.quick4j.web.service.NewInvitenumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static com.alibaba.fastjson.JSON.toJSONString;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/15.
 */
@Controller
@RequestMapping(value = "/api/share")
public class App_api_ShareController {
    @Resource
    private NewInvitenumberService newInvitenumberService;
    @Autowired
    private NewInvitenumberMapper newInvitenumberMapper;

    private static final Logger logger= LoggerFactory.getLogger(App_api_ShareController.class);
    private String status;
    private String error_msg;



    /**
     * 创建新的邀请码
     * @return
     */
    private String new_invitenumber()
    {
        String invitenumber=null;

        try {
            do{
                invitenumber = RandomUtil.generateString(10);

            }while(newInvitenumberService.invitenumber_exists(invitenumber));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return invitenumber;

    }

    /**
     * 邀请好友验证码
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/invite",produces = "text/html;charset=UTF-8")
    @Authorization
    private Object invitefriend(HttpServletRequest request) throws Exception{
        String result=null;
        NewInvitenumber newInvitenumber=new NewInvitenumber();

        String invitenumber=null;

        //获取邀请码
        invitenumber=new_invitenumber();

        String uin=request.getParameter("unique_token");
        JSONObject resJSONObj= new JSONObject();
        if(uin !=null) {

            newInvitenumber.setUniqueToken(uin);
            newInvitenumber.setInvitenumber(invitenumber);
            //更新邀请码
            newInvitenumberMapper.insert(newInvitenumber);

            resJSONObj.put("status", CUSTOM_UTIL.STATUS_OK);
            resJSONObj.put("invitenumber",invitenumber);
            result= toJSONString(resJSONObj);

        }else {

            resJSONObj.put("status",CUSTOM_UTIL.STATUS_NG);
            resJSONObj.put("error_msg",CUSTOM_UTIL.GET_DATDFAIL);
            result=toJSONString(resJSONObj);
        }

        return result;
    }



}
