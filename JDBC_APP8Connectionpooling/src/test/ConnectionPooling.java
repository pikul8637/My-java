package test;
import java.sql.*;
import java.util.Vector;
public class ConnectionPooling {
public String dburl,uname,pword;
public ConnectionPooling(String dburl,String uname,String pword)
    {
	   this.dburl=dburl;
	   this.uname=uname;
	   this.pword= pword;
	}
public Vector<Connection> v=new Vector<Connection>();
public void creatConnections()
  {
	try {
		   while( v.size()<5)
		   {
			   System.out.println("pool is not full...");
			   Connection con=DriverManager.getConnection
					   (dburl,uname,pword);
			   v.add(con);
			   System.out.println(con);
		   }//end of loop
		   if(v.size()==5)
		   {
			   System.out.println("pool is full....");
		   }
	    }catch(Exception e)
	         {e.printStackTrace();}
  }//end of Method
public synchronized Connection useConnection()
          {
	        Connection con=v.elementAt(0);//Taking the element from vector
	        v.removeElementAt(0);///Element deleted from vector
			return con;
          }//end of syncro method.
public synchronized void returnConnection(Connection con)
     {
	   v.addElement(con);//Adding connection back to vector
	   System.out.println("connecton added back to pool");
     }
}
