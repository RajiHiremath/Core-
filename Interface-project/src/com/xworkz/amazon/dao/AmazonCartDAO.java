package com.xworkz.amazon.dao;

public interface AmazonCartDAO 
{
	boolean save(CartDTO cartDTO);
	CartDTO findByName(String name);
	default void displayAllCartDetails()
	{
		
	}
	
		
	
	
}






