<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;">

            <tr>
                <td class="label">贷款时限：(月)</td>
                <td>
                    <input class="easyui-textbox" type="text" name="loanTime" data-options="required:true">
                </td>
            </tr>
            <tr>
                <td class="label">贷款利率：</td>
                <td>
                    <input  class="easyui-textbox" type="text"  name="interestRate"  data-options="required:true">
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
    </form>
</div>
<script>
    function submitForm() {
        $('#itemAddForm').form('submit', {
            //表单提交后交给谁处理
            url: 'loan',
            //表单提交之前被触发，如果返回false终止提交
            onSubmit: function () {
                return $(this).form('validate');
            },
            //表单提交成功后触发，而非item处理成功后触发
            success: function (data) {
                if (data > 0) {
                    $.messager.alert('消息', '保存成功', 'info');
                    ttshop.closeTabs('查询贷款产品', 'loan-list');
                    ttshop.closeTabs('新增贷款产品', 'loan-add');
                    ttshop.addTabs('查询贷款产品', 'loan-list');

                }else{
                    $.messager.alert('警告', '保存失败', 'warning');
                }
            }
        });
    }
</script>