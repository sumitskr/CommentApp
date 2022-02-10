<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>comment app</title>
</head>
<body>
<h1>Holaaaaaaaa</h1>

<%
	
	String session_username1 = (String)session.getAttribute("session_username");
	out.print(session_username1);
	
	
	//SQL QUERIES 
	
	
	
%>
<form action="logoutservlet" method="post">

<button type="submit">log out </button>
</form>


</body>
</html>