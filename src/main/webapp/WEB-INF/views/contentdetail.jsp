<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content detail</title>
<%@include file="headerscriptsandstyles.html"%>
</head>
<body>

	<ul>
		<li><c:out value="${content.name}" /></li>
		<li><c:out value="${content.sku}" /></li>
		<li><c:out value="${content.type}" /></li>
		<li><c:out value="${content.url}" /></li>
	</ul>

</body>
</html>