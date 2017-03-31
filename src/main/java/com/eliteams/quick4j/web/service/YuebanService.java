package com.eliteams.quick4j.web.service;

import com.aliyun.oss.OSSClient;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.web.dao.*;
import com.eliteams.quick4j.web.model.*;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/20.
 */
@Service
public class YuebanService {
    @Autowired
    NewYuebancommentMapper newYuebancommentMapper;
    @Autowired
    NewYuebanimageMapper  newYuebanimageMapper;
    @Autowired
    NewYuebanMapper  newYuebanMapper;

    @Autowired
    NewYuebanreplyMapper newYuebanreplyMapper;

    @Autowired
    NewYuebancommentCustomMapper newYuebancommentMapperCustomMapper;


    /**
     * 验证uinque是否存在
     * @param $access_token
     * @return
     */
    public Boolean access_token_exists(String $access_token) throws Exception
    {
        Boolean result=true;

        NewYuebanExample newYuebanExample=new NewYuebanExample();
        NewYuebanExample.Criteria criteria=newYuebanExample.createCriteria();
        criteria.andUinqueEqualTo($access_token);

        //查询
        List<NewYueban> list=newYuebanMapper.selectByExample(newYuebanExample);

        if(list.size()==0)
            result=false;


        return result;
    }

    /**
     * 插入一条约伴信息
     * @param newYueban
     */
    public void publish_yueban(NewYueban newYueban) throws Exception{
        newYuebanMapper.insert(newYueban);
    }

    public int  getyuebnaid(String uniq) throws Exception{
        int id=0;
        NewYuebanExample newYuebanExample=new NewYuebanExample();
        NewYuebanExample.Criteria criteria=newYuebanExample.createCriteria();
        criteria.andUinqueEqualTo(uniq);
        List<NewYueban> list=newYuebanMapper.selectByExample(newYuebanExample);
        if(list.size()==1)
        {
            id=list.get(0).getId();
        }

        return id;
    }

    /**
     * 获取最近最新十条记录
     * @return
     * @throws Exception
     */

    public List<NewYuebanCoustom> get_yueban(int offset,int pagesize) throws Exception{
        List<NewYuebanCoustom>  list;

        list=newYuebanMapper.get_latest(offset,pagesize);
        return  list;

    }

    /**
     * pagehelper 测试
     * @return
     * @throws Exception
     */
    public List<NewYueban>  getallyueban()throws Exception{
        List<NewYueban> list;

        NewYuebanExample newYuebanExample=new NewYuebanExample();
        NewYuebanExample.Criteria  criteria=newYuebanExample.createCriteria();
        criteria.andYuebanuserIdEqualTo(1651);

        list=newYuebanMapper.selectByExample(newYuebanExample);

        return list;
    }


    /**
     * 根据参数获取倒序约伴信息，
     * @param offsetpage   要显示第几页
     * @param pagesize     每页显示多少条数据
     * @return
     * @throws Exception
     */
    public  List<NewYuebanCoustom> get_latest_pagehelperService(int offsetpage,int pagesize,int area) throws Exception{
        List<NewYuebanCoustom>  list;

        /**
         *
         PageHelper.startPage(page,row);
         page:要显示第几页
         row:每页多少条数据
         */
        PageHelper.startPage(offsetpage,pagesize);
        list=newYuebanMapper.get_latest_pagehelper(area);

       return list;
    }

    public  List<NewYuebanCoustom> get_latest_pagehelperServicebyUserid(int offsetpage,int pagesize,int yuebanuser_id) throws Exception{
        List<NewYuebanCoustom>  list;

        /**
         *
         PageHelper.startPage(page,row);
         page:要显示第几页
         row:每页多少条数据
         */
        PageHelper.startPage(offsetpage,pagesize);
        list=newYuebanMapper.get_latest_pagehelperByUser(yuebanuser_id);

        return list;
    }


    /**
     * 约伴评论
     * @param newYuebancomment
     * @throws Exception
     */

    public void comment_yueban(NewYuebancomment newYuebancomment) throws Exception{

        NewYuebancommentExample newYuebancommentExample=new NewYuebancommentExample();
        NewYuebancommentExample.Criteria criteria=newYuebancommentExample.createCriteria();
        //全选
        newYuebancommentMapper.insert(newYuebancomment);


    }

    /**
     * 对约伴评论进行回复
     * @param newYuebanreply
     * @throws Exception
     */
    public void reply_yuban(NewYuebanreply newYuebanreply) throws  Exception{
        NewYuebanreplyExample newYuebanreplyExample=new NewYuebanreplyExample();
        NewYuebanreplyExample.Criteria criteria=newYuebanreplyExample.createCriteria();
        newYuebanreplyMapper.insert(newYuebanreply);

    }

