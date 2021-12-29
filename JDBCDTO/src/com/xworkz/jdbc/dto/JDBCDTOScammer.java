package com.xworkz.jdbc.dto;

import com.xworkz.jdbc.dao.ClubDAO;

public class JDBCDTOScammer {

	public static void main(String[] args) {
		
      ClubDTO clubdto=new ClubDTO(2, "Bangalore Golf","High Grounds,Bangalore", 5, 1200);
      //ClubDTO clubdto1=new ClubDTO(3, "Catholic","Chikkapet", 9, 2200);
      //ClubDTO clubdto2=new ClubDTO(4, "Citi Nest","Indiranagar", 10, 2500);
      
      ClubDAO dao=new ClubDAO();
      dao.save(clubdto);
     // dao.save(clubdto1);
      //dao.save(clubdto2);
	}

}
