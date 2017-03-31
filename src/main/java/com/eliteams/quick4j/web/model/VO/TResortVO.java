package com.eliteams.quick4j.web.model.VO;

import com.eliteams.quick4j.web.model.TComment;
import com.eliteams.quick4j.web.model.TResort;
import com.eliteams.quick4j.web.model.TResortImage;
import com.eliteams.quick4j.web.model.TUser;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/9.
 */
public class TResortVO extends TResort {

    private TUser tUser;

    private List<TResortImage> tResortImageList;

    private List<TCommentVO>  tCommentVOList;


    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    public List<TResortImage> gettResortImageList() {
        return tResortImageList;
    }

    public void settResortImageList(List<TResortImage> tResortImageList) {
        this.tResortImageList = tResortImageList;
    }


    public List<TCommentVO> gettCommentVOList() {
        return tCommentVOList;
    }

    public void settCommentVOList(List<TCommentVO> tCommentVOList) {
        this.tCommentVOList = tCommentVOList;
    }
}
