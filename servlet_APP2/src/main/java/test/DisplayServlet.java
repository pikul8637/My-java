package test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/dis")
public class DisplayServlet implements Servlet{
public void init(ServletConfig sc)throws ServletException{
//NoCode
}
public void service(ServletRequest req,ServletResponse res)
throws ServletException,IOException{
PrintWriter pw = res.getWriter();
res.setContentType("text/html");
String cd = req.getParameter("code");
String nm = req.getParameter("name");
float pr = Float.parseFloat(req.getParameter("price"));
int qt = Integer.parseInt(req.getParameter("qty"));
pw.println("====ProductDeatils====");
pw.println("<br>Code:"+cd);
pw.println("<br>Name:"+nm);
pw.println("<br>Price:"+pr);
pw.println("<br>Qty:"+qt);
pw.println("<html><body bgcolor= 'grey'>");
}

public void destroy() {
//NoCode
}
public ServletConfig getServletConfig() {
return this.getServletConfig();
}
public String getServletInfo() {
return "DisplayServlet";
}
}



