package com.xworkz.collect.dto.fruit;

public class FruitDAOScammer {

	public static void main(String[] args) {
		
		FruitDAO fdao=new FruitDAO();
		fdao.save("Mango");
		fdao.save("Orange");
		fdao.save("Chikku");
		fdao.save("Apple");
		fdao.save("Pineapple");
		
		boolean findMatchingName=fdao.findMatchingName("Papaya");
		System.out.println(findMatchingName);

	    boolean findMatchingCaseIngore =fdao.findMatchingCaseInsensitive("WaterMELOw");
	    System.out.println(findMatchingCaseIngore);
	
	   boolean findMatchStart=fdao.findMatchStartsWith("wt");
	   System.out.println(findMatchStart);
	
	   boolean findMatchEnd=fdao.findMatchEndsWith("LE");
	   System.out.println(findMatchEnd);

	}

}
