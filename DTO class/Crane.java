package com.xworkz.dp.dto;

public class Crane 
{
     private String brand;
     private String type;
     private double price;
     private boolean working;
     private String model;
     
     public Crane() 
     {
		System.out.println("invoked no arg const");
	 }

	public Crane(String brand, String type, double price, boolean working, String model) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.working = working;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
     
}
