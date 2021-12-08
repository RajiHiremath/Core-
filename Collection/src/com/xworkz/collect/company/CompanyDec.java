package com.xworkz.collect.company;

import java.util.Comparator;

public class CompanyDec implements Comparator<String>{

	@Override
	public int compare(String n1, String n2) {
		
		return n1.compareTo(n2);
	}

}
