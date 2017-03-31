<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="net.sf.json.JSONArray" %>
<%@ page import="com.eliteams.quick4j.web.model.NewActivityCustom" %>
<%@ page import="com.eliteams.quick4j.web.model.NewActivitydetail" %>
<%@ page import="com.eliteams.quick4j.web.model.NewJoin" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html lang="en">
<head>

    <base href="<%=basePath%>">
    <%
        NewActivityCustom newActivityCustom = (NewActivityCustom) request.getAttribute("activity");
    %>
    <meta name="description" content="【大熊猫参观活动】，首选【窝友之家】。" />
    <!-- 禁用iPhone手机浏览器上给电话号码自动加上的link样式 -->
    <meta name="format-detection" content="telephone=no">
    <meta charset="UTF-8">
    <title>活动</title>
    <link rel="stylesheet" href="assets/app_web/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/pages/app_activity.css">
    <!--响应式设计开始  -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <script type="text/javascript" src="http://cdn.bootcss.com/device.js/0.2.7/device.min.js"></script>
    <script type="text/javascript" src="assets/plugins/jquery/jquery-1.11.1.min.js">
        //控制设备类型
        if(device.windows()){
            $("head").append('<script type="text/javascript" src="js/web.js"><'+'/script>');
        }else{
            $("head").append('<link href="css/mi.css" rel="stylesheet" />')
                    .append('<script type="text/javascript" src="js/miweb.js"><'+'/script>');
        }
    </script>
    <!-- 百度地图 -->
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=7CYGYApbY70NDVWRs2kdXNeAWfMxG8E3"></script>
</head>
<body>

    <div class="container" id="allmap" style="width:100%;height: 100%;margin: 0;padding: 0;border: 1px solid #999;">

    <!-- 活动信息 -->
    <div class="onepage">

        <!-- 海报 -->
        <div class="activity_poster">
            <img src="" alt="海报">
            <a href="javascript:void(0)" onclick="goBack_detail()" class="return" title="返回"></a>
        </div>

        <!-- 标题 -->
        <div class="detail_title">
            <title id="dt_title" class="detail_title_h1"></title>
        </div>

        <!-- 发布时间、阅读、分享数 -->
        <div class="activity_share_wrap have_safeguard">
            <div class="time"></div>
            <div class="fx">
                <img src="app/img/ActivityScan.png" alt="">
                <span></span>
            </div>
            <div class="yd">
                <img src="app/img/ActivityShare.png" alt="">
                <span></span>
            </div>
            <%--<a class="safeguard" href="javascript:void(0)" onclick="_tc._show('safeguard')" ontouchstart="">交易保障</a>--%>
        </div>

        <!-- 时间、地点、人数、费用 -->
        <div class="detail_time_attr_join">
            <div class="detail_time_attr_join_gray">

                <div class="detail_Time"><b></b>
                    <div class="detail_Time_n">
                        <p></p>
                    </div>
                </div>

                <div class="detail_Addr"><b></b><i></i>
                    <a href="javascript:void(0)" class="dt_address_item" ontouchstart="">
                        <div class="detail_Addr_K">
                            <p class="detail_Time_n"></p>
                        </div>
                    </a>
                </div>

                <div id="detail_Joinnum" class="detail_Joinnum">
                    <b></b>
                    <div class="detail_Joinnum_t">
                        <p>
                            已报名<span>143</span>人 /
                            不限制名额
                        </p>
                    </div>
                </div>
                <div class="detail_price">
                    <b></b><i></i>
                    <div class="detail_price_tit" ontouchstart="">
                        <p onclick="_tc._show('join_box_fee2');getTxtWidth()"><span>¥0~100</span></p>
                    </div>
                </div>
            </div>
        </div>

        <!-- 活动主办方 -->
        <div class="detail_publisher">
            <div class="detail_publisher_content">
                <div class="detail_publisher_pic">

                    <a href="/timeline/0bxpq.html" ontouchstart=""><img src="" onerror="this.src='http://cdn.hudongba.com/static_v4/images/other/face_default_200.png'" alt=""></a>

                </div>
                <div class="detail_publisher_con_c">
                    <div class="detail_publisher_Name">
                        <p>
                            <a class="subinfo_name" href="/timeline/0bxpq.html" ontouchstart=""></a>
                            <a href="javascript:;" class="rz_icon_a" onclick="_tc._show('rz_web_tc')"><img src="http://cdn.hudongba.com/static_v4/images/manage/rz_icon_g.png" style="margin-top: 4px;" width="11"></a>
                        </p>
                        <span>发起人</span>
                    </div>
                    <div class="detail_publisher_signature"><p></p></div>
                </div>
                <div class="focus_Pb">
                    <a id="attent_Btn" href="javascript:void(0)" rel="nofollow" class="wgz" ontouchstart="">+ 关注</a>
                    <b></b>
                    <a class="wgz" id="tel" ontouchstart="" rel="nofollow" href="tel:183100502" data-toggle="modal" data-target="#myModal" data-backdrop="true">联系Ta</a>
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog myDialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h4 class="modal-title" id="myModalLabel">提示</h4>
                                </div>
                                <div class="modal-body">
                                    确认拨打电话 <%=newActivityCustom.getNewActivity().getSuPhone()%> 吗?
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                    <a href="tel:<%=newActivityCustom.getNewActivity().getSuPhone()%>" class="ensure">确定</a>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>




    </div>

    <!-- 活动详情 -->
    <div class="twopage" style="padding-left: 12px;">
        <%
            List<NewActivitydetail>  list= newActivityCustom.getNewActivitydetail();
            for (int i=0;i<list.size();i++){
        %>
        <p><%=list.get(i).getImagedetail()%></p>
        <%
            if(list.get(i).getImageurl().trim()!=""){
        %>
        <img id="descrImg" class="center-block" src="<%=list.get(i).getImageurl()%>">

        <div class="content_wrap" id="content_wrap">
           <!-- 测试 -->
            <p>W3School 提供的内容仅用于培训。我们不保证内容的正确性。通过使用本站内容随之而来的风险与本站无关。W3School 简体中文版的所有内容仅供测试，对任何法律问题及风险不承担任何责任。
                当使用本站时，代表您已接受了本站的使用条款和隐私条款。版权所有，保留一切权利。 赞助商：上海赢科投资有限公司。 蒙ICP备06004630号
                W3School 提供的内容仅用于培训。我们不保证内容的正确性。通过使用本站内容随之而来的风险与本站无关。W3School 简体中文版的所有内容仅供测试，对任何法律问题及风险不承担任何责任。
                当使用本站时，代表您已接受了本站的使用条款和隐私条款。版权所有，保留一切权利。 赞助商：上海赢科投资有限公司。 蒙ICP备06004630号
            </p>
                <p>W3School 提供的内容仅用于培训。我们不保证内容的正确性。通过使用本站内容随之而来的风险与本站无关。W3School 简体中文版的所有内容仅供测试，对任何法律问题及风险不承担任何责任。
                    当使用本站时，代表您已接受了本站的使用条款和隐私条款。版权所有，保留一切权利。 赞助商：上海赢科投资有限公司。 蒙ICP备06004630号
                    W3School 提供的内容仅用于培训。我们不保证内容的正确性。通过使用本站内容随之而来的风险与本站无关。W3School 简体中文版的所有内容仅供测试，对任何法律问题及风险不承担任何责任。
                    当使用本站时，代表您已接受了本站的使用条款和隐私条款。版权所有，保留一切权利。 赞助商：上海赢科投资有限公司。 蒙ICP备06004630号
                </p>
                <p>W3School 提供的内容仅用于培训。我们不保证内容的正确性。通过使用本站内容随之而来的风险与本站无关。W3School 简体中文版的所有内容仅供测试，对任何法律问题及风险不承担任何责任。
                    当使用本站时，代表您已接受了本站的使用条款和隐私条款。版权所有，保留一切权利。 赞助商：上海赢科投资有限公司。 蒙ICP备06004630号
                    W3School 提供的内容仅用于培训。我们不保证内容的正确性。通过使用本站内容随之而来的风险与本站无关。W3School 简体中文版的所有内容仅供测试，对任何法律问题及风险不承担任何责任。
                    当使用本站时，代表您已接受了本站的使用条款和隐私条款。版权所有，保留一切权利。 赞助商：上海赢科投资有限公司。 蒙ICP备06004630号
                </p>

        </div>
        <%
                }
            }
        %>
        <button type="button" class="btn btn-link center-block" id="mybtn">展开更多详情 <span class="caret"></span></button>
    </div>

    <!-- 报名列表 -->
    <div class="threepage">
        <a name="a_join_list"></a>
        <div id="dt_join_menu_bg" class="dt_join_menu_bg">
            <div class="dt_join_top" ontouchstart="">
                <p id="dt_join_count" class="dt_join_topL">
                    <span id="join_total">已报名(0)</span>
                </p>
                <a class="moreJoin"  href="javascript:void(0)" onclick="window.location.href=baseUrl+'/manage/activity/joinActivityList?info_id=<%=newActivityCustom.getNewActivity().getId()%>'">更多报名</a>
            </div>
            <div class="line_Spacer"></div>
            <ul id="dt_list_main" class="dt_list_main" style="display: block;">
                <li ontouchstart="" class="dt_review_main" id="li_join_id_40665421">
                    <div class="dt_review_K">
                        <div class="dt_guess_item_icon">
                            <a ontouchstart="" href="/timeline/a0l3x.html">
                                <img class="default_img" src="" alt="">
                            </a>
                        </div>
                        <div class="dt_guess_item_title">
                            <a ontouchstart="" href="/timeline/a0l3x.html"></a>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>

     <!-- 讨论 -->
    <div class="fourpage">
        <div class="dt_disc_top" ontouchstart="">
            <p id="dt_disc_count" class="dt_disc_topL">
                <span id="disc_total">讨论(<span id="dissCount">10</span>)</span>
            </p>
            <a class="moreDisc" ms-href="/joinPartyList?info_id={{party_id_36}}" href="/joinPartyList?info_id=go38b">我要讨论</a>
        </div>
            <div class="line_Spacer"></div>
        <p id="noDiss">还木有人讨论，快来抢个沙发吧！</p>
        <div id="list-discuss">
            <div class="media activity-discuss">
                <div class="media-left media-top joiner">
                    <a href="#">
                        <img class="img-circle media-object joiner-icon" src="<%=newActivityCustom.getNewActivity().getImageurl()%>" alt="...">
                    </a>
                </div>
                <div class="media-body discuss-info">
                    <a class="media-heading discuss-name"><%=newActivityCustom.getNewActivity().getName()%></a>
                    <span class="pull-right discuss-time"><%=newActivityCustom.getNewActivity().getPublishtime().substring(5,7)%>月<%=newActivityCustom.getNewActivity().getPublishtime().substring(8,10)%>日</span>
                    <p class="discuss-content"><%=newActivityCustom.getNewActivity().getThemedetail()%></p>
                </div>
            </div>

            <div class="media activity-discuss">
                <div class="media-left media-middle joiner">
                    <a href="#">
                        <img class="img-circle media-object joiner-icon" src="<%=newActivityCustom.getNewActivity().getImageurl()%>" alt="...">
                    </a>
                </div>
                <div class="media-body discuss-info">
                    <a class="media-heading discuss-name"><%=newActivityCustom.getNewActivity().getName()%></a>
                    <span class="pull-right discuss-time"><%=newActivityCustom.getNewActivity().getPublishtime().substring(5,7)%>月<%=newActivityCustom.getNewActivity().getPublishtime().substring(8,10)%>日</span>
                    <p class="discuss-content"><%=newActivityCustom.getNewActivity().getThemedetail()%></p>
                </div>
            </div>
            <div class="media activity-discuss">
                <div class="media-left media-middle joiner">
                    <a href="#">
                        <img class="img-circle media-object joiner-icon" src="<%=newActivityCustom.getNewActivity().getImageurl()%>" alt="...">
                    </a>
                </div>
                <div class="media-body discuss-info">
                    <a class="media-heading discuss-name"><%=newActivityCustom.getNewActivity().getName()%></a>
                    <span class="pull-right discuss-time"><%=newActivityCustom.getNewActivity().getPublishtime().substring(5,7)%>月<%=newActivityCustom.getNewActivity().getPublishtime().substring(8,10)%>日</span>
                    <p class="discuss-content"><%=newActivityCustom.getNewActivity().getThemedetail()%></p>
                </div>
            </div>
            <div class="media activity-discuss">
                <div class="media-left media-middle joiner">
                    <a href="#">
                        <img class="img-circle media-object joiner-icon" src="<%=newActivityCustom.getNewActivity().getImageurl()%>" alt="...">
                    </a>
                </div>
                <div class="media-body discuss-info">
                    <a class="media-heading discuss-name"><%=newActivityCustom.getNewActivity().getName()%></a>
                    <span class="pull-right discuss-time"><%=newActivityCustom.getNewActivity().getPublishtime().substring(5,7)%>月<%=newActivityCustom.getNewActivity().getPublishtime().substring(8,10)%>日</span>
                    <p class="discuss-content"><%=newActivityCustom.getNewActivity().getThemedetail()%></p>
                </div>
            </div>
            <div class="media activity-discuss">
                <div class="media-left media-middle joiner">
                    <a href="#">
                        <img class="img-circle media-object joiner-icon" src="<%=newActivityCustom.getNewActivity().getImageurl()%>" alt="...">
                    </a>
                </div>
                <div class="media-body discuss-info">
                    <a class="media-heading discuss-name"><%=newActivityCustom.getNewActivity().getName()%></a>
                    <span class="pull-right discuss-time"><%=newActivityCustom.getNewActivity().getPublishtime().substring(5,7)%>月<%=newActivityCustom.getNewActivity().getPublishtime().substring(8,10)%>日</span>
                    <p class="discuss-content"><%=newActivityCustom.getNewActivity().getThemedetail()%></p>
                </div>
            </div>
            <div class="media activity-discuss">
                <div class="media-left media-middle joiner">
                    <a href="#">
                        <img class="img-circle media-object joiner-icon" src="<%=newActivityCustom.getNewActivity().getImageurl()%>" alt="...">
                    </a>
                </div>
                <div class="media-body discuss-info">
                    <a class="media-heading discuss-name"><%=newActivityCustom.getNewActivity().getName()%></a>
                    <span class="pull-right discuss-time"><%=newActivityCustom.getNewActivity().getPublishtime().substring(5,7)%>月<%=newActivityCustom.getNewActivity().getPublishtime().substring(8,10)%>日</span>
                    <p class="discuss-content"><%=newActivityCustom.getNewActivity().getThemedetail()%></p>
                </div>
            </div>
            <div class="media activity-discuss">
                <div class="media-left media-top joiner">
                    <a href="#">
                        <img class="img-circle media-object joiner-icon" src="<%=newActivityCustom.getNewActivity().getImageurl()%>" alt="...">
                    </a>
                </div>
                <div class="media-body discuss-info">
                    <a class="media-heading discuss-name"><%=newActivityCustom.getNewActivity().getName()%></a>
                    <span class="pull-right discuss-time"><%=newActivityCustom.getNewActivity().getPublishtime().substring(5,7)%>月<%=newActivityCustom.getNewActivity().getPublishtime().substring(8,10)%>日</span>
                    <p class="discuss-content">
                        0
                        css设置div的高度自适应并到一定高度后显示滚动条3
                        css设置div的默认高度为50px,当div里面的内容很多时，div自适应增加高度，当高度达到200px时高度不再增加，而是让这个div显示滚动条。
                        请问谁能告诉我怎么实现，谢谢!
                        问题补充：
                        redstarofsleep 写道
                        设置滚动条自动(即内容多时自动显示)

                        然后,嘿嘿

                        两条CSS3搞定
                        min-height:50px;
                        max-height:200px;

                        再或者.......用JS来做也不烦的..

                        谢谢你的帮忙，用min-height:50px;
                        max-height:200px;的时候在IE6下面就不好使了。我再想想用js实现。
                        非常感谢你!!
                    </p>
                </div>
            </div>

        </div>
        <button type="button" class="btn btn-link center-block" id="discMore">查看更多讨论</button>

    </div>

    <!-- 分享 -->
    <div class="fivepage">
        <div class="hdman_newFx_wrap" id="hdman_newFx_wrap">
            <div class="post-topshare">
                <div class="line"></div>
                <span class="post-topshare-title">分享</span>
                <div class="line"></div>
            </div>

            <div class="share-list">
                <ul class="list-inline post-share">
                    <li class="share-wx">
                        <a href="javascript:;" target="_blank" class="share01"><img src="app/img/001966720af110e381132c.jpg" class="img-circle wx" title="分享到微信"></a>
                        <p>微信好友</p>
                    </li>
                    <li class="share-pyq">
                        <a href="javascript:;" target="_blank" class="share02"><img src="app/img/001966720af110e381132c.jpg" class="img-circle pyq" title="分享到微信朋友圈"></a>
                        <p>微信朋友圈</p>
                    </li>
                    <li class="share-qq">
                        <a href="javascript:;" target="_blank" class="share03"><img src="app/img/001966720af110e381132c.jpg" class="img-circle qq" title="分享到QQ"></a>
                        <p>QQ</p>
                    </li>
                    <li class="share-more">
                        <a id="sharesBtn" class="btn" data-toggle="modal" data-target=".bs-example-modal-lg"><img src="app/img/001966720af110e381132c.jpg" class="img-circle shareMore"></a>
                        <p>更多</p>
                        <div class="modal fade bs-example-modal-lg shares-wrap" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                            <div class="modal-content shares">

                                <ul class="list-inline">
                                    <li>
                                        <a href="javascript:;" target="_blank" class="share01"><img src="app/img/001966720af110e381132c.jpg" class="img-circle wx" title="分享到微信"></a>
                                        <p>微信好友</p>
                                    </li>
                                    <li>
                                        <a href="javascript:;" target="_blank" class="share02"><img src="app/img/001966720af110e381132c.jpg" class="img-circle pyq" title="分享到微信朋友圈"></a>
                                        <p>微信朋友圈</p>
                                    </li>
                                    <li>
                                        <a href="javascript:;" target="_blank" class="share03"><img src="app/img/001966720af110e381132c.jpg" class="img-circle qq" title="分享到QQ"></a>
                                        <p>QQ</p>
                                    </li>
                                    <li>
                                        <a href="javascript:;" target="_blank" class="share04"><img src="app/img/001966720af110e381132c.jpg" class="img-circle qq" title="分享到QQ空间"></a>
                                        <p>QQ空间</p>
                                    </li>
                                    <li class="share-wx">
                                        <a href="javascript:;" target="_blank" class="share05"><img src="app/img/001966720af110e381132c.jpg" class="img-circle wx" title="分享到新浪微博"></a>
                                        <p>新浪微博</p>
                                    </li>
                                    <li>
                                        <a href="javascript:;" target="_blank" class="share06"><img src="app/img/001966720af110e381132c.jpg" class="img-circle pyq" title="分享到Facebook"></a>
                                        <p>Facebook</p>
                                    </li>
                                    <li>
                                        <a href="javascript:;" target="_blank" class="share07"><img src="app/img/001966720af110e381132c.jpg" class="img-circle qq" title="分享到Twitter"></a>
                                        <p>Twitter</p>
                                    </li>
                                    <li>
                                        <a href="javascript:;" onclick="copyToClipboard(location.href)"><img src="app/img/001966720af110e381132c.jpg" class="img-circle qq" title="复制链接"></a>
                                        <p>复制链接</p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>

    <!-- 猜你喜欢 -->
    <div class="sixpage">

        <div class="dt_guess_top" ontouchstart="">
            <p id="dt_guess_count" class="dt_guess_topL">
                <span id="guess_total">猜你喜欢</span>
            </p>
            <a class="moreGuess" ms-href="/joinPartyList?info_id={{party_id_36}}" href="rest/manage/activity/activityList">查看更多</a>
        </div>
        <div class="moreActivity">
            <ul class="dt_guess_list_main">
                <li>
                    <a class="dt_guess_list party" href="javascript:void(0)">
                        <div class="dt_guess_list_icon">
                            <img onerror="this.src='http://cdn.hudongba.com/static_v4/images/other/order_confirm_bg.png'" alt="" src="">
                        </div>
                        <div class="dt_guess_list_title">
                            <span></span>
                        </div>
                        <div class="find_main_address"></div>
                        <div class="find_main_time">
                            <p></p>
                        </div>
                        <div class="find_main_price"><span>￥</span><i>0</i><span>起</span></div>
                    </a>
                </li>
            </ul>

        </div>

    </div>

    <!-- 页尾 -->
    <div class="footer">
        <div class="myfoot">
            窝友之家
        </div>
        <a>
            <img style="width:100%;height:100px;" src="...">
        </a>
    </div>

    </div>




<script src="assets/app_web/js/bootstrap.min.js"></script>
<script src="assets/scripts/app_activity.js"></script>
<script>

</script>

</body>
</html>
