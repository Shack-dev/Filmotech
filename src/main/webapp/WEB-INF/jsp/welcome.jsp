<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>Filmotech | Home</title>

	<jsp:include page="importCss.jsp" />
	<link rel="stylesheet" href="css/home.css">

</head>

<body class="welcome">

	<jsp:include page="header.jsp" />

	
	<div>	
			<p class="title-head">Bienvenue sur Filmotech<br>L'encyclopedie de tous vos films.</p>
	</div>
	
	<div>	
			<p class="title-1">Liste aléatoire</p>
	</div>
	
	<div class="slide">
		<div class="polygon"></div>
			<div class="img-home"><p>Photo</p></div>
		<div class="polygon"></div>
	</div>
	
	<div><p>${movie.name}</p></div>

	<jsp:include page="footer.jsp" />
	<jsp:include page="importJs.jsp"/>
</body>
</html>
