package com.xworkz.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.jdbc.constant.DataBaseConstant;
import com.xworkz.jdbc.dto.ClubDTO;

public class ClubDAO {

	public boolean save(ClubDTO dto)
	{
		Connection mysql=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			mysql=DriverManager.getConnection(DataBaseConstant.MYSQL_URL,DataBaseConstant.USERNAME, DataBaseConstant.PASSWORD);
			
			String sql="insert into club_details values("+dto.getId()+",'"+dto.getName()+"','"+dto.getLocation()+"',"+dto.getBouncers()+",'"+dto.getEntryFees()+"')";
			java.sql.Statement stat=mysql.createStatement();
			int rowsAffected=stat.executeUpdate(sql);
			System.out.println("Formatted output : "+rowsAffected);
			if(rowsAffected==1) {
				return true;
			}
			
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if(mysql!=null)
			try 
			{
				    mysql.close();
					System.out.println("Closed the resource");
				
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return false;
	}

	public boolean deleteOperation(int id)
	{
		Connection mysql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			mysql=DriverManager.getConnection(DataBaseConstant.MYSQL_URL,DataBaseConstant.USERNAME, DataBaseConstant.PASSWORD);
			
			String sql="delete from club_details where id="+id;
			Statement stat=mysql.createStatement();
			int rowsAffected=stat.executeUpdate(sql);
			System.out.println("Formatted output : "+rowsAffected);
			if(rowsAffected==1) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			if(mysql!=null)
			try {
				
					mysql.close();
					System.out.println("Closed the resource");
				
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
			
		return false;
		
		}
}
