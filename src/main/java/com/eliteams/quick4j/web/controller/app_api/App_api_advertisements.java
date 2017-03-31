package com.eliteams.quick4j.web.controller.app_api;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.UTF8Decoder;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.model.NewAdvertisement;
import com.eliteams.quick4j.web.service.NewAdvertisementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import static com.alibaba.fastjson.JSON.toJSONString;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/16.
 */
@Controller
@RequestMapping(value = "/api/advertisement")
public class App_api_advertisements {

    @Autowired
    private NewAdvertisementService newAdvertisementService;


    private static final Logger logger= LoggerFactory.getLogger(App_api_ShareController.class);
    private String status;
    private String error_msg;




    @RequestMapping(value = "/adver_index",produces = "text/html;charset=UTF-8")
    @Authorization
    private  @ResponseBody String invitefriend(HttpServletRequest request){
        String result=null;
        List<NewAdvertisement> list = null;

        try {
          list  =newAdvertisementService.function_example();

        } catch (Exception e) {
            e.printStackTrace();
        }

        JSONObject resJSONObj= new JSONObject();
        resJSONObj.put("status", CUSTOM_UTIL.STATUS_OK);
        resJSONObj.put("advertisement",list);
        result= toJSONString(resJSONObj);
        return result;
    }

}
