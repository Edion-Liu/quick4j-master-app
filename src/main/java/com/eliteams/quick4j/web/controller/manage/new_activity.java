package com.eliteams.quick4j.web.controller.manage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.web.controller.app_api.App_api_yuebanController;
import com.eliteams.quick4j.web.model.NewActivity;
import com.eliteams.quick4j.web.model.NewActivityCustom;
import com.eliteams.quick4j.web.model.NewActivitydetail;
import com.eliteams.quick4j.web.model.NewWallet;
import com.eliteams.quick4j.web.service.ActivityService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/17.
 */
@Controller
@RequestMapping(value = "/manage/activity")
public class new_activity {

    @Resource
    ActivityService activityService;
    private static final Logger logger= LoggerFactory.getLogger(new_activity.class);

    /**
     * 掉转到发布活动信息页
     * @param request
     * @return
     */
    @RequestMapping(value = "/publishactivity")
    public ModelAndView publishactivity(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView("activity");
        return  modelAndView;
    }


    /**
     * 获取所有发布活动内容信息
     * @param request
     * @param offset
     * @param limit
     * @param search
     * @return
     */
    @RequestMapping(value = "/getdata",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public  String getdata(HttpServletRequest request, @RequestParam(value = "offset",required = false) Integer offset,
    @RequestParam(value = "limit",required = false)Integer limit,@RequestParam(value = "search",required = false)String search){
        List<NewActivity> newActivityList=null;
        String result=null;

       /* String callback = request.getParameter("callback");
        logger.info("回调函数名:{}",callback);*/

        if(search==null ||search.equals("") ||search.equals("搜索")){

            newActivityList=  activityService.getactivity(offset,limit);

    }else {


    }

            JSONObject jsonObject=new JSONObject();
            jsonObject.put("total",new PageInfo<NewActivity>(newActivityList).getTotal());
            jsonObject.put("rows",newActivityList);
            result= JSON.toJSONString(jsonObject);
            return  result;
    }


    /**
     * 通过id 查找活动
     * @param id
     * @return
     */
    @RequestMapping(value = "/getdataByid",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getdataByid(@RequestParam (value = "id",required = false)Integer id)throws Exception{
        String result=null;
       NewActivityCustom newActivityCustom= activityService.getactivityByid(id);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("activity",newActivityCustom);

        result= JSON.toJSONString(jsonObject);
        return  result;

    }

    /**
     * 跳转到报名列表
     * @param request
     * @return
     */
    @RequestMapping(value = "/joinActivityList",produces = "text/html;charset=UTF-8")
    public String joinActivityList(HttpServletRequest request)  {
        return "joinActivityList";
    }

    /**
     * 跳转到查看更多活动列表
     * @param request
     * @return
     */
    @RequestMapping(value = "/activityList",produces = "text/html;charset=UTF-8")
    public String activityList(HttpServletRequest request)  {
        return "activityList";
    }
}
