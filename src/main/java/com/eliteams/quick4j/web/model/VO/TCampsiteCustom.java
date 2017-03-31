package com.eliteams.quick4j.web.model.VO;

import com.eliteams.quick4j.web.model.TCampsite;
import com.eliteams.quick4j.web.model.TCampsiteImage;
import com.eliteams.quick4j.web.model.TComment;
import com.eliteams.quick4j.web.model.TUser;

import java.io.Serializable;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/4.
 */
public class TCampsiteCustom implements Serializable {

    private TCampsite tCampsite;

    private List<TCampsiteImage> tCampsiteImageList;

    private TUser tUser;

    private List<TComment> tCommentList;

    public List<TCampsiteImage> gettCampsiteImageList() {
        return tCampsiteImageList;
    }

    public void settCampsiteImageList(List<TCampsiteImage> tCampsiteImageList) {
        this.tCampsiteImageList = tCampsiteImageList;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    public List<TComment> gettCommentList() {
        return tCommentList;
    }

    public void settCommentList(List<TComment> tCommentList) {
        this.tCommentList = tCommentList;
    }

    public TCampsite gettCampsite() {
        return tCampsite;
    }

    public void settCampsite(TCampsite tCampsite) {
        this.tCampsite = tCampsite;
    }
}
