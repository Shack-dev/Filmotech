<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>Filmotech | Rechercher un film</title>

	<jsp:include page="importCss.jsp" />
	<link rel="stylesheet" href="css/search.css">

</head>

<body class="search">

	<jsp:include page="header.jsp" />

	
	<div>	
			<p class="title-head">Rechercher un film.</p>
	</div>
	
	<div>
	<form:form method="POST" action="/rechercher/resultat"
			modelAttribute="movie">
			<div>
				<form:label path="name">Par nom :</form:label>
				<form:input path="name" />				
			</div>
			<div>
				<form:label path="category">Par catégorie :</form:label>
				<form:select path="category" multiple="false">
					<form:option value="-" label="Selectionnez une catégorie"/>
					<form:options items="${category}" />
				</form:select>
			</div>
			<div>
				<input type="submit" value="Submit" />
			</div>
		</form:form>
	</div>
	

	<jsp:include page="footer.jsp" />
	<jsp:include page="importJs.jsp"/>
</body>
</html>
