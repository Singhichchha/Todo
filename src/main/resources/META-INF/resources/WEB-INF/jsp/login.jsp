<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body style="background-image: url('https://img.freepik.com/premium-photo/list-icon-notebook-with-completed-todo-list-3d-render_471402-428.jpg'); background-size: cover; background-repeat: no-repeat; background-attachment: fixed;">
	<div class="container">
		<h3>Login into your TODO!</h3>
		<form method="post">
			UserName: <input type="text" name="name" /> <br>
			<br> Password: <input type="password" name="password" /> <br>
			<br> <input type="submit" />
		</form>
		<pre>${errorMessage}</pre>
	</div>
</body>
</html>