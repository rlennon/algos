<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="/Logistics/login.css" type="text/css">
</head>
<body>
	<div class="login-page">
	
		<div class="form">
		<h1 style="color: #4CAF50">EVIL PORTAL LOGIN</h1>
			<form class="login-form" method="post" action="LoginCheck">
				<input type="text" placeholder="username" name="uname" /> <input type="password"
					placeholder="password"  name="password"/>
				<button>login</button>	
			</form>
		</div>
	</div>
</body>
</html>