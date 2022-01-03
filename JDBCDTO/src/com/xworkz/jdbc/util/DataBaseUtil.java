package com.xworkz.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.xworkz.jdbc.constant.TrainConstant;

public class DataBaseUtil 
{
	public static Connection createConnection() {
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(TrainConstant.MYSQL_URL, TrainConstant.USERNAME,
					TrainConstant.PASSWORD);
			return connection;
		} 
		catch (SQLException e) 
		{
          e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection) {
		if (connection != null)
			try {
                connection.close();
				System.out.println("Closed the resource");
                } 
		    catch (SQLException e) 
		        {
                e.printStackTrace();
                }
	}
}
