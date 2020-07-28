<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<c:if test="${empty content.id}">
	<title>Add content</title>
</c:if>
<c:if test="${!empty content.id}">
	<title>Edit content</title>
</c:if>
</head>
<body>
	<%@include file="navbar.jsp"%>

	<c:if test="${empty content.id}">
		<h1>Add a new content</h1>
	</c:if>
	<c:if test="${!empty content.id}">
		<h1>Edit this content</h1>
	</c:if>

	<form:form servletRelativeAction="${empty content.id ? '/contentadd' : '/contentedit'}" modelAttribute="content">
		<div class="form-row">
			<div class="form-group col-md-6">
				<label>Name</label>
				<form:input path="name" class="form-control" />
				<form:errors path="name" element="small" cssClass="form-text text-danger" />
			</div>
			<div class="form-group col-md-6">
				<label>SKU</label>
				<form:input path="sku" class="form-control" />
			</div>
		</div>
		<div class="form-group">
			<label>Type</label>
			<form:select path="type" class="form-control">
				<form:option value="" label="--Please Select" />
				<form:options items="${types}" itemValue="id" itemLabel="name" />
			</form:select>
			<form:errors path="type" element="small" cssClass="form-text text-danger" />
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label>Gender</label>
				<form:select path="gender" class="form-control">
					<form:option value="" label="--Please Select" />
					<form:options items="${genders}" itemValue="id" itemLabel="name" />
				</form:select>
			</div>
			<div class="form-group col-md-6">
				<label>Generation</label>
				<form:select multiple="true" path="generations" class="form-control">
					<form:options items="${generations}" itemValue="id"
						itemLabel="name" />
				</form:select>
			</div>
		</div>
		<div class="form-group">
			<label>Creator</label>
			<form:select multiple="true" path="creators" class="form-control">
				<form:options items="${creators}" itemValue="id" itemLabel="name" />
			</form:select>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label>Page URL</label>
				<form:input path="url" class="form-control" />
				<form:errors path="url" element="small" cssClass="form-text text-danger" />
			</div>
			<div class="form-group col-md-6">
				<label>Source website</label>
				<form:select path="website" class="form-control">
					<form:option value="" label="--Please Select" />
					<form:options items="${websites}" itemValue="id" itemLabel="name" />
				</form:select>
				<form:errors path="website" element="small" cssClass="form-text text-danger" />
			</div>
		</div>
		<div class="form-group">
			<label>Software</label>
			<form:select multiple="true" path="softwares" class="form-control">
				<form:options items="${softwares}" itemValue="id" itemLabel="name" />
			</form:select>
		</div>
		<form:input path="id" type="hidden" />
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
	
	<%@include file="footer.jsp"%>

</body>
</html>