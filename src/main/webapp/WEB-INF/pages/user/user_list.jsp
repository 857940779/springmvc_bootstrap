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
            $(document).ready(function() {

//                $('#example').DataTable( {
//                    processing:true,
//                    serverSide:true,
//                    ajax: {
//                        url: '/user/page',
//                        dataSrc: ''
//                    },
//                    columns: [ { data: 'userName' },
//                                { data: 'state' },
//                                { data: 'registerTime' },
//                                { data: 'roleId' }]
//            });

                $.ajax({
                    "dataType": 'json',
                    "type": "GET",
                    "url": "/user/page",
                    //"data": {"applyId": actId},  上送参数
                    "success": function (data) {
                        console.log(data);

//                        $('#example').DataTable({
//                            data: data,
//                            columns: [
//                                { data: "userName" }
//                            ]
//                        } );
                    }
                });
            } );

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
									<table id="example1"  class="display" cellspacing="0" width="100%">
										<thead>
											<tr>
												<th>用户名称</th>
												<th>状态</th>
												<th>注册时间</th>
												<th>角色</th>
											</tr>
										</thead>
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
