<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*, test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoggedOutSuccessfully</title>
</head>
<body>
	<%
		String msg = (String)session.getAttribute("msg");
		out.println(msg);
		session.invalidate();
	%>
	<jsp:include page="Home.html"></jsp:include>
</body>
</html>