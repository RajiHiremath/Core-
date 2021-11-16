package com.xworkz.crud;

public class WaterfallStarter {

	public static void main(String[] args) {
		Waterfall fall=new Waterfall();
		String name=fall.getName();
		System.out.println(name);
		String location=fall.getLocation();
		System.out.println(location);
		
		fall.addName("Jog Falls");
		fall.addLocation("Shimoga");
		
		fall.addName("Shathodi falls");
		fall.addLocation("balagar");
		
		fall.addName("Dudhsagar falls");
		fall.addLocation("goa");
		
		fall.addName("Abbe falls");
		fall.addLocation("madikeri");
		
		fall.addName("shirle falls");
		fall.addLocation("hubli");
		
		fall.displayWaterfall();
	}
}
