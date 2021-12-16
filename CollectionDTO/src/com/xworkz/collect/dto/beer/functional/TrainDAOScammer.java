package com.xworkz.collect.dto.beer.functional;

public class TrainDAOScammer {

	public static void main(String[] args) {
		
   TrainDAO trainDAO=new TrainDAO();
		
		StringMatch stringMatch= new FindMatch();
		boolean match1=trainDAO.Find(stringMatch,"Hospet to Bellari");
        System.out.println(match1);
         
         StringMatch stringMatch1=new FindMatchCaseInsensitive();
         boolean match2=trainDAO.Find(stringMatch1,"Hubli TO GADag");
         System.out.println(match2);
         
         StringMatch stringMatch2=new FindMatchStartsWith();
         boolean match3=trainDAO.Find(stringMatch2,"hub");
         System.out.println(match3);
         
         StringMatch stringMatch3=new FindMatchEndsWith();
         boolean match4=trainDAO.Find(stringMatch3,"llari");
         System.out.println(match4);

	}

}
