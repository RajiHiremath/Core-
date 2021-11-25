package com.xworkz.exception;

public class PanValidationException 
{
    public PanValidationException()
    {
    	System.out.println("invoked Pan validation no arg const");
    }
    public PanValidationException(String msg)
    {
    	System.out.println("Can only add 5 pan cards");
    }
}
