package com.xworkz.collect.dto;
import java.io.Serializable;
public class PoliceStationDTO implements Serializable  
{
    private String name,location,type;
    private int noOfStaffs;
    
    public PoliceStationDTO() {
		System.out.println("invoked no-arg const");
	}

	public PoliceStationDTO(String name, String location, String type, int noOfStaffs) 
	{
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noOfStaffs = noOfStaffs;
	}

	
	@Override
	public int hashCode() {
		System.out.println("invoked Hashcode of objects");
		return 7;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals methods of objects");
		if(obj!=null)
		{
			if(obj instanceof PoliceStationDTO)
			{
				PoliceStationDTO casted=(PoliceStationDTO)obj;
				if(this.name.equals(casted.name) && this.location.equals(casted.location))
				{
					System.out.println("Police Station is equal :" .concat(name));
					return true;
				}
			}
		}
		return true;
	}
	
	
	@Override
	public String toString() {
		return "PoliceStationDTO [name=" + name + ", location=" + location + ", type=" + type + ", noOfStaffs="
				+ noOfStaffs + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}
}
