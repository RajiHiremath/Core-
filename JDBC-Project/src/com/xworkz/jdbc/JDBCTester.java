package com.xworkz.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {

	public static void main(String[] args) {
		Connection connect=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/club";
			String username="root";
			String password="@rajeshwari7";
			
			connect=DriverManager.getConnection(url,username,password);
			if(!connect.isClosed())
			{
				System.out.println("connection is open");
				String sql="Insert into club_details values(2,'Bangalore Golf','High Grounds,Bangalore',4,1300)";
				Statement statement=connect.createStatement();
				int rowsAffected=statement.executeUpdate(sql);
				System.out.println("Total rows affected :"+rowsAffected );
				
				String sql1="Insert into club_details values(3,'Bangalore Turf','Race Course Road',7,1700)";
				Statement statement1=connect.createStatement();
				int rowsAffected1=statement1.executeUpdate(sql1);
				System.out.println("Total rows affected :"+rowsAffected1 );
				
				String sql2="Insert into club_details values(4,'Catholic','Chikkapet',6,900)";
				Statement statement2=connect.createStatement();
				int rowsAffected2=statement2.executeUpdate(sql2);
				System.out.println("Total rows affected :"+rowsAffected2 );
				
				String sql3="Insert into club_details values(5,'Century club','CubbonPark',10,2100)";
				Statement statement3=connect.createStatement();
				int rowsAffected3=statement3.executeUpdate(sql3);
				System.out.println("Total rows affected :"+rowsAffected3 );
				
				String sql4="Insert into club_details values(6,'Citi Nest','Indiranagar',5,1500)";
				Statement statement4=connect.createStatement();
				int rowsAffected4=statement4.executeUpdate(sql4);
				System.out.println("Total rows affected :"+rowsAffected4 );
				
				String sql5="Insert into club_details values(7,'Estate Club','Gulimangala',8,2500)";
				Statement statement5=connect.createStatement();
				int rowsAffected5=statement5.executeUpdate(sql5);
				System.out.println("Total rows affected :"+rowsAffected5 );
				
	
				
			}
			System.out.println("after driver class is loading and registered");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connect!=null)
			{
				try {
					connect.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				System.out.println("connection is finally closed");
				
			}
		}
		

	}

}
