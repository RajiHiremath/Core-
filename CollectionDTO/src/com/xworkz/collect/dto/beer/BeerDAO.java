package com.xworkz.collect.dto.beer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collect.dto.beer.functional.StringMatch;

public class BeerDAO 
{
	private Collection<String> beerCollections=new ArrayList();
   
	public BeerDAO()
 {
	this.beerCollections.add("King Fisher");
	this.beerCollections.add("Tuborg");
	this.beerCollections.add("Heineken");
	this.beerCollections.add("Bira 91");
	this.beerCollections.add("Carlsberg");

 }
	
	public boolean Find(StringMatch search,String value)
	{
		Iterator<String> itr=beerCollections.iterator();
		 while(itr.hasNext())
		 {
		String element=itr.next();
		if(search.evaluate(element,value))
		{
			return true;
		}


		 }
		return false;
	  }
   }
