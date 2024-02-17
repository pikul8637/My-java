package test;
import java.util.*;
import java.sql.*;
public class Dbcon9 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try(s;){
        	try {
        		System.out.println("enter the custId");
        		String cid=s.nextLine();
        		System.out.println("Enter the cust First name");
        		String fname=s.nextLine();
        		System.out.println("Enter the cust last name");
        		String lname=s.nextLine();
        		System.out.println("Enter the cust hno");
        		String hno=s.nextLine();
        		System.out.println("Enter the cust sname");
        		String sname=s.nextLine();
        		System.out.println("Enter the cust city");
        		String city=s.nextLine();
        		System.out.println("Enter the cust pincode");
        		int pincode=Integer.parseInt(s.nextLine());
        		System.out.println("Enter the cust mail id");
        		String mid=s.nextLine();
        		System.out.println("Enter the cust phno");
        		long phno=Long.parseLong(s.nextLine());
        		Connection con = DriverManager.getConnection
       ("jdbc:oracle:thin:@localhost:1521:ORCL","system","Adarsha00");
        		CallableStatement cs=con.prepareCall
        	    ("{call CustInsert52(?,?,?,?,?,?,?,?,?)}");
        		cs.setString(1, cid);
        		cs.setString(2, fname);
        		cs.setString(3, lname);
        		cs.setString(4, hno);
        		cs.setString(5, sname);
        		cs.setString(6, city);
        		cs.setInt(7, pincode);
        		cs.setString(8, mid);
        		cs.setLong(9, phno);
        		cs.execute();
        		System.out.println("procedure executed successfuly");
        		System.out.println("CustData updated----");
        		//System.out.println("data:"+cs);
        	}catch(Exception e) {e.printStackTrace();}
        }//end of try
	}//end of try with resource
}
