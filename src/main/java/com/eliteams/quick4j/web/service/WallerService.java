package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.web.dao.NewWalletMapper;
import com.eliteams.quick4j.web.model.NewWallet;
import com.eliteams.quick4j.web.model.NewWalletExample;
import com.eliteams.quick4j.web.model.NewYuebancomment;
import com.eliteams.quick4j.web.model.NewYuebancommentExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/7.
 */
@Service
public class WallerService {

    @Autowired
    NewWalletMapper newWalletMapper;


    /**
     * 插入一条钱包记录
     * @param newWallet
     */
   /* public void add(NewWallet newWallet){

        newWalletMapper.insert(newWallet);


    }*/

    /**
     * 扣款
     * @param newWallet
     * @return   succeed 扣款成功，n
     */
    public String detain(NewWallet newWallet){
        NewWallet newWallet1;
        String result="fail";
        if(newWallet.getInoutmoney()==1 || newWallet.getInoutmoney()==2 || newWallet.getInoutmoney()==7){
            NewWalletExample newWalletExample=new NewWalletExample();
            NewWalletExample.Criteria criteria=newWalletExample.createCriteria();
            criteria.andUseridEqualTo(newWallet.getUserid());
            PageHelper.startPage(1,1);
            PageHelper.orderBy("time desc");
            List<NewWallet> newWalletList=newWalletMapper.selectByExample(newWalletExample);
            if(newWalletList.size()==1){
                newWallet1 =newWalletList.get(0);
                //返回的结果是int类型，-1表示小于，0是等于，1是大于。
                int i=newWallet1.getCash().compareTo(newWallet.getMoney());

                if(i==-1){
                    return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.WALLET_NOTENOUGH);
                }

                Integer tempmoney=newWallet1.getCash()-newWallet.getMoney();
                newWallet.setCash(tempmoney);
                newWallet.setUsername(newWallet1.getUsername());
                newWallet.setTime(ApplicationUtils.dateToStrLong(new Date()));
                newWalletMapper.insert(newWallet);
                return "succeed";
            }
        }

        return result;
    }

    /**
     * 充值
     * @param newWallet
     * @return
     */
    public String addmoney(NewWallet newWallet){
        NewWallet newWallet1;
        String result="fail";
        NewWalletExample newWalletExample=new NewWalletExample();
        NewWalletExample.Criteria criteria=newWalletExample.createCriteria();
        criteria.andUseridEqualTo(newWallet.getUserid());
        PageHelper.startPage(1,1);
        PageHelper.orderBy("time desc");
        List<NewWallet> newWalletList=newWalletMapper.selectByExample(newWalletExample);
        if(newWalletList.size()==1){
            newWallet1 =newWalletList.get(0);
            //返回的结果是int类型，-1表示小于，0是等于，1是大于。
          /*  int i=newWallet1.getCash().compareTo(newWallet.getMoney());

            if(i==-1){
                return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.WALLET_NOTENOUGH);
            }*/

            Integer tempmoney=newWallet1.getCash()+newWallet.getMoney();
            newWallet.setCash(tempmoney);
            newWallet.setUsername(newWallet1.getUsername());
            newWallet.setTime(ApplicationUtils.dateToStrLong(new Date()));
            newWalletMapper.insert(newWallet);
            return "succeed";

        }
        return result;
    }


    /**
     * 获取最近消费记录列表
     * @param offsetpage
     * @param pagesize
     * @return
     */
    public List<NewWallet> query(int offsetpage, int pagesize){
            int pageindex=0;

        NewWalletExample newWalletExample=new NewWalletExample();
        NewWalletExample.Criteria criteria=newWalletExample.createCriteria();



            pageindex=offsetpage/17+1;
            PageHelper.startPage(pageindex,pagesize);
            //按降序排列  从大到小
            PageHelper.orderBy("time desc");
            List<NewWallet> newWalletList= newWalletMapper.selectByExample(newWalletExample);
            return newWalletList;
    }


    /**
     * 条件查找 钱包收支信息
     * @param search
     * @return
     */
    public List<NewWallet> walletcondition(String search){
        if(search.equals("在线支付")){
            search="1";
        }else

        if(search.equals("提现")){
            search="2";
        }else

        if(search.equals("充值")){
            search="3";
        }else

        if(search.equals("转账进来")){
            search="4";
        }else

        if(search.equals("红包")){
            search="5";
        }else

        if(search.equals("打赏")){
            search="6";
        }else

        if(search.equals("转账出去")){
            search="7";
        }else {

        }
        NewWalletExample newWalletExample=new NewWalletExample();
        NewWalletExample.Criteria criteria=newWalletExample.createCriteria();
        criteria.andUseridEqualTo(Integer.parseInt(search));


        NewWalletExample.Criteria criteria1=newWalletExample.createCriteria();
        criteria1.andInoutmoneyEqualTo(Integer.parseInt(search));

        newWalletExample.or(criteria1);


        List<NewWallet> newWalletList=newWalletMapper.selectByExample(newWalletExample);
        return newWalletList;
    }


    public List<NewWallet> GetBillByUserid(Integer userid,Integer offsetpage ,Integer pagesize){

        NewWalletExample newWalletExample=new NewWalletExample();
        NewWalletExample.Criteria criteria=newWalletExample.createCriteria();
        criteria.andUseridEqualTo(userid);

        PageHelper.startPage(offsetpage,pagesize);
        PageHelper.orderBy("time desc");
        List<NewWallet> newWalletList=newWalletMapper.selectByExample(newWalletExample);
        return newWalletList;

    }

    /**
     * 根据用户id 查询当前钱包余额
     * @param userid
     * @return
     */
   public NewWallet GetmyWallet(Integer userid){

       NewWallet newWallet=null;

       NewWalletExample newWalletExample=new NewWalletExample();
       NewWalletExample.Criteria criteria=newWalletExample.createCriteria();
       criteria.andUseridEqualTo(userid);
       PageHelper.startPage(1,1);
       PageHelper.orderBy("time desc");
       List<NewWallet> newWalletList=newWalletMapper.selectByExample(newWalletExample);
       if(newWalletList.size()==1) {
           newWallet = newWalletList.get(0);
       }

       return newWallet;

   }







}
