package com.xworkz.exception;

public class EmailOperator 
{
  private String[] email=new String[5];
  private int count=0;
  
  public void save(String email) throws EmailValidationException,StorageFullRuntimeException 
  {
		System.out.println("Invoked save method from Email Operator");
		if (this.count < this.email.length && email != null) {
			this.email[this.count++] = email;
			if (email.contains("@") && email.endsWith(".com")) {
				System.out.println("Email is Valid");

			}
			else 
			{
				System.err.println("Email is Invalid");
				throw new EmailValidationException();
			}
		} 
		else
		{
			System.err.println("Email is equal to null");
			throw new StorageFullRuntimeException();
     }
  }
}
	  

     

