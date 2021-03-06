<%@ page contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>

<div>test commit.</div>

<div class="easyui-panel" title="产品详情" data-options="fit:true">
	<form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
		<div style="margin: 0 auto;text-align: center">
			<div>
				<label class="label">产品名称:</label>
				<input class="easyui-textbox input-lg" type="text" id="name" name="name"
					   data-options="required:true" style="width:40%">
			</div><br/>

			<div>
				<label class="label">公司ID:</label>
				<input class="easyui-numberbox" type="text" id="companyId" name="companyId"
					   data-options="required:true,min:1" style="width:40%">
			</div><br/>

			<div>
				<label class="label">分类ID:</label>
				<input class="easyui-numberbox" type="text" id="cat" name="cat"
					   data-options="required:true,min:1" style="width:40%">
			</div><br/>

			<div>
				<label class="label">期限:</label>
				<input class="easyui-numberbox" type="text" id="duration" name="duration"
					   data-options="required:true,min:1,max:9999" style="width:40%">
			</div><br/>

			<div>
				<label class="label">保费:</label>
				<input class="easyui-numberbox" type="text" id="coverageView" name="coverageView"
					   data-options="required:true,min:0,precision:2" style="width:40%">
				<input type="hidden" id="coverage" name="coverage" />
			</div><br/>

			<div>
				<label class="label">保额:</label>
				<input class="easyui-numberbox" type="text" id="premiumView" name="premiumView"
					   data-options="required:true,min:0,precision:2" style="width:40%">
				<input type="hidden" id="premium" name="premium" />
			</div><br/>

			<div>
				<!-- 加载编辑器的容器 -->
				<script id="container" name="message" type="text/plain">商品描述</script>
			</div><br/>

			<div>
				<button onclick="submitForm()" class="easyui-linkbutton" type="button"
						data-options="iconCls:'icon-ok'">保存
				</button>
				<button onclick="clearForm()" class="easyui-linkbutton" type="button"
						data-options="iconCls:'icon-undo'">重置
				</button>
			</div><br/>
		</div>
	</form>
</div>

<script>
	var ue = UE.getEditor('container',{
		initialFrameWidth: '100%',
		initialFrameHeight: '300',
		serverUrl: 'file/upload'
	});

	//表单提交动作
	function submitForm() {
		$('#itemAddForm').form('submit', {
			//表单提交后交给谁处理
			url: 'insurance/product',
			//表单提交之前被触发，如果返回false终止提交
			onSubmit: function () {
				$('#coverage').val($('#coverageView').val()*100);
				$('#premium').val($('#premiumView').val()*100);


				return $(this).form('validate');
			},
			//表单提交成功后触发，而非item处理成功后触发
			success: function (data) {
				if(data > 0){
					ttshop.closeTabs('新增保险产品');
					ttshop.closeTabs('查询保险产品');
					ttshop.addTabs('查询保险产品','insurance-product-list');
					$("#dgItems").datagrid('reload');

					$.messager.alert('消息','保存成功', 'info');
				}
			}
		});
	}
</script>