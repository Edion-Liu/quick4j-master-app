package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.NewInvitenumberMapper;
import com.eliteams.quick4j.web.dao.TUserMapper;
import com.eliteams.quick4j.web.model.NewInvitenumber;
import com.eliteams.quick4j.web.model.NewInvitenumberExample;
import com.eliteams.quick4j.web.model.TUser;
import com.eliteams.quick4j.web.model.TUserExample;
import com.eliteams.quick4j.web.model.VO.TFriendVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/15.
 */
@Service
public class TUserMapperService {


    @Autowired
    private TUserMapper tUserMapper;


    /**
     * 验证TOKEN是否存在
     * @param $access_token
     * @return
     */
    public Boolean access_token_exists(String $access_token) throws Exception
    {
        Boolean result=true;

        TUserExample   tUserExample=new TUserExample();
        TUserExample.Criteria criteria=tUserExample.createCriteria();
        criteria.andAccessTokenEqualTo($access_token);


        //查询
        List<TUser> list=tUserMapper.selectByExample(tUserExample);

        if(list.size()==0)
            result=false;


        return result;
    }


    /**
     * 验证TOKEN是否存在
     * @param $access_token
     * @return
     */
    public Boolean access_uinqtoken_exists(String $access_token) throws Exception
    {
        Boolean result=true;

        TUserExample   tUserExample=new TUserExample();
        TUserExample.Criteria criteria=tUserExample.createCriteria();
        criteria.andUniqueTokenEqualTo($access_token);


        //查询
        List<TUser> list=tUserMapper.selectByExample(tUserExample);

        if(list.size()==0)
            result=false;


        return result;
    }

    /**
     * 检测用户名是否已经存在
     * @param name  存在 返回true ; 不存在 返回false
     * @return
     */

    public Boolean name_exists(String name) throws  Exception{

        Boolean result=true;

        TUserExample   tUserExample=new TUserExample();
        TUserExample.Criteria criteria=tUserExample.createCriteria();
        criteria.andNameEqualTo(name);

        //查询
        List<TUser> list=tUserMapper.selectByExample(tUserExample);

        if(list.size()==0)
            result=false;


        return result;
    }

    /**
     * 检测手机号码是否已经注册
     * @param phone
     * @return
     */

    public Boolean phone_exists(String phone) throws Exception{
        Boolean result=true;

        TUserExample   tUserExample=new TUserExample();
        TUserExample.Criteria criteria=tUserExample.createCriteria();
        criteria.andPhoneEqualTo(phone);

        //查询
        List<TUser> list=tUserMapper.selectByExample(tUserExample);

        if(list.size()==0)
            result=false;


        return result;
    }





    public void function_insert(TUser tUser) throws Exception {
        tUserMapper.insert(tUser);
    }

    /**
     * 通过手机号 或者 名字查找用户
     * @param login_id
     * @return
     * @throws Exception
     */

    public  List<TUser> function_selectByExample(String login_id) throws Exception {



        TUserExample   tUserExample=new TUserExample();
        TUserExample.Criteria criteria=tUserExample.createCriteria();
        criteria.andPhoneEqualTo(login_id);

        TUserExample.Criteria criteria1=tUserExample.createCriteria();
        criteria1.andNameEqualTo(login_id);
        tUserExample.or(criteria1);


        //查询
        List<TUser> list=tUserMapper.selectByExample(tUserExample);



        return  list;
    }


    /**
     * 根据id 查找用户
     * @param id
     * @return
     * @throws Exception
     */
    public  TUser FindUserById(Integer id) throws Exception {

        TUserExample   tUserExample=new TUserExample();
        TUserExample.Criteria criteria=tUserExample.createCriteria();
        criteria.andIdEqualTo(id);
        //查询
        List<TUser> tUserList=tUserMapper.selectByExample(tUserExample);
        return   tUserList.get(0);
    }


    /**
     * 获取粉丝
     * @param user_id
     * @return
     */
    public List<TFriendVO> getMyFans(Integer user_id){
       List<TFriendVO> tFriendVOList= tUserMapper.getMyFans(user_id);
        return tFriendVOList;
    }


    public  List<TUser> function_selectByExample_User_unique_token(String parame) throws Exception {



        TUserExample   tUserExample=new TUserExample();
        TUserExample.Criteria criteria=tUserExample.createCriteria();
        criteria.andUniqueTokenEqualTo(parame);
        //查询
        List<TUser> list=tUserMapper.selectByExample(tUserExample);

        return  list;
    }



    /**
     * 根据 UniqueTokenEqualTo  更新数据
     * @param tUser
     * @throws Exception
     */

    public void function_updateByExample(TUser tUser) throws Exception {

        TUserExample   tUserExample=new TUserExample();
        TUserExample.Criteria criteria=tUserExample.createCriteria();
        criteria.andUniqueTokenEqualTo(tUser.getUniqueToken());

        //更新token
        tUserMapper.updateByExample(tUser,tUserExample);

    }

    /**
     *  根据第三方类型查找用户
     * @param snsid
     * @param snstype
     * @return
     */
   public TUser findTuerBySns(String snsid,Integer snstype){
       TUser tUser=null;
       TUserExample tUserExample=new TUserExample();
       TUserExample.Criteria criteria=tUserExample.createCriteria();
       criteria.andSnsIdEqualTo(snsid);
       criteria.andSnsTypeEqualTo(snstype);

       List<TUser> tUserList=tUserMapper.selectByExample(tUserExample);
       if (tUserList.size()==1){
            tUser=tUserList.get(0);
           return tUser;
       }

          return  tUser;
   }
}
