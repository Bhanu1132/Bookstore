package test;
import java.io.*;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/buybook")
public class BuyBookServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
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
			int rqty = Integer.parseInt(req.getParameter("rqty"));
			int k = new BuyBookDAO().buybook(bb, rqty);	
			if(k>0)
			{
				req.setAttribute("arraylistbookbean", bb);
				req.getRequestDispatcher("BuyBook.jsp").forward(req, res);
			}
		}//end of if-else
	}
}
