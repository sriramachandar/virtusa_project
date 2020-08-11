package ibc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {


	private static Connection connection = null;

	private DAO()
	{

	}

	public static Connection getNewConnection()
	{
		if(connection==null)
		{    
			try 
			{
				Class.forName("oracle.jdbc.OracleDriver");
			} 
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try 
			{
				connection =(Connection) DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","c##sai","oracle");
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

		} 
		return connection;

	}

}

