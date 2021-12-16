package com.xworkz.collect.dto.beer.functional;

public class FindMatch implements StringMatch{

	
	@Override
	public boolean evaluate(String element, String value) 
	{
		System.out.println("invoked evaluate method Find Match");
		return element.contains(value);
	}

	
}
