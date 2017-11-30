<%@ page contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
	<form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
		<div>
			<td class="label">产品名称:</td>
			<input class="easyui-textbox" type="text" id="name" name="name"
				   data-options="required:true" style="width:40%">
		</div><br/>

		<div>
			<td class="label">公司电话:</td>
			<input class="easyui-numberbox" type="text" id="telephone" name="telephone"
				   data-options="required:true,min:1" style="width:40%">
		</div><br/>

		<div>
			<td class="label">公司地址:</td>
			<input class="easyui-textbox" type="text" id="adress" name="address"
				   data-options="required:true,validType:'length[0,255]'" style="width:100%">
		</div><br/>

		<div>
			<script id="container" name="message" type="text/plain">公司描述</script>
		</div><br/>

		<div>
			<!-- 加载编辑器的容器 -->
			<button onclick="submitForm()" class="easyui-linkbutton" type="button"
					data-options="iconCls:'icon-ok'">保存
			</button>
			<button onclick="clearForm()" class="easyui-linkbutton" type="button"
					data-options="iconCls:'icon-undo'">重置
			</button>
		</div><br/>
	</form>
</div>

<script>
	var ue = UE.getEditor('container');

	//表单提交动作
	function submitForm() {
		$('#itemAddForm').form('submit', {
			//表单提交后交给谁处理
			url: 'insurance/company',
			//表单提交之前被触发，如果返回false终止提交
			onSubmit: function () {
				return $(this).form('validate');
			},
			//表单提交成功后触发，而非item处理成功后触发
			success: function (data) {
				if(data > 0){
					ttshop.closeTabs('新增保险公司');
					ttshop.closeTabs('查询保险公司');
					ttshop.addTabs('查询保险公司','insurance-company-list');
					$("#dgItems").datagrid('reload');

					$.messager.alert('消息','保存成功', 'info');
				}
			}
		});
	}
</script>