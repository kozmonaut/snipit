<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Snippets - Add snippet</title>
    </head>
    <body>
	<section>
	    <div class="jumbotron">
		<div class="container">
		    <h2>Snippets</h2>
		    <p>Add new snippet</p>
		</div>
	    </div>
	</section>
	<section class="container">
	    <form:form modelAttribute="newSnippet" class="form-horizontal">
		<fieldset>
		    <legend>Fill the form</legend>
		    <div class="form-group">
			<label class="control-label col-lg-2 col-lg-2" for="snippetId">Snippet ID</label>
			<div class="col-lg-10">
			    <form:input id="snippetId" path="snippetId" type="text" class="form:input-large"/>
			</div>
		    </div>
		    <div class="form-group">
			<label class="control-label col-lg-2" for="name">Snippet name</label>
			<div class="col-lg-10">
			    <form:input id="name" path="name" type="text" class="form:input-large"/>
			</div>
		    </div>

		    <div class="form-group">

			<label class="control-label col-lg-2" for="description">Description</label>
			<div class="col-lg-10">
			    <form:textarea id="description" path="description" rows="2" cols="30"/>
			</div>
		    </div>

		    <div class="form-group">

			<label class="control-label col-lg-2 col-lg-2" for="label">Label</label>
			<div class="col-lg-10">
			    <form:input id="label" path="label" type="text" class="form:input-large"/>
			</div>

		    </div>
		    <div class="form-group">
			<label class="control-label col-lg-2 col-lg-2" for="project">Project</label>
			<div class="col-lg-10">
			    <form:input id="project" path="project" type="text" class="form:input-large"/>
			</div>
		    </div>
		    <div class="form-group">
			<label class="control-label col-lg-2 col-lg-2" for="productId">Code</label>
			<div class="col-lg-10">
			    <form:textarea id="code" path="code" rows="10"  cols="80" class="form:input-large"/>
			</div>
		    </div>
		    <div class="form-group">
			<div class="col-lg-offset-2 col-lg-10">
			    <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
			</div>
		    </div>
		</fieldset>
	    </form:form>
	</section>
    </body>
</html>