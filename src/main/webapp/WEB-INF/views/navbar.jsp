<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/home" var="home" />
<c:url value="/contentadd" var="contentadd" />
<c:url value="/typeadd" var="typeadd" />
<c:url value="/genderadd" var="genderadd" />
<c:url value="/generationadd" var="generationadd" />
<c:url value="/creatoradd" var="creatoradd" />
<c:url value="/websiteadd" var="websiteadd" />
<c:url value="/softwareadd" var="softwareadd" />
<c:url value="/typelist" var="typelist" />
<c:url value="/genderlist" var="genderlist" />
<c:url value="/generationlist" var="generationlist" />
<c:url value="/creatorlist" var="creatorlist" />
<c:url value="/websitelist" var="websitelist" />
<c:url value="/softwarelist" var="softwarelist" />

<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="${home}">3D Catalog</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active">
				<a class="nav-link" href="${home}">Home<span class="sr-only">(current)</span></a>
			</li>
			<li class ="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Display a list</a>
			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
			        	<a class="dropdown-item" href="${home}">Content</a>
			        	<a class="dropdown-item" href="${typelist}">Type</a>
			        	<a class="dropdown-item" href="${genderlist}">Gender</a>
			        	<a class="dropdown-item" href="${generationlist}">Generation</a>
			        	<a class="dropdown-item" href="${creatorlist}">Creator</a>
			        	<a class="dropdown-item" href="${websitelist}">Website</a>
			        	<a class="dropdown-item" href="${softwarelist}">Software</a>
			        </div>
			</li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Add</a>
			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
			        	<a class="dropdown-item" href="${contentadd}">Content</a>
			        	<a class="dropdown-item" href="${typeadd}">Type</a>
			        	<a class="dropdown-item" href="${genderadd}">Gender</a>
			        	<a class="dropdown-item" href="${generationadd}">Generation</a>
			        	<a class="dropdown-item" href="${creatoradd}">Creator</a>
			        	<a class="dropdown-item" href="${websiteadd}">Website</a>
			        	<a class="dropdown-item" href="${softwareadd}">Software</a>
			        </div>
			</li>
<!-- 			<li class="nav-item dropdown"> -->
<!-- 				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" -->
<!-- 				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Modify</a> -->
<!-- 			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink"> -->
<!-- 			        	<a class="dropdown-item" href="#">Content</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Type</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Gender</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Generation</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Creator</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Website</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Software</a> -->
<!-- 			        </div> -->
<!-- 			</li> -->
<!-- 			<li class="nav-item dropdown"> -->
<!-- 				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" -->
<!-- 				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Delete</a> -->
<!-- 			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink"> -->
<!-- 			        	<a class="dropdown-item" href="#">Content</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Type</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Gender</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Generation</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Creator</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Website</a> -->
<!-- 			        	<a class="dropdown-item" href="#">Software</a> -->
<!-- 			        </div> -->
<!-- 			</li> -->
		</ul>
	</div>
</nav>