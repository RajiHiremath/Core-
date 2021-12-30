package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.CityConstant;
import com.xworkz.jdbc.constant.CountryConstant;
import com.xworkz.jdbc.dto.CountryDTO;
import com.xworkz.jdbc.util.DBUtil;

public class CountryDAO 
{
	public boolean save(CountryDTO countryDTO) {
		
		Connection mysql = null;
		try {
			Class.forName(CityConstant.DRIVER);
			mysql = DBUtil.createConnection();
			
				String sql = "insert into country_details values(?,?,?,?)";
				PreparedStatement pstmt=mysql.prepareStatement(sql);
				pstmt.setObject(1, countryDTO.getId());
				pstmt.setObject(2, countryDTO.getName());
				pstmt.setObject(3, countryDTO.getCode());
				pstmt.setObject(4, countryDTO.getContinent());
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
			
				String sql = "delete from country_details where c_id=?";
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
			
			String sql="SELECT * FROM country_details where country_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				Object cid=rs.getObject(1);
				System.out.println("id- "+cid);
				Object cname=rs.getObject(2);
				System.out.println("name - "+cname);
				Object code=rs.getObject(3);
				System.out.println("code- "+code);
				Object continent=rs.getObject(4);
				System.out.println("continent -"+continent);
				
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
			
			
			String sql="SELECT* from country_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet rs=stat.executeQuery();
			while(rs.next())
			{
				System.err.println("row Started");
				Object country_id=rs.getObject(1);
				Object country_name=rs.getObject(2);
				Object country_code=rs.getObject(3);
				Object country_Continent=rs.getObject(4);
				System.out.println("Country id- "+country_id+" "+"Country Name- "+country_name+" "+"Country Code- "+country_code+" "+"Country Continent- "+country_Continent);
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
			String sql="SELECT COUNT(*) from country_details";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			int count=rs.getInt(1);
			System.out.println("Number of rows added in country_details table is :"+count);
			}
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
	}

}
