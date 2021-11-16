package com.xworkz.crud;

public class Bag {

	// no par no rT
	// no par with rt
	// no rt with par
	// with rt with pr
	public static void bagName() {

		System.out.println(" gym bag");
	}

	public static int bagPrice() {

		 return 1000;
	}
	
	public static void bagBrand(String brand) {

		 System.out.println("Brand  "+brand);
	}
	
	public static int totalBagPrice(int a,int b) {

		 return(a+b);
	}
	
	public static double totalBagPrice(int a,int b,int c) {

		 return(a+b+c);
	}

	public static void main(String[] args) {

		Bag.bagName();
		int price= Bag.bagPrice();
		System.out.println(price);
		String brand = "hp";
		Bag.bagBrand(brand);
		//Bag.totalBagPrice(1000, 2000);
		System.out.println(Bag.totalBagPrice(1000, 2000));
		System.out.println(Bag.totalBagPrice(1000, 2000,2000));
		
		
	}

}
