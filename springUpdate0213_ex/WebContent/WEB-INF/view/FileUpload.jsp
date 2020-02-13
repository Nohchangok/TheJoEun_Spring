<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileUpload.jsp</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/File/fileUploadOk"
		method="post" enctype="multipart/form-data">
		<input type="file" name="uploadFile" multiple>
		<input type="submit" value="업로드고고">
	</form>
</body>
</html>