<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content</title>
<c:url value="/assets/datatable.css" var="datatableCss" />
<c:url value="/assets/datatable.js" var="datatableJs" />
<c:url value="/assets/jquery-3.4.1.js" var="jqueryJs" />
<link rel="stylesheet" href="${datatableCss}" />
<script type="text/javascript" charset="utf8" src="${jqueryJs}"></script>
<script type="text/javascript" charset="utf8" src="${datatableJs}"></script>
</head>
<body>


	<table id="content_result" class="display">
		<thead>
			<tr>
				<th>Name</th>
				<th>SKU</th>
				<th>URL</th>
				<th>Type</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contents}" var="s">
				<tr>
					<td><c:out value="${s.name}" /></td>
					<td><c:out value="${s.sku}" /></td>
					<td><c:out value="${s.url}" /></td>
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