package com.employee.factory;
import java.sql.*;
public class FactoryConnection {
	private static Connection con=null;
	static
	{  
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lavanya","root","12345");		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
}
	public static Connection getFactoryConnection()
	{
		return con;
	}
}
