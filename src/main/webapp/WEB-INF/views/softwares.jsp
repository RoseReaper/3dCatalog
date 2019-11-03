<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Software</title>
</head>
<body>

	<ul>
	<c:forEach items="${softwares}" var="s">
		<li><c:out value="${s.name}"/></li>
	</c:forEach>
	</ul>

</body>
</html>