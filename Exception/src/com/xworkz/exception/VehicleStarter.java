package com.xworkz.exception;

public class VehicleStarter {

	public static void main(String[] args) throws VehicleValidationException,StorageFullRuntimeException2{
	VehicleOperator vehicleoperator=new VehicleOperator();
	vehicleoperator.save("KA 27 4592");
}
}
