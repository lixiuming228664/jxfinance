<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <!-- 导入easyui的样式表 -->
    <%--如果在页面上使用easyui框架：1、CSS  2、JS(注意载入顺序)--%>
    <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
    <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
    <link rel="stylesheet" href="css/common.css">

</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:70px;padding-left:10px;text-align: center;">
    <h2>金溪金融后台管理系统</h2>
</div>
<div data-options="region:'south'" style="padding:5px;background:#eee;">
    系统版本：V1.01
</div>
<div data-options="region:'west'" style="width:200px;">
    <div id="menu" class="easyui-accordion">
        <div title="用户管理" data-options="selected:true,iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">

                <li data-options="attributes:{'href':'user-list'}">查询用户</li>

            </ul>
        </div>
        <div title="保险产品管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'insurance-product-add'}">新增保险产品</li>
                <li data-options="attributes:{'href':'insurance-product-list'}">查询保险产品</li>
                <li data-options="attributes:{'href':'insurance-company-add'}">新增保险公司</li>
                <li data-options="attributes:{'href':'insurance-company-list'}">查询保险公司</li>

            </ul>
        </div>
        <div title="活期理财产品管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'current-add'}">新增活期理财产品</li>
                <li data-options="attributes:{'href':'current-list'}">查询活期理财产品</li>

            </ul>
        </div>
        <div title="定期理财产品管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'fixedtime-list'}">定期理财产品</li>
                <%--<li data-options="attributes:{'href':'fixedtime-list'}">查询定期理财产品</li>--%>
                <li data-options="attributes:{'href':'fc-company-list'}">理财公司</li>
                <li data-options="attributes:{'href':'fc-company-index'}">导入索引</li>
                <%--<li data-options="attributes:{'href':'fc-company-list'}">查询理财公司</li>--%>
            </ul>
        </div>
        <div title="贷款管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'loan-add'}">新增贷款产品</li>
                <li data-options="attributes:{'href':'loan-list'}">查询贷款产品</li>
                <li data-options="attributes:{'href':'loan-user-list'}">查看贷款人信息</li>

            </ul>
        </div>
    </div>
</div>
<div data-options="region:'center'" style="background:#eee;">
    <div id="tab" class="easyui-tabs" data-options="fit:true">
        <div title="欢迎页面" style="padding:20px;text-align: center;">
            <h3>欢迎登录金溪金融后台管理</h3>
        </div>
    </div>
</div>
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<script src="js/moment/moment-with-locales.js"></script>
<script src="js/common.js"></script>
<%--添加富文本编辑器的相关文件--%>
<script src="js/ueditor/ueditor.config.js"></script>
<script src="js/ueditor/ueditor.all.js"></script>
<script>
    ttshop.registerMenuEvent();
</script>
<script>
    moment.locale("zh-cn");
</script>
</body>
</html>