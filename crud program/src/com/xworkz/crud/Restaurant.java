package com.xworkz.crud;

public class Restaurant {
        private String type;
        private String facility;
        private int counter=0;
     private String[] treats=new String[5];
     
     public Restaurant()
     {
    	 System.out.println("invoked default const");
     }
     public Restaurant(String type,String facility)
     {
    	 this.type=type;
    	 this.facility=facility;
    	 System.out.println("invoked String and String const");
     }
     public String getType()
     {
    	 return type;
     }
     public String getFacility()
     {
    	 return facility;
     }
     public void addType(String type)
     {
    	 System.out.println("Type of restaurant is :".concat(type));
    	 if(counter<4)
    	 {
    		 this.treats[this.counter]=type;
    		 this.treats[this.counter]=facility;
    		 counter++;
    	 }
    	 else
    	 {
    		 System.err.println("Array is fulled");
    	 }
     }
     public void addFacility(String facility)
     {
    	 System.out.println("Facility of restaurant :".concat(facility));
     }
     public void displayRestaurant()
     {
    	 System.out.println("%%");
    	 for(int y=0;y<this.treats.length;y++)
    	 {
    		 String type=this.treats[y];
    		 System.out.println(type);
    	 }
     }
}
