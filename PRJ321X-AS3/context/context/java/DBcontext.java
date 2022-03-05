package context.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBcontext {
	private final String serverName="localhost";
	private final String dbName="ShoppingDB";
	private final String portNumber="3306";
	private final String instance="";
	private final String user="root";
	private final String password="";
	public Connection getConnection() throws Exception {
		String url="jdbc:mysql://"+serverName +":"+portNumber+"/"+instance+"/"+dbName;
		if(instance==null||instance.trim().isEmpty()) 
			url="jdbc:mysql://"+serverName+":"+portNumber +"/"+dbName;
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);	
				
	}
	
	
		
	public static void main(String[] args) throws Exception {
		System.out.print(new DBcontext().getConnection() );
		
	}

}
