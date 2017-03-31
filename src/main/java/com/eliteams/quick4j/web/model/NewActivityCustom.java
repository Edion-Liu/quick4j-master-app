package com.eliteams.quick4j.web.model;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/5.
 */
public class NewActivityCustom {

    private  NewActivity newActivity;
    private List<NewActivitydetail> newActivitydetail;
    //获取报名列表
    private List<NewJoin> newJoinList;


    public NewActivity getNewActivity() {
        return newActivity;
    }

    public void setNewActivity(NewActivity newActivity) {
        this.newActivity = newActivity;
    }


    public List<NewActivitydetail> getNewActivitydetail() {
        return newActivitydetail;
    }

    public void setNewActivitydetail(List<NewActivitydetail> newActivitydetail) {
        this.newActivitydetail = newActivitydetail;
    }

    public List<NewJoin> getNewJoinList() {
        return newJoinList;
    }

    public void setNewJoinList(List<NewJoin> newJoinList) {
        this.newJoinList = newJoinList;
    }
}
