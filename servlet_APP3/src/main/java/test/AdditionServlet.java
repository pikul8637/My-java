package test;
import java.io.*;
import javaX.servlet.*;
import javaX.servlet.annotation.*;
@webServlet("/ad")
public class AdditionServlet extends GenericServlet {
   public void service(ServletRequest req,ServletResponse res)
		   throws ServletException,IOException
   {
    PrintWriter pw=res.getWriter();
    res.setContentType("text/html");
    try
    {
    	int v1=Integer.parseInt(req.getParameter("v1"));
    	int v2=Integer.parseInt(req.getParameter("v2"));
    	int v3=v1+v2;
    	pw.println("sum: "+v3+"<br>");
    }catch(Exception e)
    pw.println("Enter only integer values..<br>");
   }
   RequestDispatcher rd = req.get RequestDispatcher("input.html");
   rd.include(req,res);
}
}


