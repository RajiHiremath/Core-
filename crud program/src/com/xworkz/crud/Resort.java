package com.xworkz.crud;

public class Resort
{
      private String name;
      
    private String[] treats1=new String[5];
    private int counter=0;
    
    
    public Resort()
    {
    	this("kavya");
    	System.out.println("invoked default const");
    }
    public Resort(String name)
    {
    	
    	System.out.println("invoked parameterized const");
    	this.name=name;
    	
    }
    public String getName()
    {
    	return name;
    }
    
    public void addName(String name)
    {
    	System.out.println("The name of resort is :".concat(name));
    	if(this.counter<5) 
    	{
    		this.treats1[this.counter]=name;
    		this.counter++;
    	}
    	else
    	{
    		System.err.println("array is full");
    	}
    }
   
    public void displayResort()
    {
    	System.out.println("invoked displayResort");
    	for(int i=0;i<this.treats1.length;i++)
    	{
    	  String name=this.treats1[i];
    	  System.out.println(name);
    	}
    }
}
