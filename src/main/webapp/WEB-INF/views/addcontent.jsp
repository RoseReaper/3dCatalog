<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add content</title>
<%@include file="headerscriptsandstyles.html"%>
</head>
<body>

	<form:form servletRelativeAction="/addcontent" modelAttribute="content">
		<p>
			<label>Name : </label>
			<form:input path="name" />
			<form:errors path="name" />
		</p>
		<p>
			<label>SKU : </label>
			<form:input path="sku" />
			<form:errors path="sku" />
		</p>
		<p>
			<label>Type : </label>
			<form:select path="type">
				<form:option value="-" label="--Please Select" />
				<form:options items="${types}" itemValue="id" itemLabel="name" />
			</form:select>
		</p>
		<p>
			<label>URL : </label>
			<form:input path="url" />
			<form:errors path="url" />
		</p>
		<button type="submit">Submit</button>
	</form:form>

</body>
</html>