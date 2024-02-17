package test;
import java.io.*;
import javax.Servlet.*;
import javax.Servlet.annotation.*;
@websevlet("/choice")
public class ChoiceServelet extends GenericServlet {
public void service(ServletRequest req,ServletResponse res)
		throws ServletException,IoException
		{
	String s1=req.getParameter("s1");
	if(s1.equals("Add"))
	{
		RequestDispatcher rd=req.getRequestDispatcher("ad");
		rd.forward(req,res);
		RequestDispatcher rd=req.getRequestDispatcher("sb");
		rd.forward(req,res);
		}
}
}
