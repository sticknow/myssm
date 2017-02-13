var menuitem = {
	/**
	 * 加载树
	 */
	loadTree:function(){
		/**
		 * 第三个参数是回调函数，是在服务器端成功响应完毕以后才要执行该函数
		 * 如果js端的代码要用到回调函数的数据，这段代码必须写在回调函数中
		 * @param {Object} data
		 */
		$.post("menuitemAction_showMenuitems.action",null,function(data){
			$("#tree").zTree(menuitem.setting,data);
		});
	},
	setting:{
		isSimpleData: true,
		treeNodeKey: "mid",
		treeNodeParentKey: "pid",
		showLine: true,
		root:{ 
			isRoot:true,
			nodes:[]
		}
	}
};
$().ready(function(){
	/**
	 * 加载树
	 */
	menuitem.loadTree();
});
