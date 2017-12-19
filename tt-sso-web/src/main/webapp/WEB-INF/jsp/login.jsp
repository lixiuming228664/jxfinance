<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <title>金溪金融登录</title>
    <!-- Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- 引入自定义css文件 style.css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login-register.css" type="text/css"/>

    <style>
        .error {
            font-size: 12px;
            color: red;
            display: inline-block;
            width: 120px;
        }
    </style>

</head>

<body>
<div id="form-header" class="header">
    <a href="https://www.jxjrong.com/" class="logo">
        <img src="${pageContext.request.contextPath}/images/logo.png" width="6%">
    </a>
    <span class="span_wel">欢迎登录</span>
</div>
<hr>
<div class="container" style="width: 100%;">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8"
             style="background: #fff; padding: 40px 60px; border: 3px solid aliceblue; border-radius: 10px;">
            <form class="form-horizontal" style="margin-top: 5px;" method="post" id="loginForm"
                  action="${pageContext.request.contextPath}/user/login">
                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名"
                               onblur="checkUserName(this)">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_username">${msg_username}</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-6">
                        <input type="password" class="form-control" id="password" name="password"
                               placeholder="请输入密码" onblur="checkPassword(this)">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_password">${msg_password}</span>
                    </div>
                </div>

                <div class="form-group">
                    <label for="ckCode" class="col-sm-2 control-label">验证码</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="ckCode" name="ckCode" onblur="checkckCode(this)">
                    </div>
                    <!--验证码-->
                    <div class="col-sm-2">
                        <img id="img" src="${pageContext.request.contextPath}/user/checkCode"/>
                    </div>
                    <div class="col-sm-3" id="msg_ckCode">${msg_ckCode}</div>
                </div>
                <div class="form-group">
                    <div class="col-sm-6">
                    </div>
                    <div class="col-sm-6">
                        <a href="javascript:void(0);" onclick="changeCheckCode()">看不清换一张</a>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-6">
                        <button type="button" onclick="checkForm()" class="btn btn-block btn-info btn-md">登录
                        </button>
                        <button type="button" class="btn btn-block btn-default btn-md">我要注册</button>
                    </div>

                </div>
            </form>
        </div>

        <div class="col-md-2"></div>

    </div>
</div>
<jsp:include page="commons/footer.jsp"></jsp:include>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<!--ajax提交表单需要引入jquery.form.js-->
<script type="text/javascript" src="http://malsup.github.io/jquery.form.js"></script>

<script>
    //改变验证码
    function changeCheckCode() {
        document.getElementById("img").src = "${pageContext.request.contextPath}/user/checkCode?time=" +
            new Date().getTime();
    }

    //校验用户账号
    function checkUserName(obj) {
        var v = obj.value;
        if (v == null || v.trim() == "") {
            $("#msg_username").html("用户名不能为空");
            $("#msg_username").addClass("error");
        } else {
            $("#msg_username").html("");
            $("#msg_username").removeClass("error");
        }
    }

    //校验密码
    function checkPassword(obj) {
        var v = obj.value;
        if (v == null || v.trim() == "") {
            $("#msg_password").html("密码不能为空");
            $("#msg_password").addClass("error");
        } else {
            $("#msg_password").html("");
            $("#msg_password").removeClass("error");
        }
    }

    //校验验证码
    function checkckCode(obj) {
        var v = obj.value;
        if (v == null || v.trim() == "") {
            $("#msg_ckCode").html("验证码不能为空");
            $("#msg_ckCode").addClass("error");
        } else {
            $("#msg_ckCode").html("");
            $("#msg_ckCode").removeClass("error");
        }
    }

    //提交时全都校验一遍
    function checkForm() {
        checkUserName($("#username").get(0));
        checkPassword($("#password").get(0));
        checkckCode($("#ckCode").get(0));
        if ($(".error").length != 0) {
            return false;
        }
        //调用方法登录
        userlogin();
    }

    //给id为ajaxSubmit的按钮提交表单
    function userlogin() {
        $("#loginForm").ajaxSubmit({
            beforeSubmit: function () {
                //校验表单
                checkUserName($("#username").get(0));
                checkPassword($("#password").get(0));
                checkckCode($("#ckCode").get(0));

                if ($(".error").length != 0) {
                    return false;
                }
            },
            success: function (rs) {
                debugger;
                if (rs.success) {
                    alert(rs.message);
                    location.href = "${pageContext.request.contextPath}:8081/"
                } else {
                    alert(rs.message);
                }
            }
        });
    }

</script>
</body>
