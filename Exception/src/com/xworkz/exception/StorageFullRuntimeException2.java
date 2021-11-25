package com.xworkz.exception;

public class StorageFullRuntimeException2 extends Exception
{
public StorageFullRuntimeException2() {
	System.out.println("invoked no-arg const");
}
 public StorageFullRuntimeException2(String msg)
 {
	 System.out.println("can add only 5 vehicle numbers");
 }
}
