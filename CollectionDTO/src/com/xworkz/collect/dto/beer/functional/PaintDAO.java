package com.xworkz.collect.dto.beer.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PaintDAO 
{
	private Collection<String> paintCollections=new ArrayList();
	   
	public PaintDAO()
 {
	this.paintCollections.add("Yellow");
	this.paintCollections.add("Brown");
	this.paintCollections.add("Blue");
	this.paintCollections.add("Orange");
	this.paintCollections.add("Pink");
 }
	public boolean Find(StringMatch search,String value)
	{
		Iterator<String> itr=paintCollections.iterator();
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
		 
