<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 id="msg"><%= request.getAttribute("msg") %></h3>
<form action="login" method="POST">
<input type="email" name="email" />
<input type="password" name="password" />
<input type="submit" value="login" />
</form>
<script type="text/javascript" src="index.js"></script>
</body>
</html>