package com.xworkz.exception;

public class PanStarter {

	public static void main(String[] args)throws PanValidationException, StorageFullRuntimeException{
		PanOperator panoperator = new PanOperator();
		panoperator.save("adrf6789i8"); 
		

	}

}
