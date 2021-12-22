package com.presentation.mobile;

public class MobilePhone 
{
 String brand;
 String color;
 int price;
 float weight;
 
  public MobilePhone()
  {
	  System.out.println("invoked no-arg constructor");
  }
 
  public MobilePhone(String brand)
  {
	  System.out.println("invoked string brand of the mobile phone");
	  this.brand=brand;
  }
  public MobilePhone(String brand,String color)
  {
	  System.out.println("invoked String brand and String color of mobile phone");
	  this.brand=brand;
	  this.color=color;
  }
  public MobilePhone(String brand,String color,int price)
  {
	  System.out.println("invoked String brand,String color and int price");
	  this.brand=brand;
	  this.color=color;
	  this.price=price;
  }
}
