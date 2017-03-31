package com.eliteams.quick4j.web.controller.app_api;

import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.model.NewSoftware;
import com.eliteams.quick4j.web.service.SoftwareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/11.
 */
@Controller
@RequestMapping("/api/software")
public class App_api_softwareController {

    @Resource
    SoftwareService softwareService;


    private static final Logger logger= LoggerFactory.getLogger(App_api_softwareController.class);


    @RequestMapping(value = "/update",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object update(@RequestParam(value ="userid" ,required = false) Integer userid,@RequestParam(value = "version",required = false)String version){


        if(ApplicationUtils.Checknotnull_int(userid) || ApplicationUtils.Checknotnull(version)){
            return  ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }

        NewSoftware newSoftware=softwareService.getnewapp();
        if(newSoftware!=null){
            if((newSoftware.getRangeupdateminid()==0 && newSoftware.getRangeupdatemaxid()==0 && (!newSoftware.getVersion().equals(version))) ||(
                    userid>=newSoftware.getRangeupdateminid() && userid<=newSoftware.getRangeupdatemaxid() && (!newSoftware.getVersion().equals(version))
                    )){

                return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"newapp",newSoftware);
            }
        }



        return         ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.ERROR_MSG_KEY,CUSTOM_UTIL.APPVESION);

    }


}
