package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.web.cache.annotation.CacheWrite;
import com.eliteams.quick4j.web.dao.*;
import com.eliteams.quick4j.web.model.*;
import com.eliteams.quick4j.web.model.VO.TCampsiteCustom;
import com.eliteams.quick4j.web.model.VO.TCampsiteVO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/2/27.
 */
@Service
public class CampsiteService {

    @Autowired
    TCampsiteMapper tCampsiteMapper;

    @Autowired
    TCampsiteImageMapper tCampsiteImageMapper;

    @Autowired
    TUserMapper tUserMapper;

    @Autowired
    TCommentMapper tCommentMapper;

    @Autowired
    TReportMapper tReportMapper;




    /**
     * 查找200　　　　　　范围内的窝窝
     * @param lat        纬度
     * @param lng         经度
     * @return
     */

    public List<TCampsite> nearly_has_campsite(double lat,double lng){

          return tCampsiteMapper.nearly_has_campsite(lat,lng);

    }

    /**
     * 插入一条窝窝  返回插入id
     * @param tCampsite
     */
    public Integer  insert(TCampsite tCampsite){
        tCampsiteMapper.insert(tCampsite);
        return tCampsite.getId();


    }

    /**
     * 更新一条窝窝
     * @param tCampsite
     */
    public void  update_campsite(TCampsite tCampsite){

        tCampsiteMapper.updateByPrimaryKey(tCampsite);


    }

    /**
     * 插入窝窝图片
     * @param tCampsiteImage
     */
    public void insertImage(TCampsiteImage tCampsiteImage){
       tCampsiteImageMapper.insert(tCampsiteImage);
    }


    /**
     * 获取附近的窝窝
     * @param longitude
     * @param latitude
     * @param
     * @param type
     * @param range
     * @return
     */

   public List<TCampsiteVO>  get_nearly_wowo(Double longitude,Double latitude ,Integer type ,Integer range){
       //查找营地
       List<TCampsiteVO> tCampsiteVOList =tCampsiteMapper.get_nearly_wowo_mapper(longitude,latitude,type,range);

       return  tCampsiteVOList;
   }

    /**
     * 获取附近所有窝窝类型
     * @param longitude
     * @param latitude
     * @param
     * @param range
     * @return
     */

   public List<TCampsiteVO> get_nearly_wowoall(Double longitude,Double latitude,Integer range){

       List<TCampsiteVO> tCampsiteVOList =tCampsiteMapper.get_nearly_wowoall_mapper(longitude,latitude,range);
       return tCampsiteVOList;
   }

    /**
     * 通过user_id 获取 窝窝
     * @param user_id
     * @return
     */
   public List<TCampsiteVO> get_campsite_by_user_id(Integer user_id){

       List<TCampsiteVO> tCampsiteVOList =tCampsiteMapper.get_campsite_by_user_id_mapper(user_id);
       return tCampsiteVOList;

   }

    /**
     * 根据窝窝id 获取窝窝图片
     * @param id
     * @return
     */
   public List<TCampsiteImage> getCampsiteImageByCampsiteID(Integer id){

       TCampsiteImageExample tCampsiteImageExample=new TCampsiteImageExample();
       TCampsiteImageExample.Criteria criteria=tCampsiteImageExample.createCriteria();
       criteria.andCampsiteIdEqualTo(id);
       List<TCampsiteImage> tCampsiteImageList=tCampsiteImageMapper.selectByExample(tCampsiteImageExample);
       return tCampsiteImageList;
   }


    /**
     * 根据窝窝id 获取窝窝评论
     * @param id
     * @return
     */
    public List<TComment> getICommentByCampsiteID(Integer id){
        TCommentExample tCommentExample=new TCommentExample();
        TCommentExample.Criteria criteria=tCommentExample.createCriteria();
        criteria.andCampsiteIdEqualTo(id);
        PageHelper.orderBy("updated_at desc");
        List<TComment> tCommentList=tCommentMapper.selectByExample(tCommentExample);
        return tCommentList;

    }

    /**
     * 根据窝窝id 删除窝窝图片
     * @param campsite_id
     */
    public void  delete_campsite_image(Integer campsite_id){
        TCampsiteImageExample tCampsiteImageExample=new TCampsiteImageExample();
        TCampsiteImageExample.Criteria criteria=tCampsiteImageExample.createCriteria();
        criteria.andCampsiteIdEqualTo(campsite_id);
        tCampsiteImageMapper.deleteByExample(tCampsiteImageExample);
    }

    /**
     * 根据ID删除窝窝
     * @param campsite_id
     */
    public void delete_campsite(Integer campsite_id){
        //删除窝窝图片
        delete_campsite_image(campsite_id);

        //删除窝窝评论
        TCommentExample tCommentExample=new TCommentExample();
        TCommentExample.Criteria criteria1=tCommentExample.createCriteria();
        criteria1.andCampsiteIdEqualTo(campsite_id);
        tCommentMapper.deleteByExample(tCommentExample);

        //删除窝窝
        tCampsiteMapper.deleteByPrimaryKey(campsite_id);
    }



    /**
     * 获取附近所有窝窝类型  分页
     * @param longitude
     * @param latitude
     * @param offset
     * @param range
     * @return
     */
    @CacheWrite(validTime=60)
   public List<TCampsiteCustom> get_nearly_wowoall_offsetpage(Double longitude,Double latitude,Integer offset,Integer range,Integer offsetpage,Integer pagesize,String type){


        List<TCampsite> tCampsiteList=null;
       PageHelper.startPage(offsetpage,pagesize);
        if(type==null || type.equals("")){
             tCampsiteList=tCampsiteMapper.get_campsite_alltype(longitude,latitude,range);

        }else {
             tCampsiteList=tCampsiteMapper.get_campsite(longitude,latitude,range,Integer.parseInt(type));
        }


        List<TCampsiteCustom>   tCampsiteCustomList =getdetail(tCampsiteList);

       return tCampsiteCustomList;
   }


