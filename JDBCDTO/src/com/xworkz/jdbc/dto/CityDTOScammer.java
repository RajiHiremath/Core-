package com.xworkz.jdbc.dto;
import com.xworkz.jdbc.dao.CityDAO;

public class CityDTOScammer {

	public static void main(String[] args) {
		
      CityDTO city=new CityDTO(2, "Gangavti", 345678, "mirchi");
      CityDTO city1=new CityDTO(3, "Davangere", 567890, "Benne dosa");
      CityDTO city2=new CityDTO(4, "Mundargi",45689,"gudda");
      
      CityDAO dao=new CityDAO();
      dao.save(city2);
      dao.save(city1);
      
      boolean delete=dao.deleteById(3);
		 System.out.println(delete);
		 
		 boolean found=dao.deleteById(1);
		 System.out.println(found);
		 
		 dao.displayById(2);
		 dao.displayAll();
		 dao.displayTotalRows();
	}

}
