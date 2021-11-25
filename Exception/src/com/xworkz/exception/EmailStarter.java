package com.xworkz.exception;
public class EmailStarter {

	public static void main(String[] args) throws EmailValidationException, StorageFullRuntimeException{
		EmailOperator emailoperator = new EmailOperator();
		emailoperator.save("anusha@gmail.com");

	}

}
