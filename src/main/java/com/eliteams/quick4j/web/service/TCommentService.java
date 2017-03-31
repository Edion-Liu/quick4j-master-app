package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.TCommentImageMapper;
import com.eliteams.quick4j.web.dao.TCommentMapper;
import com.eliteams.quick4j.web.model.TComment;
import com.eliteams.quick4j.web.model.TCommentExample;
import com.eliteams.quick4j.web.model.TCommentImage;
import com.eliteams.quick4j.web.model.TCommentImageExample;
import com.eliteams.quick4j.web.model.VO.TCampsiteVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/28.
 */
@Service
public class TCommentService {
    @Autowired
    TCommentMapper tCommentMapper;
    @Autowired
    TCommentImageMapper tCommentImageMapper;

    /**
     * 插入一条评论
     * @param tComment
     */
    public void insertcomment(TComment tComment){
         tCommentMapper.insert(tComment);
    }

    public void insertcommentimage(TCommentImage tCommentImage){
        tCommentImageMapper.insert(tCommentImage);
    }

    /**
     * 根据评论ID 获取评论图片
     * @param commentid
     * @return
     */
    public List<TCommentImage> getImageByCommentId(Integer commentid){
        TCommentImageExample tCommentImageExample=new TCommentImageExample();
        TCommentImageExample.Criteria criteria=tCommentImageExample.createCriteria();
        criteria.andCommentIdEqualTo(commentid);
        List<TCommentImage> tCommentImageList=tCommentImageMapper.selectByExample(tCommentImageExample);
        return tCommentImageList;
    }


 /*   public List<TCampsiteVO> getcampsiteByUserid(Integer userId){

     TCommentExample tCommentExample=new TCommentExample();
        TCommentExample.Criteria criteria=tCommentExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<T> tCampsiteVOList=tCommentMapper.selectByExample(tCommentExample);
        return tCommentImageList;

    }*/
}
