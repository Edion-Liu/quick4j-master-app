package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.NewAdvertisementMapper;
import com.eliteams.quick4j.web.model.NewAdvertisement;
import com.eliteams.quick4j.web.model.NewAdvertisementExample;
import com.eliteams.quick4j.web.model.NewInvitenumber;
import com.eliteams.quick4j.web.model.NewInvitenumberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/19.
 */
@Service

public class NewAdvertisementService {
    @Autowired
    private NewAdvertisementMapper newAdvertisementMapper;


    /**
     * 获取广告类型为1 和2 的广告
     * @return
     * @throws Exception
     */

    public List<NewAdvertisement> function_example() throws Exception{
        List<NewAdvertisement>  list=null;
        NewAdvertisementExample newAdvertisementExample=new NewAdvertisementExample();
        NewAdvertisementExample.Criteria criteria=newAdvertisementExample.createCriteria();
        criteria.andAdtypeEqualTo(1);
        NewAdvertisementExample.Criteria criteria1=newAdvertisementExample.createCriteria();
        criteria1.andAdtypeEqualTo(2);
        newAdvertisementExample.or(criteria1);
                 list=newAdvertisementMapper.selectByExample(newAdvertisementExample);

        return list;
    }

    /**
     * 插入一条新广告
     * @param newAdvertisement
     * @throws Exception
     */
    public void addap(NewAdvertisement newAdvertisement) throws Exception{
        newAdvertisementMapper.insert(newAdvertisement);

    }

    /**
     * 删除一条广告
     * @param adid
     * @throws Exception
     */
    public void deleteAD(int adid) throws Exception{
        NewAdvertisementExample newAdvertisementExample=new NewAdvertisementExample();
        NewAdvertisementExample.Criteria criteria=newAdvertisementExample.createCriteria();
        criteria.andIdEqualTo(adid);

        newAdvertisementMapper.deleteByExample(newAdvertisementExample);


    }

    /**
     * 更新广告
     * @param newAdvertisement
     * @throws Exception
     */
    public void updatead(NewAdvertisement newAdvertisement) throws Exception{

        NewAdvertisementExample newAdvertisementExample=new NewAdvertisementExample();
        NewAdvertisementExample.Criteria criteria=newAdvertisementExample.createCriteria();

        newAdvertisementMapper.updateByPrimaryKey(newAdvertisement);

    }
}
