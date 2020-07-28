<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<title>Content list</title>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>Content list</h1>

	<table id="contentlist" class="display">
		<thead>
			<tr>
				<th>Name</th>
				<th>SKU</th>
				<th>Type</th>
				<th>Gender</th>
				<th>Generation</th>
				<th>Creator</th>
				<th>Software</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contentlist}" var="c">
				<tr>
					<td><a href="<c:url value="/contentdetail">
						<c:param name="id" value="${c.id}"/></c:url>">
							<c:out value="${c.name}" /></a></td>
					<td><c:out value="${c.sku}" /></td>
					<td><c:out value="${c.type.name}" /></td>
					<td><c:out value="${c.gender.name}" /></td>
					<td>
						<c:forEach items="${c.generations}" var="gen" varStatus="loopStatus">
							<c:out value="${gen.name}" />
							<c:if test="${!loopStatus.last}">/</c:if>
						</c:forEach>
					</td>
					<td>
						<c:forEach items="${c.creators}" var="cr" varStatus="loopStatus">
							<c:out value="${cr.name}" />
							<c:if test="${!loopStatus.last}">/</c:if>
						</c:forEach>
					</td>
					<td>
						<c:forEach items="${c.softwares}" var="s" varStatus="loopStatus">
							<c:out value="${s.name}" />
							<c:if test="${!loopStatus.last}">/</c:if>
						</c:forEach>
					</td>
					<td>
						<a href="<c:url value="/contentedit">
						<c:param name="id" value="${c.id}"/></c:url>" class="btn btn-primary">
							<i class="fas fa-pencil-alt"></i></a>
					</td>
					<td>
						<form:form servletRelativeAction="/contentdelete" modelAttribute="content">
							<input type="hidden" name="id" value="${c.id}" />
							<button type="submit" class="btn btn-danger">
								<i class="fas fa-trash-alt"></i>
							</button>
						</form:form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<%@include file="footer.jsp"%>

</body>
</html>