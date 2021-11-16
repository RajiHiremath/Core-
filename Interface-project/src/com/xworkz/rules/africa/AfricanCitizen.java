package com.xworkz.rules.africa;

import com.xworkz.rules.marriage.MarriageRule;
import com.xworkz.rules.traffic.TrafficRule;
import com.xworkz.rules.voting.VotingRule;

public class AfricanCitizen implements VotingRule,TrafficRule,MarriageRule{

	@Override
	public int validAge() 
	{
		System.out.println("Invoked valid Age");
		return 20;
	}

	@Override
	public String validID() 
	{
		System.out.println("Invoked valid ID");
		return "YUD4215896";
	}

	@Override
	public boolean validLicense() 
	{
		System.out.println("Invoked valid license");
		return true;
	}

	@Override
	public String licenseNo() {
		System.out.println("Invoked license number");
		return "DL 10645825465";
	}

	@Override
	public boolean validInsurance() 
	{
		System.out.println("invoked valid Insurance");
		return true;
	}

	@Override
	public boolean validAge(char gender, int age) 
	{
		System.out.println("Invoked validAge");
		return false;
	}

	private String name="Abayomi";
	private String stateName="Comoros.";
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getStateName() 
	{
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public void displayDetails()
	{
		System.out.println("Invoked Details of Africa");
	}
}
