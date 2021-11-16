package com.xworkz.dp.dto;

public class MetroStationDTO
{
  private String name;
  private String route;
  private boolean elevator;
  private String openTime;
  private String closeTime;
  public MetroStationDTO() 
  {
	System.out.println("invoked default const");
}
public MetroStationDTO(String name, String route, boolean elevator, String openTime, String closeTime) {
	super();
	this.name = name;
	this.route = route;
	this.elevator = elevator;
	this.openTime = openTime;
	this.closeTime = closeTime;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRoute() {
	return route;
}
public void setRoute(String route) {
	this.route = route;
}
public boolean isElevator() {
	return elevator;
}
public void setElevator(boolean elevator) {
	this.elevator = elevator;
}
public String getOpenTime() {
	return openTime;
}
public void setOpenTime(String openTime) {
	this.openTime = openTime;
}
public String getCloseTime() {
	return closeTime;
}
public void setCloseTime(String closeTime) {
	this.closeTime = closeTime;
}
  
}