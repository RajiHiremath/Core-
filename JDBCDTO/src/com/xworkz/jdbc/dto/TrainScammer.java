package com.xworkz.jdbc.dto;

import com.xworkz.jdbc.dao.TrainDAO;

public class TrainScammer {

	public static void main(String[] args) {
		
		TrainDTO dto1=new TrainDTO(1, 65870, "IRTC", "Gangavati", 7, 2100, "AC", "Yeshwantura Express");
		TrainDTO dto2=new TrainDTO(2, 68770, "IRTC", "Hospet", 5, 2500, "Sleeper", "Hampi Express");
		TrainDTO dto3=new TrainDTO(3, 66780, "IRTC", "Hubli", 9, 1900, "General", "Hubli Express");
		TrainDTO dto4=new TrainDTO(4, 45908, "IRTC", "Bellari", 14, 4500, "Non-AC", "Mysore Express");
		TrainDTO dto5=new TrainDTO(5, 32157, "IRTC", "Gundakal", 10, 2990, "Non-Sleeper", "Rani Chennamma Express");

		TrainDAO trainDAO = new TrainDAO();
		 trainDAO.save(dto1);
		 trainDAO.save(dto2);
		 trainDAO.save(dto3);
		 trainDAO.save(dto4);
		 trainDAO.save(dto5);
		
		 boolean delete=trainDAO.deleteByTrainNO(66780);
		 System.out.println(delete);
		 
		 boolean found=trainDAO.deleteByTrainNoAndTrainId(68770, 2);
		 System.out.println(found);
		 
		 trainDAO.getByTrainNo(32157);
		 
		 boolean count=trainDAO.updateDestinationByTrainNo("Dharwad", 45908);
		 System.out.println(count);
		 
		 boolean store=trainDAO.updateDestinationAndBoardingByTrainNo("Bijapur", "PNR", 32157);
		 System.out.println(store);
		 
		 trainDAO.getAll();
		 
		 trainDAO.getAllByBoarding("PNR");
		 
		 trainDAO.getAllByDestination("Gangavati");
		 
		 trainDAO.getTotal();
		 
		 trainDAO.getMaxPrice();
		  
		 trainDAO.getMinPrice();
		 
		 
		 
	}

}
