package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view2allbooks")
public class View2AllBooksServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		ArrayList<BookBean> al = new View2AllBooksDAO().retrieve();
		if(al.size()==0)
		{
			req.setAttribute("msg", "No Books Are Available...<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession(false);
			hs.setAttribute("arraylist", al);
			req.setAttribute("msg", "***Available Books***<br>");
			req.getRequestDispatcher("View2AllBooks.jsp").forward(req, res);
		}
	}
}
