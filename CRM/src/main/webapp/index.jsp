<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="WEB-INF/views/layouts/header.jsp" />

</head>
<body>
	<div class="login-box">
		<div class="login-box-body">
			<h1 class="login-box-msg">
				Bem vindo ao <span class="logo-lg"><b>W</b>CRM</span>
			</h1>
			<div class="login-box-msg">
				<form action="doLogin">

					<button type="submit" class="btn btn-default">Entrar</button>

				</form>

			</div>
		</div>

	</div>
</body>
</html>