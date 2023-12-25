<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BuyBook</title>
</head>
<body>
	<%
		BookBean bb = (BookBean)request.getAttribute("arraylistbookbean");
		out.println("***Book Purchased Successfully***<br>");
		out.println("Book Code : " + bb.getCode() + "<br>");
		out.println("Book Price : " + bb.getPrice() + "<br>");
		out.println("Required Qty : " + (Integer.parseInt(request.getParameter("rqty")))+"<br>");
		out.println("Total Amount Paid : " + (bb.getPrice() * (Integer.parseInt(request.getParameter("rqty")))) +"<br>");
	%>
	<button><a href="view2allbooks">ViewAllBooks</a></button>
	<button><a href="logout">Logout</a>
</body></button>
</html>