package com.xworkz.exception;

public class PanOperator 
{
   private PanOperator[] pan=new PanOperator[5];
   private int count=0;
 
   public void save(String pan) throws PanValidationException(){
	  System.out.println("Invoked save method from pan Operator");
	  if(this.count<this.pan.length && pan!=null)
	   {
		 this.pan[this.count++]=pan;
		 if( pan.startsWith("Alphabet", 5)&& pan.endsWith("Alphabet"))
		 {
			 System.out.println("pan is Valid");
		 }
		 else
		 {
			 System.err.println("pan is Invalid");
		 }
	   }
	   else
	   {
		 System.err.println("pan is equal to null");
	   }
   
	 
   }
}

