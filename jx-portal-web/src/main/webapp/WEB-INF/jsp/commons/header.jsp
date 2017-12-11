<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ page trimDirectiveWhitespaces="true" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>


<div class="" style="left: 0px; top: 0px; visibility: hidden; position: absolute;">
    <table class="ui_border">
        <tbody>
        <tr>
            <td class="ui_lt"></td>
            <td class="ui_t"></td>
            <td class="ui_rt"></td>
        </tr>
        <tr>
            <td class="ui_l"></td>
            <td class="ui_c">
                <div class="ui_inner">
                    <table class="ui_dialog">
                        <tbody>
                        <tr>
                            <td colspan="2">
                                <div class="ui_title_bar">
                                    <div class="ui_title" unselectable="on" style="cursor: move;"></div>
                                    <div class="ui_title_buttons"><a class="ui_min" href="javascript:void(0);"
                                                                     title="最小化" style="display: inline-block;"><b
                                            class="ui_min_b"></b></a><a class="ui_max" href="javascript:void(0);"
                                                                        title="最大化" style="display: inline-block;"><b
                                            class="ui_max_b"></b></a><a class="ui_res" href="javascript:void(0);"
                                                                        title="还原"><b class="ui_res_b"></b><b
                                            class="ui_res_t"></b></a><a class="ui_close" href="javascript:void(0);"
                                                                        title="关闭(esc键)" style="display: inline-block;">×</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td class="ui_icon" style="display: none;"></td>
                            <td class="ui_main" style="width: auto; height: auto;">
                                <div class="ui_content" style="padding: 10px;"></div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <div class="ui_buttons" style="display: none;"></div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </td>
            <td class="ui_r"></td>
        </tr>
        <tr>
            <td class="ui_lb"></td>
            <td class="ui_b"></td>
            <td class="ui_rb" style="cursor: se-resize;"></td>
        </tr>
        </tbody>
    </table>
</div>


<div class="header-top" id="headerTop">
    <div class="top-box" data-key="SYdb01">
        <ul></ul>
    </div>
</div>


<input type="hidden" value="index" id="menuCur">

<link href="http://www.xiaoniu88.com/portal/favicon.ico" rel="shortcut icon">


<input value="false" type="hidden" id="isLogin">




<header class="header">
    <div class="container">

        <div class="hotline">全国理财热线：1786593371</div>
        <ul class="info" id="ulLoginStatus">


            <li class="user">
                <a href="https://www.xiaoniu88.com/user/login" id="head-login-btn">登录</a>
                <a href="https://www.xiaoniu88.com/user/register">注册</a>
            </li>
            <li class="line">|</li>

            <li><a target="_blank" href="https://www.xiaoniu88.com/activity/pointmall/usual/index">积分商城</a></li>
            <li class="line">|</li>
            <li><a target="_blank" href="https://www.xiaoniu88.com/cms/help/index">帮助中心</a></li>
            <li class="line">|</li>
            <li><a target="_blank" href="https://www.xiaoniu88.com/cms/hr/index">加入我们</a></li>
            <li class="line">|</li>
            <li><a target="_blank" href="https://www.xiaoniu88.com/cms/about/service">客服团队</a></li>
            <li class="line">|</li>
            <li class="app-area">
                <a target="_blank" href="http://www.xiaoniu88.com/portal/promotion/app/introduce">手机客户端</a>
            </li>
            <li class="line">|</li>
        </ul>
    </div>
</header>


<!--导航-->
<div class="navigation" id="navigationModel">
    <div class="container">
        <a href="" class="logo1" style="background-image:url('http://localhost:8081/images/logo.png');weight:6%;"></a>
        <nav class="info">
            <div class="nav nav-index current" data-type="index">
                <a href="https://www.xiaoniu88.com/">首页</a>
            </div>
            <div class="nav nav-financial" data-type="financial">
                <a href="https://www.xiaoniu88.com/product/financial">理财</a>

            </div>
            <div class="nav nav-transfer" data-type="transfer">
                <a href="https://www.xiaoniu88.com/product/transfer">保险</a>
            </div>
            <div class="nav nav-member" data-type="member">
                <a href="https://www.xiaoniu88.com/user/member/index">贷款</a>
            </div>
            <div class="nav nav-member" data-type="member">
                <a href="https://www.xiaoniu88.com/user/member/index">个人中心</a>
            </div>
        </nav>
        <div class="user">


            <%--<a href="javascript:gotoLogin(&#39;/user/login&#39;, 0, &#39;/MyAccount/index&#39;);" class="title">
                <div class="img-box"></div>
                <span>我的账户</span>
                <i class="icon-common icon-common-to-bottom"></i>
            </a>--%>


        </div>
    </div>
</div>


<%--<div class="streamer" id="streamerModel">
    <div class="slider">&lt;%&ndash;
        <ul class="banner" id="banner" style="width: 17808px; position: absolute; left: 0px;">
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/325297c5-3a23-4ee4-8efe-d32bae0de7e8.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/neo/pc/59c233f72abcd74a81562b24/html/1.html" target="_blank"></a>
            </li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/f9f03ba2-ddb5-48de-97c5-0aa758842ee1.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/neo/pc/5a24e99469ece763f528991b/html/1.html?ch=pc"
                   target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/f9ba5abf-53ca-4685-9162-f13c44bdc286.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/product/flex/detail/568774" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/c1e4fd86-4743-4826-b7b5-f3f27e50a036.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/portal/activity/encourageAward/A171016042" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/5a4b0444-1bbc-4872-938d-6b24c074f2ba.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="http://image.xiaoniu88.com/image/staticfile_upload/201711/201711.pdf" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/288b5917-6096-4d12-b904-d70d5fb166fc.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/portal/activity/common/dreamFinancing" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/00c2075c-e833-480b-b845-cfb86081ba6d.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/financier/operations/p/share" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/325297c5-3a23-4ee4-8efe-d32bae0de7e8.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/neo/pc/59c233f72abcd74a81562b24/html/1.html" target="_blank"></a>
            </li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/f9f03ba2-ddb5-48de-97c5-0aa758842ee1.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/neo/pc/5a24e99469ece763f528991b/html/1.html?ch=pc"
                   target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/f9ba5abf-53ca-4685-9162-f13c44bdc286.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/product/flex/detail/568774" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/c1e4fd86-4743-4826-b7b5-f3f27e50a036.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/portal/activity/encourageAward/A171016042" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/5a4b0444-1bbc-4872-938d-6b24c074f2ba.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="http://image.xiaoniu88.com/image/staticfile_upload/201711/201711.pdf" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/288b5917-6096-4d12-b904-d70d5fb166fc.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/portal/activity/common/dreamFinancing" target="_blank"></a></li>
            <li style="background: url(&quot;//image.xiaoniu88.com/image/image_upload/00c2075c-e833-480b-b845-cfb86081ba6d.jpg&quot;) center center / cover no-repeat; width: 1272px; float: left;">
                <a href="https://www.xiaoniu88.com/financier/operations/p/share" target="_blank"></a></li>
        </ul>&ndash;%&gt;


</div>--%>




