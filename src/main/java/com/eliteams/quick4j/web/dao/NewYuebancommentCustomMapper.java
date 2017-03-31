package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewYuebancommentCustom;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/29.
 */
public interface NewYuebancommentCustomMapper {

    //根据约伴id 查找约伴自定义类约伴评论
    List<NewYuebancommentCustom> selectbyyuebanid(int yuebanid) throws Exception;
    //根据约伴id 查找约伴自定义约伴评论 限制3条
    List<NewYuebancommentCustom> selectbyyuebanid3(int yuebanid) throws Exception;
}
