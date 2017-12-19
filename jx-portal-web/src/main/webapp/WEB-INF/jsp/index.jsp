<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- saved from url=(0026)https://www.xiaoniu88.com/ -->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=7;IE=9">
    <title>金溪金融</title>
    <%--<meta name="keywords" content="小牛在线,天天牛,安心牛,互联网金融平台,互联网金融">
    <meta name="description"
          content="小牛在线是小牛金服旗下普惠互联网金融平台,为投资者提供天天牛、安心牛等理财产品.签署银行资金存管协议,资金做到流转透明.小牛在线是中国社科院网贷评级A级平台,互联网理财,首选小牛在线！">
    <meta property="wb:webmaster" content="47a3fc0ec7760942">
    <meta property="qc:admins" content="2410357064616006375636">
    <meta name="baidu-site-verification" content="o6xM6EnXUZ">--%>


    <%-- <meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests">--%>
   <%-- <link rel="icon" href="https://www.xiaoniu88.com/favicon.ico" mce_href="//www.xiaoniu88.com/favicon.ico"
          type="image/x-icon">--%>
    <link rel="stylesheet" href="css/homepage/xiaoniu/base-ac581e4457.css">
    <%--轮播图--%>
    <link rel="stylesheet" type="text/css" href="css/homepage/base_w1200.css">
    <link rel="stylesheet" type="text/css" href="css/homepage/index.css">



    <%--主页--%>
    <script charset="utf-8" src="js/homepage/xiaoniu/v.js"></script>
    <script src="js/homepage/xiaoniu/hm.js"></script>
    <script async="" src="js/homepage/xiaoniu/analytics.js"></script>
    <script type="text/javascript" src="js/homepage/xiaoniu/base-ddafbf473e.js"></script>
    <script type="text/javascript" src="js/homepage/xiaoniu/common-243763fee9.js"></script>
    <script>
        window.global = {
            cdn: "//image.xiaoniu88.com",
            siteroot: "http://www.xiaoniu88.com",
            staticPath: "//image.xiaoniu88.com/static/WebXn/dist",
            contextPath: "/portal",
            isLogin: false
        }
    </script>

    <script>
        $(function () {
            seajs.use('module/common/common')
        })
    </script>
    <link rel="stylesheet" href="css/homepage/xiaoniu/style-3000214b93.css">



    <style type="text/css">#YSF-BTN-HOLDER {
        position: fixed;
        max-width: 70px;
        max-height: 70px;
        right: 30px;
        bottom: 0px;
        cursor: pointer;
        overflow: visible;
        filter: alpha(opacity=100);
        opacity: 1;
        z-index: 9990
    }

    #YSF-BTN-HOLDER:hover {
        filter: alpha(opacity=95);
        opacity: .95
    }

    #YSF-BTN-HOLDER img {
        display: block;
        overflow: hidden;
    }

    #YSF-BTN-CIRCLE {
        display: none;
        position: absolute;
        right: -5px;
        top: -5px;
        width: auto;
        min-width: 12px;
        height: 20px;
        padding: 0 4px;
        background-color: #f00;
        font-size: 12px;
        line-height: 20px;
        color: #fff;
        text-align: center;
        white-space: nowrap;
        font-family: sans-serif;
        border-radius: 10px;
        z-index: 1;
    }

    #YSF-BTN-HOLDER.layer-1 #YSF-BTN-CIRCLE {
        top: -30px;
    }

    #YSF-BTN-HOLDER.layer-2 #YSF-BTN-CIRCLE {
        top: -30px;
    }

    #YSF-BTN-HOLDER.layer-3 #YSF-BTN-CIRCLE {
        top: -30px;
    }

    #YSF-BTN-HOLDER.layer-4 #YSF-BTN-CIRCLE {
        top: -30px;
    }

    #YSF-BTN-HOLDER.layer-5 #YSF-BTN-CIRCLE {
        top: -30px;
    }

    #YSF-BTN-HOLDER.layer-6 #YSF-BTN-CIRCLE {
        top: -5px;
    }

    #YSF-BTN-BUBBLE {
        display: none;
        position: absolute;
        left: -274px;
        bottom: 0px;
        width: 278px;
        height: 80px;
        box-sizing: border-box;
        padding: 14px 22px;
        filter: alpha(opacity=100);
        opacity: 1;
        background: url(https://qiyukf.com/sdk//res/img/sdk/bg_floatMsg2x.png) no-repeat;
        background: url(https://qiyukf.com/sdk//res/img/sdk/bg_floatMsg.png);
        background-size: 278px 80px;
        z-index: 1;
    }

    #YSF-BTN-HOLDER.layer-1 #YSF-BTN-BUBBLE {
        bottom: 9px;
    }

    #YSF-BTN-HOLDER.layer-2 #YSF-BTN-BUBBLE {
        bottom: 9px;
    }

    #YSF-BTN-HOLDER.layer-3 #YSF-BTN-BUBBLE {
        bottom: 9px;
    }

    #YSF-BTN-HOLDER.layer-4 #YSF-BTN-BUBBLE {
        bottom: 9px;
    }

    #YSF-BTN-HOLDER.layer-5 #YSF-BTN-BUBBLE {
        bottom: 9px;
    }

    #YSF-BTN-HOLDER.layer-6 #YSF-BTN-BUBBLE {
        bottom: -6px;
    }

    #YSF-BTN-BUBBLE:hover {
        filter: alpha(opacity=95);
        opacity: .95
    }

    #YSF-BTN-CONTENT {
        height: 45px;
        padding: 0;
        white-space: normal;
        word-break: break-all;
        text-align: left;
        font-size: 14px;
        line-height: 1.6;
        color: #222;
        overflow: hidden;
        z-index: 0;
    }

    #YSF-BTN-ARROW {
        display: none;
    }

    #YSF-BTN-CLOSE {
        position: absolute;
        width: 15px;
        height: 15px;
        right: 4px;
        top: -3px;
        filter: alpha(opacity=90);
        opacity: .9;
        cursor: pointer;
        background: url(https://qiyukf.com/sdk//res/img/sdk/btn-close.png) no-repeat;
        z-index: 1
    }

    #YSF-BTN-CLOSE:hover {
        filter: alpha(opacity=100);
        opacity: 1;
    }

    #YSF-PANEL-CORPINFO.ysf-chat-layeropen {
        width: 511px;
        height: 470px;
        box-shadow: 0 0 20px 0 rgba(0, 0, 0, .15);
    }

    #YSF-PANEL-CORPINFO {
        position: fixed;
        bottom: 0px;
        right: 20px;
        width: 0;
        height: 0;
        z-index: 99999;
    }

    #YSF-PANEL-INFO.ysf-chat-layeropen {
        width: 311px;
        height: 470px;
        filter: alpha(opacity=100);
        opacity: 1;
        box-shadow: 0 0 20px 0 rgba(0, 0, 0, .15);
    }

    #YSF-PANEL-INFO {
        position: fixed;
        bottom: 0px;
        right: 20px;
        width: 0px;
        height: 0px;
        filter: alpha(opacity=0);
        opacity: 0;
        z-index: 99999;
    }

    #YSF-PANEL-INFO .u-btn {
        background-color: #F96868
    }

    #YSF-CUSTOM-ENTRY {
        background-color: #F96868;
    }

    #YSF-CUSTOM-ENTRY-0 {
        position: relative;
        bottom: 24px;
        width: auto;
        background-color: #F96868;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-1 {
        position: relative;
        bottom: 24px;
        width: auto;
        background-color: #F96868;
        border-radius: 14px;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-2 {
        position: relative;
        bottom: 24px;
        width: auto;
        background-color: #F96868;
        border-radius: 0;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-3 {
        position: relative;
        bottom: 24px;
        width: auto;
        background-color: #F96868;
        border-radius: 50%;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-4 {
        position: relative;
        bottom: 24px;
        width: auto;
        background-color: #F96868;
        border-radius: 50%;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-5 {
        position: relative;
        bottom: 24px;
        width: auto;
        background-color: #F96868;
        border-radius: 5px;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-6 {
        position: relative;
        bottom: 0px;
        width: auto;
        background-color: #F96868;
        border-radius: 5px;
        border-bottom-left-radius: 0;
        border-bottom-right-radius: 0;
    }

    #YSF-CUSTOM-ENTRY-0 img {
        max-width: 300px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-1 img {
        width: 28px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-2 img {
        width: 58px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-3 img {
        width: 60px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-4 img {
        width: 60px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-5 img {
        width: 60px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-6 img {
        width: 115px;
        height: auto;
    }

    #YSF-IFRAME-LAYER {
        border: 0;
        outline: none;
    }

    .ysf-online-invite-mask {
        z-index: 10000;
        position: fixed;
        _position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        width: 100%;
        height: 100%;
        background: #fff;
        -ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=0)";
        filter: alpha(opacity=0);
        opacity: 0;
    }

    .ysf-online-invite-wrap {
        z-index: 10001;
        position: fixed;
        _position: absolute;
        top: 50%;
        left: 50%;
        width: 250px;
    }

    .ysf-online-invite {
        position: relative;
        top: -50%;
        left: -50%;
        cursor: pointer;
    }

    .ysf-online-invite img {
        display: block;
        width: 250px;
    }

    .ysf-online-invite .text {
        position: absolute;
        top: -11px;
        left: 0;
        right: 0;
        overflow: hidden;
        margin: 36px 20px 0 67px;
        line-height: 140%;
        color: #526069;
        font-size: 14px;
        font-family: "Microsoft YaHei", "微软雅黑", tahoma, arial, simsun, "宋体";
        text-align: left;
        white-space: normal;
        word-wrap: break-word;
    }

    .ysf-online-invite .close {
        position: absolute;
        top: -6px;
        right: -6px;
        width: 32px;
        height: 32px;
        background: url(https://qiyukf.com/sdk/res/img/invite-close.png) no-repeat;
        cursor: pointer;
    }</style>
    <style id="poshytip-css-tip-yellow" type="text/css">div.tip-yellow {
        visibility: hidden;
        position: absolute;
        top: 0;
        left: 0;
    }

    div.tip-yellow table.tip-table, div.tip-yellow table.tip-table td {
        margin: 0;
        font-family: inherit;
        font-size: inherit;
        font-weight: inherit;
        font-style: inherit;
        font-variant: inherit;
        vertical-align: middle;
    }

    div.tip-yellow td.tip-bg-image span {
        display: block;
        font: 1px/1px sans-serif;
        height: 10px;
        width: 10px;
        overflow: hidden;
    }

    div.tip-yellow td.tip-right {
        background-position: 100% 0;
    }

    div.tip-yellow td.tip-bottom {
        background-position: 100% 100%;
    }

    div.tip-yellow td.tip-left {
        background-position: 0 100%;
    }

    div.tip-yellow div.tip-inner {
        background-position: -10px -10px;
    }

    div.tip-yellow div.tip-arrow {
        visibility: hidden;
        position: absolute;
        overflow: hidden;
        font: 1px/1px sans-serif;
    }</style>
</head>
<body style="">
<jsp:include page="commons/header.jsp" />

<div class="slide_show" id="slide_show" >
    <div class="indexW">
        <div id="index_slide" class="slide_wrap" align="center" >
            <ol >
                <c:forEach items="${ad1List}" var="node" varStatus="status">
                    <li>
                        <a name="sfbest_hp_hp_focus_${status.index}" class="fore_pic trackref" href="${node.url}" target="_blank">
                            <img id="lunbo_1" alt="${node.title}"	src="${node.images}">
                        </a>
                    </li>
                </c:forEach>
            </ol>

        </div>

    </div>

    <ul class="none" id="lunboNum">
        <c:forEach items="${ad1List}" varStatus="status">
            <li class="<c:if test="${status.index==0}">cur</c:if>">${status.index+1}</li>
        </c:forEach>
    </ul>

    <div class="indexbg" id="indexbg">
        <dl style="left: -1903px;">
            <c:forEach items="${ad1List}" var="node">
                <%--&lt;%&ndash;<dd style="background: ${node.pic2}; width: 1519px;"></dd>&ndash;%&gt;--%>
            </c:forEach>
        </dl>

    </div>
</div>
<script type="text/javascript" src="js/homepage/jquery.min.js"></script>
<script type="text/javascript" src="js/homepage/global_index.js"></script>


<jsp:include page="commons/footer.jsp" />




</body>
</html>
