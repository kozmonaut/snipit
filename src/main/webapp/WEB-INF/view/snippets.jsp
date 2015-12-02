<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
    <head>
	<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Snippets</title>
    </head>
    <body>
	<section>
	    <div class="jumbotron">
		<div class="container">
		    <h2>Snippets</h2>
		    <p>Currently added code snippets.</p>

		</div>
		<div class="pull-right" style="padding-right:50px">
		    <a href="?language=en"><span class="btn btn-info">EN</span></a>|<a href="?language=hr"><span class="btn btn-info">HR</span></a> 
		    <a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btn-mini pull-right">Logout</a>
		</div>
	    </div>
	</section>
	<section class="container">
	    <div class="row">
		<c:forEach items="${snippets}" var="snippet">
		    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
			<div class="thumbnail" style="position:relative;">
			    <img src="<c:url value="/resources/images/project-bg.png"></c:url>" alt="snippet-image"/>
			    <span class="label label-info" style="top:10px;left:0;position: absolute;">${snippet.label}</span>
				 <div class="caption">
				 <h3><b>${snippet.project}</b> - <a href="<spring:url value="/snippets/snippet?id=${snippet.snippetId}" />">${snippet.name}</a></h3>
				 <p><it>${snippet.creationDate}</it></p>
				 <p>${snippet.description}</p>
				 <p><c:if test="${snippet.popularity > 5}"><span class="label label-warning">Popular</span></c:if></p>
			    </div>
			</div>
		    </div>
		</c:forEach>
	    </div>
	</section>
    </body>
</html>