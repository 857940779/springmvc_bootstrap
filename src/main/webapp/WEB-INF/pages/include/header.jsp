<%@ page language="java" pageEncoding="UTF-8"%>

<header class="main-header">
	<a href="<%=path%>" class="logo">
		<span class="logo-mini">springmvc</span>
		<span class="logo-lg"><b><sp:message code="sys.name"/></b></span> 
	</a>
	<nav class="navbar navbar-static-top">
		<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
			<span class="sr-only">Toggle navigation</span> 
		</a>
		

		<div class="navbar-custom-menu">
			<ul class="nav navbar-nav">
				<li class="dropdown user user-menu">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
						<span class="hidden-xs">${currentUser.companyName}</span>, <sp:message code="sys.wel"/>
					</a>
					<ul class="dropdown-menu">
						<!-- Menu Footer-->
						<li class="user-footer">
							<div class="pull-left">
								<a href="<%=path%>/com/show" class="btn btn-default btn-flat"><sp:message code="user.info"/></a>
							</div>
							<div class="pull-right">
								<a href="<%=path%>/account/out" class="btn btn-default btn-flat"><sp:message code="sys.out"/></a>
							</div>
						</li>
						
					</ul>
				</li>
			</ul>
		</div>
	</nav>
</header>