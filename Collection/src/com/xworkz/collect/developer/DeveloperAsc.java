package com.xworkz.collect.developer;

import java.util.Comparator;

public class DeveloperAsc implements Comparator<String>{

	@Override
	public int compare(String n1, String n2) {
		
		return n1.compareTo(n2);
	}

}
