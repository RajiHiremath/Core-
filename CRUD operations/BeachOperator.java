package com.xworkz.crud;

public class BeachOperator {

		private String name;
		private String country;
		int counter=0;
		private String[] beachNames=new String[5];
		public BeachOperator()
		{
			System.out.println("invoked public default const");
		}
        public BeachOperator(String name,String country)
        {
        	this.name=name;
        	this.country=country;
        	System.out.println("invoked public parameterised const");
        }
        public String getName()
        {
        	return name;
        }
       public void addBeachName(String name)
       {
    	 
    	   System.out.println("name :".concat(name));
    	   if(counter<4)
    	   {
    		   this.beachNames[this.counter]=name;
    		   this.counter++;
    	   }
    	   else
    	   {
    		   System.err.println("array is fulled");
    	   }
    	   
       }
       public void addCountry(String country)
       {
    	   
    	   System.out.println("country :".concat(country));
       }
       public void displayBeach()
       {
    	   System.out.println("###");
    	   		
       }
}
