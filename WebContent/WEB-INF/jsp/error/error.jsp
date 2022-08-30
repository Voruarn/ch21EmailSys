<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" isErrorPage="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>error</title>
</head>
<body>
	<h1>未知错误: </h1><%=exception %>
	<h2>错误内容: </h2>
	<%
		exception.printStackTrace(response.getWriter());
	%>
</body>
</html>