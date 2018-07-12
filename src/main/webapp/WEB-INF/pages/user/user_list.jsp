<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../include/common.jsp"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>AdminLTE 2 | Data Tables</title>

		<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<script src="<%=path%>/res/plugins/fastclick/fastclick.js"></script>
		<script src="<%=path%>/res/dist/js/app.min.js"></script>
		<script src="<%=path%>/res/dist/js/demo.js"></script>
		<script>
			//页面加载后，发起ajax请求
			$(function(){
                $("#example1").dataTable({
                    "aoColumnDefs": [
                        {
                            "mData": "userName",
                            "aTargets": [0],
                            "bSortable": false
                        },
                        {
                            "mData": "state",
                            "aTargets": [1],
                            "bSortable": false
                        },
                        {
                            "mData": "registerTime",
                            "aTargets": [2],
                            "bSortable": false
                        },
                        {
                            "mData": "roleId",
                            "aTargets": [3],
                            "bSortable": false
                        }
                    ],
                    "sAjaxSource": '/user/page'
                });


//                $('#example1').DataTable({
//					ajax:'/user/page',
//					columns:[
//						{data:'userName'},
//						{data:'state'},
//						{data:'registerTime'},
//						{data:'roleId'}
//					]
//				});


//                $.ajax({
//                    url: "/user/page",
//                    type: 'GET',
//                    dataType: 'json',
//                    success: function (data) {
//                        $('#example1').DataTable({
//                            "data": data,
//                            "paging": true,
//                            "lengthChange": false,
//                            "ordering": false,
//                            "info": true
//                        });
//                    }
//                });
			});

		</script>

	</head>


	<body class="hold-transition skin-blue sidebar-mini">
		<div >
			<div class="content-wrapper">
				<section class="content-header">
					<h1> 用户信息管理</h1>
					<ol class="breadcrumb">
				        <li><a href="#"><i class="fa fa-home"></i> 首页</a></li>
				        <li class="active">用户管理</li>
				    </ol>
				</section>
				
				<section class="content">
					<div class="row">
						<div class="col-xs-12">
							<div class="box">
								<div class="box-body">
									<table id="example1" class="table table-bordered table-striped">
										<%--<thead>--%>
											<%--<tr>--%>
												<%--<th>用户名称</th>--%>
												<%--<th>状态</th>--%>
												<%--<th>注册时间</th>--%>
												<%--<th>角色</th>--%>
											<%--</tr>--%>
										<%--</thead>--%>
									</table>
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>
		</div>

	</body>
</html>
