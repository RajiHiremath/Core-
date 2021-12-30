package com.xworkz.jdbc.dto;

import com.xworkz.jdbc.dao.FestivalDAO;

public class FestivalDTOScammer {

	public static void main(String[] args) {
		
		FestivalDTO festival1=new FestivalDTO(2, "ugadi", "14/01/2021", "Karnataka");
		FestivalDTO festival2=new FestivalDTO(3, "Deepavali", "4/11/2021", "Karnataka");
		FestivalDTO festival3=new FestivalDTO(4, "varamahalakshmi", "16/08/2021", "Karnataka");

		FestivalDAO dao=new FestivalDAO();
		dao.save(festival1);
		dao.save(festival2);
		dao.save(festival3);
		
		boolean found=dao.deleteById(2);
		 System.out.println(found);
		 
		 dao.displayById(2);
		 dao.displayAll();
		 dao.displayTotalRows();
	}

}
