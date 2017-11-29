
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="paramListToolbar">
    <div>
        <button type="button" onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button type="button" onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button type="button" onclick="del()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>
<table id="dgParamList"></table>

<script>
    $(function(){

        //列表
        $('#dgParamList').datagrid({
            title: '贷款产品列表',
            url:'loanList',
            fit: true,
            rownumbers: true,
            pagination: true,
            pageSize:10,
            toolbar: '#paramListToolbar',
            columns:[[
                {field:'ck', checkbox: true},
                {field:'id',title:'贷款编号'},
                {field:'loanTime',title:'贷款时间/月'},
                {field:'repayment',title:'还款方式', formatter:function(value,row,index){
                    switch (value) {

                        default:
                            return '银行卡还款';
                            break;
                    }
                }},
                {field:'interestRate',title:'月利率'}
            ]]

        });
    });
    function add(){
        ttshop.addTabs('新增贷款产品', 'loan-add');
    }
    function edit(){

    }
    function del(){
        //debugger; //尤其可以使用这种嵌套的页面
        //取到客户选中的记录集合
        var rows = $('#dgParamList').datagrid('getSelections');
//            console.log(rows);
        if (rows.length == 0) {
            $.messager.alert('警告', '请选中至少一条记录！', 'warning');
            return;
        }
        $.messager.confirm('确认', '您确定要删除记录吗？', function (r) {
            if (r) {
                //客户已经点击“确定”按钮
                //定义一个空的数组，用来存放ID的集合
                var ids = [];
                //遍历的是客户选中的记录集合
                for (var i = 0; i < rows.length; i++) {
                    ids.push(rows[i].id);
                }
                //发出ajax请求
                //$.ajax() $.post() $.get()
                $.post(
                    //url，提交给后台谁去处理
                    'loans/delete',
                    //data，提交什么到后台，ids
                    {'ids[]': ids},
                    //callback,相当于$.ajax中success
                    function (data) {
                        if (data > 0) {
                            $('#dgParamList').datagrid('reload');
                        }
                    }
                );
            }

        });
    }
</script>