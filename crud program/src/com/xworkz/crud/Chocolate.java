package com.xworkz.crud;

public class Chocolate {
       
	   private String brand;
	   private String name;
	   private int price;
	   private int counter=0;
	   private String[] Chocos=new String[5];
	   
    public Chocolate()
    {
    	System.out.println("invoked default const");
    }
    public Chocolate(String brand,String name,int price)
    {
    	this.brand=brand;
    	this.name=name;
    	this.price=price;
    	System.out.println("invoked parameterized const");
    }
    public String getBrand()
    {
    	return brand;
    }
    public String getName()
    {
    	return name;
    }
    public int getPrice()
    {
    	return price;
    }
    public void addChocoBrand(String brand)
    {
    	System.out.println("brand is :".concat(brand));
    	if(counter<4)
	   	 {
	   		 this.Chocos[this.counter]=name;
	   		 this.Chocos[this.counter]=brand;
	   		 counter++;
	   	 }
	   	 else
	   	 {
	   		 System.err.println("Array is fulled");
	   	 }
    }
    public void addChocoName(String name)
    {
    	System.out.println("name is :".concat(name));
    }
    public void addChocoPrice(int price)
    {
    	System.out.println("price is :"+price);
    }
    public void displayChoco()
    {
    	System.out.println("////");
    	for(int i=0;i<this.Chocos.length;i++)
    	{
    	  String name=this.Chocos[i];
    	  System.out.println(name);
    	}
    }
}
