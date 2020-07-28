<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<title>Gender list</title>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>All genders</h1>

	<ul class="ul-attributes-list">
	<c:forEach items="${genders}" var="g">
		<li class="il-attributes-list">
			<c:out value="${g.name}"/>
			<div class="edit-button">
				<a href="<c:url value="/genderedit">
				<c:param name="id" value="${g.id}"/></c:url>" class="btn btn-primary">
				<i class="fas fa-pencil-alt"></i></a>
			</div>
		</li>
	</c:forEach>
	</ul>
	
	<%@include file="footer.jsp"%>

</body>
</html>