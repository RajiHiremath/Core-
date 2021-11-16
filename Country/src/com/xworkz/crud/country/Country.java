package com.xworkz.crud.country;

public class Country {
	
	
	
	private String[] countryNames=new String[5];
	private int counter=0;
	
	
	public void addName(String name)
	{
        System.out.println("Name of Country is ".concat(String.valueOf(this.counter)));
        
		if(this.counter<this.countryNames.length)
		{
			this.countryNames[this.counter++]=name;
		}
		else
		{
			System.err.println("Cannot load,Array is fulled");
		}
	}
	
  public void deleteName(int max) {
	  
	  if(max<this.countryNames.length && max>=0) {
		  
		  System.out.println("deleting name @ index".concat(String.valueOf(max)));
		  this.countryNames[max]=null;
		  
	  }
	  else {
		  
		  System.err.println("cannot delete");
	  }
	
}
	
	//index= null
	
	public String[] getCountryNames() {
		return countryNames;
	}
	
	

}
