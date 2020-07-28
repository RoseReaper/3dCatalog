<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<c:if test="${empty type.id}">
	<title>Add type</title>
</c:if>
<c:if test="${!empty type.id}">
	<title>Edit type</title>
</c:if>
</head>
<body>
<%@include file="navbar.jsp"%>

	<c:if test="${empty type.id}">
		<h1>Add a new type</h1>
	</c:if>
	<c:if test="${!empty type.id}">
		<h1>Edit this type</h1>
	</c:if>

	<form:form servletRelativeAction="${empty type.id ? '/typeadd' : '/typeedit'}" modelAttribute="type">
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