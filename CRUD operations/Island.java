package com.xworkz.crud;

public class Island {
       private String name;
       private String country;
       private int counter=0;
     private String[] lands=new String[5];
     
   public Island()
   {
	   System.out.println("invoked default const");
   }
   public Island(String name,String country)
   {
	   this.name=name;
	   this.country=country;
	   System.out.println("invoked String and String const");
   }
   public String getName()
   {
	   return name;
   }
   public String getCountry()
   {
	   return country;
   }
   public void addName(String name)
   {
	   System.out.println("Island name is :".concat(name));
	   if(counter<4)
	   	 {
	   		 this.lands[this.counter]=name;
	   		 this.lands[this.counter]=country;
	   		 counter++;
	   	 }
	   	 else
	   	 {
	   		 System.err.println("Array is fulled");
	   	 }
   }
   public void addCountry(String country)
   {
	   System.out.println("Country of Island is :".concat(country));
   }
   public void displayIsland()
   {
	   System.out.println("invoked DisplayIsland");
	   for(int i=0;i<this.lands.length;i++)
   	{
   	  String name=this.lands[i];
   	  System.out.println(name);
   	}
   }
}
