package com.eliteams.quick4j.web.controller.manage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.aliyun.oss.OSSClient;
import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;
import com.eliteams.quick4j.web.controller.app_api.App_api_yuebanController;
import com.eliteams.quick4j.web.model.NewAdvertisement;
import com.eliteams.quick4j.web.model.NewYuebanimage;
import com.eliteams.quick4j.web.service.NewAdvertisementService;
import com.eliteams.quick4j.web.service.YuebanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import static com.alibaba.fastjson.JSON.toJSONString;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/28.
 */
@Controller
@RequestMapping(value = "/manage/advertisement")
public class updatenews {


 @Resource
    NewAdvertisementService newAdvertisementService;

    private static final Logger logger= LoggerFactory.getLogger(updatenews.class);

    /**
     * 查询管理头条广告
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/updatenews",produces = "text/html;charset=UTF-8")
    public ModelAndView updatenew(HttpServletRequest request) throws Exception{
        ModelAndView modelAndView=new ModelAndView("manage_updatenews");
        List<NewAdvertisement>  list=newAdvertisementService.function_example();
        modelAndView.addObject("adimage",list);
        return modelAndView;
    }

    /**
     * 添加新的广告
     * @param request
     * @param response
     * @return
     * @throws Exception
     */

    @RequestMapping(value = "/updateimage",produces = "text/html;charset=UTF-8")
   // @ResponseBody
    public String upLoadimage(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String Imageurl=null;


        String adtype=   request.getParameter("adtype");
        logger.info("广告类型：{}",adtype);

        if(ApplicationUtils.Checknotnull(adtype))
        {
            ModelAndView modelAndView=new ModelAndView();
           // return modelAndView;
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        String adlink=   request.getParameter("adlink");
        logger.info("广告链接：{}",adlink);
        String addescribe=request.getParameter("addescribe");
        logger.info("广告描述：{}",addescribe);


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
                    if(fileName!=null && (!"".equals(fileName.trim())))
                    {

                        String  id="ad";
                        //文件名，加后缀名
                        //             fileName=fileName.substring(0, fileName.lastIndexOf(".")) + fileName.substring(fileName.lastIndexOf("."), fileName.length());
                        String prefixion=id+"_a"+System.currentTimeMillis() + RandomUtil.generateStringnumber(5);
                        String fileSuffix=fileName.substring(fileName.lastIndexOf("."), fileName.length());
                        fileName=prefixion+fileSuffix;
                        String path = "E:/testimage/" + fileName;
                        File localFile = new File(path);

                        //写文件到本地
                        file.transferTo(localFile);

                        // 上传文件流
                        //InputStream inputStream = new FileInputStream("localFile");

                        // 创建OSSClient实例
                        OSSClient ossClient = new OSSClient(CUSTOM_UTIL.endpoint,CUSTOM_UTIL.accessKeyId ,CUSTOM_UTIL.accessKeySecret);
                        // 上传文件
                        ossClient.putObject(CUSTOM_UTIL.BucketName,fileName, localFile);
                        Imageurl=CUSTOM_UTIL.ImageBaseURL+fileName;
                        logger.info(Imageurl);
                        // 删除
                        //ossClient.deleteObject(CUSTOM_UTIL.BucketName, fileName);

                        // 关闭client
                        ossClient.shutdown();

                    }

                }
            }
        }



        NewAdvertisement newAdvertisement=new NewAdvertisement();
        newAdvertisement.setAdupdate(ApplicationUtils.dateToStrLong(new Date()));
        newAdvertisement.setAdimage(Imageurl);
        newAdvertisement.setAddescribe(addescribe);
        newAdvertisement.setAdlink(adlink);
        newAdvertisement.setAdtype(Integer.parseInt(adtype));
        newAdvertisement.setAdclickcount(0);
        newAdvertisement.setAdbusiness(1);
        newAdvertisement.setAdvalidtype(1);
        newAdvertisementService.addap(newAdvertisement);


        String  result=null;
        JSONObject resJSONObj= new JSONObject();
        resJSONObj.put("status", CUSTOM_UTIL.STATUS_OK);
        result=toJSONString(resJSONObj);


        return "redirect:/rest/manage/advertisement/updatenews";


    }

    /**
     * 根据id 删除广告
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/deletead",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deletead(HttpServletRequest request) throws Exception{
        String adid=   request.getParameter("id");
        logger.info("删除广告id：{}",adid);
        String callback = request.getParameter("callback");
        logger.info("删除广告deletead：{}",callback);

        if(ApplicationUtils.Checknotnull(adid))
        {
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        newAdvertisementService.deleteAD(Integer.parseInt(adid));

        JSONObject status=new JSONObject();
        JSONPObject jsonpObject=new JSONPObject();
        jsonpObject.setFunction(callback);
        status.put(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
        jsonpObject.addParameter(status);
        String result= JSON.toJSONString(jsonpObject);

        return result;
    }


    @RequestMapping(value = "/updatelinkad",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String updatelinkad( HttpServletRequest request,NewAdvertisement newAdvertisement) throws Exception{
        String id = request.getParameter("id");

        String callback = request.getParameter("callback");
        logger.info("更新广告：{}",callback);
         newAdvertisementService.updatead(newAdvertisement);

        JSONObject status=new JSONObject();
        JSONPObject jsonpObject=new JSONPObject();
        jsonpObject.setFunction(callback);
        status.put(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
        jsonpObject.addParameter(status);
        String result= JSON.toJSONString(jsonpObject);

        return result;

    }
}
