package test;
import java.sql.*;
import java.util.Scanner;
public class DBCon10 {
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
try {
	try(s;)
	{
		System.out.println("Enter customer id:");
		String cid=s.nextLine();
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:ORCL","system","Adarsha00");
		CallableStatement cs=con.prepareCall
		("{call CustRetrieve52(?,?,?,?,?,?,?,?,?)}");
		cs.setString(1, cid);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.registerOutParameter(3, Types.VARCHAR);
		cs.registerOutParameter(4, Types.VARCHAR);
		cs.registerOutParameter(5, Types.VARCHAR);
		cs.registerOutParameter(6, Types.VARCHAR);
		cs.registerOutParameter(7, Types.INTEGER);
		cs.registerOutParameter(8, Types.VARCHAR);
		cs.registerOutParameter(9, Types.BIGINT);
		cs.execute();
		System.out.println("cid:"+cid);
		System.out.println("fName:"+cs.getString(2));
		System.out.println("lName:"+cs.getString(3));
		System.out.println("hno:"+cs.getString(4));
		System.out.println("sName:"+cs.getString(5));
		System.out.println("city:"+cs.getString(6));
		System.out.println("pincode:"+cs.getInt(7));
		System.out.println("Mid:"+cs.getString(8));
		System.out.println("phno:"+cs.getLong(9));
	}
}catch(Exception e) {
	System.out.println(e.getMessage());
	//e.printStackTrace();
	//System.out.println(e.getMessage());
}

}
}
