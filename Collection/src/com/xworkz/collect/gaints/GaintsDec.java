package com.xworkz.collect.gaints;

import java.util.Comparator;

public class GaintsDec implements Comparator<String>{

	@Override
	public int compare(String n1, String n2) {
		
		return n1.compareTo(n2);
	}

}
