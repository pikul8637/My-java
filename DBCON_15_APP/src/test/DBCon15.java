package test;
import java.sql.*;
import java.util.*;
public class DBCon15 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		try(s;)
		{
			try {
				Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:ORCL","system","Adarsha00");
				DatabaseMetaData dmd=con.getMetaData();
				System.out.println("--DtabaseMetaData---");
				System.out.println("url:"+dmd.getURL());
				System.out.println
				("--Driver version:"+dmd.getDriverMajorVersion());
				System.out.println("--Driver Name:"+dmd.getDriverName());
				PreparedStatement ps=con.prepareStatement
						("insert into Emp52 values(?,?)");
				ParameterMetaData pmd=ps.getParameterMetaData();
				System.out.println("--parameterMetaData---");
				System.out.println
				("--parameter count="+pmd.getParameterCount());
				System.out.println("--ID:");
				String id=s.nextLine();
				System.out.println("--enter Name:");
				String name=s.nextLine();
				ps.setString(1, id);
				ps.setString(2,name);
				int k=ps.executeUpdate();
				if(k>0) {
					System.out.println("--Inserted successfully..");
				}
			}//catch(java.sql.SQLException se)
			//{
				//System.out.println("invalid index");
			///}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
