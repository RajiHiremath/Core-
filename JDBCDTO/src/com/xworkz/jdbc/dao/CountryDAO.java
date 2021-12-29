package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.CountryConstant;
import com.xworkz.jdbc.dto.CountryDTO;

public class CountryDAO 
{
	public boolean save(CountryDTO countryDTO) {
		
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(CountryConstant.MYSQL_URL, CountryConstant.USERNAME,
					CountryConstant.PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "insert into  country_details values(" + countryDTO.getId() + ",'" + countryDTO.getName() + "',"
						+ countryDTO.getCode() + ",'"+countryDTO.getContinent() +"')";
				Statement statement = mysql.createStatement();
				System.out.println(sql);
				int rowsAffected = statement.executeUpdate(sql);

				if (rowsAffected == 1) {
					return true;
				}
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

		return false;
	}

	public boolean deleteById(int id) {
		
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(CountryConstant.MYSQL_URL, CountryConstant.USERNAME,
					CountryConstant.PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection  is open");
				String sql = "delete from  country_details where c_id=3";
				Statement statement = mysql.createStatement();
				
				int rowsAffected = statement.executeUpdate(sql);
                if(rowsAffected==1)
				return true;

			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

		return false;
	}

}
