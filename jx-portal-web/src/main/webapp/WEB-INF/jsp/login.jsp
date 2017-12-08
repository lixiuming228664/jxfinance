<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <title>金溪金融登录</title>
    <!-- Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- 引入自定义css文件 style.css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login-register/login-register.css" type="text/css"/>
</head>

<body>
<div id="form-header" class="header">
    <a href="https://www.jxjrong.com/" class="logo">
        <img src="${pageContext.request.contextPath}/images/logo.png" width="6%">
    </a>
    <span class="span_wel">欢迎登录</span>
</div>
<hr>
<div class="container"style="width: 100%;">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8"
             style="background: #fff; padding: 40px 60px; border: 3px solid aliceblue; border-radius: 10px;">
            <form class="form-horizontal" style="margin-top: 5px;" method="post" action="#">
                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="username" placeholder="请输入用户名">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_Username">用户名不能为空</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-6">
                        <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码">
                    </div>
                    <div class="col-sm-4">
                        <span id="msg_password">密码</span>
                    </div>
                </div>

                <div class="form-group">
                    <label for="ckCode" class="col-sm-2 control-label">验证码</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="ckCode">
                    </div>
                    <!--验证码-->
                    <div class="col-sm-2">
                        <img id="img" src=""/>
                    </div>
                    <div class="col-sm-3">验证码错误</div>
                </div>
                <div class="form-group">
                    <div class="col-sm-6">
                    </div>
                    <div class="col-sm-6">
                        <a href="javascript:void(0);" onclick="changeImage()">看不清换一张</a>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-6">
                        <button type="submit" class="btn btn-block btn-info btn-md">登录</button>
                        <button type="button" class="btn btn-block btn-default btn-md">我要注册</button>
                    </div>

                </div>
            </form>
        </div>

        <div class="col-md-2"></div>

    </div>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script>
    //改变验证码 src="js/global_index.js"
    function changeImage() {
        document.getElementById("img").src = "${pageContext.request.contextPath}/user_imageCode.action?time=" +
            new Date().getTime();
    }
</script>
    <jsp:include page="commons/footer.jsp"></jsp:include>
</body>
