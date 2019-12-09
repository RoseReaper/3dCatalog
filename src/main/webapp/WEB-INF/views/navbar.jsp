<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/content" var="home" />
<c:url value="/contentadd" var="contentadd" />

<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="${home}">3D Catalog</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="${home}">Home
				<span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Add</a>
			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
			        	<a class="dropdown-item" href="${contentadd}">Content</a>
			        	<a class="dropdown-item" href="#">Type</a>
			        	<a class="dropdown-item" href="#">Figure</a>
			        	<a class="dropdown-item" href="#">Generation</a>
			        	<a class="dropdown-item" href="#">Website</a>
			        	<a class="dropdown-item" href="#">Software</a>
			        	<a class="dropdown-item" href="#">Creator</a>
			        </div>
			</li>
		</ul>
	</div>
</nav>