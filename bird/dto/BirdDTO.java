package com.xworkz.bird.dto;

public class BirdDTO 
{
   private String birdID;
   private int age ;
   private String breed;
   private boolean canFly;
   
   public BirdDTO() {
	System.out.println("invoked no-arg const");
   }

public BirdDTO(String birdID, int age, String breed, boolean canFly) 
{
	this.birdID = birdID;
	this.age = age;
	this.breed = breed;
	this.canFly = canFly;
}

public String getBirdID() {
	return birdID;
}

public void setBirdID(String birdID) {
	this.birdID = birdID;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

public boolean isCanFly() {
	return canFly;
}

public void setCanFly(boolean canFly) {
	this.canFly = canFly;
}
   
   
  
}
