<%@ page language="java" pageEncoding="UTF-8"%>


<!--左侧菜单栏，目前写死，后续可以从数据库读取-->
<aside class="main-sidebar">
	<section class="sidebar">

		<ul class="sidebar-menu">
			<li class="header"><sp:message code="menu"/></li>
			<li class="treeview">
				<!--使用target来制定页面只在ifrmae内生效-->
					<a target="main_frame" href="<%=path%>/user/list">
						<i class="fa fa-user"></i><span><sp:message code="menu.company"/></span>
					</a>
			</li>
			<li class="treeview">
				<a href="<%=path%>/area/list"> <i class="fa fa-edit"></i><span><sp:message code="menu.area"/></span></a>
			</li>
			<li class="treeview">
				<a href="<%=path%>/area/list"> <i class="fa fa-edit"></i><span><sp:message code="menu.task"/></span></a>
			</li>
		</ul>
	</section>
</aside>