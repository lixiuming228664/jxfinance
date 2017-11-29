<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="userListToolbar">
   //用户名查询模糊、用户状态查询、用户等级查询
   <div style="padding: 5px; background-color: #fff;">
      <label>用户名：</label>
      <input class="easyui-textbox" type="text" id="userName" name="userName">
      &nbsp;&nbsp;
      <label>会员状态：</label>
      <select id="status" name="status" class="easyui-combobox" data-options="editable:false,panelHeight:'auto'">
         <option value="0">全部</option>
         <option value="1">正常</option>
         <option value="2">禁用</option>
      </select>
      &nbsp;&nbsp;
      <label>会员等级：</label>
      <select id="level" name="level" class="easyui-combobox" data-options="editable:false,panelHeight:'auto'">
         <option value="0">全部</option>
         <option value="1">普通会员</option>
         <option value="2">vip会员</option>
      </select>
      &nbsp;&nbsp;&nbsp;&nbsp;
      <!--注意：要加上type="button",默认行为是submit-->
      <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
   </div>
   <div>
      &nbsp;&nbsp;
      <button onclick="up()" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">设为正常</button>
      &nbsp;&nbsp;
      <button onclick="down()" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">设为禁用</button>
      &nbsp;&nbsp;
      <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除会员</button>
      &nbsp;&nbsp;
      <button onclick="help()" class="easyui-linkbutton" data-options="iconCls:'icon-help',plain:true">帮助</button>
   </div>
</div>

<%--容器放好--%>
<table id="dgItems"></table>

<%--通过js代码来渲染容器--%>
<script>
    $('#dgItems').datagrid({
        //多表单排序
        multiSort: true,
        //添加工具栏
        toolbar: '#userListToolbar',
        //请求服务器端数据
        url: 'users',
        //请求方式，默认是POST
        pagination: true,
        //自适应父容器
        fit: true,
        //在设置分页属性的时候初始化页面大小
        pageSize: 15,
        //在设置分页属性的时候 初始化页面大小选择列表
        pageList: [5, 10, 20, 30, 50],

        //列属性
        columns: [[
            {field: "ck", checkbox: true},
            {field: 'id', title: '编号', width: 100, sortable: true},
            {field: 'userName', title: '登录名', width: 250},
            {field: 'userRealname', title: '姓名', width: 250},
            {field: 'email', title: '电子邮箱',width: 250},
            {field: 'phone', title: '手机', width: 250},
            {field: 'image', title: '头像'},
            {
                field: 'state', title: '用户状态',
                formatter: function (value, row, index) {
                    if (value == 1) {
                        return "正常";
                    } else if (value == 2) {
                        return "禁用";
                    } else if (value == 3) {
                        return "删除";
                    } else {
                        return "未知";
                    }
                }
            },
            {
                field: 'level', title: '用户等级',
                formatter: function (value, row, index) {
                    if (value == 1) {
                        return "管理员";
                    } else if (value == 2) {
                        return "普通会员";
                    } else if (value == 3) {
                        return "vip会员";
                    } else {
                        return "未知";
                    }
                }
            },
            {
                field: 'created', title: '创建时间', sortable: true,
                formatter: function (value) {
                    return moment(value).format("LLL");
                }
            },
            {
                field: 'updated', title: '更新时间', sortable: true,
                formatter: function (value) {
                    return moment(value).format("LLL");
                }
            }
        ]]
    });

</script>



