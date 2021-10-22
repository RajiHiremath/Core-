package com.xworkz.crud;

public class CoolDrinksRunner {

	public static void main(String[] args) {
		CoolDrinks cooldrinks=new CoolDrinks();
		
		cooldrinks.addName("Mirenda");
		cooldrinks.addName("Sip On");
		cooldrinks.addName("Red Bull");
		cooldrinks.addName("Swing");
		cooldrinks.addName("Coco Cola");
		cooldrinks.addName("Coco Cola");
		cooldrinks.addName("Coco Cola");
		
		String [] array=cooldrinks.getName();
	    for(int u=0;u<array.length;u++)
	    {
	    	String sname=array[u];
	    	System.out.println(sname);
	    }
	    cooldrinks.deleteName(4);
	    
	    
	  
	    cooldrinks.displayNames();
	    
	    cooldrinks.update(3,null);
	    cooldrinks.displayNames();
	
	    }
	
}
