package com.xworkz.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.CityConstant;
import com.xworkz.jdbc.constant.StateConstant;
import com.xworkz.jdbc.dto.StateDTO;
import com.xworkz.jdbc.util.DBUtil;

public class StateDAO 
{
	public boolean save(StateDTO stateDTO) {
		
		Connection mysql = null;
		try {
			Class.forName(CityConstant.DRIVER);
			mysql = DBUtil.createConnection();
			
				String sql = "insert into icecream_details values(?,?,?,?)";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(1, stateDTO.getId());
				pstmt.setObject(2, stateDTO.getName());
				pstmt.setObject(3, stateDTO.getCode());
				pstmt.setObject(4, stateDTO.getCapital());
				
				
				int rowsAffected = pstmt.executeUpdate(sql);
				System.out.println("Formated output :" +rowsAffected );

				if (rowsAffected == 1) {
					return true;
				}
			
		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(mysql);
			}
		

		return false;
	}

	public boolean deleteById(int id) {
		
		Connection mysql = null;
		try {
			Class.forName(CityConstant.DRIVER);
			mysql = DBUtil.createConnection();
			
				String sql = "delete from state_details where c_id=?";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(1, id);
				
				int rowsAffected = pstmt.executeUpdate(sql);
				if (rowsAffected == 1)
					return true;

			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(mysql);
			}
		return false;
	}
	public void displayById(int id)
	{
		Connection mysql=null;
		try {
			mysql=DBUtil.createConnection();
			
			String sql="SELECT * FROM state_details where country_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(3, id);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				Object sid=rs.getObject(1);
				System.out.println("id- "+sid);
				Object name=rs.getObject(2);
				System.out.println("name - "+name);
				Object code=rs.getObject(3);
				System.out.println("code- "+code);
				Object capital=rs.getObject(4);
				System.out.println("capital -"+capital);
				
			}
			
		}  catch (SQLException e) {

			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
	}
	
	public void displayAll()
	{
		Connection mysql=null;
		mysql=DBUtil.createConnection();
		
		try {
			
			
			String sql="SELECT* from state_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				System.err.println("row Started");
				Object id=rs.getObject(1);
				Object name=rs.getObject(2);
				Object code=rs.getObject(3);
				Object capital=rs.getObject(4);
				System.out.println("State id- "+id+" "+"State name- "+name+" "+"State code- "+code+" "+"State capital- "+capital);
				System.err.println("row Ended");
			}
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
	}
	
	public void displayTotalRows()
	{
		Connection mysql=null;
       mysql=DBUtil.createConnection();
		
		try {
			String sql="SELECT COUNT(*) from state_details";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			int count=rs.getInt(1);
			System.out.println("Number of rows added in state_details table is :"+count);
			}
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
	}
}
