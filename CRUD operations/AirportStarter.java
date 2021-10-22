package com.xworkz.crud;

public class AirportStarter {

	public static void main(String[] args) {
		Airport airport=new Airport();
		
		airport.addName("Kempegouda Airport");
		airport.addName("Chennai Airport");
		airport.addName("Sangoli Rayanna");
		airport.addName("Dudai Airport");
		airport.addName("Indara Gandhi Airport");
		
		String [] array=airport.getName();
		for(int i=0;i<array.length;i++)
		{
			String sname=array[i];
			System.out.println(sname);
		}
		
		airport.deleteName(3);
		airport.displayDetails();
		
		airport.updateName(2,"Lokpriya Gopinath");
		airport.displayDetails();
	}
}
