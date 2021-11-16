package com.xworkz.crud.country;

public class CountryTester {

	public static void main(String[] args) {
		
		
		Country country= new Country();
		country.addName("India");
		country.addName("USA");
		country.addName("russia");
		country.addName("japan");
		country.addName("keenya");
		
		
		
		//index is full
		country.addName("germany"); 
		System.out.println("****");
		country.deleteName(4);
		

	}

}
