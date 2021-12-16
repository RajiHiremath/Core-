package com.xworkz.collect.dto.beer.functional;

public class BiscuitDAOScammer {

	public static void main(String[] args) {
		
		BiscuitDAO biscuit=new BiscuitDAO();
		
		StringMatch stringMatch= new FindMatch();
		boolean match1=biscuit.Find(stringMatch,"Dark Fantacy");
        System.out.println(match1);
         
         StringMatch stringMatch1=new FindMatchCaseInsensitive();
         boolean match2=biscuit.Find(stringMatch1,"paRLE-g");
         System.out.println(match2);
         
         StringMatch stringMatch2=new FindMatchStartsWith();
         boolean match3=biscuit.Find(stringMatch2,"Hi");
         System.out.println(match3);
         
         StringMatch stringMatch3=new FindMatchEndsWith();
         boolean match4=biscuit.Find(stringMatch3,"eek");
         System.out.println(match4);

	}

}
