package com.xworkz.collect.phone;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhoneScammer {

	public static void main(String[] args) {

		List<Long> collection = new ArrayList<Long>();
		collection.add(8050058473l);
		collection.add(7204735375l);
		collection.add(9380674362l);
		collection.add(9449435637l);
		collection.add(9483764412l);
		collection.add(9483764424l);
		collection.add(9483764433l);
		collection.add(9886288519l);
		collection.add(7202238563l);
		collection.add(7852369456l);

		System.out.println("LIST Collection");
		System.out.println(collection.size());
		
		Comparator comparator=new PhoneNumbers();
		Collections.sort(collection);
		System.out.println("acending order of list");
		
		Iterator<Long> itr = collection.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		System.err.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("decending order of list");
		
		Comparator comparator1=new PhoneNumbersDec();
		Collections.sort(collection, Collections.reverseOrder());
		
		Iterator<Long> itr1 = collection.iterator();
		while (itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}

        System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("SET Collection");
		Set<Long> set1 = new TreeSet<Long>();
		set1.add(8050058473l);
		set1.add(7204735375l);
		set1.add(9380674362l);
		set1.add(9449435637l);
		set1.add(9483764412l);
		set1.add(9483764424l);
		set1.add(9483764433l);
		set1.add(9886288519l);
		set1.add(7202238563l);
		set1.add(7852369456l);

		System.out.println(set1.size());
		System.out.println("acending order of set");
		
		Comparator comparator2=new PhoneNumbers();

		Iterator<Long> itr2 = set1.iterator();
		while (itr2.hasNext()) 
		{
			System.out.println(itr2.next());
		}

		System.out.println("----------------------------");
		System.out.println("descending order of set");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<Long> itr3 = collection.iterator();
		while (itr3.hasNext())
		{
			Long type1 = itr3.next();
			System.out.println(type1);
		}

	}

}
