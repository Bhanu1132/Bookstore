package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/addbook")
public class AddBookServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		BookBean bb = new BookBean();
		bb.setCode(req.getParameter("code"));
		bb.setName(req.getParameter("name"));
		bb.setAuthor(req.getParameter("author"));
		bb.setPrice(Float.parseFloat(req.getParameter("price")));
		bb.setQty(Integer.parseInt(req.getParameter("qty")));
		int k = new AddBookDAO().insert(bb);
		if(k>0)
		{
			req.setAttribute("bookbean", bb);
			req.setAttribute("msg", "***Book Added Successfully***<br>");
			req.getRequestDispatcher("AddBook.jsp").forward(req, res);
		}
	}
}
