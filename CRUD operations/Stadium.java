package com.xworkz.crud;

public class Stadium {
	private String[] stadiumNames=new String[5];
    private int counter;
 public void addName(String name)
 {
 	System.out.println("Name of the Stadium is :".concat(name));
 	this.stadiumNames[this.counter++]=name;
 }
 public String[] getName()
 {
 	return stadiumNames;
 }
 public void deleteName(int counter)
 {
  if(counter>=0 && counter<this.stadiumNames.length)
   {
      this.stadiumNames[counter]=null;     
   }
  else
  {
 	 System.out.println("Cannot add counter");
  }
 }	
 public void updateName(int yy,String name)
 {
 	this.stadiumNames[yy]=name;
 }
 public void displayDetails()
 {
 	for(int hh=0;hh<this.stadiumNames.length;hh++)
 	{
 		String store =this.stadiumNames[hh];
 		System.out.println(store);
  	}
 }
}


