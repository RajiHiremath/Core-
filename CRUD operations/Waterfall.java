package com.xworkz.crud;

public class Waterfall {
      private String name;
      private String location;
      private int counter=0;
     private String[] falls=new String[4];
   public Waterfall()
   {
	   System.out.println("invoked default const");
   }
   public Waterfall(String name,String location)
   {
	   this.name=name;
	   this.location=location;
	   System.out.println("invoked String and String const");
   }
   public String getName()
   {
	   return name;
   }
   public String getLocation()
   {
	   return location;
   }
   public void addName(String name)
   {
	   System.out.println("Name of Waterfall is :".concat(name));
	   if(counter<4)
	   	 {
	   		 this.falls[this.counter]=name;
	   		 this.falls[this.counter]=location;
	   		 counter++;
	   	 }
	   	 else
	   	 {
	   		 System.err.println("Array is fulled");
	   	 }
   }
   public void addLocation(String location)
   {
	   System.out.println("Location of Waterfall is :".concat(location));
   }
   public void displayWaterfall()
   {
	   System.out.println("invoked displayIsland");
	   for(int i=0;i<this.falls.length;i++)
	   	{
	   	  String name=this.falls[i];
	   	  System.out.println(name);
	   	}
   }
     
}
