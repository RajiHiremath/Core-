package com.xworkz.crud;
//country
public class Airport {
	private String[] airportsName=new String[5];
    private int counter;
 public void addName(String name)
 {
 	System.out.println("Name of the Airport is :".concat(name));
 	this.airportsName[this.counter++]=name;
 }
 public String[] getName()
 {
 	return airportsName;
 }
 public void deleteName(int counter)
 {
  if(counter>=0 && counter<this.airportsName.length)
   {
      this.airportsName[counter]=null;     
   }
  else
  {
 	 System.out.println("Cannot add counter");
  }
 }	
 public void updateName(int yy,String name)
 {
 	this.airportsName[yy]=name;
 }
 public void displayDetails()
 {
 	for(int h=0;h<this.airportsName.length;h++)
 	{
 		String store =this.airportsName[h];
 		System.out.println(store);
  	}
 }
}

