package com.xworkz.dp.dto;

public class ElevatorStarter {

	public static void main(String[] args) {
		Elevator elevator=new Elevator();
		elevator.setLocation("Orion mall");
		elevator.setMotionType("Upward");
		elevator.setNoOfSteps(15);
		elevator.setColour("Black");
		elevator.setWorking(true);
		
		Elevator elevator1=new Elevator("Mantri Mall", "Downward", 12, "Grey", false);
		Elevator elevator2=new Elevator("Gopalan Mall", "Upward", 20, "Grey", true);
		Elevator elevator3=new Elevator("J.P nagar Metro", "Upward", 14, "Black", false);
		Elevator elevator4=new Elevator("D-Mart", "Downward", 17, "White", true);
	
	Elevator[] ref=new Elevator[4];
	ref[0]=elevator3;
	ref[3]=elevator2;
	ref[2]=elevator1;
	for(int upper=0;upper<ref.length;upper++)
	{
		Elevator ref1=ref[upper];
		if(ref1!=null)
		{
			System.out.println(ref1.getLocation());
			System.out.println(ref1.getMotionType());
			System.out.println(ref1.getNoOfSteps());
			System.out.println(ref1.getColour());
			System.out.println(ref1.isWorking());
		}
		else
		{
			System.out.println("Index is pointing to null".concat(String.valueOf(upper)));
		}
	}
}
}
