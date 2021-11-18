package com.xworkz.amazon.dao;

public class CartDTO
{
	private String name;
	private int quantity;
	private int price;
	private int noOfItems;
	

	
	public CartDTO(String name, int quantity, int price, int noOfItems) 
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.noOfItems = noOfItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	
}
