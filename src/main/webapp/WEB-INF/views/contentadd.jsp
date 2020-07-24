<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	<h1>Add a new content</h1>

	<form:form servletRelativeAction="/contentadd" modelAttribute="content">
		<div class="form-group">
			<label>Name: </label>
			<form:input path="name" class="form-control" />
			<form:errors path="name" />
		</div>
		<div class="form-group">
			<label>SKU: </label>
			<form:input path="sku" class="form-control" />
			<form:errors path="sku" />
		</div>
		<div class="form-group">
			<label>Type: </label>
			<form:select path="type.id" class="form-control">
				<form:option value="" label="--Please Select" />
				<form:options items="${types}" itemValue="id" itemLabel="name" />
			</form:select>
		</div>
 		<div class="form-group">
 			<label>Is this content a new figure?</label>
 			<form:checkbox path="" value="" />
			<label>Gender: </label>
			<form:select path="gender.id" class="form-control">
				<form:option value="" label="--Please Select" />
				<form:options items="${genders}" itemValue="id" itemLabel="name" />
			</form:select>
			<label>Generation: </label>
			<form:select path="generation.id" class="form-control">
				<form:option value="" label="--Please Select" />
				<form:options items="${generations}" itemValue="id" itemLabel="name" />
			</form:select>
 		</div>
		<div class="form-group">
			<label>Creator: </label>
			<form:select multiple="true" path="creators" class="form-control">
				<form:options items="${creators}" itemValue="id" itemLabel="name" />
			</form:select>
		</div>
		<div class="form-group">
			<label>Source website: </label>
			<form:select path="website.id" class="form-control">
				<form:option value="" label="--Please Select" />
				<form:options items="${websites}" itemValue="id" itemLabel="name" />
			</form:select>
		</div>
		<div class="form-group">
			<label>Page URL: </label>
			<form:input path="url" class="form-control" />
			<form:errors path="url" />
		</div>
		<div class="form-group">
			<label>Software: </label>
			<form:select multiple="true" path="softwares" class="form-control">
				<form:options items="${softwares}" itemValue="id" itemLabel="name" />
			</form:select>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>

</body>
</html>