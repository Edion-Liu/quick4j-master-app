package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.TCollectMapper;
import com.eliteams.quick4j.web.model.TCollect;
import com.eliteams.quick4j.web.model.TCollectExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/16.
 */
@Service
public class TCollectService {
    @Autowired
    private TCollectMapper tCollectMapper;


    public void insertCollect(TCollect tCollect){
        tCollectMapper.insert(tCollect);
    }

    /**
     * 获取收藏状态
     * @param campsiteID
     * @return
     */
    public List<TCollect> getCollectStatus(Integer campsiteID,Integer userID){
        TCollectExample tCollectExample=new TCollectExample();
        TCollectExample.Criteria criteria=tCollectExample.createCriteria();
        criteria.andCampsiteIdEqualTo(campsiteID);
        criteria.andUserIdEqualTo(userID);
        List<TCollect> tCollectList=tCollectMapper.selectByExample(tCollectExample);
        return tCollectList;
    }


    /**
     * 根据窝窝ID 进行更新
     * @param tCollect
     */
    public void updateCollect(TCollect tCollect){

        tCollectMapper.updateByPrimaryKey(tCollect);
    }

}
