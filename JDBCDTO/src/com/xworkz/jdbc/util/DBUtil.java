package com.xworkz.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.FestivalConstant;

public class DBUtil {

	public static Connection createConnection()
	{
		Connection connection;
		try {
			connection = DriverManager.getConnection(FestivalConstant.MYSQL_URL,FestivalConstant.USERNAME,FestivalConstant.PASSWORD);
			return connection;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection)
	{
		if(connection!=null)
			try {
				
					connection.close();
					System.out.println("connection is closed");
				
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
}
}