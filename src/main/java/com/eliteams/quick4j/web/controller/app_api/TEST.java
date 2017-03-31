package com.eliteams.quick4j.web.controller.app_api;

import com.eliteams.quick4j.web.model.NewYueban;
import com.eliteams.quick4j.web.service.YuebanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/13.
 */
@Controller
@RequestMapping(value = "/api/user")
public class TEST {

  @Resource
  private YuebanService yuebanService;
  /*  private static final Logger logger = LoggerFactory.getLogger(App_api_UserController.class);  */
    private static final Logger logger=LoggerFactory.getLogger(TEST.class);
    @ModelAttribute
    public void setReqAndRes() {


        logger.info("非常好点点滴滴");

    }

    @RequestMapping(value = "/new_n",produces = "text/html;charset=UTF-8")
    public void login(HttpServletRequest request) throws  Exception{

      /**
       *
           PageHelper.startPage(page,row);
           page:要显示第几页
           row:每页多少条数据
       */
      PageHelper.startPage(2,20);
      List<NewYueban> list=yuebanService.getallyueban();

    PageInfo<NewYueban> pageinfonewyueban=  new PageInfo<NewYueban>(list);
      System.out.println("页面信息："+pageinfonewyueban);
      for(int i=0;i<pageinfonewyueban.getList().size();i++)
      {
        System.out.println("页面数据信息："+pageinfonewyueban.getList());
      }


      System.out.println("获取数量："+list.size());
      for(NewYueban newy:list)
      {
        System.out.println(newy.toString());
      }


    }




}
