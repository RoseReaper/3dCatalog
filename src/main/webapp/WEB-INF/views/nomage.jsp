<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<form:form servletRelativeAction="/nomage" modelAttribute="na">
  <p><label>Nom : </label><form:input path="nom"/> <form:errors path="nom"/></p>
  <p><label>Âge : </label><form:input path="age"/> <form:errors path="age"/></p>
  <button type="submit">Envoyer</button>
</form:form>

</body>
</html>