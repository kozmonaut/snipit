<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		    <h1>Users</h1>
		    <p>List of all users.</p>
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
				<p><span class="btn btn-info">${user.role}</span></p>
			    </div>
			</div>
		    </div>
		</c:forEach>
	    </div>
	</section>
    </body>
</html>