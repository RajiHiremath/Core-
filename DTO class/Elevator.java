package com.xworkz.dp.dto;

public class Elevator 
{
 private String location;
 private String motionType;
 private int noOfSteps;
 private String colour;
 private boolean working;
 
 public Elevator() {
	System.out.println("invoked default const");
}

public Elevator(String location, String motionType, int noOfSteps, String colour,boolean working) {
	super();
	this.location = location;
	this.motionType = motionType;
	this.noOfSteps = noOfSteps;
	this.colour = colour;
	this.working=working;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getMotionType() {
	return motionType;
}

public void setMotionType(String motionType) {
	this.motionType = motionType;
}
public int getNoOfSteps() {
	return noOfSteps;
}
public void setNoOfSteps(int noOfSteps) {
	this.noOfSteps = noOfSteps;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public boolean isWorking() {
	return working;
}
public void setWorking(boolean working) {
	this.working = working;
}
}
