<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="currentListToolbar">
    <div style="padding: 5px; background-color: #fff;">

        <label>公司编码：</label>
        <input class="easyui-textbox" type="text" id="fcId">
        <label>产品标题：</label>
        <input class="easyui-textbox" type="text" id="title">
        <label>产品状态：</label>
        <select id="state" class="easyui-combobox" data-options="editable:false,panelHeight:'auto'">
            <option value="0">全部</option>
            <option value="1">正常</option>
            <option value="2">下架</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <!--注意：不管<a>还是<button>只要添加class="easyui-linkbutton"，那么他们的外观样式是一样的-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
        <button onclick="down()" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">下架</button>
        <button onclick="up()" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">上架</button>
    </div>
</div>

<%--容器放好--%>
<table id="dgCurrents"></table>

<%--通过js代码来渲染容器--%>
<script>
    //点击搜索按钮动作
    function searchForm() {
        if($('#fcId').val()){
            $('#dgCurrents').datagrid('load',{

                fcId:$('#fcId').val(),
                title:$('#title').val(),
                state:$('#state').combobox('getValue')
            });
        }else {
            $('#dgCurrents').datagrid('load',{


                title:$('#title').val(),
                state:$('#state').combobox('getValue')
            });
        }

    }
    //各个按钮的JS动作
    function add() {
        ttshop.addTabs('新增商品', 'item-add');
    }

    function edit() {
        console.log('edit');
    }

    function down() {
        //取到客户选中的记录集合
        var rows = $('#dgCurrents').datagrid('getSelections');
        if (rows.length == 0) {
            $.messager.alert('警告', '必须选择至少一个', 'warning');
            return;
        }
        $.messager.confirm('确认', '您确定要下架商品吗？', function (r) {
            if (r) {
                //客户已经点击确认
                //定义一个空的数组，存放id集合
                var ids = [];
                //遍历客户选中的记录集合
                for (var i = 0; i < rows.length; i++) {
                    ids.push(rows[i].id);
                }
                //发送ajax请求
                $.post(
                    //url,提交给后台 谁去处理
                    'currents/soldOutCurrent',
                    //data,提交什么到后台,ids
                    {'ids[]': ids},
                    //callback,相当于$.ajax中success
                    function (data) {
                        if (data > 0) {
                            $('#dgCurrents').datagrid('reload');
                        }
                    },
                    //dataType
                    'json'
                );
            }
        })
    }

    function up() {
        var rows = $('#dgCurrents').datagrid('getSelections');
        if (rows.length == 0) {
            $.messager.alert('警告', '必须选择至少一个', 'warning');
            return;
        }
        $.messager.confirm('确认', '您确定要上架商品吗？', function (r) {
            if (r) {
                //客户已经点击确认
                //定义一个空的数组，存放id集合
                var ids = [];
                //遍历客户选中的记录集合
                for (var i = 0; i < rows.length; i++) {
                    ids.push(rows[i].id);
                }
                //发送ajax请求
                $.post(
                    //url,提交给后台 谁去处理
                    'currents/putAwayCurrent',
                    //data,提交什么到后台,ids
                    {'ids[]': ids},
                    //callback,相当于$.ajax中success
                    function (data) {
                        if (data > 0) {
                            $('#dgCurrents').datagrid('reload');
                        }
                    },
                    //dataType
                    'json'
                );
            }
        })
    }

    function remove() {
        //debugger; //尤其可以使用这种嵌套的页面
        //取到客户选中的记录集合
        var rows = $('#dgCurrents').datagrid('getSelections');
//            console.log(rows);
        if (rows.length == 0) {
            $.messager.alert('警告', '请选中至少一条记录！', 'warning');
            return;
        }
        $.messager.confirm('确认', '您确定要删除记录吗？', function (r) {
            if (r) {
                //客户已经点击“确定”按钮
                //定义一个空的数组，用来存放ID的集合
                var ids = [];
                //遍历的是客户选中的记录集合
                for (var i = 0; i < rows.length; i++) {
                    ids.push(rows[i].id);
                }
                //发出ajax请求
                //$.ajax() $.post() $.get()
                $.post(
                    //url，提交给后台谁去处理
                    'currents/batch',
                    //data，提交什么到后台，ids
                    {'ids[]': ids},
                    //callback,相当于$.ajax中success
                    function (data) {
                        if (data > 0) {
                            $('#dgCurrents').datagrid('reload');
                        }
                    }
                );
            }

        });
    }


    //初始化数据表格代码
    $('#dgCurrents').datagrid({
        //数据表格的标题
        title: '查询商品列表',
        //显示行号
        rownumbers: true,
        //允许多列排序
        multiSort: true,
        //添加工具栏
        toolbar: '#currentListToolbar',
        //初始化页面数据条数
        pageSize: 20,
        //在设置分页属性的时候 初始化页面大小选择列表
        pageList: [20, 50, 100],
        //请求服务器端数据
        url: 'currents',
        //请求方式，默认是POST
        method: 'get',
        //是否显示分页工具栏
        pagination: true,
        //自适应父容器
        fit: true,
        //列属性
        columns: [[
            {field: 'ck', checkbox: true},
            {field: 'fcId', title: '公司编码', sortable: true},
            {field: 'title', title: '产品标题'},
            {field: 'risk', title: '投资风险',width: 100, formatter: function (value, row, index) {
                switch (value) {
                    case 1:
                        return '低';
                        break;
                    case 2:
                        return '中';
                        break;
                    case 3:
                        return '高';
                        break;
                    default:
                        return '未知';
                        break;
                }
            }},
            {
                field: 'nav', title: '单位净值',formatter: function (value) {
                return value / 10000;
            }
            },
            {
                field: 'initAmount', title: '初始金额', formatter: function (value) {
                return value / 100;
            }
            },
            {
                field: 'threeRate', title: '三个月的利率',formatter: function (value) {
                return value / 100;
                }
            },
            {
                field: 'nearYear', title: '近一年利率',formatter: function (value) {
                return value / 100;
                }
            },
            {field: 'redempTime', title: '赎回时长'},
            {
                field: 'newScale', title: '最新规模',formatter: function (value) {
                return value / 100;
                }
            },
            {
                field: 'state', title: '产品状态', width: 100, formatter: function (value, row, index) {
                switch (value) {
                    case 1:
                        return '正常';
                        break;
                    case 2:
                        return '下架';
                        break;
                    case 3:
                        return '删除';
                        break;
                    default:
                        return '未知';
                        break;
                }
            }
            },
            {
                field: 'setTime', title: '成立日期', formatter: function (value, rows, index) {
                return moment(value).format('L');
            }
            }
        ]]
    });

</script>
