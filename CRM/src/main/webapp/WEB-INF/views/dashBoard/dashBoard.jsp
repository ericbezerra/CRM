<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<c:import url="../layouts/header.jsp" />
</head>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<!-- Main Header -->
		<header class="main-header">
			<!-- Logo -->
			<a href="enter" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>W</b>an</span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>W</b>CRM</span>
			</a>
			<!-- Header Navbar -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> <span class="sr-only">Toggle navigation</span>
				</a>
				<!-- Navbar Right Menu -->
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<!-- Messages: style can be found in dropdown.less-->
						<li class="dropdown messages-menu">
							<!-- Menu toggle button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-envelope-o"></i> <span
								class="label label-success">4</span>
						</a>
							<ul class="dropdown-menu">
								<li class="header">You have 4 messages</li>
								<li>
									<!-- inner menu: contains the messages -->
									<ul class="menu">
										<li>
											<!-- start message --> <a href="#">
												<div class="pull-left">
													<p></p>
												</div> <!-- Message title and timestamp -->
												<h4>
													Support Team <small><i class="fa fa-clock-o"></i> 5
														mins</small>
												</h4> <!-- The message -->
												<p>Why not buy a new awesome theme?</p>
										</a>
										</li>
										<!-- end message -->
									</ul> <!-- /.menu -->
								</li>
								<li class="footer"><a href="#">See All Messages</a></li>
							</ul>
						</li>
						<!-- /.messages-menu -->

						<!-- Notifications Menu -->
						<li class="dropdown notifications-menu">
							<!-- Menu toggle button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-bell-o"></i> <span
								class="label label-warning">10</span>
						</a>
							<ul class="dropdown-menu">
								<li class="header">You have 10 notifications</li>
								<li>
									<!-- Inner Menu: contains the notifications -->
									<ul class="menu">
										<li>
											<!-- start notification --> <a href="#"> <i
												class="fa fa-users text-aqua"></i> 5 new members joined
												today
										</a>
										</li>
										<!-- end notification -->
									</ul>
								</li>
								<li class="footer"><a href="#">View all</a></li>
							</ul>
						</li>
						<!-- Tasks Menu -->
						<li class="dropdown tasks-menu">
							<!-- Menu Toggle Button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-flag-o"></i> <span
								class="label label-danger">9</span>
						</a>
							<ul class="dropdown-menu">
								<li class="header">You have 9 tasks</li>
								<li>
									<!-- Inner menu: contains the tasks -->
									<ul class="menu">
										<li>
											<!-- Task item --> <a href="#"> <!-- Task title and progress text -->
												<h3>
													Design some buttons <small class="pull-right">20%</small>
												</h3> <!-- The progress bar -->
												<div class="progress xs">
													<!-- Change the css width attribute to simulate progress -->
													<div class="progress-bar progress-bar-aqua"
														style="width: 20%" role="progressbar" aria-valuenow="20"
														aria-valuemin="0" aria-valuemax="100">
														<span class="sr-only">20% Complete</span>
													</div>
												</div>
										</a>
										</li>
										<!-- end task item -->
									</ul>
								</li>
								<li class="footer"><a href="#">View all tasks</a></li>
							</ul>
						</li>
						<!-- User Account Menu -->
						<li class="dropdown user user-menu">
							<!-- Menu Toggle Button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <!-- The user image in the navbar-->
								<p></p> <!-- hidden-xs hides the username on small devices so only the image appears. -->
								<span class="hidden-xs">Eric Bezerra</span>
						</a>
							<ul class="dropdown-menu">
								<!-- The user image in the menu -->
								<li class="user-header">
									<p>
										Eric Bezerra - Administrador<small>Membro desde Fev.
											2013</small>
									</p>
								</li>
								<!-- Menu Body -->
								<li class="user-body">
									<div class="col-xs-6 text-center">
										<a href="enter?page=vendas">Vendas</a>
									</div>
									<div class="col-xs-6 text-center">
										<a href="enter?page=cliente">Clientes</a>
									</div>
								</li>
								<!-- Menu Footer-->
								<li class="user-footer">
									<div class="pull-left">
										<a href="enter?page=perfil" class="btn btn-default btn-flat">Perfil</a>
									</div>
									<div class="pull-right">
										<a href="doLogin" class="btn btn-default btn-flat">Sair</a>
									</div>
								</li>
							</ul>
						</li>

					</ul>
				</div>
			</nav>
		</header>
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<!-- Sidebar user panel (optional) -->
				<div class="user-panel">
					<div class="pull-left image">
						<img src="dist/img/user2-160x160.jpg" class="img-circle"
							alt="User Image">
					</div>
					<div class="pull-left info">
						<p>Eric Bezerra</p>
					</div>
				</div>


				<!-- /.search form -->
				<!-- Sidebar Menu -->
				<ul class="sidebar-menu">
					<li class="header">CABEÇALHO</li>
					<!-- Optionally, you can add icons to the links -->
					<li><a href="enter"> <i class="fa fa-home"></i> <span>HOME</span></a>
					</li>
					<li><a href="enter?page=agenda"> <i class="fa fa-calendar"></i>
							<span>Agenda</span></a></li>
					<li><a href="enter?page=vendas"> <i
							class="fa fa-bar-chart"></i> <span>Vendas</span></a></li>
					<li class="treeview"><a href="#"> <i class="fa fa-group"></i>
							<span>Clientes</span> <i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="enter?page=prospeccao">Prospecção</a></li>
							<li><a href="enter?page=cliente">Cliente</a></li>
						</ul></li>
					<li class="treeview"><a href="#"> <i class="fa fa-gear"></i>
							<span>Configuração</span> <i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="enter?page=perfil">Perfil</a></li>
							<li><a href="doLogin">Sair</a></li>
						</ul></li>
				</ul>
				<!-- /.sidebar-menu -->
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header"></section>

			<!-- Main content -->
			<section class="content">
				<!-- Your Page Content Here -->

				<c:choose>
					<c:when test="${param.page == 'agenda' }">
						Agenda
					</c:when>
					<c:when test="${param.page == 'vendas' }">
						Vendas
					</c:when>
					<c:when test="${param.page == 'prospeccao' }">
						Prospecção
					</c:when>
					<c:when test="${param.page == 'cliente' }">
						Clientes
					</c:when>
					<c:when test="${param.page == 'perfil' }">
						Perfil
					</c:when>
					<c:when test="${param.page == 'erro' }">
						<c:import url="../error/erro.jsp"/>
					</c:when>
					<c:when test="${param.page == '404' }">
						<c:import url="../error/404.jsp"/>
					</c:when>
					<c:otherwise>
						Bem Vindo
					</c:otherwise>
				</c:choose>

			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<!-- Main Footer -->
		<footer class="main-footer">
			<!-- To the right -->
			<div class="pull-right hidden-xs">Versão 1.0</div>
			<!-- Default to the left -->
			<strong>Copyright &copy; 2016 <a href="#">Wancorp</a>.
			</strong> Todos diretos reservados.
		</footer>

		<!-- Control Sidebar -->

		<!-- /.control-sidebar -->
		<!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
		<div class="control-sidebar-bg"></div>
	</div>
	<!-- ./wrapper -->

	<c:import url="../layouts/footer.jsp" />
</body>
</html>
