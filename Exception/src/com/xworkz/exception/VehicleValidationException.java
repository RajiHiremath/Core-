package com.xworkz.exception;

public class VehicleValidationException extends Exception
{
 public VehicleValidationException() {
	System.out.println("invoked no arg const");
}
 public VehicleValidationException(String msg)
 {
	 System.out.println(" vehicle numbers is added");
 }
}
