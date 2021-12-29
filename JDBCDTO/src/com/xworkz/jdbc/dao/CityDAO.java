package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.CityConstant;
import com.xworkz.jdbc.dto.CityDTO;

public class CityDAO 
{
	public boolean save(CityDTO cityDTO) {
		
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(CityConstant.MYSQL_URL, CityConstant.USERNAME,
					CityConstant.PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "insert into city_details values(" + cityDTO.getId() + ",'" + cityDTO.getName() + "',"
						+ cityDTO.getPopulation() + ",'" + cityDTO.getFamousFor() + "')";
				Statement statement = mysql.createStatement();
				
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
			mysql = DriverManager.getConnection(CityConstant.MYSQL_URL, CityConstant.USERNAME,
					CityConstant.PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "delete from city_details where c_id=4";
				Statement statement = mysql.createStatement();
				
				int rowsAffected = statement.executeUpdate(sql);
				if (rowsAffected == 1)
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
