package com.eliteams.quick4j.web.controller.app_api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.odps.udf.CodecCheck;
import com.aliyun.oss.OSSClient;
import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.core.util.RandomUtil;

import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.dao.NewInvitenumberMapper;
import com.eliteams.quick4j.web.model.*;
import com.eliteams.quick4j.web.service.NewInvitenumberService;
import com.eliteams.quick4j.web.service.YuebanService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import static com.alibaba.druid.util.Utils.read;
import static com.alibaba.fastjson.JSON.toJSONString;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/20.
 */
@Controller
@RequestMapping("/api/yueban")
public class App_api_yuebanController {




    @Resource
    private YuebanService yuebanService;
    private static final  Logger logger=LoggerFactory.getLogger(App_api_yuebanController.class);


    /**
     * 生成新的uinque
     * @return
     */
    private String new_access_token()
    {
        String $access_token = null;

        try {
            do{
                $access_token = RandomUtil.generateString(9);

            }while(yuebanService.access_token_exists($access_token));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return $access_token;

    }



    /**
     * 发布新的约伴信息
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/yueban_publish_information",produces = "text/html;charset=UTF-8")
    @ResponseBody
    @Authorization
    public Object yueban_publish_information(HttpServletRequest request,NewYueban newYueban) throws Exception{
    //public Object yueban_publish_information(HttpServletRequest request) throws IllegalStateException, IOException,Exception {
        String result=null;
      /*  NewYueban newYueban=new NewYueban();
        String test= request.getParameter("release");
        newYueban=JSON.parseObject(test,NewYueban.class);*/
        //校验指定字段
        if(newYueban==null||ApplicationUtils.Checknotnull_int(newYueban.getYuebantype(),newYueban.getYuebanplan(),
                newYueban.getYuebanprotocolstatus(),newYueban.getYuebanuserId()) || ApplicationUtils.Checknotnull(newYueban.getYuebanpublishtime(),
                newYueban.getYuebandescription(),newYueban.getYuebancurrentadress(), newYueban.getYuebanwecat(),
                newYueban.getYuebanqq(),newYueban.getYuebancall(),newYueban.getYuebanicon(),newYueban.getYuebanname())){

            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        //存储约伴信息
        newYueban.setYuebanscore(0);
        newYueban.setUinque(new_access_token());
        yuebanService.publish_yueban(newYueban);
        int yuebanid=yuebanService.getyuebnaid(newYueban.getUinque());

        //存储约伴图片


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

                    if(fileName!=null && (!"".equals(fileName.trim()))){
                        //文件名，加后缀名
                        String prefixion = newYueban.getYuebanuserId() + "_a" + System.currentTimeMillis() + RandomUtil.generateStringnumber(5);
                        //   String prefixion=10000+"_a"+System.currentTimeMillis() +RandomUtil.generateStringnumber(5);
                        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
                        fileName = prefixion + fileSuffix;
                        String path = "E:/testimage/" + fileName;
                        File localFile = new File(path);

                        //写文件到本地
                        file.transferTo(localFile);

                        // 创建OSSClient实例
                        OSSClient ossClient = new OSSClient(CUSTOM_UTIL.endpoint, CUSTOM_UTIL.accessKeyId, CUSTOM_UTIL.accessKeySecret);
                        // 上传文件
                        ossClient.putObject(CUSTOM_UTIL.BucketName, fileName, localFile);
                        String Imageurl = CUSTOM_UTIL.ImageBaseURL + fileName;
                        logger.info(Imageurl);

                        //保存图片路径
                        NewYuebanimage newYuebanimage = new NewYuebanimage();
                        newYuebanimage.setImageurl(Imageurl);
                        newYuebanimage.setYuebanid(yuebanid);
                        //  newYuebanimage.setYuebanid(10000);
                        yuebanService.yuebanimage(newYuebanimage);
                        // 删除
                        //ossClient.deleteObject(CUSTOM_UTIL.BucketName, fileName);

                        // 关闭client
                        ossClient.shutdown();


                    }
                }
            }
        }

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }


    /**
     * 获取约伴信息
     * @param offsetpage  显示第几页
     * @param pagesize    每页显示数量
     * @param area       省份
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/yueban_get_information",produces = "text/html;charset=UTF-8")
    @Authorization
    public Object yueban_get(@RequestParam(value="offsetpage" ,required =false ) String  offsetpage , @RequestParam(value="pagesize" ,required =false ) String pagesize,
                             @RequestParam(value="area" ,required =false ) String area, HttpServletRequest request) throws Exception{
        if(ApplicationUtils.Checknotnull(offsetpage,pagesize,area)) {
            return  ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }


        //获取约伴信息
        List<NewYuebanCoustom> list= yuebanService.get_latest_pagehelperService(Integer.parseInt(offsetpage),Integer.parseInt(pagesize),Integer.parseInt(area));
        //对每条约伴信息 进行查找评论
        for (int i=0;i<list.size();i++) {
            //获取每条约伴信息的照片
           list.get(i).setListimage(yuebanService.yuebangetimage(list.get(i).getId()));

            //获取约伴评论 针对约伴信息的评论  根据约伴信息id 查找
            list.get(i).setListcommentCoustom(yuebanService.getcomment_yuebanCustom3(list.get(i).getId()));
            //list.get(i).setListcommentCoustom(yuebanService.getcomment_yuebanCustom(list.get(i).getId()));
            //对每条评论进行查找 回复
            /*for (int j=0;j<list.get(i).getListcommentCoustom().size();j++) {
                List<NewYuebanreply> listreply= yuebanService.getreply_yueban(list.get(i).getListcommentCoustom().get(j).getId());
                if(listreply.size()>=1) {
                    list.get(i).getListcommentCoustom().get(j).setListreply(listreply);

                }

            }*/

        }

        return  ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.PAGEINFO,new PageInfo<NewYuebanCoustom>(list),"yueban",list);
    }

    /**
     * 对发布的约伴信息进行评论
     * @param
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/yueban_comment",produces = "text/html;charset=UTF-8")
    @Authorization
    public Object yueban_comment(NewYuebancomment newYuebancomment) throws Exception{
        if( ApplicationUtils.Checknotnull_int(newYuebancomment.getYuebanid(),newYuebancomment.getYuebancommentid()) ||
                ApplicationUtils.Checknotnull(newYuebancomment.getYuebancommenticon())) {
            return  ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        newYuebancomment.setYuebantime(ApplicationUtils.dateToStrLong(new Date()));
        //插入评论
        yuebanService.comment_yueban(newYuebancomment);
        return  ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
    }


    /**
     * 获取一条约伴信息 的所有评论和回复
     * @param yuebanid
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/yueban_getcomments",produces = "text/html;charset=UTF-8")
    @Authorization
    public Object yueban_getcomments(@RequestParam(value = "yuebanid",required = false) String yuebanid) throws Exception{
        if(ApplicationUtils.Checknotnull(yuebanid)) {
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        int yuebanidint=Integer.parseInt(yuebanid);
        List<NewYuebancommentCustom> list=yuebanService.getcomment_yuebanCustom(yuebanidint);
        for (int j=0;j<list.size();j++) {
                List<NewYuebanreply> listreply= yuebanService.getreply_yueban(list.get(j).getId());
                if(listreply.size()>=1) {
                    list.get(j).setListreply(listreply);

                }

            }
            return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"yuebancomment",list,"yuebanid",yuebanid);
    }

    /**
     * 对约伴评论进行回复
     * @param newYuebanreply
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/yueban_comment_reply",produces = "text/html;charset=UTF-8")
    @Authorization
    public Object yueban_reply(NewYuebanreply newYuebanreply) throws Exception{

        if(ApplicationUtils.Checknotnull(newYuebanreply.getYuebanreplycontent(),
                newYuebanreply.getYuebanreplyto(),newYuebanreply.getYuebanreplyusername())||ApplicationUtils.Checknotnull_int(newYuebanreply.getYuebancommentreplyid())) {
            return  ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }

        newYuebanreply.setYuebanreplydate(ApplicationUtils.dateToStrLong(new Date()));
        yuebanService.reply_yuban(newYuebanreply);
        return  ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);


    }

    /**
     * 删除约伴信息
     * @param yuebanid
     * @return
     * @throws Exception
     */

    @ResponseBody
    @RequestMapping(value = "/yueban_delete",produces = "text/html;charset=UTF-8")
    @Authorization
    public Object yueban_delete(@RequestParam(value = "yuebanid",required = false) String yuebanid) throws  Exception{
        if(ApplicationUtils.Checknotnull(yuebanid)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }
        yuebanService.yuebandelete(Integer.parseInt(yuebanid));
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);

    }

    /**
     * 获取个人发布约伴信息
     * @param yuebanuser_id
     * @param offsetpage
     * @param pagesize
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/yueban_get_information_person",produces = "text/html;charset=UTF-8")
    @Authorization
    public Object yueban_get_information_person(@RequestParam(value = "yuebanuser_id",required = false)String yuebanuser_id,
                                                @RequestParam(value="offsetpage" ,required =false ) String  offsetpage ,
                                                @RequestParam(value="pagesize" ,required =false ) String pagesize) throws Exception{
        if(ApplicationUtils.Checknotnull(yuebanuser_id)){

        }


        //获取对应记录的图片信息
        //  List<NewYuebanCoustom> list= yuebanService.get_yueban(0,10);
        //
       List<NewYuebanCoustom> list= yuebanService.get_latest_pagehelperServicebyUserid(Integer.parseInt(offsetpage),Integer.parseInt(pagesize),Integer.parseInt(yuebanuser_id));


        List<NewYuebancommentCustom> listcomment=null;
        for(int i=0;i<list.size();i++){

            listcomment=yuebanService.getcomment_yuebanCustom(list.get(i).getId());
            for (int j=0;j<listcomment.size();j++) {
                List<NewYuebanreply> listreply= yuebanService.getreply_yueban(listcomment.get(j).getId());
                if(listreply.size()>=1) {
                    listcomment.get(j).setListreply(listreply);

                }

            }
        }


        return  ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,CUSTOM_UTIL.PAGEINFO,new PageInfo<NewYuebanCoustom>(list),"yueban",list,"yuebancomment",listcomment);

    }


}
