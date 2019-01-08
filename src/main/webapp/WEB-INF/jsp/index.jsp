<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/icons.css" rel="stylesheet">
    <link href="assets/css/style.css" rel="stylesheet">

    <link href="css/bootstrap-tab.css" rel="stylesheet">


    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/property.css">

    <!-- End core plugin -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>


    <script src="js/bootstrap-tab.js"></script>
    <script src="js/index.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <![endif]-->

</head>
<body>
   <!--logo-->
 <%--   <div class="logo">
        <a href="index.html"><img src="assets/images/logo.png" alt=""></a>
    </div>
    <div class="logo-icon text-center">
        <a href="index.html"><img src="assets/images/logo-icon.png" alt=""></a>
    </div>--%>
    <header>
        <div class="logo">
            <em><img src="images/logo.png" alt=""></em>云联汇
        </div>
        <div class="header_left">
            <a href="property_homePage.html" style="color: #fff;">
                <em><img src="images/1.png" alt=""></em>郑州市德旺物业管理有限公司
                <img src="images/2.png" alt="" class="right_top_img">
            </a>
        </div>
        <!--头部右侧-->
        <div class="header_right">
            <div class="hr_div1">
                <em class="hr_em1"><img src="images/3.png" alt=""></em>
                <span class="hr_show">美景天城</span>
                <em class="hr_em2"><img src="images/4.png" alt="" class="hr1_img1"></em>
                <ul class="header_list" id="hdl_c">
                    <li style="position: relative" id="hl_li"><img src="images/42.png" alt="" class="hdl_img"></li>
                    <li class="hdl_select">
                        美景天城
                    </li>
                    <li class="hdl_select">
                        美景天城二
                    </li>
                </ul>
            </div>
            <div class="hr_div1" style="border-left: 1px solid #fff;">
                <em class="hr_em1" style="width: 15px;height: 15px;margin-left: 5px"><img src="images/5.png" alt=""></em>
                <span>欢迎Admin</span>
                <em class="hr_em2"><img src="images/4.png" alt="" class="hr1_img1"></em>
                <ul class="header_list" style="right:0">
                    <li style="position: relative"  id="hl_li2"><img src="images/42.png" alt="" class="hdl_img"></li>
                    <li>
                        <a href="#"><span><img src="images/sz.png" alt=""></span>我的设置</a>
                    </li>
                    <li>
                        <a href="#"><span><img src="images/mm.png" alt=""></span>修改密码</a>
                    </li>
                    <li>
                        <a href="property_index.html"><span><img src="images/tc.png" alt=""></span>退出系统</a>
                    </li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </header>

   <div style="margin-bottom: 60px;width: 100%">
       <div class="left-side-inner" id="sidebar" style="background: #2E363F;float: left;height:100%;width: 15%;padding-left: 10px;padding-bottom: 10px">
             <!--左侧导航菜单 -->
             <ul id='menu' class='nav nav-pills nav-stacked custom-nav'></ul>
        </div>
<!--End left side menu-->
       <div id="main-container" class="main-container"style="background: #F0F0F0;float: left;height: 100%;width:85%;">
            <div class="row clearfix">
                <div class="col-md-12 column" >
                        <div class="tabbable"id="tabContainer"> </div>
                              <script>
                                  $("#tabContainer").tabs({
                                      data: [{
                                          id: 'home',
                                          text: ' 首 页 ',
                                          url:"${ctx}/input/propertyChange",
                                          closeable: false
                                      }],
                                      showIndex: 1,
                                      loadAll: false
                                  });
                              </script>
                </div>
            </div>
       </div>
</div>
<%--网页底部--%>
<nav class=" navbar-default navbar-fixed-bottom" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">网页底部</a>
        </div>
    </div>
</nav>
</body>
</html>
