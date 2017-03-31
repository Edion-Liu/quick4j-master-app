package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.web.dao.TScoreMapper;
import com.eliteams.quick4j.web.model.TScore;
import com.eliteams.quick4j.web.model.TScoreExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/9.
 */
@Service
public class TScoreService {
    @Autowired
    TScoreMapper tScoreMapper;

    /**
     * 通过id 获取成绩  窝窝美食营地id
     * @param id
     * @return
     */
    public Integer getScoreById(Integer  id){

        TScoreExample tScoreExample=new TScoreExample();
        TScoreExample.Criteria criteria=tScoreExample.createCriteria();
        criteria.andCampsiteIdEqualTo(id);
        List<TScore> tScoreList=tScoreMapper.selectByExample(tScoreExample);
        if(tScoreList.size()==0)
            return 0;
        int scorecount=0;
        for (TScore ts:tScoreList){
            scorecount+=ts.getScore();
        }
        int score=scorecount/tScoreList.size();
        return score;

    }


    public Integer getScoreByUser_idAndCampsiteid(Integer user_id,Integer campsiteid){
        TScoreExample tScoreExample=new TScoreExample();
        TScoreExample.Criteria criteria=tScoreExample.createCriteria();
        criteria.andUserIdEqualTo(user_id);
        criteria.andCampsiteIdEqualTo(campsiteid);
        List<TScore> tScoreList=tScoreMapper.selectByExample(tScoreExample);
        if(tScoreList.size()==0)
            return 0;
        int scorecount=0;
        for (TScore ts:tScoreList){
            scorecount+=ts.getScore();
        }
        int score=scorecount/tScoreList.size();
        return score;

    }

    /**
     * 插入一条分数记录
     * @param tScore
     */
    public void InsertScore(TScore tScore){

        tScore.setCreatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tScore.setUpdatedAt(ApplicationUtils.dateToStrLong(new Date()));
        tScoreMapper.insert(tScore);
    }



}
