<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--suppress ALL --%>
<%--suppress ALL --%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="net.sf.json.JSONArray" %>
<%@ page import="com.eliteams.quick4j.web.model.NewAdvertisement" %>

<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>


<!DOCTYPE html>
<!--
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.0.3
Version: 1.5.5
Author: KeenThemes
Website: http://www.keenthemes.com/
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8"/>
    <title>app软件更新</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <meta name="MobileOptimized" content="320">
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN THEME STYLES -->
    <link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/plugins.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
    <link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>


    <link href="app/css/fileinput.css"  rel="stylesheet" type="text/css">



    //新增
    <%--  <link href="assets/css/portfolio-rtl.css" rel="stylesheet" type="text/css"/>--%>

    <!-- END THEME STYLES -->
    <link rel="shortcut icon" href="favicon.ico"/>




</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
<!-- BEGIN HEADER -->
<div class="header navbar navbar-inverse navbar-fixed-top">
    <!-- BEGIN TOP NAVIGATION BAR -->
    <div class="header-inner">
        <!-- BEGIN LOGO -->
        <a class="navbar-brand" href="index.html">
            <img src="assets/img/logo.png" alt="logo" class="img-responsive"/>
        </a>
        <!-- END LOGO -->
        <!-- BEGIN RESPONSIVE MENU TOGGLER -->
        <a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <img src="assets/img/menu-toggler.png" alt=""/>
        </a>
        <!-- END RESPONSIVE MENU TOGGLER -->
        <!-- BEGIN TOP NAVIGATION MENU -->
        <ul class="nav navbar-nav pull-right">
            <!-- BEGIN NOTIFICATION DROPDOWN -->

            <!-- END NOTIFICATION DROPDOWN -->
            <!-- BEGIN INBOX DROPDOWN -->

            <!-- END INBOX DROPDOWN -->
            <!-- BEGIN TODO DROPDOWN -->

            <!-- END TODO DROPDOWN -->
            <!-- BEGIN USER LOGIN DROPDOWN -->
            <li class="dropdown user">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                    <img alt="" src="assets/img/avatar1_small.jpg"/>
                    <span class="username"> ${userInfo.username } </span>
                    <i class="fa fa-angle-down"></i>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="javascript:;" id="trigger_fullscreen"><i class="fa fa-move"></i> 全屏</a>
                    </li>
                    <li>
                        <a href="rest/user/extra_lock">
                            <i class="fa fa-lock"></i> 锁屏
                        </a>
                    </li>
                    <li>
                        <a href="rest/user/logout">
                            <i class="fa fa-key"></i> 退出
                        </a>
                    </li>
                </ul>
            </li>
            <!-- END USER LOGIN DROPDOWN -->
        </ul>
        <!-- END TOP NAVIGATION MENU -->
    </div>
    <!-- END TOP NAVIGATION BAR -->
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
    <!-- BEGIN SIDEBAR -->
    <div class="page-sidebar-wrapper">
        <div class="page-sidebar navbar-collapse collapse">
            <!-- BEGIN SIDEBAR MENU -->
            <ul class="page-sidebar-menu">
                <li class="sidebar-toggler-wrapper">
                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                    <div class="sidebar-toggler hidden-phone">
                    </div>
                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                </li>


                <li class="">
                    <a href="/" id="btn-dashboard">
                        <i class="fa fa-home"></i><span class="title"> 首页 </span><span
                    > </span>
                    </a>
                </li>

                <li class="">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> 系统管理 </span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="javascript:;">
                                用户管理
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                角色管理
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                权限管理
                            </a>
                        </li>


                        <shiro:hasPermission name="user:create">
                            <li>
                                <a href="javascript:;">user:create 拥有此权限</a>
                            </li>
                        </shiro:hasPermission>

                        <shiro:hasPermission name="user:manage">
                            <li>
                                <a href="javascript:;">user:manage 拥有此权限</a>
                            </li>
                        </shiro:hasPermission>

                        <shiro:hasRole name="edion">
                            <li>
                                <a href="javascript:;">edion 拥有此角色,管理用户</a>
                            </li>
                        </shiro:hasRole>


                    </ul>
                </li>

                <li class="">
                    <a href="javascript:;">
                        <i class="fa fa-user"></i><span class="title"> 个人中心 </span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="javascript:;">
                                信息修改
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                密码修改
                            </a>
                        </li>



                    </ul>
                </li>

                <li class=" ">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> 硬件设备 </span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="rest/page/controller">
                                设备控制端
                            </a>
                        </li>
                        <li>
                            <a href="rest/page/allinformation">
                                设备状态查询
                            </a>
                        </li>
                        <li>
                            <a class="selected" href="rest/page/resetDevices">
                                设备修改/激活
                            </a>
                        </li>
                    </ul>
                </li>

                <li class=" ">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> 约伴</span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="rest/manage/yueban/yuebanget">
                                获取约伴发布信息
                            </a>
                        </li>

                    </ul>
                </li>

                <li class="">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> 广告管理</span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="rest/manage/advertisement/updatenews">
                                广告内容更新
                            </a>
                        </li>

                    </ul>
                </li>

                <li class=" ">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> 钱包</span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="rest/manage/wallet/getinoutmoney">
                                钱包收支
                            </a>
                        </li>

                    </ul>
                </li>


                <li class="">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> 活动</span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="rest/manage/activity/publishactivity">
                                查看活动信息
                            </a>
                        </li>

                    </ul>
                </li>


                <li class="start active">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> app配置管理</span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="rest/manage/software/updateapp">
                                app 版本更新
                            </a>
                        </li>

                    </ul>
                </li>



            </ul>
            <!-- END SIDEBAR MENU -->
        </div>
    </div>

    <!-- END SIDEBAR -->
    <!-- BEGIN CONTENT -->
    <div class="page-content-wrapper">
        <div class="page-content">
            <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
            <div class="modal fade" id="portlet-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            <h4 class="modal-title">Modal title</h4>
                        </div>
                        <div class="modal-body">
                            Widget settings form goes here
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn blue">Save changes</button>
                            <button type="button" class="btn default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>
            <!-- /.modal -->
            <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
            <!-- BEGIN STYLE CUSTOMIZER -->
            <div class="theme-panel hidden-xs hidden-sm">
                <div class="toggler"></div>
                <div class="toggler-close"></div>
                <div class="theme-options">
                    <div class="theme-option theme-colors clearfix">
                        <span> 主题颜色 </span>
                        <ul>
                            <li class="color-black current color-default" data-style="default"></li>
                            <li class="color-blue" data-style="blue"></li>
                            <li class="color-brown" data-style="brown"></li>
                            <li class="color-purple" data-style="purple"></li>
                            <li class="color-grey" data-style="grey"></li>
                            <li class="color-white color-light" data-style="light"></li>
                        </ul>
                    </div>
                    <div class="theme-option">
                        <span> 布局 </span>
                        <select class="layout-option form-control input-small">
                            <option value="fluid">顺序</option>
                            <option value="boxed">盒状</option>
                        </select>
                    </div>
                    <div class="theme-option">
                        <span> 标题 </span>
                        <select class="header-option form-control input-small">
                            <option value="fixed">固定</option>
                            <option value="default">默认</option>
                        </select>
                    </div>
                    <div class="theme-option">
                        <span> 工具栏 </span>
                        <select class="sidebar-option form-control input-small">
                            <option value="fixed">固定</option>
                            <option value="default">默认</option>
                        </select>
                    </div>
                    <div class="theme-option">
                        <span> 工具栏位置 </span>
                        <select class="sidebar-pos-option form-control input-small">
                            <option value="left">左边</option>
                            <option value="right">右边</option>
                        </select>
                    </div>
                    <div class="theme-option">
                        <span> 页脚 </span>
                        <select class="footer-option form-control input-small">
                            <option value="fixed">固定</option>
                            <option value="default">默认</option>
                        </select>
                    </div>
                </div>
            </div>


            <!-- END STYLE CUSTOMIZER -->
            <!-- BEGIN PAGE HEADER-->
            <div class="row">
                <div class="col-md-12">
                    <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                    <h3 class="page-title">
                        app 软件更新
                    </h3>

                </div>
            </div>
            <!-- END PAGE HEADER-->
            <!-- BEGIN PAGE CONTENT-->
                <div style="margin:  20px auto;border-color: #0A246A;">
                     <h4>当前程序信息：</h4>
                        <p>提示：最小更新id 与最大更新id 同时为零时，更新id 范围不受限制</p>
                        <p>最小更新id:${rangeupdateminid}</p>
                        <p>最大更新id:${rangeupdatemaxid}</p>
                        <p>程序版本号:${version}</p>
                        <p>程序下载地址:${appurl}</p>
                        <p>程序更新时间:${publishdate}</p>
                        <p>程序描述:${newdescribe}</p>


                    <h4>软件更新设置：</h4>
                    <form name="upload" action="/rest/manage/software/updateappinformation" enctype="multipart/form-data" method="post">

                        广告类型：<br>
                        <input type="text" name="rangeupdateminid" value="0" size="100%"><br>
                        广告类型：<br>
                        <input type="text" name="rangeupdatemaxid" value="0" size="100%"><br>
                        广告类型：<br>
                        <input type="text" name="version" value="v1.2.3" size="100%"><br>
                        广告类型：<br>
                        <input type="text" name="newdescribe" value="1、更新了部分bug" size="100%"><br>
                        <input type="file" name="thefile" /> <input type="submit" value="上传设置" />
                    </form>
                </div>







            <!-- END PAGE CONTENT-->
        </div>
    </div>
    <!-- END CONTENT -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="footer">
    <div class="footer-inner">
        2016 &copy; 天涯同行智能控制系统 by Edion.
    </div>
    <div class="footer-tools">
		<span class="go-top">
			<i class="fa fa-angle-up"></i>
		</span>
    </div>
