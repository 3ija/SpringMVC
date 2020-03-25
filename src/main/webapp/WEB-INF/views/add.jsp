<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/spring-project/ading" method="POST"
		modelAttribute="user">
		<form:label path="username">Username</form:label>
		<form:input path="username" />
		<br>
		<br>
		<form:label path="password">Password</form:label>
		<form:input path="password" />
		<br>
		<br>

		<input type="submit" value="Dodaj">
	</form:form>
	<br>
	${added}
	<br>
	<a href="./home">Home</a>
</body>
</html>