package com.xworkz.collect.dto.dao.park;

public class AmusementParkScammer {

	public static void main(String[] args) {
		
		AmusementParkDAO dao= new AmusementParkDAO();
		
		AmusementParkDTO dtotoCompare=new AmusementParkDTO("Wonderla",2200,true,true);
		
		AmusementParkDTO found=dao.Find((d1,d2) -> 
		 {
			 if(d1.getName().equals(d2.getName()) && d1.getEntryFees()==d2.getEntryFees())
			 {
				 return d1;
			 }
			return null;
		 }, dtotoCompare );
							
		 System.out.println(found);	
	
}
}
