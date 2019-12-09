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

	<ul>
		<li><c:out value="${content.name}" /></li>
		<li><c:out value="${content.sku}" /></li>
		<li><c:out value="${content.type.id}" /></li>
		<li><c:out value="${content.url}" /></li>
	</ul>
	<button type="submit" class="btn btn-primary"><i class="fas fa-pencil-alt">Modify</i></button>
	<button type="submit" class="btn btn-primary"><i class="fas fa-trash-alt">Delete</i></button>

</body>
</html>