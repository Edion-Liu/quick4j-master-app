package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.web.cache.annotation.CacheWrite;
import com.eliteams.quick4j.web.cache.util.CacheKey;
import com.eliteams.quick4j.web.dao.NewActivityMapper;
import com.eliteams.quick4j.web.dao.NewActivitydetailMapper;
import com.eliteams.quick4j.web.dao.NewJoinMapper;
import com.eliteams.quick4j.web.model.*;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/4.
 */
@Service
public class ActivityService {

    @Autowired
    NewActivityMapper newActivityMapper;

    @Autowired
    NewActivitydetailMapper newActivitydetailMapper;

    @Autowired
    NewJoinMapper newJoinMapper;

    /**
     * 插入一条活动记录
     * @param newActivity
     * @throws Exception
     */
    public void publish(NewActivity newActivity) throws Exception{

      newActivityMapper.insertCustom(newActivity);

    }


    /**
     * 保存图片
     * @param newActivitydetail
     * @return
     */
    public int publishimage(NewActivitydetail newActivitydetail){

        int id=newActivitydetailMapper.insert(newActivitydetail);
        return id;

    }

    /**
     * 获取首页活动
     * @param offsetpage
     * @param pagesize
     * @param type
     * @return
     * @throws Exception
     */
    //不清理  实时性不强
    @CacheWrite(key=CacheKey.ACTIVITY_GET_LATEST,fields={"offsetpage","pagesize","type"},validTime=3)
    public List<NewActivity> getactivity(int offsetpage,int pagesize,int type) {
        List<NewActivity>  list=null;
        PageHelper.startPage(offsetpage,pagesize);
      /*  精选类型*/
        if(type==1){
            NewActivityExample newActivityExample=new NewActivityExample();
            NewActivityExample.Criteria criteria=newActivityExample.createCriteria();
            criteria.andGoodactivityEqualTo(1);
            list=newActivityMapper.selectByExample(newActivityExample);

        }else {
            list=newActivityMapper.get_latest(type);
        }


        return list;
    }

    /**
     * 通过活动信息id 获取活动信息
     * @param id
     * @return
     * @throws Exception
     */
    public NewActivityCustom  getactivityByid(Integer id) throws Exception{
       //查询活动信息
        NewActivityCustom newActivityCustom=new NewActivityCustom();
        NewActivityExample newActivityExample=new NewActivityExample();
        NewActivityExample.Criteria criteria=newActivityExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<NewActivity> newActivity=newActivityMapper.selectByExample(newActivityExample);


         //查询活动图文
        NewActivitydetailExample newActivitydetailExample=new NewActivitydetailExample();
        NewActivitydetailExample.Criteria criteria1=newActivitydetailExample.createCriteria();
        criteria1.andActivityidEqualTo(id);
        List<NewActivitydetail> newActivitydetailList=newActivitydetailMapper.selectByExample(newActivitydetailExample);


        //查询活动报名人数
        NewJoinExample newJoinExample=new NewJoinExample();
        NewJoinExample.Criteria criteria2=newJoinExample.createCriteria();
        criteria2.andActivityidEqualTo(id);
        PageHelper.startPage(1,10);
        PageHelper.orderBy("jointime desc");
        List<NewJoin> newJoinList=newJoinMapper.selectByExample(newJoinExample);

        if(newActivity.size()<=1 && newActivitydetailList.size()>=1 ){
            newActivityCustom.setNewActivitydetail(newActivitydetailList);
            newActivityCustom.setNewActivity(newActivity.get(0));

        }

        if(newJoinList.size()>=1){
            newActivityCustom.setNewJoinList(newJoinList);
        }

        return newActivityCustom;

    }


    /**
     * 根据id 返回原生 活动信息
     * @param id
     * @return
     */
    public NewActivity getactivityByidold(int id){
        NewActivityExample newActivityExample=new NewActivityExample();
        NewActivityExample.Criteria criteria=newActivityExample.createCriteria();
        criteria.andIdEqualTo(id);
       List<NewActivity>  newActivityList=newActivityMapper.selectByExample(newActivityExample);
        NewActivity newActivity=null;
        if(newActivityList.size()==1)
        {
            newActivity =newActivityList.get(0);
        }
        return newActivity;
    }

    /**
     * 更新活动信息
     * @param newActivity
     */
    public void updateactivity(NewActivity newActivity){
        newActivityMapper.updateByPrimaryKey(newActivity);
    }




    /**
     * 报名参加活动
     * @param newJoin
     */
    public void joinactivity(NewJoin newJoin) {

              newJoinMapper.insert(newJoin);
    }

    /**
     * 根据活动id 获取参加活动人员
     * @param id
     */
    public  List<NewJoin>  getJoinByid(int id){
            NewJoinExample newJoinExample=new NewJoinExample();
            NewJoinExample.Criteria criteria=newJoinExample.createCriteria();
            criteria.andActivityidEqualTo(id);
            PageHelper.startPage(1,10);
            //按降序排列  从大到小
            PageHelper.orderBy("jointime desc");
            List<NewJoin> newJoinList=newJoinMapper.selectByExample(newJoinExample);

           return  newJoinList;
    }


    /**
     * 获取报名用户
     * @param id  报名用户id
     * @return
     */
    public NewJoin getoneJoin(int id){
        NewJoin newJoin=newJoinMapper.selectByPrimaryKey(id);
        return newJoin;
    }

    /**
     * 更新报名用户
     * @param newJoin
     */
    public void updateoneJoin(NewJoin newJoin){
        newJoinMapper.updateByPrimaryKey(newJoin);
    }


    /**
     * 发现附近的活动
     * @param offsetpage
     * @param pagesize
     * @param longitude
     * @param latitude
     * @return
     */
    public List<NewActivity> findNearlyActivity(Integer offsetpage,Integer pagesize, double longitude,double latitude){

        PageHelper.startPage(offsetpage,pagesize);
       /* PageHelper.orderBy("publishtime desc");*/
      List<NewActivity> newActivityList=  newActivityMapper.findnearActivity(longitude,latitude);

        return newActivityList;
    }




  /*  后台管理*/


  public List<NewActivity>  getactivity(Integer offsetpage,Integer pagesize){
     int   pageindex=offsetpage/17+1;

      NewActivityExample newActivityExample=new NewActivityExample();
      NewActivityExample.Criteria criteria=newActivityExample.createCriteria();
      PageHelper.startPage(pageindex,pagesize);
      List<NewActivity> newActivityList=newActivityMapper.selectByExample(newActivityExample);
      return newActivityList;
  }


}
