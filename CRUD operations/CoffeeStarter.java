package com.xworkz.crud;

public class CoffeeStarter {

	public static void main(String[] args) {
		
		Coffee coffee=new Coffee();
		
		coffee.addName("DaviDofi");
		coffee.addName("Country Bean");
		coffee.addName("Rage");
		coffee.addName("House Blend");
		coffee.addName("McCafe");
		
		String [] array=coffee.getName();
		for(int i=0;i<array.length;i++)
		{
			String sname=array[i];
			System.out.println(sname);
		}
		
		coffee.deleteName(3);
		coffee.displayDetails();
		
		coffee.updateName(3,"sri");
		coffee.displayDetails();
	}
}


