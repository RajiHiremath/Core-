package com.xworkz.bus.dto;

public class BusDTO 
{
 private String busId;
 private String startPoint;
 private String destination;
 private String driverName;
 
 public BusDTO() 
 {
	System.out.println("invoked no-arg const");
   }

public BusDTO(String busId, String startPoint, String destination, String driverName) {
	super();
	this.busId = busId;
	this.startPoint = startPoint;
	this.destination = destination;
	this.driverName = driverName;
}

public String getBusId() {
	return busId;
}

public void setBusId(String busId) {
	this.busId = busId;
}

public String getStartPoint() {
	return startPoint;
}

public void setStartPoint(String startPoint) {
	this.startPoint = startPoint;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getDriverName() {
	return driverName;
}

public void setDriverName(String driverName) {
	this.driverName = driverName;
}
 
}
