package com.xworkz.exception;

public class VehicleOperator 
{
	private VehicleOperator[] vehicle=new VehicleOperator[5];
	   private int count=0;
	 
	   
	   public void save(String vehi) throws VehicleValidationException,StorageFunRuntimeException2()
	  {
		  System.out.println("Invoked save method from Vehicle Operator");
		   if(this.count<this.vehicle.length && vehicle!=null)
		   {
			 this.vehicle[this.count++]=vehi;
			 if(vehi.startsWith("Alphabet", 2)&& vehi.endsWith("number"))
			 {
				 System.out.println("vehicle number  is Valid");
			 }
			 else
			 {
				 System.err.println("vehicle number  is Invalid");
			 }
		   }
		   else
		   {
			 System.err.println("vehicle number is equal to null");
		   }
	   
		 
	   }

