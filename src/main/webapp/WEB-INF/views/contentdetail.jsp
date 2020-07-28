<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<title>Content detail</title>
</head>
<body>
	<%@include file="navbar.jsp"%>

	<h1>Content detail</h1>

	<div class="card" style="width: 26rem;">
		<div class="card-body">
			<h2 class="card-title">${contentdetail.name}</h2>
			<c:if test="${!empty contentdetail.sku}">
				<p class="card-text">SKU: <c:out value="${contentdetail.sku}" /></p>
			</c:if>
			<c:if test="${!empty contentdetail.type}">
				<p class="card-text">Type: <c:out value="${contentdetail.type.name}" /></p>
			</c:if>
			<c:if test="${!empty contentdetail.gender}">
				<p class="card-text">Gender: <c:out value="${contentdetail.gender.name}" /></p>
			</c:if>
			<c:if test="${!empty contentdetail.generations}">
				<p class="card-text">Generation(s): 
					<c:forEach items="${contentdetail.generations}" var="gen" varStatus="loopStatus">
						<c:out value="${gen.name}" />
						<c:if test="${!loopStatus.last}">/</c:if>
					</c:forEach></p>
			</c:if>
			<c:if test="${!empty contentdetail.creators}">
				<p class="card-text">Creator(s): 
					<c:forEach items="${contentdetail.creators}" var="cr" varStatus="loopStatus">
						<c:out value="${cr.name}" />
						<c:if test="${!loopStatus.last}">/</c:if>
					</c:forEach></p>
			</c:if>
			<p><a target="_blank" href="<c:out value="${contentdetail.url}" />" class="card-link">Shop or download</a> on <c:out value="${contentdetail.website.name}" /></p>
			<c:if test="${!empty contentdetail.softwares}">
				<p class="card-text">Software: 
					<c:forEach items="${contentdetail.softwares}" var="s" varStatus="loopStatus">
						<c:out value="${s.name}" />
						<c:if test="${!loopStatus.last}">/</c:if>
					</c:forEach></p>
			</c:if>
		</div>
	</div>

	<%@include file="footer.jsp"%>

</body>
</html>