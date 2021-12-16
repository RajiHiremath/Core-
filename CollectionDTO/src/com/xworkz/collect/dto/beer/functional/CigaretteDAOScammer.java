package com.xworkz.collect.dto.beer.functional;

public class CigaretteDAOScammer {

	public static void main(String[] args) {
		
		CigaretteDAO cigaretteDAO=new CigaretteDAO();
		
		StringMatch stringMatch= new FindMatch();
		boolean match1=cigaretteDAO.Find(stringMatch,"horsel");
        System.out.println(match1);
         
         StringMatch stringMatch1=new FindMatchCaseInsensitive();
         boolean match2=cigaretteDAO.Find(stringMatch1,"KOol");
         System.out.println(match2);
         
         StringMatch stringMatch2=new FindMatchStartsWith();
         boolean match3=cigaretteDAO.Find(stringMatch2,"lu");
         System.out.println(match3);
         
         StringMatch stringMatch3=new FindMatchEndsWith();
         boolean match4=cigaretteDAO.Find(stringMatch3,"ike");
         System.out.println(match4);

	}

}
