<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<link href="login.css" rel="stylesheet">

<!DOCTYPE html>
<html>
<head>

<script type="text/javascript">
	/* url로 접속하지 못하도록 web-inf폴더로 이동시켜야 함.  */
	function loginClick() {
		location.href = "main.jsp";
	}

	function registerClick() {
		location.href = "register.jsp";
	}
</script>

<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<div class="sidenav">
		<div class="login-main-text">
			<h2>
				Application<br> Login Page
			</h2>
			<p>Login or register from here to access.</p>
		</div>
	</div>
	<div class="login">
		<h1>LOGIN</h1>
		<form action="login.php" method="post" autocomplete="off">
			<label for="username"> <i class="fas fa-user"></i>
			</label> <input type="text" name="username" placeholder="Username"
				id="username" required> <label for="password"> <i
				class="fas fa-lock"></i>
			</label> <input type="password" name="password" placeholder="Password"
				id="password" required> </label> <input type="button"
				class="btn btn-black" value="Login" onclick="loginClick()">
			</button>
			<input type="button" class="btn btn-secondary" value="Register"
				onclick="registerClick()">
			</button>
		</form>
	</div>

</body>
</html>