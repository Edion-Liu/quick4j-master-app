package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NewWallet;
import com.eliteams.quick4j.web.model.NewWalletExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewWalletMapper {
    int countByExample(NewWalletExample example);

    int deleteByExample(NewWalletExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewWallet record);

    int insertSelective(NewWallet record);

    List<NewWallet> selectByExample(NewWalletExample example);

    NewWallet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewWallet record, @Param("example") NewWalletExample example);

    int updateByExample(@Param("record") NewWallet record, @Param("example") NewWalletExample example);

    int updateByPrimaryKeySelective(NewWallet record);

    int updateByPrimaryKey(NewWallet record);
}