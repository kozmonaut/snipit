<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		    <h1>Snippets</h1>
		    <p>Currently added code snippets.</p>
		</div>
	    </div>
	</section>
	<section class="container">
	    <div class="row">
		<c:forEach items="${snippets}" var="snippet">
		    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
			<div class="thumbnail">
			    <div class="caption">
				<h3><b>${snippet.project}</b> - ${snippet.name}</h3>
				<p>${snippet.description}</p>
				<p><span class="btn btn-info">${snippet.label}</span></p>
			    </div>
			</div>
		    </div>
		</c:forEach>
	    </div>
	</section>
    </body>
</html>