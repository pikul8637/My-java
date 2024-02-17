package test;
import java.sql.*;
import java.util.*;
public class DBCon11 {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
try(s;) {
	try
	{
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:ORCL","system","Adarsha00");
		System.out.println("Enter the CustId:");
		String cid=s.nextLine();
		CallableStatement cs=con.prepareCall
				("{call ?:=RetrievePhno52(?)}");
		cs.registerOutParameter(1,Types.BIGINT);
		cs.setString(2,cid);
		cs.execute();
		System.out.println("custid="+cid);
		System.out.println("phno:"+cs.getLong(1));
	}catch(Exception e)
	{e.printStackTrace();}
}
	}

}
