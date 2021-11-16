package com.xworkz.dp.dto;

public class BucketDTO {
 private String colour;
 private String size;
 private int price;
 private String quantity;
 private float weight;
 private String company;
 
 public BucketDTO() 
 {
	System.out.println("invoked default const");
 }

public BucketDTO(String colour, String size, int price, String quantity, float weight, String company) {
	super();
	this.colour = colour;
	this.size = size;
	this.price = price;
	this.quantity = quantity;
	this.weight = weight;
	this.company = company;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getQuantity() {
	return quantity;
}

public void setQuantity(String quantity) {
	this.quantity = quantity;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}
 
}
