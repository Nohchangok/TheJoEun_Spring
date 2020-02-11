<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/update" method="post">
	<input type="text" name="userId" value="${user.userId }">
	<input type="text" name="name" value="${user.name }">
	<input type="text" name="nickname" value="${user.nickname }">
	<input type="date" name="birthStr" value="${user.birth.toString() }">
	<input type="submit">

</body>
</html>