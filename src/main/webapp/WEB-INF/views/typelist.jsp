<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Type list</title>
<%@include file="headerscriptsandstyles.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>All types</h1>

	<ul>
	<c:forEach items="${types}" var="t">
		<li><c:out value="${t.name}"/></li>
	</c:forEach>
	</ul>

</body>
</html>