<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/insert" method="post">
	<input type="text" name="userId" placeholder="아이디를 입력하세요.">
	<input type="text" name="name" placeholder="이름을 입력하세요.">
	<input type="text" name="nickname" placeholder="닉네임을 입력하세요.">
	<input type="date" name="birthStr">
	<input type="submit">
	
</form>
</body>
</html>