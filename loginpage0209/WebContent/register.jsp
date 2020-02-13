<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">	
	
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<link href="register.css" rel="stylesheet">
<script src="register.js"></script>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="sidenav">
		<div class="login-main-text">
			<h2>
				Application<br> Register Page
			</h2>
			<p>Register from here to access.</p>
		</div>
	</div>

	<div class="register">
		<h1>Register</h1>
		<form action="registerAdd.jsp" method="post" autocomplete="off">
			<label for="userid"> <i class="fas fa-user"></i>
			</label> <input type="text" name="userId" placeholder="UserId" id="userid"
				required> 
				
			<label for="choosepassword"> <i class="fas fa-lock"></i>
			</label> <input type="password" name="password" placeholder="Choose Password"
				id="choosepassword" required> 
				
			<label for="confirmpassword"> <i class="fas fa-lock"></i>
			</label> <input type="password" name="confirmpassword" placeholder="Confirm Password"
				id="confirmpassword" required> 
				
			<label for="email"> <i class="fas fa-envelope"></i>
			</label> <input type="email" name="Email" placeholder="Email"
				id="email" required> 
				
			<label for="username"> <i class="glyphicon glyphicon-ok"></i>
			</label> <input type="text" name="UserName" placeholder="UserName" id="username"
				required> 
				
			<label for="phonenumber"> <i class="glyphicon glyphicon-phone-alt"></i>
			</label> <input type="number" name="PhoneNumber" placeholder="010-0000-0000" id="phonenumber" required> 
			
				
			<label for="birth"> <i class="glyphicon glyphicon-calendar"></i>
			</label> <input type="date" name="Birth" id="birth" required> 
				
			<input type="submit" value="Add" onclick="Vaildate()">
		</form>
	</div>
</body>
</html>