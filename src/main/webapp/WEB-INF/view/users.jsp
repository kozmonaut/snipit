<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
    <head>
	<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Users</title>
    </head>
    <body>
	<section>
	    <div class="jumbotron">
		<div class="container">
		    <h2>Users</h2>
		    <p>List of all users.</p>
		</div>
		<div class="pull-right" style="padding-right:50px">
		    <a href="?language=en"><span class="btn btn-info">EN</span></a>|<a href="?language=hr"><span class="btn btn-info">HR</span></a> 
		    <a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btn-mini pull-right">Logout</a>
		</div>
	    </div>
	</section>
	<section class="container">
	    <div class="row">
		<c:forEach items="${users}" var="user">
		    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
			<div class="thumbnail">
			    <div class="caption">
				<h3><b>${user.userId}</b> - ${user.name}</h3>
				<p><span class="label label-info">${user.role}</span></p>
			    </div>
			</div>
		    </div>
		</c:forEach>
	    </div>
	</section>
    </body>
</html>