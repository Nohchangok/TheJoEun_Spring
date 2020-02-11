<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
${result }
<c:forEach var="user" items="${userList }">
	${user.userId }, ${user.name }, ${user.nickname },${user.birth }<br>
</c:forEach>
	
</body>
</html>