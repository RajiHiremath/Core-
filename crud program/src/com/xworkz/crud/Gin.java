package com.xworkz.crud;

public class Gin {
	
	private String colour;
	private String brand;
	private int counter=0;
	private String[] gins=new String[5];
	 
   public Gin()
   {
	   System.out.println("invoked default const");
   }
   public Gin(String colour,String brand)
   {
	   this.colour=colour;
	   this.brand=brand;
	   System.out.println("invoked String and String const");
   }
   public String getColour()
   {
	   return colour;
   }
   public String getBrand()
   {
	   return brand;
   }
   public void addColour(String colour)
   {
	   System.out.println("The colour is :".concat(colour));
	   if(counter<5) 
	   {
		 this.gins[this.counter]=colour;
		 counter++;
	   }
	   else
	   {
		   System.err.println("Array is fulled");
	   }
   }
   public void addBrand(String brand)
   {
	   System.out.println("The brand of gin is :".concat(brand));
   }
   public void displayGin()
   {
	   System.out.println("///");
	   for(int i=0;i<this.gins.length;i++)
   	{
   	  String colour=this.gins[i];
   	  System.out.println(colour);
   	}
   }

}
