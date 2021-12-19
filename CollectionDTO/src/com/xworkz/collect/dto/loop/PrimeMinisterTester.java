package com.xworkz.collect.dto.loop;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrimeMinisterTester {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Jawaharlal Nehru");
		list.add("Lal Bahadur");
		list.add("Narendra Modi");
		list.add("Manmohan Singh");
		list.add("Indira Gandhi");

		System.err.println("using for loop");
		for (String element : list) {
			System.out.println(element);
		}
		
		System.err.println("using forEach method");
		list.forEach((ele) -> {
			System.out.println(ele);
		});
		

		ListIterator<String> listIterator = list.listIterator(list.size());
		System.err.println("using List Iterator reverse order using ref size");
		while (listIterator.hasPrevious()) {
			String str = listIterator.previous();
			System.out.println(str);
		}
		
		System.err.println("using list Iterator order");
		ListIterator<String> listIterator1 = list.listIterator();
		while (listIterator1.hasNext()) {
			String str1 = listIterator1.next();
			System.out.println(str1);
		}

	

	}

}
