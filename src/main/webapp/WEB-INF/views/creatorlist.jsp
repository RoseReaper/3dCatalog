<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creator list</title>
<%@include file="header.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>All creators</h1>

	<ul>
	<c:forEach items="${creators}" var="c">
		<li><c:out value="${c.name}"/></li>
	</c:forEach>
	</ul>
	
	<%@include file="footer.jsp"%>

</body>
</html>