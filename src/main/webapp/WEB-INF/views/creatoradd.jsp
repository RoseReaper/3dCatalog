<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add creator</title>
<%@include file="header.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>Add a new creator</h1>

	<form:form servletRelativeAction="/creatoradd" modelAttribute="creator">
		<div class="form-group">
			<label>Name: </label>
			<form:input path="name" class="form-control" />
			<form:errors path="name" />
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
	
	<%@include file="footer.jsp"%>

</body>
</html>