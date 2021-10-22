package com.xworkz.crud;

public class CoolDrinks {

	private String[] drinksNames=new String[5];
    private int kaju;

	public void addName(String name)
	{
System.out.println("Name of CoolDrinks is ".concat(name). concat("Index is :").concat(String.valueOf(this.kaju)));
		if(this.kaju<this.drinksNames.length)
		{
			this.drinksNames[this.kaju++]=name;
		}
		else
		{
			System.err.println("Cannot load,Array is fulled");
		}
	}
    public String[] getName()
    {
    	return drinksNames;
    }
    
   public void deleteName(int t)
	{
	if(t<this.drinksNames.length && t>=0)
		{
			this.drinksNames[t]=null;
		}
	else
		{
			System.err.println("Cannot add the timer");
		}
	}
	public void update(int t,String name)
	{
		 if(t<this.drinksNames.length && t>=0)
		 {
		    this.drinksNames[t]=name;	
		 }
	     else
		 {
			System.err.println("Cannot update the chikki");
		 }
	   
	 }
	public void displayNames()
    {
    	for(int i=0;i<this.drinksNames.length;i++)
    	{
    		System.out.println(this.drinksNames[i]);
    	}
    }
    
}
