package com.xworkz.dp.dto;

public class Carpenter 
{
 private String name;
 private int age;
 private char gender;
 private float height;
 
 public Carpenter() {
	System.out.println("invoked default const");
}

public Carpenter(String name, int age, char gender, float height) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.height = height;
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

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public float getHeight() {
	return height;
}

public void setHeight(float height) {
	this.height = height;
}
}
