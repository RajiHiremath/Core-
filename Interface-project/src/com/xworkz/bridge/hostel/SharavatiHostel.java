package com.xworkz.bridge.hostel;

public class SharavatiHostel implements HostelRule,VisitingDay
{
    @Override
	public int inTime() 
	{
		System.out.println("Invoked inTime of Hostel");
		return 7;
	}

	 public int breakFastTime()
	{
		System.out.println("invoked breakFastTime of Hostel");
		return 8;
	}

	@Override
	public String visitingDay() 
	{
		System.out.println("Invoked VisistingDay of Hostel");
		return "Sunday";
	}
	
	
}
