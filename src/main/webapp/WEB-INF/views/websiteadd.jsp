<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<title>Add website</title>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>Add a new website</h1>

	<form:form servletRelativeAction="/websiteadd" modelAttribute="website">
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
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
	
	<%@include file="footer.jsp"%>

</body>
</html>