package com.xworkz.temple.rules;

import com.xworkz.temple.devotee.DevoteeRule;

public class TempleAssociation 
{
     private DevoteeRule devoteeRule;
     private String associationName;
     
   public TempleAssociation() 
   {
	System.out.println("Invoked TempleAssociation no-arg const");
   }

   public TempleAssociation(DevoteeRule devoteeRule, String associationName) 
   {
	this.devoteeRule = devoteeRule;
	this.associationName = associationName;
   }
   public void allowDevotee()
   {
	   System.out.println("Invoked allowDevotee");
	   if(this.devoteeRule!=null)
	   {
		 System.out.println("invoked devoteeRule");
		 boolean slipperOFF=this.devoteeRule.slipperOFF();
		 if(slipperOFF)
		 {
			 System.out.println("Devotee is good");
		 }
		 else
		 {
			 System.err.println("Devotee is bad");
		 }
		 boolean photo=this.devoteeRule.dontTakePhoto();
		 boolean silence=this.devoteeRule.maintainSilence();
		 if(photo && silence)
		 {
			 System.out.println("Devotee followed the rules and allowed to enter the temple");
		 }
		 else 
		 {
			 System.err.println("Rules not followed by Devotee hence not allowed");
		 }
	   }
		 else
		 {
			System.err.println("Display the rules of devotees to enter the temple"); 
		 }
	   
	}
}
