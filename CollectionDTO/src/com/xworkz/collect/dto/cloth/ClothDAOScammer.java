package com.xworkz.collect.dto.cloth;

public class ClothDAOScammer {

	public static void main(String[] args) {
		
		ClothDAO clothdao=new ClothDAO();
		clothdao.save("Allen Solly");
		clothdao.save("Wrangler");
		clothdao.save("Levi’s");
		clothdao.save("Van Heusen");
		clothdao.save("Pepe Jeans");
		
		boolean findMatchingName=clothdao.findMatchingName("Levi’s");
		System.out.println(findMatchingName);

	    boolean findMatchingCaseIngore =clothdao.findMatchingCaseInsensitive("pEter england");
	    System.out.println(findMatchingCaseIngore);
	
	   boolean findMatchStart=clothdao.findMatchStartsWith("en");
	   System.out.println(findMatchStart);
	
	   boolean findMatchEnd=clothdao.findMatchEndsWith("ss");
	   System.out.println(findMatchEnd);

	}

}
