package com.xworkz.collect.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collect.developer.DeveloperAsc;
import com.xworkz.collect.developer.DeveloperDec;
public class ProductCompany {

	public static void main(String[] args) {
		
		List<String> collection = new ArrayList<String>();
		collection.add("Microsoft");
		collection.add("Oracle");
		collection.add("VMware");
		collection.add("Amdocs");
		collection.add("HCL");
		collection.add("Uber");
		collection.add("Hewlett-Packed");
		collection.add("Zomato");
		collection.add("TCS");
		collection.add("Paypal");

		System.out.println("LIST Collection");
		System.out.println(collection.size());
		
		Comparator comparator=new CompanyAsc();
		Collections.sort(collection);
		System.out.println("acending order of list");
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			System.out.println(type);
		}

		System.err.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.err.println("decending order of list");
		
		Comparator comparator1=new CompanyAsc();
		Collections.sort(collection, Collections.reverseOrder());
		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}

		System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		System.err.println("SET Collection");
		Set<String> set1 = new TreeSet<String>();
		set1.add("Microsoft");
		set1.add("Oracle");
		set1.add("VMware");
		set1.add("Amdocs");
		set1.add("HCL");
		set1.add("Uber");
		set1.add("Hewlett-Packed");
		set1.add("Zomato");
		set1.add("TCS");
		set1.add("Paypal");

		System.out.println(set1.size());
		System.err.println("acending order of set.");
		
		Comparator comparator2=new CompanyDec();

		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.err.println("----------------------------");
		System.err.println("descending order of set");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<String> itr3 = set1.iterator();
		while (itr3.hasNext()) {
			String type1 = itr3.next();
			System.out.println(type1);
		}

	}
}