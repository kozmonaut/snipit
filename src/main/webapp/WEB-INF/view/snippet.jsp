<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
	<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Snippet</title>
    </head>
    <body>
	<section>
	    <div class="jumbotron">
		<div class="container">
		    <h1>Snippet details</h1>
		</div>
	    </div>
	</section>
	<section class="container">
	    <div class="row">
		<div class="col-md-5">
		    <h3>${snippet.name}</h3>
		    <p>${snippet.description}</p>
		    <p><strong>Label:</strong><span class="label label-warning">${snippet.label}</span></p>
		    <p><strong>Creation date:</strong>${snippet.creationDate}</p>
		    <p><strong>Project:</strong>${snippet.project}</p>
		    <p><strong>Popularity:</strong>${snippet.popularity}</p>
		    <p style="background-color:#ddd;padding:5px;">${snippet.code}</p>
		    <a href="#" class="btn btn-warning btn-large"><span class="glyphicon-plus glyphicon"/>Add to collection</a>
		</div>
	    </div>
	</section>
    </body>
</html>