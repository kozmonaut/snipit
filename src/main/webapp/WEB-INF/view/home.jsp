<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
    <head>
	<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>SnipIt</title>
    </head>
    <body>
	<section>
	    <div class="jumbotron">
		<div class="container">
		    <h2>${greeting}</h2>
		    <p>${subtitle}</p>
		</div>
		<div class="pull-right" style="padding-right:50px">
		    <a href="?language=en"><span class="btn btn-info">EN</span></a>|<a href="?language=hr"><span class="btn btn-info">HR</span></a> 
		    <a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btn-mini pull-right">Logout</a>
		</div>
	    </div>
	</section>
    </body>
</html>