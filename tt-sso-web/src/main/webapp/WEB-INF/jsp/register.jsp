<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <title>金溪金融注册</title>
    <!-- Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- 引入自定义css文件 style.css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login-register.css" type="text/css"/>
</head>

<script>
    //改变验证码
    function changeImage() {
        document.getElementById("img").src = "${pageContext.request.contextPath}/user_imageCode.action?time=" +
            new Date().getTime();
    }

    //校验用户账号
    function checkUserCode(obj) {
        var v = obj.value;
        if (v == null || v.trim() == "") {
            $("#user_code_span").html("用户账号不能为空");
            $("#user_code_span").addClass("error");
        } else {
            $("#user_code_span").html("");
            $("#user_code_span").addClass("error");

            //发送ajax请求
            $.post("${pageContext.request.contextPath}/user_checkUserCode.action", {"user_code": v},
                function (data) {
                    if (data == "false") {
                        $("#user_code_span").html("用户名可用");
                        $("#user_code_span").removeClass("error");
                        $("#user_code_span").addClass("tip");
                    } else {
                        $("#user_code_span").html("用户名已经存在");
                        $("#user_code_span").addClass("error");
                    }
                }, "text");
        }
    }

    //校验密码
    function checkPassword(obj) {
        var v = obj.value;
        if (v == null || v.trim() == "") {
            $("#user_password_span").html("密码不能为空");
            $("#user_password_span").addClass("error");
        } else {
            $("#user_password_span").html("");
            $("#user_password_span").removeClass("error");
        }

    }

    //校验再次输入密码
    function checkPassword2(obj) {
        var v = $("#user_password").val();
        if (obj.value != v) {
            $("#user_repassword_span").html("两次密码不一样");
            $("#user_repassword_span").addClass("error");
        } else {
            $("#user_repassword_span").html("");
            $("#user_repassword_span").removeClass("error");
        }
    }

    //校验验证码
    function checkckCode(obj) {
        var v = obj.value;
        if (v == null || v.trim() == "") {
            $("#code_span").html("验证码不能为空");
            $("#code_span").addClass("error");
        } else {
            $("#code_span").html("");
            $("#code_span").removeClass("error");
        }
    }

    //提交时全都校验一遍
    function checkForm() {
        checkUserCode($("#user_code").get(0));
        checkPassword($("#user_password").get(0));
        checkPassword2($("#user_repassword").get(0));
        checkckCode($("#checkCode").get(0));

        if ($(".error").length != 0) {
            return false;
        }
        return true;
    }
</script>

<body>
<div id="form-header" class="header">
    <a href="https://www.jxjr.com/" class="logo">

        <img src="${pageContext.request.contextPath}/images/logo.png" width="6%">
    </a>
    <span class="span_wel">欢迎注册</span>
</div>

<hr>
<div class="container" style="width: 100%;">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8"
             style="background: #fff; padding: 40px 60px; border: 3px solid aliceblue; border-radius: 10px;">
            <form class="form-horizontal" style="margin-top: 5px;" onsubmit="return checkForm()" method="post"
                  action="#">
                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="username" placeholder="您的账户名和登录名">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_username">用户名不能为空</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">设置密码</label>
                    <div class="col-sm-6">
                        <input type="password" class="form-control" id="password" placeholder="请输入密码">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_password">密码错误</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="confirmpwd" class="col-sm-2 control-label">确认密码</label>
                    <div class="col-sm-6">
                        <input type="password" class="form-control" id="confirmpwd" placeholder="请输入确认密码">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_confirmpwd">确认密码</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputEmail3" class="col-sm-2 control-label">邮箱地址</label>
                    <div class="col-sm-6">
                        <input type="email" class="form-control" id="inputEmail3" placeholder="请输入邮箱地址">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_email">电子邮件</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="phone" class="col-sm-2 control-label">手机号码</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="phone" placeholder="请输入手机号码">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_phone">手机号码</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="usercaption" class="col-sm-2 control-label">手机验证码</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="usercaption" placeholder="请输入手机验证码">
                    </div>
                    <div class="col-sm-2">
                        <a class="btn btn-default" href="#" role="button">获取验证码</a>
                    </div>
                    <div class="col-sm-4">
                        <span id="">手机验证码错误</span>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-6">
                        <button type="submit" class="btn btn-block btn-info btn-md">注册</button>
                        <button type="button" class="btn btn-block btn-default btn-md">我要登录</button>
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

</body>
