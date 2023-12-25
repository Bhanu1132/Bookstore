<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*, test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditBookDetails</title>
</head>
<body>
	<%
		BookBean bb = (BookBean)request.getAttribute("arraylistbookbean");
		String msg = (String)request.getAttribute("msg");
		out.println(msg);
		out.println("Book Code : " + bb.getCode() + "<br>");
	%>
	<form method="post"  action="update">
		<input type="hidden" name="code"  value=<%=bb.getCode() %>>
		Enter Price: <input type="text"  name="price"  value=<%=bb.getPrice()%>><br><br>
		Enter Qty: <input type="text"  name="qty"  value=<%=bb.getQty()%>><br><br>
		<input type="submit"  value="UpdateBook"><br><br>
	</form>
</body>
</html>