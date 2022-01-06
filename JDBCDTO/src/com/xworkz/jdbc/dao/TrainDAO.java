package com.xworkz.jdbc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.jdbc.constant.TrainConstant;
import com.xworkz.jdbc.dto.TrainDTO;
import com.xworkz.jdbc.util.DataBaseUtil;

public class TrainDAO 
{
	//save method
	public boolean save(TrainDTO trainDTO) {
		
		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DataBaseUtil.createConnection();

			String sql = "INSERT INTO train_details values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(1, trainDTO.getId());
			pstmt.setObject(2, trainDTO.getTrainNo());
			pstmt.setObject(3, trainDTO.getBoarding());
			pstmt.setObject(4, trainDTO.getDestination());
			pstmt.setObject(5, trainDTO.getSeatNo());
			pstmt.setObject(6, trainDTO.getPrice());
			pstmt.setObject(7, trainDTO.getClassType());
			pstmt.setObject(8, trainDTO.getName());
			int rowsAffected=pstmt.executeUpdate();
			System.out.println("Formated output :" +rowsAffected);

			if (rowsAffected == 1) 
				return true;
			
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
		DataBaseUtil.closeConnection(mysql);
		}
	   return false;
    }

	//delete by train no and id 
	 
	 public boolean deleteByTrainNoAndTrainId(int t_trainNo,int id) {

			Connection mysql = null;
			try {
				Class.forName(TrainConstant.DRIVER);
				mysql = DataBaseUtil.createConnection();

				String sql = "DELETE FROM train_details WHERE t_id=?";
				PreparedStatement pstmt = mysql.prepareStatement(sql);
				pstmt.setObject(65870, t_trainNo);
				pstmt.setObject(1, id);
	            int rowsAffected = pstmt.executeUpdate(sql);
	            System.out.println("Formated output :" + rowsAffected);
				if (rowsAffected == 1)
					return true;

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
				DataBaseUtil.closeConnection(mysql);
			}
			return false;
		}

	 //delete by train number

	public boolean deleteByTrainNO(int t_trainNo) {
		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DataBaseUtil.createConnection();

			String sql = "DELETE FROM train_details WHERE t_id=?";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(65870, t_trainNo);
			
            int rowsAffected = pstmt.executeUpdate(sql);
            System.out.println("Formated output :" + rowsAffected);
			if (rowsAffected == 1)
				return true;

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
			DataBaseUtil.closeConnection(mysql);
		}
		return false;
	}
	
	//get by train number
	public TrainDTO getByTrainNo(int train_No)
	{
		Connection mysql=null;
        mysql=DataBaseUtil.createConnection();
		TrainDTO dto=null;
		try {
			String sql="SELECT* FROM train_details WHERE train_no=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(45908, train_No);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				int id=result.getInt(1);
				System.out.println("train_id- "+id);
				int trainNo=result.getInt(2);
				System.out.println("train_No - "+trainNo);
				String boarding=result.getString(3);
				System.out.println("boarding - "+boarding);
				String destination=result.getString(4);
				System.out.println("destination -"+destination);
				int seatNo=result.getInt(5);
				System.out.println("seat_No- "+seatNo);
				int price=result.getInt(6);
				System.out.println("train_Price - "+price);
				String classType=result.getString(7);
				System.out.println("Class - "+classType);
				String name=result.getString(8);
				System.out.println("name -"+name);
				
			} 	
		
		}  
			catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		finally {
			if(mysql!=null)
			{
				try {
					mysql.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
			
		
		return null;
	}
	
	//update dest by train number
	public boolean updateDestinationByTrainNo(String newDest,int trainNo)
	{
		Connection mysql=null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql=DataBaseUtil.createConnection();
			
			String sql="Update train_details set destination=? WHERE train number=?";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			pstmt.setObject(65870, newDest);
			
			int rowsAffected=pstmt.executeUpdate();
			System.out.println("Formated output :" +rowsAffected);
			if(rowsAffected == 1) 
				return true;
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
			{
				try {
					mysql.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	
	// update dest and boarding by train number
	public boolean updateDestinationAndBoardingByTrainNo(String newDest,
			                                            String newBoarding,int trainNo)
	{
		Connection mysql=null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql=DataBaseUtil.createConnection();
			
			String sql="Update train_details set destination=? AND boarding=? WHERE train number=?";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			pstmt.setObject(65870, newDest);
			pstmt.setObject(65870, newBoarding);
			
			int rowsAffected=pstmt.executeUpdate();
			System.out.println("Formated output :" +rowsAffected);
			if(rowsAffected == 1) 
				return true;
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
			{
				try {
					mysql.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return false;
		
	}
	
	// get all trainDTO
	public Collection<TrainDTO> getAll()
	{
		Connection mysql=null;
		mysql=DataBaseUtil.createConnection();
		Collection<TrainDTO> details=new ArrayList<TrainDTO>();
		TrainDTO dto=new TrainDTO();
		try {
			String sql="SELECT * FROM train_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				int id=result.getInt(1);
				int trainNo=result.getInt(2);
				String boarding=result.getString(3);
				String destination=result.getString(4);
				int seatNo=result.getInt(5);
				int price=result.getInt(6);
				String classType=result.getString(7);
				String name=result.getString(8);
				
				dto.setId(id);
				dto.setTrainNo(trainNo);
				dto.setBoarding(boarding);
				dto.setDestination(destination);
				dto.setSeatNo(seatNo);
				dto.setPrice(price);
				dto.setClassType(classType);
				dto.setName(name);
				
				details.add(dto);
				
				System.out.println("Train_id- "+id+" "+"Train_No- "+trainNo+" "+"boarding- "+boarding+" "+"destination- "+destination+"  "+"Seat No- "+seatNo+"  "+"Ticket Price- "+price+"  "+"Class- "+classType+"  "+"name- "+name);
		      }
			}  
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		finally {
			if(mysql!=null)
			{
				try {
					mysql.close();
				}
				catch (SQLException e) {
                   e.printStackTrace();
				}
				
			}
		}
			
		return details;
	}
	
	public Collection<TrainDTO> getAllByBoarding(String boarding)
	{
		Connection mysql=null;
		Collection<TrainDTO> details=new ArrayList<TrainDTO>();
		TrainDTO dtos=new TrainDTO();
		try
		{
			mysql=DataBaseUtil.createConnection();
			String sql="SELECT * boarding train_details=?";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				String t_boarding=rs.getString(boarding);
				
				dtos.setBoarding(t_boarding);
				details.add(dtos);
			}
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(mysql!=null)
			{
				try {
					mysql.close();
				} 
				catch (SQLException e) 
				{
                    e.printStackTrace();
				}
			}
		}
		
	return details;
		
	}
	
	public Collection<TrainDTO> getAllByDestination(String destination)
	{
		Connection mysql=null;
		Collection<TrainDTO> details=new ArrayList<TrainDTO>();
		TrainDTO dtos=new TrainDTO();
		try
		{
			mysql=DataBaseUtil.createConnection();
			String sql="SELECT * destination train_details=?";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				String t_dest=rs.getString(destination);
				
				dtos.setBoarding(t_dest);
				details.add(dtos);
			}
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(mysql!=null)
			{
				try {
					mysql.close();
				} 
				catch (SQLException e) 
				{
                    e.printStackTrace();
				}
			}
		}
		
		return details;
	}
	
	public int getTotal()
	{
		Connection mysql=null;
		
		try
		{
			mysql=DataBaseUtil.createConnection();
			String sql="SELECT * FROM train_details";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				int rows=rs.getInt(1);
				System.out.println("total rows in table is:" +rows);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			if(mysql!=null)
			{
				try {
					mysql.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return 0;
		
	}
	
	public int getMaxPrice()
	{
		Connection mysql=null;
		int maxPrice=0;
		try
		{
			mysql=DataBaseUtil.createConnection();
			String sql="SELECT * Max(price) train_details";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				maxPrice=rs.getInt(getMaxPrice());
				System.out.println(maxPrice);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally
		{
			if(mysql!=null)
			{
				try {
					mysql.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	public int getMinPrice()
	{
		Connection mysql=null;
		int minPrice=0;
		try
		{
			mysql=DataBaseUtil.createConnection();
			String sql="SELECT * Min(price) train_details";
			PreparedStatement pstmt=mysql.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				minPrice=rs.getInt(getMinPrice());
				System.out.println(minPrice);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally
		{
			if(mysql!=null)
			{
				try {
					mysql.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
}
