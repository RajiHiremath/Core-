package com.xworkz.dp.dto;

public class TempleDTO {
   private String name;
   private String location;
   private String mainGod;
   private boolean prasad;
   private int yestGante;
   public TempleDTO() 
   {
	System.out.println("invoked no-arg constructor");
   }
public TempleDTO(String name, String location, String mainGod, boolean prasad, int yestGante) {
	super();
	this.name = name;
	this.location = location;
	this.mainGod = mainGod;
	this.prasad = prasad;
	this.yestGante = yestGante;
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
public String getMainGod() {
	return mainGod;
}
public void setMainGod(String mainGod) {
	this.mainGod = mainGod;
}
public boolean isPrasad() {
	return prasad;
}
public void setPrasad(boolean prasad) {
	this.prasad = prasad;
}
public int getYestGante() {
	return yestGante;
}
public void setYestGante(int yestGante) {
	this.yestGante = yestGante;
}
public  String concat(String valueOf) 
{
	return null;
}
   
}
