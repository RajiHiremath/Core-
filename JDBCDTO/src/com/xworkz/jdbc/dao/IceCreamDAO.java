package com.xworkz.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.IcecreamConstant;
import com.xworkz.jdbc.dto.IceCreamDTO;

public class IceCreamDAO 
{
	public boolean save(IceCreamDTO dto) {
		
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql=DriverManager.getConnection(IcecreamConstant.MYSQL_URL, IcecreamConstant.USERNAME,
					IcecreamConstant.PASSWORD);
			if (!mysql.isClosed()) 
			{
				System.out.println("connection open");
				String sql = "insert into  icecream_details values(" + dto.getId() + ",'" + dto.getFlavour() + "','"
						+ dto.getName() + "',"+dto.getPrice() +")";
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
			mysql = DriverManager.getConnection(IcecreamConstant.MYSQL_URL, IcecreamConstant.USERNAME,
					IcecreamConstant.PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "delete from  icecream_details where cream_id=3";
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
