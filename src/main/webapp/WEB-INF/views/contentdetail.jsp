<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content detail</title>
<%@include file="header.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>Content detail</h1>

	<ul>
		<li>Name: <c:out value="${contentdetail.name}" /></li>
		<li>SKU: <c:out value="${contentdetail.sku}" /></li>
		<li>Type: <c:out value="${contentdetail.type.name}" /></li>
<%-- 		<li>Generation: <c:out value="${contentdetail.generation.name}" /></li> --%>
		<li>URL: <c:out value="${contentdetail.url}" /></li>
	</ul>
	<button type="button" class="btn btn-primary"><i class="fas fa-pencil-alt"></i> Modify</button>
	<button type="button" class="btn btn-secondary"><i class="fas fa-trash-alt"></i> Delete</button>
	
	<%@include file="footer.jsp"%>

</body>
</html>