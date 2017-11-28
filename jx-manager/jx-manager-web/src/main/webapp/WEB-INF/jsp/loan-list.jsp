
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
                {field:'id',title:'ID'},
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

    }
</script>