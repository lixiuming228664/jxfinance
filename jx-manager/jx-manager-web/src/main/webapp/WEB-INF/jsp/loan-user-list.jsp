<%--
  User: Lenovo
  Date: 2017/11/27
  Time: 17:18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="paramListToolbar">
    <div>
        <button type="button" onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
    </div>
</div>
<table id="dgLoanUserList"></table>

<script>
    $(function(){
        //列表
        $('#dgLoanUserList').datagrid({


            //允许多列排序
            multiSort: true,
            title: '贷款订单列表',
            url:'loanOrderList',
            fit: true,
            rownumbers: true,
            pagination: true,
            pageSize:10,
            toolbar: '#paramListToolbar',
            columns:[[
                {field:'ck', checkbox: true},
                {field:'id',title:'贷款订单编号',sortable: true},
                {field:'userName',title:'用户名'},
                {field:'loadid',title:'贷款编号'},
                {field:'money',title:'贷款金额',sortable: true},
                {field:'totalInterest',title:'总利息'},
                {
                    field: 'createTime', title: '创建时间', formatter: function (value, rows, index) {
                    return moment(value).format('L');
                }
                },
                {field:'status',title:'付款状态', formatter:function(value,row,index){
                    switch (value) {
                        case 1:
                            return '未还款';
                            break;
                        case 2:
                            return '已还款';
                            break;
                        default:
                            return '未知';
                            break;
                    }
                }}
            ]]

        });
    });

    function edit(){

    }

</script>