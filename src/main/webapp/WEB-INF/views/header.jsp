<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/assets/datatable.css" var="datatableCss" />
<c:url value="/assets/bootstrap.min.css" var="bootstrapCss" />
<c:url value="/assets/fontawesome.all.min.css" var="fontAwesomeCss" />
<c:url value="/assets/style.css" var="myCss" />
<c:url value="/assets/jquery-3.4.1.js" var="jqueryJs" />
<c:url value="/assets/datatable.js" var="datatableJs" />

<link rel="stylesheet" href="${datatableCss}" />
<link rel="stylesheet" href="${bootstrapCss}" />
<link rel="stylesheet" href="${fontAwesomeCss}" />
<link rel="stylesheet" href="${myCss}" />

<script type="text/javascript" charset="utf8" src="${jqueryJs}"></script>
<script type="text/javascript" charset="utf8" src="${datatableJs}"></script>
<script>
	$(document).ready(function() {
		$('#contentlist').DataTable();
	});
</script>