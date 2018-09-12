<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/test.css" />
</head>
<body>
	<a href="">这是主界面</a> <br />
	<table>
		<c:forEach items="${users }" var="user">
		<tr>
			<td>${user.user_id }</td>
			<td>${user.user_name }</td>
			<td>${user.user_pwd }</td>
			<td>${user.user_type }</td>
			<td>${user.user_extra }</td>
		</tr>
		</c:forEach>
	
	</table>
	
	
	
</body>
</html>