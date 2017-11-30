<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="产品详情" data-options="fit:true">
    <form class="itemFormft" id="itemAddFormft" name="itemAddFormft" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">产品名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="title" name="title"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">近七天收益率：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="sevenearningsView" name="sevenearningsView"
                           data-options="required:true,min:0,precision:2">
                    <input type="hidden" id="sevenEarnings" name="sevenEarnings">
                </td>
            </tr>
            <tr>
                <td class="label">锁定周期(天)：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="periodCycle" name="periodCycle"
                           data-options="required:true,min:0,precision:0">
                </td>
            </tr>
            <tr>
                <td class="label">万份收益(元)：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="copiesView" name="copiesView"
                           data-options="required:true,min:0,precision:4">
                    <input type="hidden" id="copies" name="copies">
                </td>
            </tr>
            <tr>
                <td class="label">起始金额(元)：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="initamountView" name="initamountView"
                           data-options="required:true,min:0,precision:0">
                    <input type="hidden" id="initAmount" name="initAmount">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button onclick="submitFormft()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
    </form>
</div>
<script>
    //提交表单
    function submitFormft() {
        $('#itemAddFormft').form('submit', {
            //提交表单到item进行处理
            url: 'itemft',
            //在表单提交之前触发
            onSubmit: function () {
                //将表单上价格单位从元转为分
                $('#sevenEarnings').val($('#sevenearningsView').val()*10000);
                $('#copies').val($('#copiesView').val()*100);
                $('#initAmount').val($('#initamountView').val()*100);
                //做表单校验，表单上所有字段全部校验通过才能返回true，才会提交表单，
                //如果有任意一个字段没有校验通过，返回false，不会提交表单
                return $(this).form('validate');
            },
            //在表单提交成功以后触发
            success: function (data) {
                if (data > 0) {
                    $.messager.alert('温馨提示', '恭喜！添加产品成功！');
                    ttshop.addTabs('定期理财产品', 'fixedtime-list');
                    ttshop.closeTabs('新增理财产品');
                }
            }
        });
    }
</script>