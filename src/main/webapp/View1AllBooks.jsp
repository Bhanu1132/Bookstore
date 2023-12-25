<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*, test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewAllBooks</title>
</head>
<body>
	<%
		ArrayList<BookBean> al = (ArrayList<BookBean>)session.getAttribute("arraylist");
		String msg = (String)request.getAttribute("msg");
		out.println(msg);
		Iterator<BookBean> it = al.iterator();
		while(it.hasNext())
		{
			BookBean bb = it.next();
			out.println(bb.getCode()+ "&nbsp&nbsp" + bb.getName() + "&nbsp&nbsp" +
					bb.getAuthor() + "&nbsp&nbsp" +bb.getPrice() + "&nbsp&nbsp" +
					bb.getQty() + "&nbsp&nbsp" + "<a href='edit?code="+bb.getCode()+"'>Edit</a>" +
					"&nbsp&nbsp" + "<a href='delete?code="+bb.getCode()+"'>Delete</a><br>");
		}//end of loop
	%>
	<button><a href="AddBook.html">AddBook</a></button>
	<button><a href="logout">Logout</a></button>
</body>
</html>