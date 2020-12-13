package com.mvc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample 
{
public static Connection Connectivity() throws ClassNotFoundException, SQLException{
	
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Apollo";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}
}
}
