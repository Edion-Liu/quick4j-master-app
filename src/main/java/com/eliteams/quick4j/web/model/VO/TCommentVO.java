package com.eliteams.quick4j.web.model.VO;

import com.eliteams.quick4j.web.model.TComment;
import com.eliteams.quick4j.web.model.TUser;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/10.
 */
public class TCommentVO extends TComment {

    private TUser tUser;

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }
}
