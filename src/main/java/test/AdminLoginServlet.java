package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/adminlogin")
public class AdminLoginServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		AdminLoginBean alb = new AdminLoginDAO().adminLogin
				(req.getParameter("uname"), req.getParameter("pword"));
		if(alb==null)
		{
			req.setAttribute("msg", "Invalid Login Details...<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession();
			hs.setAttribute("adminloginbean", alb);
			req.setAttribute("msg", "***Login Process Successfull***<br>");
			req.getRequestDispatcher("AdminLogin.jsp").forward(req, res);
		}
	}
}
