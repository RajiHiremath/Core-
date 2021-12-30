package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.FestivalConstant;
import com.xworkz.jdbc.dto.FestivalDTO;
import com.xworkz.jdbc.util.DBUtil;

public class FestivalDAO 
{
	public boolean save(FestivalDTO festivalDTO) {
		
		Connection mysql = null;
		try {
			Class.forName(FestivalConstant.DRIVER);
			mysql =DBUtil.createConnection();
			
				String sql = "insert into fest_details values(?,?,?,?)";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(1, festivalDTO.getId());
				pstmt.setObject(2, festivalDTO.getName());
				pstmt.setObject(3, festivalDTO.getDate());
				pstmt.setObject(4, festivalDTO.getState());
				
				int rowsAffected=pstmt.executeUpdate();
				System.out.println("Formated output :" +rowsAffected);

				if (rowsAffected == 1) {
					return true;
				}
			
		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally 
		{
			  DBUtil.closeConnection(mysql);
			}
		

		return false;
	}

	public boolean deleteById(int id) {
		
		Connection mysql = null;
		try {
			Class.forName(FestivalConstant.DRIVER);
			mysql = DBUtil.createConnection();
			
				String sql = "delete from fest_details where f_id=?";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(1, id);
				
				int rowsAffected=pstmt.executeUpdate();
				System.out.println("Formated output :" +rowsAffected);

                if(rowsAffected==1)
				return true;

			
		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally 
		{
			DBUtil.closeConnection(mysql);
		}

		return false;
	}
	public void displayById(int id)
	{
		Connection mysql=null;
		try {
			mysql=DBUtil.createConnection();
			
			String sql="SELECT * FROM fest_details where country_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				Object fid=rs.getObject(1);
				System.out.println("id- "+fid);
				Object name=rs.getObject(2);
				System.out.println("name - "+name);
				Object date=rs.getObject(3);
				System.out.println("date- "+date);
				Object state=rs.getObject(4);
				System.out.println("state -"+state);
				
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
			
			
			String sql="SELECT* from fest_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				System.err.println("row Started");
				Object fid=rs.getObject(1);
				Object name=rs.getObject(2);
				Object date=rs.getObject(3);
				Object state=rs.getObject(4);
				System.out.println("Festival id- "+fid+" "+"Name- "+name+" "+"Date- "+date+" "+"State- "+state);
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
			String sql="SELECT COUNT(*) from fest_details";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			int count=rs.getInt(1);
			System.out.println("Number of rows added in fest_details table is :"+count);
			}
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
	}

}