    /**
     * 获取对应约伴信息评论
     * @param yuebanid
     * @return
     * @throws Exception
     */
    public List<NewYuebancomment> getcomment_yueban(int yuebanid) throws Exception{
        NewYuebancommentExample newYuebancommentExample=new NewYuebancommentExample();
        NewYuebancommentExample.Criteria criteria=newYuebancommentExample.createCriteria();
        criteria.andYuebanidEqualTo(yuebanid);
        List<NewYuebancomment> list=newYuebancommentMapper.selectByExample(newYuebancommentExample);
        return  list;

    }

    /**
     * 获取对应约伴信息自定义评论
     * @param yuebanid
     * @return
     * @throws Exception
     */
    public List<NewYuebancommentCustom> getcomment_yuebanCustom(int yuebanid) throws Exception{

        List<NewYuebancommentCustom> list=newYuebancommentMapperCustomMapper.selectbyyuebanid(yuebanid);
        return  list;

    }

    /**
     * 获取对应约伴信息自定义评论 最新3条记录
     * @param yuebanid
     * @return
     * @throws Exception
     */
    public List<NewYuebancommentCustom> getcomment_yuebanCustom3(int yuebanid) throws Exception{

        List<NewYuebancommentCustom> list=newYuebancommentMapperCustomMapper.selectbyyuebanid3(yuebanid);
        return  list;

    }



    public List<NewYuebanreply> getreply_yueban(int yuebancommentid) throws Exception{

        NewYuebanreplyExample newYuebanreplyExample=new NewYuebanreplyExample();
        NewYuebanreplyExample.Criteria criteria=newYuebanreplyExample.createCriteria();
        criteria.andYuebancommentreplyidEqualTo(yuebancommentid);
        List<NewYuebanreply> list=newYuebanreplyMapper.selectByExample(newYuebanreplyExample);
        return list;
    }

    /**
     * 插入约伴图片信息
     * @param newYuebanimage
     * @throws Exception
     */
    public void yuebanimage(NewYuebanimage newYuebanimage) throws Exception{
        newYuebanimageMapper.insert(newYuebanimage);

    }

    /**
     * 获取约伴条数对应图片
     * @param yuebanid
     * @return
     * @throws Exception
     */
    public List<NewYuebanimage> yuebangetimage(int yuebanid) throws Exception{
        NewYuebanimageExample newYuebanimageExample=new NewYuebanimageExample();
        NewYuebanimageExample.Criteria criteria=newYuebanimageExample.createCriteria();
        criteria.andYuebanidEqualTo(yuebanid);
       List<NewYuebanimage> list=  newYuebanimageMapper.selectByExample(newYuebanimageExample);

        return list;
    }

    /**
     * 根据ID 删除约伴信息
     * @param id
     * @throws Exception
     */
    public void yuebandelete(int id) throws Exception{
        //删除约伴信息
        newYuebanMapper.deleteByPrimaryKey(id);

        //删除约伴图片
        NewYuebanimageExample newYuebanimageExample=new NewYuebanimageExample();
        NewYuebanimageExample.Criteria criteria=newYuebanimageExample.createCriteria();
        criteria.andYuebanidEqualTo(id);

        List<NewYuebanimage> newYuebanimageList=newYuebanimageMapper.selectByExample(newYuebanimageExample);
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(CUSTOM_UTIL.endpoint, CUSTOM_UTIL.accessKeyId, CUSTOM_UTIL.accessKeySecret);
        for (int i=0;i<newYuebanimageList.size();i++){
            // 删除
            String imageurl=newYuebanimageList.get(i).getImageurl();
            String filename=imageurl.substring(48,imageurl.length());
            System.out.println("删除阿里云图片文件："+filename);
            ossClient.deleteObject(CUSTOM_UTIL.BucketName,filename);
        }

        // 关闭client
        ossClient.shutdown();
        newYuebanimageMapper.deleteByExample(newYuebanimageExample);


        //删除约伴信息评论
       NewYuebancommentExample newYuebancommentExample=new NewYuebancommentExample();
        NewYuebancommentExample.Criteria criteria1=newYuebancommentExample.createCriteria();
        criteria1.andYuebanidEqualTo(id);
        newYuebancommentMapper.deleteByExample(newYuebancommentExample);

        //删除约伴回复
        NewYuebanreplyExample newYuebanreplyExample=new NewYuebanreplyExample();
        NewYuebanreplyExample.Criteria criteria2=newYuebanreplyExample.createCriteria();
        criteria2.andYuebancommentreplyidEqualTo(id);
        newYuebanreplyMapper.deleteByExample(newYuebanreplyExample);

    }

    /**
     * 获取发布记录信息条数
     */
    public int get_recordcount(){
    int recordcount=    newYuebanMapper.get_recordcount();

        return recordcount;
    }

}
