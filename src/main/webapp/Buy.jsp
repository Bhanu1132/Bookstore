<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*, test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy</title>
</head>
<body>
	<%
		BookBean bb = (BookBean)request.getAttribute("arraylistbookbean");
		out.println("***Required Qty of Books***<br>");
		out.println("Book Code : " + bb.getCode() + "<br>");
	%>
	<form method="post"  action="buybook">
		<input type="hidden"  name="code" value=<%=bb.getCode()%>><br>
		Book Qty : <input type="number"  value=<%=bb.getQty()%> disabled><br><br>
		Enter RQty : <input type="number"  name="rqty"><br><br>
		<input type="submit"  value="BuyBook">
	</form>
</body>
</html>