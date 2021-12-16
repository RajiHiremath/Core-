package com.xworkz.collect.dto.beer.functional;

public class PaintDAOScammer {

	public static void main(String[] args) {
		
		PaintDAO paintDAO=new PaintDAO();
		
		StringMatch stringMatch= new FindMatch();
		boolean match1=paintDAO.Find(stringMatch,"Dark violet");
        System.out.println(match1);
         
         StringMatch stringMatch1=new FindMatchCaseInsensitive();
         boolean match2=paintDAO.Find(stringMatch1,"pINK");
         System.out.println(match2);
         
         StringMatch stringMatch2=new FindMatchStartsWith();
         boolean match3=paintDAO.Find(stringMatch2,"Wh");
         System.out.println(match3);
         
         StringMatch stringMatch3=new FindMatchEndsWith();
         boolean match4=paintDAO.Find(stringMatch3,"llow");
         System.out.println(match4);


	}

}
