package com.xworkz.collect.developer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Developers {

	public static void main(String[] args) {
		
		List<String> collection = new ArrayList<String>();
		collection.add("Raju");
		collection.add("Manju");
		collection.add("Prashant");
		collection.add("Pranchi");
		collection.add("Pooja");
		collection.add("Bhoomika");
		collection.add("Teju");
		collection.add("Sharada");
		collection.add("Sunni");
		collection.add("Vacchi");

		System.out.println("LIST Collection");
		System.out.println(collection.size());
		
		Comparator comparator=new DeveloperAsc();
		Collections.sort(collection);
		System.out.println("acending order of list");
		
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		System.err.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("decending order of list");
		
		Comparator comparator1=new DeveloperAsc();
		Collections.sort(collection, Collections.reverseOrder());
		
		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}


		System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("SET Collection");
		Set<String> set1 = new TreeSet<String>();
		set1.add("Shailaja");
		set1.add("Mahesh");
		set1.add("Manju");
		set1.add("Anusha");
		set1.add("Rajeshwari");
		set1.add("Kavitha");
		set1.add("Pranitha");
		set1.add("Poorvik");
		set1.add("Veeresh");
		set1.add("Chetu");

		System.out.println(set1.size());
		System.out.println("acending order of set");
		
		Comparator comparator2=new DeveloperDec();
		
		
        Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) 
		{
			System.out.println(itr2.next());
		}

		System.err.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("descending order of set");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext())
		{
			System.out.println(itr3.next());
		}

	}
}
	

	


