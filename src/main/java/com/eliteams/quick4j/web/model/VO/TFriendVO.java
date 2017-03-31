package com.eliteams.quick4j.web.model.VO;

import com.eliteams.quick4j.web.model.TFriend;
import com.eliteams.quick4j.web.model.TUser;

import java.io.Serializable;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/18.
 */
public class TFriendVO extends TFriend {
    private TUser tUser;

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }
}
