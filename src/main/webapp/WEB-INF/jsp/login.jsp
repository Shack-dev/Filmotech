<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

		<form:form method="POST" action="login" modelAttribute="member">
		<div>
				<form:label path="username" >Nom d'utilisateur </form:label>
				<form:input path="username" />
			</div>
			<div>
				<form:label path="password" >Mot de passe </form:label>
				<form:input type="password" path="password" />
			</div>
			<input type="submit" value="Submit" />
		</form:form>

</body>
</html>