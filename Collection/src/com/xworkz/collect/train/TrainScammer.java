package com.xworkz.collect.train;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainScammer {

	public static void main(String[] args) {
		
		List<Integer> collection = new ArrayList<Integer>();
		collection.add(63265);
		collection.add(53265);
		collection.add(85324);
		collection.add(12635);
		collection.add(44120);
		collection.add(94246);
		collection.add(48334);
		collection.add(85193);
		collection.add(72635);
		collection.add(82567);

		System.out.println("LIST Collection");
		System.out.println(collection.size());
		
		Comparator comparator=new TrainNoAcs();
		Collections.sort(collection);
		System.out.println("acending order of list");
		
		Iterator<Integer> itr = collection.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		System.err.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("decending order of list");
		
		Comparator comparator1=new TrainNoDec();
		Collections.sort(collection, Collections.reverseOrder());
		
		Iterator<Integer> itr1 = collection.iterator();
		while (itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}


		System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("SET Collection");
		
		Set<Integer> set1 = new TreeSet<Integer>(comparator);
		set1.add(80500);
		set1.add(72047);
		set1.add(93806);
		set1.add(94494);
		set1.add(94836);
		set1.add(37644);
		set1.add(76443);
		set1.add(98519);
		set1.add(72563);
		set1.add(79456);
     
		System.out.println(set1.size());
		System.out.println("acending order of set");
		
		Comparator comparator2=new TrainNoAcs();
		Iterator<Integer> itr2 = set1.iterator();
		while (itr2.hasNext()) 
		{
			System.out.println(itr2.next());
		}

		System.out.println("----------------------------");
		System.out.println("descending order of set");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<Integer> itr3 = collection.iterator();
		while (itr3.hasNext())
		{
			System.out.println(itr3.next());
		}

	}
}


