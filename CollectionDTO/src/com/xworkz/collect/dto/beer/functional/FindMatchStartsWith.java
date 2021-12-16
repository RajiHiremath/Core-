package com.xworkz.collect.dto.beer.functional;

public class FindMatchStartsWith implements StringMatch
{

	@Override
	public boolean evaluate(String element, String value) 
	{
		System.out.println("invoked evaluate method of Find Match Starts With");
		return element.toUpperCase().startsWith(value.toUpperCase());
	}

}
