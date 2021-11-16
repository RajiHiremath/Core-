package com.xworkz.dp.dto;

public class DressCodeDTO {
 private String size;
 private String material;
 private String colour;
 private int price;
 private char gender;
 
 public DressCodeDTO() 
 {
	System.out.println("invoked no-arg constructor");
 }

public DressCodeDTO(String size, String material, String colour, int price, char gender) {
	super();
	this.size = size;
	this.material = material;
	this.colour = colour;
	this.price = price;
	this.gender = gender;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}
 
}
