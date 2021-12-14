package com.xworkz.collect.dto.country;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDAO implements Serializable
{
private Collection<String> countries = new ArrayList<String>();
		
	
	public boolean save(String countryName)
   {
	 return this.countries.add(countryName);
    }

 public boolean findMatchingName(String country)
 {
	 if(country!=null)
	 {
		 if(countries.contains(country))
		 {
			 System.out.println("country is found");
			 return true;
		 }
	 }
	 
	 return false;
 }
 public boolean findMatchingCaseInsensitive(String country) 
 {
	 if(country !=null)
	 {
		 Iterator<String> itr=countries.iterator();
		 while(itr.hasNext())
		 {
			 String value=itr.next();
			 if(value.equalsIgnoreCase(country))
			 {
				 System.out.println("country is found ignoring the cases");
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
	 Iterator<String> itr=countries.iterator();
	 while(itr.hasNext())
	 {
		 String val1=itr.next();
		 if(val1.toUpperCase().startsWith(chars.toUpperCase()))
		 {
			System.out.println("country is found which starts with same chars");
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
		 Iterator<String> itr=countries.iterator();
		 while(itr.hasNext())
		 {
			 String val1=itr.next();
			 if(val1.toUpperCase().endsWith(chars.toUpperCase()))
			 {
				System.out.println("country is found which ends with same chars");
				return true;
			 }
		 }
		 
	 }
	 return false;
	 
 }
}

