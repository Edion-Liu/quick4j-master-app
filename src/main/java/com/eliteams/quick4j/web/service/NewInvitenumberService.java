package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.NewInvitenumberMapper;
import com.eliteams.quick4j.web.model.NewInvitenumber;
import com.eliteams.quick4j.web.model.NewInvitenumberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/15.
 */
@Service
public class NewInvitenumberService {


    @Autowired
    private NewInvitenumberMapper newInvitenumberMapper;




    /**
     * 检测邀请码是否存在
     * @param invitenumber
     * @return
     */
    public Boolean invitenumber_exists(String invitenumber)  throws Exception
    {
        Boolean result=true;
        NewInvitenumberExample newInvitenumberExample=new NewInvitenumberExample();
        NewInvitenumberExample.Criteria criteria=newInvitenumberExample.createCriteria();
        criteria.andInvitenumberEqualTo(invitenumber);
        //查询
        List<NewInvitenumber> list=newInvitenumberMapper.selectByExample(newInvitenumberExample);

        if(list.size()==0)
            result=false;


        return result;
    }

    /**
     * 根据邀请码 返回邀请用户唯一标识符
     * @param invitenumber
     * @return
     * @throws Exception
     */
    public String finduserByinvitenumber(String invitenumber) throws Exception{
        String result=null;


        NewInvitenumberExample newInvitenumberExample=new NewInvitenumberExample();
        NewInvitenumberExample.Criteria criteria=newInvitenumberExample.createCriteria();
        criteria.andInvitenumberEqualTo(invitenumber);
        //查询
        List<NewInvitenumber> list=newInvitenumberMapper.selectByExample(newInvitenumberExample);

        if(list.size()==1)
            result=list.get(0).getUniqueToken();

        return result;
    }





}
