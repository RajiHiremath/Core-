package com.xworkz.collect.dto.country;

public class CountryDAOScammer {

	public static void main(String[] args) {
		
		CountryDAO cdao=new CountryDAO();
		cdao.save("India");
		cdao.save("AMerica");
		cdao.save("Africa");
		cdao.save("England");
		cdao.save("south Korea");
		
		boolean findMatchingName=cdao.findMatchingName("India");
		System.out.println(findMatchingName);

	    boolean findMatchingCaseIngore =cdao.findMatchingCaseInsensitive("inDIA");
	    System.out.println(findMatchingCaseIngore);
	
	   boolean findMatchStart=cdao.findMatchStartsWith("we");
	   System.out.println(findMatchStart);
	
	   boolean findMatchEnd=cdao.findMatchEndsWith("ca");
	   System.out.println(findMatchEnd);

	}

}
