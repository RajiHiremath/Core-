package com.xworkz.temple;

import com.xworkz.temple.devotee.DevoteeRule;
import com.xworkz.temple.rules.PublicRules;
import com.xworkz.temple.rules.TempleAssociation;

public class TempleScammer {

	public static void main(String[] args) 
	{
		
		DevoteeRule devotee=new PublicRules();
		
		TempleAssociation association=new TempleAssociation(devotee,"Isckon");
		association.allowDevotee();
		
		
		
	}

}
