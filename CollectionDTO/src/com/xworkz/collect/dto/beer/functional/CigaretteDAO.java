package com.xworkz.collect.dto.beer.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CigaretteDAO {

	private Collection<String> cigaretteCollections=new ArrayList();
	   
	public CigaretteDAO()
 {
	this.cigaretteCollections.add("camel");
	this.cigaretteCollections.add("kool");
	this.cigaretteCollections.add("marlboro");
	this.cigaretteCollections.add("newport");
	this.cigaretteCollections.add("luckystrike");
 }
	public boolean Find(StringMatch search,String value)
	{
		Iterator<String> itr=cigaretteCollections.iterator();
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


