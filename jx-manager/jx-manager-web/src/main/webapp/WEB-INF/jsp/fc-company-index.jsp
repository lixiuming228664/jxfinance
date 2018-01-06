<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/13
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a id="import" class="easyui-linkbutton">一键导入定期产品数据到索引库</a>
<span id="msg"></span>
<script>
    $(function(){
        $("#import").click(function () {
            $("#import").linkbutton("disable");
            $("#msg").html("正在导入，请稍后...");
            $.post(
                "fixedtime/search/import",
                function (data) {
                    if(data.success){
                        $.messager.alert("warning",data.message);
                    }else{
                        $.messager.alert("warning","导入失败！请刷新后再尝试");
                    }
                    $("#msg").html("");
                },
                "json"

            );
        });
    });
</script>
</body>
</html>
