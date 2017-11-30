<%@ page contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<%--容器放好--%>
<table id="dgProducts"></table>

<%--工具栏div--%>
<div id="toolbar">
	<%--搜索框及状态分类--%>
	<div style="padding: 5px; background-color: #fff;">
		<label>商品名称：
			<input class="easyui-textbox" type="text" id="name"></label>
		<label>商品状态：
			<select id="state" class="easyui-combobox"  data-options="editable:false, panelHeight:'auto'">
				<option value="0">全部</option>
				<option value="1">正常</option>
				<option value="2">下架</option>
			</select>
		</label>
		<button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
	</div>

	<%--工具栏上的按钮们--%>
	<div>
		<button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
		<button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
		<button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
		<button onclick="down()" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">下架</button>
		<button onclick="up()" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">上架</button>
	</div>
</div>

<%--通过js代码来渲染容器--%>
<script>
	//设置moment.js的语言
	moment.locale('zh-cn');

	//向后台请求数据表格中的所有记录
	$('#dgProducts').datagrid({
		//开启多列排序功能
		multiSort: true,
		//添加工具栏
		toolbar: '#toolbar',
		//初始化页面数据条数
		pageSize: 20,
		//pageSize的可选项
		pageList: [10,20,30,40,50,70,100,200],

		//请求服务器端数据
		url:'insurance/products',
		//请求方式，默认是POST
		method: 'get',
		//是否显示分页工具栏
		pagination: true,
		fit: true,
		//列属性
		columns:[[
			{field: 'ids',checkbox: true},	//复选框
			{field: 'id',title: '编号',width: 120,align: 'right',sortable: true},
			{field: 'name',title: '产品名称',width: 200,sortable: true},
			{field: 'companyView',title: '公司名称',width: 100,align: 'right',sortable: true},
			{field: 'catView',title: '分类',width: 200,sortable: true},
			{field: 'duration',title: '期限(月)',width: 70,align: 'right',sortable: true},
			{field: 'coverageView',title: '保额',width: 70,align: 'right',sortable: true},
			{field: 'premiumView',title: '保费',fit: true,align: 'center',sortable: true},
			{field: 'message',title: '更多信息',fit: true,align: 'center',sortable: true},
			{field: 'stateView',title: '状态',fit: true,align: 'center',sortable: true}
		]]
	});

	function add() {
		console.log('add');
	}

	function edit() {
		console.log('edit');
	}

	function remove() {
		var ckItems = $("#dgProducts").datagrid('getSelections');
		if (ckItems.length === 0) {
			$.messager.alert('删除无效','没有选中任何产品','warning');
		} else {
			$.messager.confirm('确认?','您确定要删除这'+ ckItems.length +'款产品?',function (r) {
				//判断用户点击为确定按钮时
				if (r) {
					//定义一个空数组,去接收id的集合
					var ids = [];
					//遍历ckItems,得到ids
					for (var i = 0; i < ckItems.length; i++)
						ids.push(ckItems[i].id);
					$.post(
						//url:
						'insurance/products/delete',
						//data:
						{'ids[]': ids},
						//callback:
						function (data) {
							if(data > 0)
								$("#dgProducts").datagrid('reload');
						}
						//dataType
						//'json'
					);
				}
			});
		}
	}

	function down() {
		var ckItems = $("#dgProducts").datagrid('getSelections');
		if (ckItems.length === 0) {
			$.messager.alert('下架无效','没有选中任何产品','warning');
		} else {
			$.messager.confirm('确认?','您确定要下架这'+ ckItems.length +'款产品?',function (r) {
				//判断用户点击为确定按钮时
				if (r) {
					//定义一个空数组,去接收id的集合
					var ids = [];
					//遍历ckItems,得到ids
					for (var i = 0; i < ckItems.length; i++)
						ids.push(ckItems[i].id);
					$.post(
						//url:
						'insurance/products/update',
						//data:
						{
							'ids[]': ids,
							'state': 2
						},
						//callback:
						function (data) {
							if(data > 0)
								$("#dgProducts").datagrid('reload');
						}
						//dataType
						//'json'
					);
				}
			});
		}
	}

	function up() {
		var ckItems = $("#dgProducts").datagrid('getSelections');
		if (ckItems.length === 0) {
			$.messager.alert('上架无效','没有选中任何产品','warning');
		} else {
			$.messager.confirm('确认?','您确定要上架这'+ ckItems.length +'款产品?',function (r) {
				//判断用户点击为确定按钮时
				if (r) {
					//定义一个空数组,去接收id的集合
					var ids = [];
					//遍历ckItems,得到ids
					for (var i = 0; i < ckItems.length; i++)
						ids.push(ckItems[i].id);
					$.post(
						//url:
						'insurance/products/update',
						//data:
						{
							'ids[]': ids,
							'state': 1
						},
						//callback:
						function (data) {
							if(data > 0)
								$("#dgProducts").datagrid('reload');
						}
						//dataType
						//'json'
					);
				}
			});
		}
	}

	function searchForm() {
		$('#dgProducts').datagrid('load',{
			name: $('#name').val(),
			state: $('#state').combobox('getValue')
		});
	}
</script>


