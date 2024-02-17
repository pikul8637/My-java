package test;
import java.util.*;
import java.sql.*;
import java.io.*;
public class DBCon12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:ORCL","System","Adarsha00");
				PreparedStatement ps=con.prepareStatement
						("insert into streamtab52 values(?,?)");
				System.out.println("Enter the id:");
				String id=s.nextLine();
				ps.setString(1,id);
				System.out.println("Enter fpath&fname");
				File f=new File(s.nextLine());
				FileInputStream fis=new FileInputStream(f);
				ps.setBinaryStream(2, fis,f.length());
				int k=ps.executeUpdate();
				if(k>0)
				{
					System.out.println
					("Image inserted to database Successfully");
				}
			}catch(Exception e)
			{e.printStackTrace();}
		}
	}

}
