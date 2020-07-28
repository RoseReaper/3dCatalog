<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<c:if test="${empty generation.id}">
	<title>Add generation</title>
</c:if>
<c:if test="${!empty generation.id}">
	<title>Edit generation</title>
</c:if>
</head>
<body>
<%@include file="navbar.jsp"%>

	<c:if test="${empty generation.id}">
		<h1>Add a new generation</h1>
	</c:if>
	<c:if test="${!empty generation.id}">
		<h1>Edit this generation</h1>
	</c:if>

	<form:form servletRelativeAction="${empty generation.id ? '/generationadd' : '/generationedit'}" modelAttribute="generation">
		<div class="form-group">
			<label>Name: </label>
			<form:input path="name" class="form-control" />
			<form:errors path="name" element="small" cssClass="form-text text-danger" />
		</div>
		<form:input path="id" type="hidden" />
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
	
	<%@include file="footer.jsp"%>

</body>
</html>