   private List<TCampsiteCustom> getdetail( List<TCampsite> tCampsiteList){
       List<TCampsiteCustom> tCampsiteCustomList =new ArrayList<TCampsiteCustom>() ;

       for (int i=0;i<tCampsiteList.size();i++){
           //查找窝窝用户
           TCampsiteCustom tCampsiteCustom=null;
           tCampsiteCustom=new TCampsiteCustom();

           //窝窝信息
           tCampsiteCustom.settCampsite(tCampsiteList.get(i));
           //玩家信息
           List<TUser> tUserList=tUserMapper.getTUserByid(tCampsiteList.get(i).getUserId());
           if(tUserList.size()>=1)
               tCampsiteCustom.settUser(tUserList.get(0));
           //查找窝窝图片
           List<TCampsiteImage> tCampsiteImageList=getCampsiteImageByCampsiteID(tCampsiteList.get(i).getId());
           tCampsiteCustom.settCampsiteImageList(tCampsiteImageList);


           //查找窝窝评论
           List<TComment> tCommentList=getICommentByCampsiteID(tCampsiteList.get(i).getId());
           tCampsiteCustom.settCommentList(tCommentList);
           tCampsiteCustomList.add(tCampsiteCustom);

       }

       return tCampsiteCustomList;
   }



    public List<TCampsiteCustom> get_nearly_wowomore(Double longitude,Double latitude,Integer range,Integer campsiteID){
        List<TCampsite> tCampsiteList=null;
        PageHelper.startPage(1,3);
        tCampsiteList=tCampsiteMapper.get_campsite_alltypemore(longitude,latitude,range,campsiteID);
        List<TCampsiteCustom>   tCampsiteCustomList =getdetail(tCampsiteList);
        return tCampsiteCustomList;
    }

    @CacheWrite(validTime = 60)
    public List<TCampsiteCustom> get_nearly_wowohot(Integer offsetpage,Integer pagesize){

        List<TCampsiteCustom> tCampsiteCustomList =new ArrayList<TCampsiteCustom>() ;
        List<TCampsite> tCampsiteLists=null;
        PageHelper.startPage(offsetpage,pagesize);

            tCampsiteLists=tCampsiteMapper.get_campsite_alltype_hot();



        for (int j=0;j<tCampsiteLists.size();j++){
            //查找窝窝用户
            TCampsiteCustom tCampsiteCustom=tCampsiteCustom=new TCampsiteCustom();

            //窝窝信息
            tCampsiteCustom.settCampsite(tCampsiteLists.get(j));
            //玩家信息
            List<TUser> tUserList=tUserMapper.getTUserByid(tCampsiteLists.get(j).getUserId());
            if(tUserList.size()>=1)
                tCampsiteCustom.settUser(tUserList.get(0));
            //查找窝窝图

            List<TCampsiteImage> tCampsiteImageList=getCampsiteImageByCampsiteID(tCampsiteLists.get(j).getId());
            tCampsiteCustom.settCampsiteImageList(tCampsiteImageList);


            //查找窝窝评论
            List<TComment> tCommentListr=getICommentByCampsiteID(tCampsiteLists.get(j).getId());
            tCampsiteCustom.settCommentList(tCommentListr);
            tCampsiteCustomList.add(tCampsiteCustom);

        }

        return tCampsiteCustomList;
    }


   public TCampsiteCustom get_campsiteByID(Integer id){

       TCampsiteCustom tCampsiteCustom=new TCampsiteCustom();
        //获取窝窝
       TCampsite tCampsite=tCampsiteMapper.selectByPrimaryKey(id);

       //获取图片
       List<TCampsiteImage> tCampsiteImageList=getCampsiteImageByCampsiteID(id);

       //玩家信息
       List<TUser> tUserList=tUserMapper.getTUserByid(tCampsite.getUserId());

       List<TComment> tCommentList=getICommentByCampsiteID(id);

       tCampsiteCustom.settCampsite(tCampsite);
       tCampsiteCustom.settCampsiteImageList(tCampsiteImageList);
       if(tUserList.size()>=1)
       tCampsiteCustom.settUser(tUserList.get(0));
       tCampsiteCustom.settCommentList(tCommentList);
       return  tCampsiteCustom;
   }


    /**
     * 通过城市获取 本城市范围内的窝窝
     * @param city
     * @return
     */
    public List<TCampsiteVO> get_campsite_by_city(String city){

        List<TCampsiteVO> tCampsiteVOList=tCampsiteMapper.get_campsite_by_city_mapper(city);
        return tCampsiteVOList;
    }


    public List<TCampsiteVO> get_campsite_by_cityAndtype(String city,Integer type){

        List<TCampsiteVO> tCampsiteVOList=tCampsiteMapper.get_campsite_by_cityAndtype_mapper(city,type);
        return tCampsiteVOList;
    }

    /**
     * 插入举报窝窝记录
     * @param tReport
     */
    public void insertreportCampsite(TReport tReport){
        tReportMapper.insert(tReport);
    }


    public List<TCampsiteVO> get_campsitescan_by_user_id(Integer userId){

        List<TCampsiteVO> tCampsiteVOList=tCampsiteMapper.get_campsitescan_by_user_id_mapper(userId);
        return tCampsiteVOList;

    }



}
