package com.xworkz.crud;

public class ResortStarter {

	public static void main(String[] args) {
		Resort resort=new Resort("Capital club");
		String name=resort.getName();
        System.out.println(name);
		
		
		resort.addName("Jacked resorts");
		resort.addName("Behinde wood");
		resort.addName("Eagliridg");
		resort.addName("SonShine resort");
		resort.addName("Aiynna");
		resort.addName("Aiynna");
		
		resort.displayResort();

	}

}
