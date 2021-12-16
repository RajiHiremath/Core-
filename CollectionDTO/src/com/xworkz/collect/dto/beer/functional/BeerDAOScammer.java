package com.xworkz.collect.dto.beer.functional;

import com.xworkz.collect.dto.beer.BeerDAO;

public class BeerDAOScammer {

	public static void main(String[] args) {
	
		BeerDAO beerDAO=new BeerDAO();

		StringMatch stringMatch=new FindMatch();
		boolean result=beerDAO.Find(stringMatch, "KingFisher");
		System.out.println(result);


		StringMatch stringMatch1=new FindMatchCaseInsensitive();
		boolean result1=beerDAO.Find(stringMatch1, "KINGfisher");
		System.out.println(result1);

		StringMatch stringMatch2=new FindMatchStartsWith();
		boolean result2=beerDAO.Find(stringMatch2, "ZEr");
		System.out.println(result2);


		StringMatch stringMatch3=new FindMatchEndsWith();
		boolean result3=beerDAO.Find(stringMatch3, "uiy");
		System.out.println(result3);
         
         
	}

}
