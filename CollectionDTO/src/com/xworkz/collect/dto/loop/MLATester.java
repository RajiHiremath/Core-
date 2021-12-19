package com.xworkz.collect.dto.loop;

import java.util.HashSet;
import java.util.Set;

public class MLATester {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Vishwanath Mamani");
		set.add("Anad singh");
		set.add("Ajay Darmasingh");
		set.add("Venkatesh naik");
		set.add("Hegde Vishweshwar");

		System.err.println("using for loop");
		for (String element : set) {
			System.out.println(element);
		}
		System.out.println("==========================");
		System.err.println("using forEach method");
		set.forEach((ele) -> {
			System.out.println(ele);
		});

	}

}
