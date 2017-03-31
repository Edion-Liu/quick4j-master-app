package com.eliteams.quick4j.web.controller.manage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.eliteams.quick4j.web.model.NewWallet;
import com.eliteams.quick4j.web.model.NewWalletExample;
import com.eliteams.quick4j.web.service.WallerService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/10.
 */
@Controller
@RequestMapping(value = "/manage/wallet")
public class new_wallet {


    @Resource
    WallerService wallerService;

    /**
     * 掉转到钱包支收记录
     * @param request
     * @return
     */
    @RequestMapping(value = "/getinoutmoney",produces = "text/html;charset=UTF-8")
    public ModelAndView getinout(HttpServletRequest request)  {

        ModelAndView modelAndView=new ModelAndView("wallet");
        return modelAndView;
    }


    /**
     * 获取支收记录
     * @param request
     * @param offset
     * @param limit
     * @param search
     * @return
     */
    @RequestMapping(value = "/getdata",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String  getdata(HttpServletRequest request, @RequestParam(value = "offset",required = false) Integer offset,
                                       @RequestParam(value = "limit",required = false)Integer limit,@RequestParam(value = "search",required = false)String search){
        String result=null;
        List<NewWallet> newWalletList;

        if(search.equals("") ||search.equals("搜索")){
            newWalletList= wallerService.query(offset,limit);
        }else {
            newWalletList= wallerService.walletcondition(search);
        }

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("total",new PageInfo<NewWallet>(newWalletList).getTotal());
        jsonObject.put("rows",newWalletList);
        result= JSON.toJSONString(jsonObject);
        return  result;
    }
}
