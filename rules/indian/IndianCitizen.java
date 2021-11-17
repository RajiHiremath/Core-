package com.xworkz.rules.indian;

import com.xworkz.rules.marriage.MarriageRule;
import com.xworkz.rules.traffic.TrafficRule;
import com.xworkz.rules.voting.VotingRule;

public class IndianCitizen implements VotingRule,TrafficRule,MarriageRule{
	
	@Override
	public int validAge() {
		System.out.println("invoked valid age of voting");
		return 18 ;
	}
	@Override
	public String validID() {
		System.out.println("invoked valid Id");
		return "YCV0164822";
	}

	@Override
	public boolean validAge(char gender, int age) 
	{
		System.out.println("Invoked Marriage valid age ");
		return true;
	}

	@Override
	public boolean validLicense() {
		System.out.println("Invoked Valid License of Driver");
		return false;
	}

	@Override
	public String licenseNo() {
		System.out.println("invoked License number");
		return "DL-0420110149xxxx";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Invoked valid Insurance");
		return false;
	}
   
	private String name="Raj";
	private String address="Jaynagar";
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void displayNameAndAddressDetails()
	{
		System.out.println("Invoked Name and Address of Indian Citizen");
	}
}
