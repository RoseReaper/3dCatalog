<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content list</title>
<%@include file="headerscriptsandstyles.jsp"%>
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
				<th>Software</th>
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
					<td>
						<c:forEach items="${c.softwares}" var="s" varStatus="loopStatus">
							<c:out value="${s.name}" />
							<c:if test="${!loopStatus.last}">/</c:if>
						</c:forEach>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script>
		$(document).ready(function() {
			$('#contentlist').DataTable();
		});
	</script>

</body>
</html>