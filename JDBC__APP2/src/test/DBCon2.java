package test;
import java.sql.*;
import java.util.*;
public class DBCon2 {
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       try(s;) {
    	   try {
    		   System.out.println("enter empid:");
    		   String id=s.nextLine();
    		   System.out.println("enter empName:");
    		   String name=s.nextLine();
    		   System.out.println("enter Desg :");
    		   String Desg=s.nextLine();
    		   System.out.println("enter empsal:");
    		   int sal=s.nextInt();
    		 //  Class.forName("oracle.jdbc.driver.OracleDriver");--It is  auto loding
               //Loading driver
       
      Connection con = DriverManager.getConnection
       ("jdbc:oracle:thin:@localhost:1521:ORCL","system","Adarsha00");
              //Creating Connection
      Statement stm = con.createStatement();
              //Preparing statement
       int k=stm.executeUpdate
    ("insert into Emp52 values('"+id+"','"+name+"','"+Desg+"','"+sal+"')");
       if(k>0)
       {
    	 System.out.println("Record inerted Successfully....");  
       }
       con.close();
    	   }
    	   catch(InputMismatchException ime){
    		   System.out.println("Invalid input..");
    	   }
    	   catch(SQLIntegrityConstraintViolationException sicve);
    	   {
    		   System.out.println("Employee details already available---");
    	   }
    	   catch(SQLException cnfe)
    	   {
    		   cnfe.printStackTrace();
    	   }
       }//end of try with resource
	}

}
