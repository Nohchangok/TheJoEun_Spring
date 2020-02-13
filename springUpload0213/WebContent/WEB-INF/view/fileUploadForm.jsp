<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileUpload.jsp</title>
</head>
<body>
	<!-- enctype 전송하는 방식 multipart/form-data 파일 업로드를 할 때 쓰는 방식!!(인코딩을 안해주고 보낸다)-->
	<form action="${pageContext.request.contextPath}/file/upload"
		method="post" enctype="multipart/form-data" >
		<input type="file" name="uploadFile" multiple> <input type="submit"
			value="파일업로드">
</body>
</html>