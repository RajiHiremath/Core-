package com.xworkz.collect.dto.juice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlaceDAO implements Serializable
{
	private Collection<String> places = new ArrayList<String>();
		
	
	public boolean save(String name)
 {
	 return this.places.add(name);
 }

 public boolean findMatchingName(String place)
 {
	 if(place!=null)
	 {
		 if(places.contains(place))
		 {
			 System.out.println("Place is found");
			 return true;
		 }
	 }
	 
	 return false;
 }
 public boolean findMatchingCaseInsensitive(String place) 
 {
	 if(place !=null)
	 {
		 Iterator<String> itr=places.iterator();
		 while(itr.hasNext())
		 {
			 String value=itr.next();
			 if(value.equalsIgnoreCase(place))
			 {
				 System.out.println("place is found ignoring the cases");
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
	 Iterator<String> itr=places.iterator();
	 while(itr.hasNext())
	 {
		 String val1=itr.next();
		 if(val1.toUpperCase().startsWith(chars.toUpperCase()))
		 {
			System.out.println("place is found which starts with same chars");
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
		 Iterator<String> itr=places.iterator();
		 while(itr.hasNext())
		 {
			 String val1=itr.next();
			 if(val1.toUpperCase().endsWith(chars.toUpperCase()))
			 {
				System.out.println("place is found which ends with same chars");
				return true;
			 }
		 }
		 
	 }
	 return false;
	 
 }
}
