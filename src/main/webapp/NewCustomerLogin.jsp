<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Succesfully</title>
</head>
<body>
	<%
		String msg = (String)request.getAttribute("msg");
		out.println(msg);
		out.println("==Perform Login Process==<br>");
	%>
	<jsp:include page="CustomerLogin.html"></jsp:include>
</body>
</html>