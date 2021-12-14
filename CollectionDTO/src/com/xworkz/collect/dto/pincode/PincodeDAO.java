package com.xworkz.collect.dto.pincode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PincodeDAO implements Serializable
{
  private Collection<String> codes=new ArrayList<String>();
  
  public boolean save(String pin)
  {
 	 return this.codes.add(pin);
  }

  public boolean findMatchingName(String code)
  {
 	 if(code!=null)
 	 {
 		 if(codes.contains(code))
 		 {
 			 System.out.println("Pincode is found");
 			 return true;
 		 }
 	 }
 	 
 	 return false;
  }
 
  
  public boolean findMatchStartsWith(String chars)
  {
 	 if(chars!=null)
 	 {
 	 Iterator<String> itr=codes.iterator();
 	 while(itr.hasNext())
 	 {
 		 String val1=itr.next();
 		 if(val1.startsWith(chars))
 		 {
 			System.out.println("pincode is found which starts with same chars");
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
 		 Iterator<String> itr=codes.iterator();
 		 while(itr.hasNext())
 		 {
 			 String val1=itr.next();
 			 if(val1.endsWith(chars))
 			 {
 				System.out.println("pincode is found which ends with same chars");
 				return true;
 			 }
 		 }
 		 
 	 }
 	 return false;
 	 
  }
 }

