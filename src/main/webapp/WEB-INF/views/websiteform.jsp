<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<c:if test="${empty website.id}">
	<title>Add website</title>
</c:if>
<c:if test="${!empty website.id}">
	<title>Edit website</title>
</c:if>
</head>
<body>
<%@include file="navbar.jsp"%>

	<c:if test="${empty website.id}">
		<h1>Add a new website</h1>
	</c:if>
	<c:if test="${!empty website.id}">
		<h1>Edit this website</h1>
	</c:if>

	<form:form servletRelativeAction="${empty website.id ? '/websiteadd' : '/websiteedit'}" modelAttribute="website">
		<div class="form-group">
			<label>Name: </label>
			<form:input path="name" class="form-control" />
			<form:errors path="name" element="small" cssClass="form-text text-danger" />
		</div>
		<div class="form-group">
			<label>URL: </label>
			<form:input path="url" class="form-control" />
			<form:errors path="url" element="small" cssClass="form-text text-danger" />
		</div>
		<form:input path="id" type="hidden" />
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
	
	<%@include file="footer.jsp"%>

</body>
</html>