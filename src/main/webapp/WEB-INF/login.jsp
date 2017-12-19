<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<p><a href="${pageContext.request.contextPath}/admin">进入管理员页面</a></p>
		<form action="${pageContext.request.contextPath}/login" method="post">
			userName:<input type="text" name="username" value="admin"><br/>
			passWord:<input type="password" name="password" value="admin"><br/>
			<button type="submit">登录</button>
		</form>
		<p>${error_info }</p>
		<p style="vertical-align: middle;">提示：
				账号：admin 密码：admin  是管理员账号<br/>
			           账号：1234      密码：1234        是普通用户
		</p>
	</center>
</body>
</html>