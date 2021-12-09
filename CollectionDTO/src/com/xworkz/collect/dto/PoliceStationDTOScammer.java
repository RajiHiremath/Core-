package com.xworkz.collect.dto;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PoliceStationDTOScammer {

	public static void main(String[] args) {
		
	PoliceStationDTO policeStationDTO1 =new PoliceStationDTO("Gurguntepalya", "Rajajinagar", "Civil", 30);

	PoliceStationDTO policeStationDTO2 =new PoliceStationDTO("Jaynagar Police Station", "Jaynagar 4th block", "Traffic", 41);

	PoliceStationDTO policeStationDTO3 =new PoliceStationDTO("Shivaram Police Station ", "Bagalkote", "Civil", 25);

	PoliceStationDTO policeStationDTO4 =new PoliceStationDTO("Gangavati police Station", "July nagar", "Criminal",50);

	PoliceStationDTO policeStationDTO5 =new PoliceStationDTO("old town police Station", "Bhadravathi", "Civil", 39);

	Set<PoliceStationDTO> set=new HashSet<PoliceStationDTO>();
	set.add(policeStationDTO5);
	set.add(policeStationDTO2);
	set.add(policeStationDTO3);
	set.add(policeStationDTO4);
	set.add(policeStationDTO1);
	
	Iterator<PoliceStationDTO> itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	
	}

}
