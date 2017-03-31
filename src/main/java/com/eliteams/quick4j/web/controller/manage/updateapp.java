package com.eliteams.quick4j.web.controller.manage;

import com.aliyun.oss.OSSClient;
import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;
import com.eliteams.quick4j.web.model.NewSoftware;
import com.eliteams.quick4j.web.service.SoftwareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.Iterator;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/12.
 */
@Controller
@RequestMapping(value = "/manage/software")
public class updateapp {


    @Resource
    SoftwareService softwareService;

    private static final Logger logger= LoggerFactory.getLogger(updateapp.class);
    @ModelAttribute
    public void Init(){
        logger.info("app软件更新管理");
    }


    /**
     * 跳转到 app 更新
     * @return
     */

    @RequestMapping(value = "updateapp",produces = "text/html;charset=UTF-8")
   public ModelAndView updateapp(){

        NewSoftware newSoftware= softwareService.getnewapp();
        if(newSoftware !=null){
            ModelAndView modelAndView=new ModelAndView("updateapp");
            modelAndView.addObject("rangeupdateminid",newSoftware.getRangeupdateminid());
            modelAndView.addObject("rangeupdatemaxid",newSoftware.getRangeupdatemaxid());
            modelAndView.addObject("version",newSoftware.getVersion());
            modelAndView.addObject("appurl",newSoftware.getAppurl());
            modelAndView.addObject("publishdate",newSoftware.getPublishdate());
            modelAndView.addObject("newdescribe",newSoftware.getNewdescribe());
            return modelAndView;
        }

        ModelAndView modelAndView=new ModelAndView("404");
        return modelAndView;
    }


    @RequestMapping(value = "updateappinformation",produces = "text/html;charset=UTF-8")
    public String updateappinformation(HttpServletRequest request) throws  Exception{

            String rangeupdateminid=  request.getParameter("rangeupdateminid");
            String rangeupdatemaxid=  request.getParameter("rangeupdatemaxid");
            String version=  request.getParameter("version");
            String newdescribe=  request.getParameter("newdescribe");

            logger.info("最小更新id：{}",rangeupdateminid);
            logger.info("最大更新id：{}",rangeupdatemaxid);
            logger.info("程序版本：{}",version);
            logger.info("描述：{}",newdescribe);





        //解析器解析request的上下文
        CommonsMultipartResolver multipartResolver =
                new CommonsMultipartResolver(request.getSession().getServletContext());
        //先判断request中是否包涵multipart类型的数据，
        if(multipartResolver.isMultipart(request)){
            //再将request中的数据转化成multipart类型的数据
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            Iterator iter = multiRequest.getFileNames();
            while(iter.hasNext()){
                MultipartFile file = multiRequest.getFile((String)iter.next());
                if(file != null){
                    String fileName = file.getOriginalFilename();
                    String  id="10000";

                    //文件名，加后缀名
                    //             fileName=fileName.substring(0, fileName.lastIndexOf(".")) + fileName.substring(fileName.lastIndexOf("."), fileName.length());
                    String prefixion=id+"_app"+System.currentTimeMillis() + RandomUtil.generateStringnumber(5);
                    String fileSuffix=fileName.substring(fileName.lastIndexOf("."), fileName.length());
                    fileName=prefixion+fileSuffix;
                    String path = "E:/testapp/" + fileName;
                    File localFile = new File(path);

                    //写文件到本地
                    file.transferTo(localFile);

                    // 创建OSSClient实例
                    OSSClient ossClient = new OSSClient(CUSTOM_UTIL.endpoint,CUSTOM_UTIL.accessKeyId ,CUSTOM_UTIL.accessKeySecret);
                    // 上传文件
                    ossClient.putObject(CUSTOM_UTIL.BucketName,fileName, localFile);
                    String Imageurl=CUSTOM_UTIL.ImageBaseURL+fileName;
                    logger.info(Imageurl);


                    NewSoftware newSoftware=new NewSoftware();
                    newSoftware.setRangeupdateminid(Integer.parseInt(rangeupdateminid));
                    newSoftware.setRangeupdatemaxid(Integer.parseInt(rangeupdatemaxid));
                    newSoftware.setVersion(version);
                    newSoftware.setNewdescribe(newdescribe);
                    newSoftware.setPublishdate(ApplicationUtils.dateToStrLong(new Date()));
                    newSoftware.setAppurl(Imageurl);
                    softwareService.updateapp(newSoftware);


                    // 关闭client
                    ossClient.shutdown();



                }
            }
        }


        return "redirect:/rest/manage/software/updateapp";
    }



}
