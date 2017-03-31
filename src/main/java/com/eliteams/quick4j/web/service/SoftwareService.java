package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.NewSoftwareMapper;
import com.eliteams.quick4j.web.model.NewSoftware;
import com.eliteams.quick4j.web.model.NewSoftwareExample;
import com.eliteams.quick4j.web.model.NewWalletExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/11.
 */
@Service
public class SoftwareService {

    @Autowired
    NewSoftwareMapper newSoftwareMapper;


    /**
     * 获取最新app 版本
     * @return
     */
    public NewSoftware getnewapp(){
        NewSoftware newSoftware=null;
        NewSoftwareExample newSoftwareExample=new NewSoftwareExample();
        PageHelper.startPage(1,1);
        PageHelper.orderBy("publishdate desc ");

        List<NewSoftware> newSoftwareList=newSoftwareMapper.selectByExample(newSoftwareExample);

        if(newSoftwareList.size()==1){
            newSoftware=newSoftwareList.get(0);
        }

        return newSoftware;
    }


    /**
     * 插入一条新的app 信息
     * @param newSoftware
     */
    public  void  updateapp(NewSoftware newSoftware){
        newSoftwareMapper.insert(newSoftware);
    }






}
