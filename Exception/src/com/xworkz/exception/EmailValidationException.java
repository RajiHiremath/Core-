package com.xworkz.exception;

public class EmailValidationException extends EmailOperator 
{
  public EmailValidationException ()
  {
	  System.out.println("invoked EmailValidationException no arg const");
  }
  
  public EmailValidationException(String msg)
  {
	  System.out.println("Emails is added");
  }
}
