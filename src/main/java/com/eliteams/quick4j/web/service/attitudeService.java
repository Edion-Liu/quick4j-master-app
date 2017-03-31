package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.NewAttitudeMapper;
import com.eliteams.quick4j.web.model.NewAttitude;
import com.eliteams.quick4j.web.model.NewAttitudeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/28.
 */
@Service
public class attitudeService {
    @Autowired
    NewAttitudeMapper newAttitudeMapper;

    public List<NewAttitude> getAttitude(Integer tCampsiteId,Integer type,Integer userId,Integer typecampsite){

        NewAttitudeExample newAttitudeExample=new NewAttitudeExample();
        NewAttitudeExample.Criteria criteria=newAttitudeExample.createCriteria();
        criteria.andTCampsiteIdEqualTo(tCampsiteId);
        criteria.andTypeEqualTo(type);
        criteria.andUserIdEqualTo(userId);
        criteria.andTypeCampsiteEqualTo(typecampsite);
        List<NewAttitude> newAttitudeList=newAttitudeMapper.selectByExample(newAttitudeExample);
        return newAttitudeList;
    }

    public List<NewAttitude> getAttitudecount(Integer tCampsiteId,Integer type,Integer typecampsite){

        NewAttitudeExample newAttitudeExample=new NewAttitudeExample();
        NewAttitudeExample.Criteria criteria=newAttitudeExample.createCriteria();
        criteria.andTypeEqualTo(type);
        criteria.andTCampsiteIdEqualTo(tCampsiteId);
        criteria.andTypeCampsiteEqualTo(typecampsite);
        List<NewAttitude> newAttitudeList=newAttitudeMapper.selectByExample(newAttitudeExample);
        return newAttitudeList;
    }



    public void insertAttitude(NewAttitude newAttitude){
        newAttitudeMapper.insert(newAttitude);
    }

}
