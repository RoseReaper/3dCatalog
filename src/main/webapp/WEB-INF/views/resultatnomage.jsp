<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Résultat NomAge</title>
</head>
<body>

	<ul>
		<li><c:out value="${na.nom}" /></li>
		<li><c:out value="${na.age}" /></li>
	</ul>

</body>
</html>