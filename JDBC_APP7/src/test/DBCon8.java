package test;

public class DBCon8 {

	public static void main(String[] args) {
      ConnectionPooling cp=new ConnectionPooling
    ("jdbc:oracle:thin:@localhost:1521:ORCL","System","Adarsha00"); 
      cp.creatConnections();
	}

}
