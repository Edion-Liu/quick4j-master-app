package com.eliteams.quick4j.web.controller.app_api;


import com.eliteams.quick4j.core.util.ApplicationUtils;
import com.eliteams.quick4j.core.util.CUSTOM_UTIL;
import com.eliteams.quick4j.web.authorization.annotation.Authorization;
import com.eliteams.quick4j.web.model.NewWallet;
import com.eliteams.quick4j.web.model.PayOrder_NotifyUrlEntity;
import com.eliteams.quick4j.web.service.WallerService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/7.
 */
@Controller
@RequestMapping("/api/wallet")
public class App_api_walletController {

    @Resource
    WallerService wallerService;

    private static final Logger logger= LoggerFactory.getLogger(App_api_walletController.class);


    /**
     * 在线支付
     * @param userid
     * @param count
     * @param inoutype
     * @return
     */
    private String payonline(Integer userid,Integer count,Integer inoutype){


          return null;
    }

    /**
     * 钱包支出
     * @param userid
     * @param  money       收支类型
     * @param inoutmoney   收支金额
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/inout",produces = "text/html;charset=UTF-8")
  //  @Authorization
    public Object wallet_inout(@RequestParam(value="userid" ,required =false ) Integer  userid , @RequestParam(value="money" ,required =false ) Integer money,
                             @RequestParam(value="inoutmoney" ,required =false ) Integer inoutmoney) throws Exception {

                                 if(ApplicationUtils.Checknotnull_int(userid,inoutmoney)){
                                     return  ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);

                                 }

        NewWallet newWallet=new NewWallet();
        newWallet.setUserid(userid);
        newWallet.setMoney(money);
        newWallet.setInoutmoney(inoutmoney);
                                 switch (inoutmoney){
                                     case 1:
                                         String status=wallerService.detain(newWallet);
                                         if(status.equals("succeed")){
                                             return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
                                         }
                                         break;
                                     case 2:
                                         String status1=wallerService.detain(newWallet);
                                          if(status1.equals("succeed")){
                                         return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
                                     }
                                         break;
                                     case 3:
                                         String status2=wallerService.addmoney(newWallet);
                                         if(status2.equals("succeed")){
                                             return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
                                         }

                                         break;
                                     case 4:
                                         String status3=wallerService.addmoney(newWallet);
                                         if(status3.equals("succeed")){
                                             return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
                                         }
                                         break;
                                     case 5:
                                         String status4=wallerService.addmoney(newWallet);
                                         if(status4.equals("succeed")){
                                             return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
                                         }
                                         break;
                                     case 6:
                                         String status5=wallerService.addmoney(newWallet);
                                         if(status5.equals("succeed")){
                                             return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
                                         }
                                         break;
                                     case 7:
                                         String status6=wallerService.detain(newWallet);
                                         if(status6.equals("succeed")){
                                             return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK);
                                         }

                                         break;
                                     default:
                                         return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.WALLET_ERROR_TYPE);
                                 }


                                 return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.WALLET_NOTENOUGH);

    }


    /**
     * 根据userid 获取 钱包余额
     * @param userid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/query",produces = "text/html;charset=UTF-8")
    @Authorization
    public Object  walletget(@RequestParam(value="userid",required = false)Integer userid){

        if(ApplicationUtils.Checknotnull_int(userid)){
            return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
        }

        NewWallet newWallet=wallerService.GetmyWallet(userid);

        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"wallet",newWallet);


    }


    @ResponseBody
    @RequestMapping(value = "/GetBill",produces="text/html;charset=UTF-8")
    @Authorization
    public Object GetBill(@RequestParam(value = "offsetpage",required = false)Integer offsetpage,
                          @RequestParam(value="pagesize",required = false) Integer pagesize,
                          @RequestParam(value="userid",required=false)Integer userid){

               if(ApplicationUtils.Checknotnull_int(offsetpage,pagesize,userid)){
                   return ApplicationUtils.ReturnError(CUSTOM_UTIL.STATUS_NG,CUSTOM_UTIL.GET_DATDFAIL);
               }

        List<NewWallet> newWalletList=wallerService.GetBillByUserid(userid,offsetpage,pagesize);
        return ApplicationUtils.ReturnSuccess(CUSTOM_UTIL.STATUS_KEY,CUSTOM_UTIL.STATUS_OK,"bill",newWalletList);
    }


    /**
     * 微信支付回调函数
     * @param request
     * @return    注意 要进行缓存   未完成
     */
    @ResponseBody
    @RequestMapping(value = "/PayResultWecat",produces = "text/html;charset=UTF-8")
    public Object PayResultWecat(HttpServletRequest request) throws IOException{

        InputStream inputStream= request.getInputStream();
        String xml = IOUtils.toString(inputStream,"UTF-8");
        //String xml = ApplicationUtils.InputStreamToString(is, "UTF-8");
       PayOrder_NotifyUrlEntity payOrder_notifyUrlEntity =(PayOrder_NotifyUrlEntity) ApplicationUtils.GetObjectFromXML(xml, PayOrder_NotifyUrlEntity.class);

        if(payOrder_notifyUrlEntity==null || payOrder_notifyUrlEntity.getReturn_code()==null || !payOrder_notifyUrlEntity.getReturn_code().equals("SUCCESS")){
            return CUSTOM_UTIL.WECAT_PAY_NOTIFICATION_FAIL;
        }

        if(payOrder_notifyUrlEntity.getResult_code()==null || !payOrder_notifyUrlEntity.getResult_code().equals("SUCCESS")){
            return CUSTOM_UTIL.WECAT_PAY_FAIL_START+"错误代码："+payOrder_notifyUrlEntity.getErr_code()+"错误代码描述："+payOrder_notifyUrlEntity.getErr_code_des()+CUSTOM_UTIL.WECAT_PAY_FAIL_END;
        }

       /* 支付成功*/

        NewWallet newWallet=wallerService.GetmyWallet(Integer.parseInt(payOrder_notifyUrlEntity.getOpenid()));
        // Integer tempmoney=newWallet.getCash()+payOrder_notifyUrlEntity.getTotal_fee();
        newWallet.setInoutmoney(3);
        newWallet.setMoney(payOrder_notifyUrlEntity.getTotal_fee());
        wallerService.addmoney(newWallet);

        return CUSTOM_UTIL.WECAT_PAY_SUCCESS;
    }



}
