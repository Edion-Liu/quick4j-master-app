package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewYueban;
import com.eliteams.quick4j.web.service.YuebanService;
import com.github.pagehelper.PageHelper;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/27.
 */
public class NewYuebanMapperTest {

    @Resource
    private NewYuebanMapper newYuebanMapper;

    @Resource
    private YuebanService yuebanService;
    @Test
    public void test1() throws Exception {

        PageHelper.startPage(1,20);
        List<NewYueban>  list=yuebanService.getallyueban();

        for(NewYueban newy:list)
        {
              System.out.println(newy);
        }

    }

}