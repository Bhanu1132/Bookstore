<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invalid Login</title>
</head>
<body>
	<%
		CustomerLoginBean clb = (CustomerLoginBean)session.getAttribute("customerloginbean");
		String msg = (String)request.getAttribute("msg");
		out.println(msg);
		out.println("Welcome Customer : " + clb.getuName() + "<br>");
	%>
	<button><a href="view2allbooks">ViewAllBooks</a></button>
	<button><a href="logout">Logout</a></button>
	
</body>
</html>