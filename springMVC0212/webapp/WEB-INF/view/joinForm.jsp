<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/user_Join.css" type="text/css">
</head>
<body>

	<div class="input_form">
		<h3>회원 가입</h3>
		<form action="${contextPage.request.contextPath }user/join">
			<div>
				<span>이름 : </span><input class="fl_r" type="text" name="name">
			</div>
			<div>
				<span>아이디 : </span><input class="fl_r" type="text" name="id">
			</div>
			<div>
				<span>비밀번호 : </span><input class="fl_r" type="password" name="pwd">
			</div>
			<fieldset>
				<legend>취미</legend>
				<label><input type="checkbox" name="hobby" value="독서">독서</label>
				<label><input type="checkbox" name="hobby" value="명상">명상</label>
				<label><input type="checkbox" name="hobby" value="개발">개발</label>
			</fieldset>
			<input type="submit" value="회원가입">

		</form>
	</div>

</body>

</html>