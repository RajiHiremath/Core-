package com.xworkz.crud;

public class Rocket {
        private String name;
        private String type;
        private String speed;
        private int counter=0;
      private String [] crafts=new String[4];
    public Rocket(String name,String oilType,String speed)
    {
    	this.name=name;
    	this.type=type;
    	this.speed=speed;
    	System.out.println("invoked parameterisez const");
    }
    public Rocket()
    {
    	System.out.println("invoked default const");
    }
    public String getName()
    {
    	return name;
    }
    public String getType()
    {
    	return type;
    }
    public String getSpeed()
    {
    	return speed;
    }
    public void addName(String name)
    {
    	System.out.println("Name of Rocket is :".concat(name));
    	if(counter<4)
   	 {
   		 this.crafts[this.counter]=name;
   		 this.crafts[this.counter]=type;
   		 this.crafts[this.counter]=speed;
   		 counter++;
   	 }
   	 else
   	 {
   		 System.err.println("Array is fulled");
   	 }
    }
    public void addType(String type)
    {
    	System.out.println("Type of Rocket is :".concat(type));
    }
    public void addSpeed(String speed)
    {
    	System.out.println("Speed of Rocket is :".concat(speed));
    }
    public void displayRocket()
    {
    	System.out.println("///");
    	for(int i=0;i<this.crafts.length;i++)
    	{
    	  String name=this.crafts[i];
    	  System.out.println(name);
    	}
    	
    }
}
