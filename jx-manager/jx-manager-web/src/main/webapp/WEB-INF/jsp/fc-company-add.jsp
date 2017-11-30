<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="公司详情" data-options="fit:true">
    <form class="itemFormfc" id="itemAddFormfc" name="itemAddFormfc" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">公司名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="companyName" name="companyName"
                           data-options="required:true,min:0,precision:4">
                </td>
            </tr>
            <tr>
                <td class="label">公司地址：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="address" name="address"
                           data-options="required:true,min:0,precision:4">
                </td>
            </tr>
            <tr>
                <td class="label">公司链接：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="link" name="link"
                           data-options="required:true,min:0,precision:0">
                </td>
            </tr>
            <tr>
                <td class="label">公司电话：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="telephone" name="telephone"
                           data-options="required:true,min:0,precision:2">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button onclick="submitFormfc()" class="easyui-linkbutton" type="button"
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
    function submitFormfc() {
        $('#itemAddFormfc').form('submit', {
            //提交表单到item进行处理
            url: 'itemfc',
            //在表单提交之前触发
            onSubmit: function () {
                //将表单上价格单位从元转为分
                //做表单校验，表单上所有字段全部校验通过才能返回true，才会提交表单，
                //如果有任意一个字段没有校验通过，返回false，不会提交表单
                return $(this).form('validate');
            },
            //在表单提交成功以后触发
            success: function (data) {
                if (data > 0) {
                    $.messager.alert('温馨提示', '恭喜！添加公司成功！');
                    ttshop.addTabs('理财公司', 'fc-company-list');
                    ttshop.closeTabs('新增理财公司');
                }
            }
        });
    }
</script>