package com.xworkz.collect.dto.beer.functional;

public class FindMatchEndsWith implements StringMatch{

	@Override
	public boolean evaluate(String element, String value) {
		System.out.println("invoked evaluate method of Find Match Ends With");
		return element.toUpperCase().endsWith(value.toUpperCase());
	}

}
