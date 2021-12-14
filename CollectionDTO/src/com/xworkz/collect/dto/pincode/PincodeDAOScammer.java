package com.xworkz.collect.dto.pincode;

public class PincodeDAOScammer {

	public static void main(String[] args) {
		
		PincodeDAO dao=new PincodeDAO();
		dao.save("583227");
		dao.save("586942");
		dao.save("579684");
		dao.save("561120");
		dao.save("563289");
		
		boolean findMatchingName=dao.findMatchingName("583227");
		System.out.println(findMatchingName);
	
	    boolean findMatchStart=dao.findMatchStartsWith("85");
	    System.out.println(findMatchStart);
	
	    boolean findMatchEnd=dao.findMatchEndsWith("00");
	    System.out.println(findMatchEnd);

	}

}
