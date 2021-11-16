package com.xworkz.dp.dto;

public class ClubDTO {
 private int noOfPeople;
 private int noOfBottle;
 private float rating;
 private int entryPrice;
 private int noOfStaff;
 
 public ClubDTO() 
 {
	System.out.println("invoked no-arg const");
}

public ClubDTO(int noOfPeople, int noOfBottle, float rating, int entryPrice, int noOfStaff) {
	super();
	this.noOfPeople = noOfPeople;
	this.noOfBottle = noOfBottle;
	this.rating = rating;
	this.entryPrice = entryPrice;
	this.noOfStaff = noOfStaff;
}

public int getNoOfPeople() {
	return noOfPeople;
}

public void setNoOfPeople(int noOfPeople) {
	this.noOfPeople = noOfPeople;
}

public int getNoOfBottle() {
	return noOfBottle;
}

public void setNoOfBottle(int noOfBottle) {
	this.noOfBottle = noOfBottle;
}

public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}

public int getEntryPrice() {
	return entryPrice;
}

public void setEntryPrice(int entryPrice) {
	this.entryPrice = entryPrice;
}

public int getNoOfStaff() {
	return noOfStaff;
}

public void setNoOfStaff(int noOfStaff) {
	this.noOfStaff = noOfStaff;
}
 
 
}
