<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
    <form class="itemForm" id="currentAddForm" name="currentAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">公司编码：</td>
                <td>
                    <input class="easyui-numberbox" id="fcId" name="fcId" data-options="required:true"  style="width:200px;">
                </td>
            </tr>
            <tr>
                <td class="label">产品标题：</td>
                <td>
                    <input class="easyui-textbox" id="title" name="title" data-options="required:true"  style="width:200px;">
                </td>
            </tr>
            <tr>
                <td class="label">最新规模：</td>
                <td>
                    <input class="easyui-numberbox" id="newScale1" name="newScale1" data-options="required:true,min:0,precision:2"  style="width:200px;">亿元
                </td>
                <input type="hidden" id="newScale" name="newScale">
            </tr>
            <tr>
                <td class="label">投资风险：</td>
                <td>
                    <%--<input class="easyui-textbox" id="risk" name="risk" data-options="required:true"  style="width:200px;">--%>
                    <select id="risk1" class="easyui-combobox" data-options="required:true">
                        <option value="1">低</option>
                        <option value="2">中</option>
                        <option value="3">高</option>
                    </select>
                        <input type="hidden" id="risk" name="risk">
                </td>
            </tr>
            <tr>
                <td class="label">单位净值：</td>
                <td>
                    <input class="easyui-numberbox" id="nav1" name="nav1" data-options="required:true,min:0,precision:4"  style="width:200px;">
                </td>
                <input type="hidden" id="nav" name="nav">
            </tr>
            <tr>
                <td class="label">初始金额：</td>
                <td>
                    <input class="easyui-numberbox" id="initAmount1" name="initAmount1" data-options="required:true,min:0,precision:2"  style="width:200px;">
                    元
                </td>
                <input type="hidden" id="initAmount" name="initAmount">
            </tr>
            <tr>
                <td class="label">三个月的利率：</td>
                <td>
                    <input class="easyui-numberbox" id="threeRate1" name="threeRate1" data-options="required:true,min:0,precision:2"  style="width:200px;">%
                </td>
                <input type="hidden" id="threeRate" name="threeRate">
            </tr>
            <tr>
                <td class="label">近一年利率：</td>
                <td>
                    <input class="easyui-numberbox" id="nearYear1" name="nearYear1" data-options="required:true,min:0,precision:2"  style="width:200px;">%
                </td>
                <input type="hidden" id="nearYear" name="nearYear">
            </tr>
            <tr>
                <td class="label">赎回时长：</td>
                <td>
                    <input class="easyui-numberbox" id="redempTime" name="redempTime" data-options="required:true"  style="width:200px;">个工作日
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <!-- 加载编辑器的容器 -->
                    <script id="container" name="content" data-options="required:true"  type="text/plain">理财产品描述</script>
                </td>
            </tr>

            <tr class="paramsShow" style="display:none;">
                <td class="label">商品规格：</td>
                <td>

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

    //初始化富文本编辑器
    var ue = UE.getEditor('container');
    //表单提交动作
    function submitForm() {
        $('#currentAddForm').form('submit',{
            //表单提交后交给哪个action处理a
            url:'current',
            //表单提交之前被触发，如果返回false终止提交
            onSubmit:function () {
                $('#nav').val($('#nav1').val() * 10000);
                $('#threeRate').val($('#threeRate1').val() * 100);
                $('#nearYear').val($('#nearYear1').val() * 100);
                $('#newScale').val($('#newScale1').val() * 100);
                $('#initAmount').val($('#initAmount1').val() * 100);
                $('#risk').val($('#risk1').combobox('getValue'));
                return $(this).form('validate');
            },
            //表单提交成功后触发,而非item处理成功后触发
            success:function (data) {
                $.messager.alert('消息','保存成功','info');
                ttshop.closeTabs('新增活期理财产品');
                ttshop.addTabs('查询活期理财产品','current-list');
                $('#dgCurrents').datagrid('reload');

            }
        });
    }
</script>