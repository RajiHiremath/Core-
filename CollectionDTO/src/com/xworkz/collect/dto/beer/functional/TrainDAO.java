package com.xworkz.collect.dto.beer.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TrainDAO 
{
	private Collection<String> trainCollections=new ArrayList();
	   
	public TrainDAO()
 {
	this.trainCollections.add("Hubli to gadag");
	this.trainCollections.add("Gadag to Gangavati");
	this.trainCollections.add("Gangavati to bangalore");
	this.trainCollections.add("Hassan to mysore");
	this.trainCollections.add("Hospete to koppal");
 }
	public boolean Find(StringMatch search,String value)
	{
		Iterator<String> itr=trainCollections.iterator();
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
