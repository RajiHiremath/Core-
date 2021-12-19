package com.xworkz.collect.dto.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MallLoopTester 
{
 public static void main(String[] args) 
 {
	List<String> list =new ArrayList<String>();
	list.add("LuLu mall");
	list.add("Orion mall");
	list.add("U mall");
	list.add("Mantri square mall");
	list.add("UB city mall");

	System.err.println("print using for loop");
	for(String element : list) {
		System.out.println(element);
	}
	System.err.println("/////////////");
	System.err.println("using forEach method");
	list.forEach((ele) -> {
		System.out.println(ele);
	});
	System.out.println("///////////////");

	ListIterator<String> listIterator = list.listIterator(list.size());
	System.err.println("using List Iterator reverse order using ref size");
	while (listIterator.hasPrevious()) {
		String str = listIterator.previous();
		System.out.println(str);
	}
	System.err.println("//////////////");
	System.err.println("using list Iterator order");
	ListIterator<String> listIterator1 = list.listIterator();
	while (listIterator1.hasNext()) {
		String str1 = listIterator1.next();
		System.out.println(str1);
	}

}

}

