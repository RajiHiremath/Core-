package com.xworkz.collect.dto.fruit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FruitDAO implements Serializable
{

private Collection<String> fruits = new ArrayList<String>();
		
	
	public boolean save(String fruitName)
   {
	 return this.fruits.add(fruitName);
    }

 public boolean findMatchingName(String fruit)
 {
	 if(fruit!=null)
	 {
		 if(fruits.contains(fruit))
		 {
			 System.out.println("fruit is found");
			 return true;
		 }
	 }
	 
	 return false;
 }
 public boolean findMatchingCaseInsensitive(String fruit) 
 {
	 if(fruit !=null)
	 {
		 Iterator<String> itr=fruits.iterator();
		 while(itr.hasNext())
		 {
			 String value=itr.next();
			 if(value.equalsIgnoreCase(fruit))
			 {
				 System.out.println("fruit is found ignoring the cases");
				 return true;
			 }
		 }
	 }
	 
	 return false;
 }
 
 public boolean findMatchStartsWith(String chars)
 {
	 if(chars!=null)
	 {
	 Iterator<String> itr=fruits.iterator();
	 while(itr.hasNext())
	 {
		 String val1=itr.next();
		 if(val1.toUpperCase().startsWith(chars.toUpperCase()))
		 {
			System.out.println("fruit is found which starts with same chars");
			return true;
		 }
	 }
	}
	 return false;
 }
 
 public boolean findMatchEndsWith(String chars)
 {
	 if(chars!=null)
	 {
		 Iterator<String> itr=fruits.iterator();
		 while(itr.hasNext())
		 {
			 String val1=itr.next();
			 if(val1.toUpperCase().endsWith(chars.toUpperCase()))
			 {
				System.out.println("fruit is found which ends with same chars");
				return true;
			 }
		 }
		 
	 }
	 return false;
	 
 }
}

