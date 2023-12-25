package test;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/buy")
public class BuyServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session has Expired...<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			String code = req.getParameter("code");
			@SuppressWarnings("unchecked")
			ArrayList<BookBean> al = (ArrayList<BookBean>)hs.getAttribute("arraylist");
			BookBean bb = null;
			Iterator<BookBean> it = al.iterator();
			while(it.hasNext())
			{
				bb = it.next();
				if(code.equals(bb.getCode()))
				{
					break;
				}
			}//end of loop
			req.setAttribute("arraylistbookbean", bb);
			req.getRequestDispatcher("Buy.jsp").forward(req, res);
		}//end of if-else
	}
}
