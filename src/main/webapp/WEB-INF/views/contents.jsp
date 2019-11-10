<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content</title>
<%@include file="headerscriptsandstyles.html" %>
</head>
<body>

	<table id="content_result" class="display">
		<thead>
			<tr>
				<th>Name</th>
				<th>SKU</th>
				<th>Type</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contents}" var="s">
				<tr>
					<td><c:out value="${s.name}" /></td>
					<td><c:out value="${s.sku}" /></td>
					<td><c:out value="${s.type.name}" /></td>
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