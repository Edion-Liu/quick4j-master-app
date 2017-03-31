package com.eliteams.quick4j.web.controller.manage;

import com.alibaba.druid.stat.TableStat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.aliyun.oss.OSSClient;
import com.eliteams.quick4j.core.entity.Modle;
import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;
import com.eliteams.quick4j.web.controller.app_api.App_api_yuebanController;
import com.eliteams.quick4j.web.model.NewYueban;
import com.eliteams.quick4j.web.model.NewYuebanCoustom;
import com.eliteams.quick4j.web.model.NewYuebanimage;
import com.eliteams.quick4j.web.service.YuebanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.alibaba.fastjson.JSON.toJSONString;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/23.
 */
@Controller
@RequestMapping(value = "/manage/yueban")
public class new_yueban {
    @Resource
    private YuebanService yuebanService;

    private static final Logger logger= LoggerFactory.getLogger(App_api_yuebanController.class);


    /**
     * 跳转到约伴界面
     * @param request
     * @return
     */
    @RequestMapping(value = "/yuebanget",produces = "text/html;charset=UTF-8")
    public String yuebanget(HttpServletRequest request)  {
        return "yuebanget";
    }

    @ResponseBody
    @RequestMapping(value = "/yuebangetInfromation",produces = "text/html;charset=UTF-8")
    public String yuebangetInfromation(HttpServletRequest request) throws Exception {

         JSONObject all=new JSONObject();

        String callback = request.getParameter("callback");
        logger.info("回调函数名:{}",callback);
        if(callback.equals("deleteyueban"))
        {
            String idstr=request.getParameter("id");
            int id=Integer.parseInt(idstr);
            yuebanService.yuebandelete(id);
            all.put("status","OK");


        }else if(callback.equals(("getimageyueban")))
        {
            String idstr=request.getParameter("id");
            int id=Integer.parseInt(idstr);
            List<NewYuebanimage> listimage=yuebanService.yuebangetimage(id);
            all.put("status","OK");
            all.put("yuebanimage",listimage);


        }
        else {

            String limit = request.getParameter("limit");      //页面大小
            String offset = request.getParameter("offset");    //偏移量
            int offsetint=Integer.parseInt(offset);
            int limitint=Integer.parseInt(limit);
            List<NewYuebanCoustom> list=yuebanService.get_yueban(offsetint,limitint);
            int yuebancount=yuebanService.get_recordcount();
            logger.info("获取总约伴发布记录数：{}",yuebancount);
            all.put("total",yuebancount);
            all.put("rows",list);

        }



        JSONPObject  jsonpObject=new JSONPObject();
        jsonpObject.setFunction(callback);
        jsonpObject.addParameter(all);
        String result=JSON.toJSONString(jsonpObject);
        return result;



    }


    @ResponseBody
    @RequestMapping(value = "/ajaxtest",produces = "text/html;charset=UTF-8")
    public String ajaxtest(HttpServletRequest request) throws Exception {

        String result=null;

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("test","succeed");
        result=JSON.toJSONString(jsonObject);

        return result;

    }


}
