package com.xworkz.jdbc.dto;

import com.xworkz.jdbc.dao.CountryDAO;

public class CountryDTOScammer {

	public static void main(String[] args) {
		CountryDTO country1 = new CountryDTO(2, "India",+91,"Asia");
		CountryDTO country2 = new CountryDTO(3, "Sri Lanka",+94,"Asia");
		CountryDTO country3 = new CountryDTO(4, "West Indies",+29,"North America");

		CountryDAO dao = new CountryDAO();
		dao.save(country1);
		dao.save(country2);
		dao.save(country3);
		

		boolean delete=dao.deleteById(3);
		System.out.println(delete); 
		
		 
		 dao.displayById(3);
		 dao.displayAll();
		 dao.displayTotalRows();

	}

}
