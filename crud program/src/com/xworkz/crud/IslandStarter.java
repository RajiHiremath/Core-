package com.xworkz.crud;

public class IslandStarter {

	public static void main(String[] args) {
	 Island ice=new Island();
	 String name=ice.getName();
	 System.out.println(name);
	 String country=ice.getCountry();
	 System.out.println(country);
	 
	 ice.addName("Green Land");
	 ice.addCountry("North Altantic");
	 
	 ice.addName("New Guinia");
	 ice.addCountry("South West Altantic");
     
	 ice.addName("Boraneo");
	 ice.addCountry("Malaysia");

	 ice.addName("Sumatra");
	 ice.addCountry("North East India");

	 ice.addName("Great Britan");
	 ice.addCountry("New Europe");

     ice.displayIsland();
	}

}
