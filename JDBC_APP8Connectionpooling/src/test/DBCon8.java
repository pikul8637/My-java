package test;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DBCon8 {
	public static void main(String[] args) {
      ConnectionPooling cp=new ConnectionPooling
    ("jdbc:oracle:thin:@localhost:1521:ORCL","System","Adarsha00"); 
      cp.creatConnections();//method call
      System.out.println("***user-1***");
      Connection cn1=cp.useConnection();
      System.out.println("con at user-1:"+cn1);
      System.out.println("size of pool:"+cp.v.size());
      try {
    	    PreparedStatement ps1=cn1.prepareStatement
    	    		("select * from Bank52");
    	    ResultSet rs1=ps1.executeQuery();
    	    while(rs1.next())
    	    {
    	    	System.out.println
    	    	(rs1.getLong(1)+"\t"+
    	         rs1.getString(2)+"\t"+
    	    	 rs1.getFloat(3)+"\t"+
    	    	 rs1.getString(4));
    	    }
          }catch(Exception e) {e.printStackTrace();}
      System.out.println("***user-2***");
      Connection cn2=cp.useConnection();
      System.out.println("con at user-2:"+cn2);
      System.out.println("size of pool:"+cp.v.size());
      try {
    	    PreparedStatement ps2=cn2.prepareStatement
    	    		("select * from bank");
    	    ResultSet rs2=ps2.executeQuery();
    	    while(rs2.next())
    	    {
    	    	System.out.println
    	    	(rs2.getLong(1)+"\t"+
    	    	rs2.getString(2)+"\t"+
    	    	rs2.getFloat(3)+"\t"+
    	    	rs2.getString(4));
    	    }
          }catch(Exception e) {e.printStackTrace();}
      System.out.println("user-1");
      cp.returnConnection(cn1);
      System.out.println("size of pool:"+cp.v.size());
      System.out.println("user-2");
      cp.returnConnection(cn2);
      System.out.println("size of pool:"+cp.v.size());
      System.out.println("Display connections....");
      cp.v.forEach((k)->
      {
      System.out.println(k);
	});
}
}
