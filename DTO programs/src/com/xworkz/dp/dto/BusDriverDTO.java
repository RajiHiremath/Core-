package com.xworkz.dp.dto;

public class BusDriverDTO 
{
  private String name;
  private int age;
  private String wifeName;
  private String route;
  private int noOfChildrens;
  private String place;
  
  public BusDriverDTO() 
  {
	System.out.println("invoked no-arg const");
  }

public BusDriverDTO(String name, int age, String wifeName, String route, int noOfChildrens, String place) 
{
	super();
	this.name = name;
	this.age = age;
	this.wifeName = wifeName;
	this.route = route;
	this.noOfChildrens = noOfChildrens;
	this.place = place;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getWifeName() {
	return wifeName;
}

public void setWifeName(String wifeName) {
	this.wifeName = wifeName;
}

public String getRoute() {
	return route;
}

public void setRoute(String route) {
	this.route = route;
}

public int getNoOfChildrens() {
	return noOfChildrens;
}

public void setNoOfChildrens(int noOfChildrens) {
	this.noOfChildrens = noOfChildrens;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}
}
