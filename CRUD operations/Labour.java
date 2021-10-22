package com.xworkz.crud;

public class Labour {
       private String[] laboursName=new String[5];
       private int counter;
    public void addName(String name)
    {
    	System.out.println("Name of the Labour is :".concat(name));
    	this.laboursName[this.counter++]=name;
    	
    }
    public String[] getName()
    {
    	return laboursName;
    }
    public void deleteName(int counter)
    {
     if(counter>=0 && counter<this.laboursName.length)
      {
         this.laboursName[counter]=null;     
      }
     else
     {
    	 System.out.println("Cannot add counter");
     }
    }	
    public void updateName(int yy,String name)
    {
    	this.laboursName[yy]=name;
    }
    public void displayDetails()
    {
    	for(int h=0;h<this.laboursName.length;h++)
    	{
    		String store =this.laboursName[h];
    		System.out.println(store);
    		
    	}
    }
}
