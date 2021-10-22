package com.xworkz.crud;

public class Coffee {
	
	   private String[] coffeesName=new String[5];
       private int counter;
 public void addName(String name)
  {
 	System.out.println("Name of the coffee is :".concat(name));
 	this.coffeesName[this.counter++]=name;
 	
  }
 public String[] getName()
  {
 	return coffeesName;
  }
 public void deleteName(int counter)
  {
  if(counter>=0 && counter<this.coffeesName.length)
   {
      this.coffeesName[counter]=null;     
   }
  else
  {
 	 System.out.println("Cannot add counter");
  }
 }	
 public void updateName(int yy,String name)
 {
 	this.coffeesName[yy]=name;
 }
 public void displayDetails()
 {
 	for(int h=0;h<this.coffeesName.length;h++)
 	{
 		String bin =this.coffeesName[h];
 		System.out.println(bin);
    }
 }
}

