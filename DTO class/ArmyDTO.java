package com.xworkz.dp.dto;

public class ArmyDTO 
{
	private String Country;
	private String armyType;
	private String locationOfMainBranch;
	private String amountInvested;
	private int founded;
	private String role;
	private String uniformColour;

	public ArmyDTO() 
	{
		System.out.println("invoked default const");
	}

	public ArmyDTO(String country, String armyType, String locationOfMainBranch, String amountInvested, int founded,
			String role, String uniformColour) 
	{
		super();
		Country = country;
		this.armyType = armyType;
		this.locationOfMainBranch = locationOfMainBranch;
		this.amountInvested = amountInvested;
		this.founded = founded;
		this.role = role;
		this.uniformColour = uniformColour;
	}

	public String getCountry() 
	{
		return Country;
	}

	public void setCountry(String country) 
	{
		Country = country;
	}

	public String getArmyType() 
	{
		return armyType;
	}

	public void setArmyType(String armyType) 
	{
		this.armyType = armyType;
	}

	public String getLocationOfMainBranch() 
	{
		return locationOfMainBranch;
	}

	public void setLocationOfMainBranch(String locationOfMainBranch) 
	{
		this.locationOfMainBranch = locationOfMainBranch;
	}

	public String getAmountInvested() 
	{
		return amountInvested;
	}

	public void setAmountInvested(String amountInvested) 
	{
		this.amountInvested = amountInvested;
	}

	public int getFounded() 
	{
		return founded;
	}

	public void setFounded(int founded) 
	{
		this.founded = founded;
	}

	public String getRole() 
	{
		return role;
	}

	public void setRole(String role) 
	{
		this.role = role;
	}

	public String getUniformColour() 
	{
		return uniformColour;
	}

	public void setUniformColour(String uniformColour) 
	{
		this.uniformColour = uniformColour;
	}

}
