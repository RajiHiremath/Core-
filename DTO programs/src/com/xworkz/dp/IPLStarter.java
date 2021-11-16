package com.xworkz.dp;
import com.xworkz.dp.dao.IplDAO;
import com.xworkz.dp.dto.IplDTO;
public class IPLStarter {

	public static void main(String[] args) {
		
		
		IplDTO iplDTOs1=new IplDTO("RCB",24,3,"USL","VIVO");
		IplDAO  dao1 =new IplDAO ();
				 dao1.create(iplDTOs1);
				 
				 dao1.create(new IplDTO("KKR",24,3,"Sharkku khan","JIO"),3);
				 
				 dao1.indexOccupied();
				 
				 
				 boolean ref=dao1.matchIplByName("KKR");
				 System.out.println(ref);
				 }
	    }

	