</div>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="assets/plugins/respond.min.js"></script>
<script src="assets/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<script src="assets/scripts/app.js"></script>


<script src="app/js/fileinput.js"></script>
<%--文件上传中文--%>
<script src="app/js/zh.js"></script>

<script>


    jQuery(document).ready(function() {
        App.init();

    });


</script>
<script>
    /*全局变量*/
    var serverurl="http://192.168.1.100:8080/rest/manage/advertisement/deletead";
    /*  var serverurl="http://192.168.1.100:8080/rest/manage/advertisement/updatelinkad";*/
    function onclickDelete( adid,order) {

        $.ajax({
            url:serverurl,       //跨域到http://www.wp.com，另，http://test.com也算跨域
            dataType:'jsonp',                          //指定为jsonp类型
            data:{"id":adid},                //数据参数
            jsonp:'callback',                          //服务器端获取回调函数名的key，对应后台有$_GET['callback']='getName';callback是默认值
            jsonpCallback:'deletead',                   //回调函数名

            success:function(result){                  //成功执行处理，对应后台返回的getName(data)方法。

                //清除已生成元素
                /* var uls = document.getElementById("jq22");
                 var liss = uls.querySelectorAll("li");
                 alert(liss.length);
                 if(liss.length>=(order+1)){
                 liss[order].remove();
                 }*/
                /*   alert('执行成功'+result+",i值:"+order);   */           //执行成功
                location.reload();

            },
            error:function(msg){
                alert('执行错误');                 //执行成功
                alert(msg.toSource());                 //执行错误
            }
        });

    }


    function onclickUpdatelink( adid,newAdvertisement) {
        var updatelink=  document.getElementById("updatelink"+"adid").value;
        newAdvertisement.setAdlink(updatelink);

        $.ajax({
            url:serverurl,       //跨域到http://www.wp.com，另，http://test.com也算跨域
            dataType:'jsonp',                          //指定为jsonp类型
            data:{"id":newAdvertisement},                //数据参数
            jsonp:'callback',                          //服务器端获取回调函数名的key，对应后台有$_GET['callback']='getName';callback是默认值
            jsonpCallback:'deleteupdatelink',                   //回调函数名

            success:function(result){                  //成功执行处理，对应后台返回的getName(data)方法。

                /*                //清除已生成元素
                 var uls = document.getElementById("jq22");
                 var liss = uls.querySelectorAll("li");
                 alert(liss.length);
                 if(liss.length>=(order+1)){
                 liss[order].remove();
                 }*/
                alert('执行成功'+result+",i值:"+order);              //执行成功
                location.reload();

            },
            error:function(msg){
                alert('执行错误');                 //执行成功
                alert(msg.toSource());                 //执行错误
            }
        });

    }


</script>

<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>

















