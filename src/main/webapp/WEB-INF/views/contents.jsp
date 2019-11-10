<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content</title>
<%@include file="headerscriptsandstyles.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<table id="content_result" class="display">
		<thead>
			<tr>
				<th>Name</th>
				<th>SKU</th>
				<th>Type</th>
				<th>Software</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contents}" var="c">
				<tr>
					<td><c:out value="${c.name}" /></td>
					<td><c:out value="${c.sku}" /></td>
					<td><c:out value="${c.type.name}" /></td>
					<td>
						<c:forEach items="${c.softwares}" var="s">
							<c:out value="${s.name}" />
						</c:forEach>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script>
		$(document).ready(function() {
			$('#content_result').DataTable();
		});
	</script>

</body>
</html>