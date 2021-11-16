package com.xworkz.dp;

public class Bracelet {
     private String material;
     private String colour;
     private boolean gemUsed;
     private boolean gifted;
     private int price;
     private float weight;
     
   public Bracelet()
   {
	   System.out.println("invoked default const");
   }

public Bracelet(String material, String colour, boolean gemUsed, boolean gifted, int price, float weight) {
	super();
	this.material = material;
	this.colour = colour;
	this.gemUsed = gemUsed;
	this.gifted = gifted;
	this.price = price;
	this.weight = weight;
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

public boolean isGemUsed() {
	return gemUsed;
}

public void setGemUsed(boolean gemUsed) {
	this.gemUsed = gemUsed;
}

public boolean isGifted() {
	return gifted;
}

public void setGifted(boolean gifted) {
	this.gifted = gifted;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}
   
}
