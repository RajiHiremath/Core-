package com.xworkz.crud;

public class ChocolateTester {

	public static void main(String[] args) {
		
	  Chocolate chocolate=new Chocolate("cadbury","Dairy milk",80);
	      
	      String sbrand=chocolate.getBrand();
	      System.out.println(sbrand);
	      String sname=chocolate.getName();
	      System.out.println(sname);
	      int sprice=chocolate.getPrice();
	      System.out.println(sprice);
	      
	      chocolate.addChocoBrand("cadbury");
	      chocolate.addChocoName("Dairy milk fruit and ");
	      chocolate.addChocoPrice(90);
	      chocolate.addChocoBrand("Cadbury");
	      chocolate.addChocoName("Milky Bar");
	      chocolate.addChocoPrice(99);
	      chocolate.addChocoBrand("Nestle");
	      chocolate.addChocoName("kitkat");
	      chocolate.addChocoPrice(70);
	      chocolate.addChocoBrand("Parle");
	      chocolate.addChocoName("kachamango");
	      chocolate.addChocoPrice(8);
	      chocolate.addChocoBrand("Nestle");
	      chocolate.addChocoName("Bourbon");
	      chocolate.addChocoPrice(60);
	      chocolate.addChocoBrand("Unibic");
	      chocolate.addChocoName("Almond unibic");
	      chocolate.addChocoPrice(80);
	      chocolate.displayChoco();
	      
	      
	      
		  
	  

	}

}
