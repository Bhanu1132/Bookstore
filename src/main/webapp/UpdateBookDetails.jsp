<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdatedBookDetails</title>
</head>
<body>
	<%
		BookBean bb = (BookBean)request.getAttribute("arraylistbookbean");
		String msg = (String)request.getAttribute("msg");
		out.println(msg);
		out.println("Book Code : " + bb.getCode() + "<br>");
	%>
	<button><a href="view1allbooks">ViewAllBooks</a></button>
	<button><a href="logout">Logout</a></button>
</body>
</html>