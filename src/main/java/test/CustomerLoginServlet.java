package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/customerlogin")
public class CustomerLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		CustomerLoginBean clb = new CustomerLoginDAO().customerLogin
				(req.getParameter("uname"), req.getParameter("pword"));
		if(clb==null)
		{
			req.setAttribute("msg", "Invalid Login Process..<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession();
			hs.setAttribute("customerloginbean", clb);
			req.setAttribute("msg", "***Login Process Successfull***<br>");
			req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
		}
	}
}
