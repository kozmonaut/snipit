<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		    <h1>${greeting}</h1>
		    <p>${subtitle}</p>
		</div>
		<a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btn-mini pull-right">Logout</a>
	    </div>
	</section>
    </body>
</html>