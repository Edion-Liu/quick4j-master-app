package com.eliteams.quick4j.web.model.VO;

import com.eliteams.quick4j.web.model.*;

import java.io.Serializable;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/1.
 */
public class TCampsiteVO extends TCampsite {

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
}
