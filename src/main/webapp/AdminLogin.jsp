<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminLoginSuccessfull</title>
</head>
<body>
	<%
		AdminLoginBean alb = (AdminLoginBean)session.getAttribute("adminloginbean");
		String msg = (String)request.getAttribute("msg");
		out.println(msg);
		out.println("Welcome Admin : " + alb.getuName() + "<br>");
	%>
	<button><a href="AddBook.html">AddBook</a></button>
	<button><a href="view1allbooks">ViewAllBooks</a></button>
	<button><a href="logout">Logout</a></button>
</body>
</html>