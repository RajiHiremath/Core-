package com.xworkz.collect.gaints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class ITGaints {

	public static void main(String[] args) {
		
		List<String> collection = new ArrayList<String>();
		collection.add("HCL");
		collection.add("Infosys Ltd.");
		collection.add("LTI");
		collection.add("MindTree Ltd.");
		collection.add("Mphasis Ltd.");
		collection.add("OFSS Ltd.");
		collection.add("Quess Corp Ltd.");
		collection.add("IMB");
		collection.add("ITES");
		collection.add("Congnizant");

		System.err.println("LIST collection");
		System.out.println(collection.size());
		Comparator comparator=new GaintsAsc();
		Collections.sort(collection);
		System.err.println("acending order of list");
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			System.out.println(type);
		}

		System.err.println("----------------------------");
		System.err.println("decending of list");
		
		Comparator comparator1=new GaintsDec();
		Collections.sort(collection, Collections.reverseOrder());
		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			String type = itr1.next();
			System.out.println(type);
		}

		System.err.println("~~~~~");

		System.err.println("SET");
		Set<String> set1 = new TreeSet<String>();
		set1.add("HCL");
		set1.add("Infosys Ltd.");
		set1.add("LTI");
		set1.add("MindTree Ltd.");
		set1.add("Mphasis Ltd.");
		set1.add("OFSS Ltd.");
		set1.add("Quess Corp Ltd.");
		set1.add("IMB");
		set1.add("ITES");
		set1.add("Congnizant");

		System.out.println(set1.size());
		System.err.println("acending order of set");
		Comparator comparator2=new GaintsDec();
        Collections.sort(collection);
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


