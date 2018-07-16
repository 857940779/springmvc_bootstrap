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

		</script>

	</head>


	<body class="hold-transition skin-blue sidebar-mini">

	  <div>${message}</div>

		<div >
			<div class="content-wrapper">
				<section class="content-header">
					<h1> 地区信息管理</h1>
					<ol class="breadcrumb">
				        <li><a href="#"><i class="fa fa-home"></i> 首页</a></li>
				        <li class="active">地区管理</li>
				    </ol>
				</section>
				
				<section class="content">
					<div class="row">
						<div class="col-xs-12">
							<div class="box">
								<div class="box-body">
									<table id="example"  class="display" cellspacing="0" width="100%">
										<thead>
											<tr>
												<th>地区名称</th>
												<th>状态</th>
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
