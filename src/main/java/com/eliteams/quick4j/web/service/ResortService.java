package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.cache.annotation.CacheWrite;
import com.eliteams.quick4j.web.dao.TResortImageMapper;
import com.eliteams.quick4j.web.dao.TResortMapper;
import com.eliteams.quick4j.web.dao.TScoreMapper;
import com.eliteams.quick4j.web.model.TComment;
import com.eliteams.quick4j.web.model.TResort;
import com.eliteams.quick4j.web.model.TScore;
import com.eliteams.quick4j.web.model.VO.TCampsiteVO;
import com.eliteams.quick4j.web.model.VO.TCommentVO;
import com.eliteams.quick4j.web.model.VO.TResortVO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/8.
 */
@Service
public class ResortService {
    @Autowired
    TResortMapper tResortMapper;
    @Autowired
    TScoreMapper tScoreMapper;

    @Autowired
    TResortImageMapper tResortImageMapper;




    /**
     * 插入一条营地记录
     * @param tResort
     */
    public void addDao(TResort tResort){
        tResortMapper.insert(tResort);
    }

    @CacheWrite(fields={"longitude","latitude","offset","range"},validTime = 60)
    public List<TResortVO> get_nearly_resort_map(Double longitude, Double latitude , Integer range){
        //查找营地
        List<TResortVO> tResortVOList =tResortMapper.get_nearly_resort_mapper(longitude,latitude,range);
        return  tResortVOList;
    }


    public List<TResortVO> get_nearly_resort(Double longitude, Double latitude , Integer range,Integer offsetpage,Integer pagesize){
        //查找营地
        PageHelper.startPage(offsetpage,pagesize);
        List<TResortVO> tResortVOList =tResortMapper.get_nearly_resort_mapper(longitude,latitude,range);

        return  tResortVOList;
    }


    /**
     * 根据id  获取营地详情
     * @param resort_id
     * @return
     */
    @CacheWrite(validTime = 60)
    public List<TResortVO> get_resortImpl(Integer resort_id){
        //获取营地信息
        List<TResortVO> tResortList=tResortMapper.get_resort_mapper(resort_id);

        List<TCommentVO> tCommentList=tResortMapper.get_resort_comment_mapper(resort_id,2);

        for (TResortVO tr:tResortList){
            tr.settCommentVOList(tCommentList);

        }
        //获取评分
      //  List<TScore> tScoreList=tScoreMapper.get_user_score_mapper(user_id,resort_id,2);
        return tResortList;
    }

}
