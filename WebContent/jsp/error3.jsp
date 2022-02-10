<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>

	<style>
			body{
				background:white;
				
			}
			h3
			{
				text-align:center;
				color:red;
			}
			.container{
				margin-top:55px;
			}
	</style>

</head>
<body>
	<div class="warning">
		<h3>Invalid secret key or invalid username</h3>
	
	</div>
	
	<div class="container">
		<%@include  file="../html/forgot.html" %>
	</div>

</body>
</html>






















