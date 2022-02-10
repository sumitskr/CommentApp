<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<script>

var request;
function sendInfo()
	{	
	var v=document.vinform.textareacomment.value;
	var url="postcommentservlet?val="+v;
	if(window.XMLHttpRequest)
		{
		request = new XMLHttpRequest();
		}
	else if(window.ActiveXObject)
		{
		request = new ActiveXObject("Microsoft.XMLHTTP");
		}
	
	try
		{
		request.onreadystatechange = getInfo;
		request.open("GET",url,true);
		request.send();
		}
	catch(e)
		{
		alert("unable to conect to server");
		}
	}
	function getInfo(){
		if(request.readyState==4)
			{
			var val = request.responseText;
			document.getElementById('demo').innerHTML=val;
			}
	}
</script>
<script>
	window.onload = setInterval(function getcomments(){
		
		var url="showallcomennts";
		if(window.XMLHttpRequest)
			{
			request = new XMLHttpRequest();
			}
		else if(window.ActiveXObject)
			{
			request = new ActiveXObject("Microsoft.XMLHTTP");
			}
		
		try
			{
			request.onreadystatechange = getInfo;
			request.open("GET",url,true);
			request.send();
			}
		catch(e)
			{
			alert("unable to conect to server");
			}
		},1000)
		function getInfo(){
			if(request.readyState==4)
				{
				var val = request.responseText;
				document.getElementById('demo').innerHTML=val;
				}
	}

</script>
<script>

	
</script>

<meta charset="ISO-8859-1">
<title>CommentApp - comment</title>
</head>
<body style="padding:50px">
<marquee>
		<h1>This is an CommentApp</h1>
	</marquee>
<h1>post your comment</h1>
<%
	
	String session_username1 = (String)session.getAttribute("session_username");
	out.print(session_username1);
	
	
	//SQL QUERIES 
	
	
	
%>
<form action="logoutservlet" method="post">

<button type="submit">log out </button>
</form>
<form name="vinform">
	<textarea id="textareacomment" name="textareacomment" rows="4" cols="50">
	
	</textarea>
	<input type="button" value="post comment" onClick="sendInfo()">
</form>
<span id="demo"></span>

</body>
</html>