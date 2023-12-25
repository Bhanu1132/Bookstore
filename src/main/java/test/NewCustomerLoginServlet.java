package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/newcustomerlogin")
public class NewCustomerLoginServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		CustomerLoginBean clb = new CustomerLoginBean();
		clb.setuName(req.getParameter("uname"));
		clb.setpWord(req.getParameter("pword"));
		clb.setfName(req.getParameter("fname"));
		clb.setlName(req.getParameter("lname"));
		clb.setAddr(req.getParameter("addr"));
		clb.setmId(req.getParameter("mid"));
		clb.setPhNo(Long.parseLong(req.getParameter("phno")));
		int k = new NewCustomerLoginDAO().newcustomerLogin(clb);
		if(k>0)
		{
			@SuppressWarnings("unused")
			HttpSession  hs = req.getSession(false);
			req.setAttribute("msg", "Registeration Process Successfull...<br>");
			req.getRequestDispatcher("NewCustomerLogin.jsp").forward(req, res);
		}
	}
}
