<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add content</title>
<%@include file="headerscriptsandstyles.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<form:form servletRelativeAction="/addcontent" modelAttribute="content">
		<div class="form-group">
			<label>Name : </label>
			<form:input path="name" class="form-control" />
			<form:errors path="name" />
		</div>
		<div class="form-group">
			<label>SKU : </label>
			<form:input path="sku" class="form-control" />
			<form:errors path="sku" />
		</div>
		<div class="form-group">
			<label>Type : </label>
			<form:select path="type.id" class="form-control">
				<form:option value="-" label="--Please Select" />
				<form:options items="${types}" itemValue="id" itemLabel="name" />
			</form:select>
		</div>
		<div class="form-group">
			<label>URL : </label>
			<form:input path="url" class="form-control" />
			<form:errors path="url" />
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>

</body>
</html>