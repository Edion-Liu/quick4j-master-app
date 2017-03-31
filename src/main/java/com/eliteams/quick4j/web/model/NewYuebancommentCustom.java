package com.eliteams.quick4j.web.model;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/29.
 */
public class NewYuebancommentCustom extends NewYuebancomment {

    public List<NewYuebanreply> listreply;


    public List<NewYuebanreply> getListreply() {
        return listreply;
    }

    public void setListreply(List<NewYuebanreply> listreply) {
        this.listreply = listreply;
    }

}
