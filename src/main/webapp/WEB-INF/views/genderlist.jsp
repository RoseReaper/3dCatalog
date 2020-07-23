<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gender list</title>
<%@include file="headerscriptsandstyles.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>All genders</h1>

	<ul>
	<c:forEach items="${genders}" var="g">
		<li><c:out value="${g.name}"/></li>
	</c:forEach>
	</ul>

</body>
</html>