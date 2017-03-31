package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.TUserMapper;
import com.eliteams.quick4j.web.model.TUser;
import com.eliteams.quick4j.web.model.TUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/10 0010.
 */
@Service
public class TUserService {

    @Autowired
    public TUserMapper tUserMapper;


    public void testSelectByExample() {
        TUserExample tUserExample =new TUserExample();
        TUserExample.Criteria criteria1=tUserExample.createCriteria();
//		criteria1.andAddressLike("四川");
        //criteria1.andAddressEqualTo("四川");
        criteria1.andAddressLike("%%");   //包含成 的地址
        //查询
        List<TUser> list=tUserMapper.selectByExample(tUserExample);
        int i;
        for(i=0;i<list.size();i++)
            System.out.println(list.get(i).getAddress());
    }

    /**
     * 根据用户id 获取用户名字和头像
     * @param id
     * @return
     */
    public List<TUser> getTUserByidService(Integer id){
        List<TUser> tUserList=tUserMapper.getTUserByid(id);
        return tUserList;
    }
}
