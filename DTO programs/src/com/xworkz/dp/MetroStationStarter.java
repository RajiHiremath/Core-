package com.xworkz.dp;

import com.xworkz.dp.dao.MetroStationDAO;
import com.xworkz.dp.dto.MetroStationDTO;

public class MetroStationStarter {

	public static void main(String[] args) {
		
		MetroStationDTO metroStationdto=new MetroStationDTO("BTM","Green route",false,"9.00AM","7.00PM");
		MetroStationDTO metroStationdto1=new MetroStationDTO("Rajajinagar","Purple route",true,"8.00AM","7.00PM");
		MetroStationDTO metroStationdto2=new MetroStationDTO("J.P nagar","Green route",false,"9.00AM","7.00PM");
		MetroStationDTO metroStationdto3=new MetroStationDTO("Mejastic","Purple route",true,"7.00AM","8.00PM");
		MetroStationDTO metroStationdto4=new MetroStationDTO("M.G road","Green route",false,"6.00AM","7.00Pm");
				  
			MetroStationDAO metroStationDAO=new MetroStationDAO();
			metroStationDAO.save(metroStationdto);
			metroStationDAO.save(metroStationdto2);
			metroStationDAO.save(metroStationdto3);
			metroStationDAO.save(metroStationdto1);

			MetroStationDTO[] ref=metroStationDAO.getMetroStationDTOs();
			for(int count=0;count<ref.length;count++)
			{
				MetroStationDTO ref1=ref[count];
				if(ref1!=null)
				{
				System.out.println(ref1.getName());
				System.out.println(ref1.getRoute());
				System.out.println(ref1.isElevator());
				System.out.println(ref1.getOpenTime());
				System.out.println(ref1.getCloseTime());
				System.err.println("!!!!!!!!!!!!!!!!");
				}
				else
				{
					System.err.println("Refence is pointing to null :" .concat(String.valueOf(count)));
				}
			 }
			metroStationDAO.delete(1);
			metroStationDAO.displayDetails();
			}
			
}


