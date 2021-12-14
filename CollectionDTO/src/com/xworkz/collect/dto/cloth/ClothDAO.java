package com.xworkz.collect.dto.cloth;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothDAO implements Serializable 
{
 private Collection<String> cloths = new ArrayList<String>();
	
	
public boolean save(String clothName)
{
return this.cloths.add(clothName);
}

public boolean findMatchingName(String cloth)
{
if(cloth!=null)
{
	 if(cloths.contains(cloth))
	 {
		 System.out.println("cloth is found");
		 return true;
	 }
}

return false;
}
public boolean findMatchingCaseInsensitive(String cloth) 
{
if(cloth !=null)
{
	 Iterator<String> itr=cloths.iterator();
	 while(itr.hasNext())
	 {
		 String value=itr.next();
		 if(value.equalsIgnoreCase(cloth))
		 {
			 System.out.println("cloth is found ignoring the cases");
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
Iterator<String> itr=cloths.iterator();
while(itr.hasNext())
{
	 String val1=itr.next();
	 if(val1.toUpperCase().startsWith(chars.toUpperCase()))
	 {
		System.out.println("cloth is found which starts with same chars");
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
	 Iterator<String> itr=cloths.iterator();
	 while(itr.hasNext())
	 {
		 String val1=itr.next();
		 if(val1.toUpperCase().endsWith(chars.toUpperCase()))
		 {
			System.out.println("cloth is found which ends with same chars");
			return true;
		 }
	 }
	 
}
return false;

}
}

