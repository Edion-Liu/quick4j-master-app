package com.eliteams.quick4j.web.controller.app_api;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import static com.alibaba.fastjson.JSON.toJSONString;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/22.
 */
@Controller
@RequestMapping(value = "/api/users")
public class Testupimage {

    private static final Logger logger= LoggerFactory.getLogger(Testupimage.class);
    @ModelAttribute
    public void setReqAndRes() {

        logger.info("非常好点点滴滴");

    }

    @RequestMapping(value = "/testimage",produces = "text/html;charset=UTF-8")
    public String login(HttpServletRequest request) {
        return "testimage";

    }

    @ResponseBody
    @RequestMapping(value="upload2",produces = "text/html;charset=UTF-8")
    public String upLoad2(HttpServletRequest request, HttpServletResponse response)
            throws IllegalStateException, IOException {


     String adtype=   request.getParameter("adtype");
        System.out.println(adtype);
        String adlink=   request.getParameter("adlink");
        System.out.println(adlink);


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
                    String prefixion=id+"_a"+System.currentTimeMillis() +RandomUtil.generateStringnumber(5);
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
                    String Imageurl=CUSTOM_UTIL.ImageBaseURL+fileName;
                    logger.info(Imageurl);
                    // 删除
                    //ossClient.deleteObject(CUSTOM_UTIL.BucketName, fileName);

                    // 关闭client
                    ossClient.shutdown();



                }
            }
        }

        String  result=null;
        JSONObject resJSONObj= new JSONObject();
        resJSONObj.put("status", CUSTOM_UTIL.STATUS_OK);
        result=toJSONString(resJSONObj);
        return result;

    }




}