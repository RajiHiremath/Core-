package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class ClubDTO implements Serializable
{
  private int id;
  private String name;
  private String location;
  private int bouncers;
  private double entryFees;
  
  public ClubDTO() {
	System.out.println("invoked no-arg const");
   }

public ClubDTO(int id, String name, String location, int bouncers, double entryFees) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
	this.bouncers = bouncers;
	this.entryFees = entryFees;
}

@Override
public String toString() {
	return "ClubDTO [id=" + id + ", name=" + name + ", location=" + location + ", bouncers=" + bouncers + ", entryFees="
			+ entryFees + "]";
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getLocation() {
	return location;
}

public int getBouncers() {
	return bouncers;
}

public double getEntryFees() {
	return entryFees;
}


}
