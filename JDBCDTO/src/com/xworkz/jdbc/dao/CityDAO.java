package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.CityConstant;
import com.xworkz.jdbc.dto.CityDTO;
import com.xworkz.jdbc.util.DBUtil;

public class CityDAO 
{
	public boolean save(CityDTO cityDTO) {
		
		Connection mysql = null;
		try {
			Class.forName(CityConstant.DRIVER);
			mysql = DBUtil.createConnection();
			
				String sql = "insert into city_details values(?,?,?,?)";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(1, cityDTO.getId());
				pstmt.setObject(2, cityDTO.getName());
				pstmt.setObject(3, cityDTO.getPopulation());
				pstmt.setObject(4, cityDTO.getFamousFor());
				pstmt.executeUpdate();
				
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
			
				String sql = "delete from city_details where c_id=?";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(2, id);
				
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
			
			String sql="SELECT * FROM city_details where country_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				Object cid=rs.getObject(1);
				System.out.println("id- "+cid);
				Object cname=rs.getObject(2);
				System.out.println("name - "+cname);
				Object population=rs.getObject(3);
				System.out.println("population- "+population);
				Object famousFor=rs.getObject(4);
				System.out.println("famousFor -"+famousFor);
				
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
			
			
			String sql="SELECT* from city_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				System.err.println("row Started");
				Object cid=rs.getObject(1);
				Object cname=rs.getObject(2);
				Object population=rs.getObject(3);
				Object famousFor=rs.getObject(4);
				System.out.println("city id-" +cid+ " "+"City Name- "+cname+" "+"Population-"+population+" "+"Famous For- "+famousFor);
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
			String sql="SELECT COUNT(*) from city_details";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			int count=rs.getInt(1);
			System.out.println("Number of rows added in city_details table is :"+count);
			}
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
	}
}

