package com.xworkz.collect.dto.juice;

public class PlaceDAOScammer {

	public static void main(String[] args) {
		
		PlaceDAO dao=new PlaceDAO();
		dao.save("Bangalore");
		dao.save("Hampi");
		dao.save("Hospet");
		dao.save("Gangavati");
		dao.save("Hassan");
		
		boolean findMatchingName=dao.findMatchingName("koppal");
		System.out.println(findMatchingName);

	boolean findMatchingCaseIngore =dao.findMatchingCaseInsensitive("haMpi");
	System.out.println(findMatchingCaseIngore);
	
	boolean findMatchStart=dao.findMatchStartsWith("ga");
	System.out.println(findMatchStart);
	
	boolean findMatchEnd=dao.findMatchEndsWith("th");
	System.out.println(findMatchEnd);
	
	
	}

}
