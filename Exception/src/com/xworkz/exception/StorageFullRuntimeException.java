package com.xworkz.exception;

public class StorageFullRuntimeException extends Exception
{
	public StorageFullRuntimeException()
	{
		System.out.println("invoked Storage Full Time Exception no-arg const");
	}
	
	public StorageFullRuntimeException(String msg)
	{
		System.out.println("can only add 5 emails");
	}
	
	
}
