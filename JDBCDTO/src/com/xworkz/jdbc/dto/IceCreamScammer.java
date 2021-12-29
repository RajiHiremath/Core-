package com.xworkz.jdbc.dto;

import com.xworkz.jdbc.dao.IceCreamDAO;

public class IceCreamScammer {

	public static void main(String[] args) {
		
		IceCreamDTO iceDTO1 = new IceCreamDTO(1, "Vanilla", "Gadabad",20);
		IceCreamDTO iceDTO2 = new IceCreamDTO(2, "Buttered", "talent",30);
		

		IceCreamDAO iceDAO = new IceCreamDAO();
		
		iceDAO.save(iceDTO1);
		iceDAO.save(iceDTO2);

		boolean delete=iceDAO.deleteById(1);
		System.out.println(delete); 

	}

}
