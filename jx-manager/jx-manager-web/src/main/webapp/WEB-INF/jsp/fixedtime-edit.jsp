<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="产品详情" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">

        <table style="width:100%;">
            <tr>
                <td class="label">产品名称：</td>
                <td>
                    <input id="title" name="title" value="${data.title}" style="width:200px;">
                </td>
            </tr>
            <tr>
                <td class="label">近七天收益率(<1)：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="sevenEarningsView" name="sevenEarningsView"
                           data-options="required:true,min:0,precision:4">
                    <input type="hidden" id="sevenEarnings" name="sevenEarnings">
                </td>
            </tr>
            <tr>
                <td class="label">锁定周期(天)：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="periodCycle" name="periodCycle"
                           data-options="required:true,min:0,precision:0">
                </td>
            </tr>
            <tr>
                <td class="label">万份收益(元)：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="copiesView" name="copiesView"
                           data-options="required:true,min:0,precision:2">
                    <input type="hidden" id="copies" name="copies">
                </td>
            </tr>
            <tr>
                <td class="label">起始金额(元)：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="initAmountView" name="initAmountView"
                           data-options="required:true,min:0,precision:2">
                    <input type="hidden" id="initAmount" name="initAmount">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>
<script>

    window.onload=function(){
        $.post(
            '/items/fixtime',
            console.log(ftid+"666666666"),
            {'ftid':ftid},
            function(data){
               alert("6666");
            },
            'json'
        );
    }
    //提交表单
    function submitForm() {
        $('#itemAddForm').form('submit', {
            //提交表单到item进行处理
            url: 'item',
            //在表单提交之前触发
            onSubmit: function () {
                //将表单上价格单位从元转为分
                $('#sevenEarnings').val($('#sevenEarningsView').val()*10000);
                $('#copies').val($('#copiesView').val()*100);
                $('#initAmount').val($('#initAmountView').val()*100);
                //做表单校验，表单上所有字段全部校验通过才能返回true，才会提交表单，
                //如果有任意一个字段没有校验通过，返回false，不会提交表单
                return $(this).form('validate');
            },
            //在表单提交成功以后触发
            success: function (data) {
                if (data > 0) {
                    $.messager.alert('温馨提示', '恭喜！修改产品成功！');
                    ttshop.addTabs('定期理财产品', 'fixedtime-list');
                    ttshop.closeTabs('编辑理财产品');
                }
            }
        });
    }
</script>