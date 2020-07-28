<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<title>Creator list</title>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>All creators</h1>

	<ul>
	<c:forEach items="${creators}" var="c">
		<li><c:out value="${c.name}"/>
			<a href="<c:url value="/creatoredit">
				<c:param name="id" value="${c.id}"/></c:url>" class="btn btn-primary">
				<i class="fas fa-pencil-alt"></i></a>
		</li>
	</c:forEach>
	</ul>
	
	<%@include file="footer.jsp"%>

</body>
</html>