<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content detail</title>
<%@include file="headerscriptsandstyles.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>Content details</h1>

	<ul>
		<li><c:out value="${contentdetail.name}" /></li>
		<li><c:out value="${contentdetail.sku}" /></li>
		<li><c:out value="${contentdetail.type.id}" /></li>
		<li><c:out value="${contentdetail.url}" /></li>
	</ul>
	<button type="submit" class="btn btn-primary"><i class="fas fa-pencil-alt">Modify</i></button>
	<button type="submit" class="btn btn-secondary"><i class="fas fa-trash-alt">Delete</i></button>

</body>
</html>