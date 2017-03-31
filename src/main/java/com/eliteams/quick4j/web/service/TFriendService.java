package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.web.dao.TFriendMapper;
import com.eliteams.quick4j.web.model.TFriend;
import com.eliteams.quick4j.web.model.TFriendExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/3/3.
 */
@Service
public class TFriendService {

    @Autowired
    TFriendMapper tFriendMapper;

    /**
     * 通过玩家id 获取粉丝id
     * @param id
     * @return
     */
    public List<TFriend>  getFriendByUserId(Integer id){
        TFriendExample  tFriendExample=new TFriendExample();
        TFriendExample.Criteria criteria=tFriendExample.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<TFriend > tFriendList=tFriendMapper.selectByExample(tFriendExample);

        return tFriendList;
    }




}
