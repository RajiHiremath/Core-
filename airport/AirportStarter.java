package com.xworkz.airport;
import com.xworkz.airport.dao.AirportDTO;
import com.xworkz.airport.dto.AirportBusiness;

public class AirportStarter {

	public static void main(String[] args) 
	{
		AirportDTO airportDTOs = new AirportDTO("ef8652","Kempegouda International Airport","Bangalore","Towered");
		AirportBusiness dto1 = new AirportBusiness();
		dto1.saveAirport(airportDTOs);
        dto1.save(new AirportDTO("uh5678","Devanahalli","Bangalore","Non-Towered"));

		AirportDTO ref1= dto1.findByName("Devanahalli");
		System.out.println(ref1);
		
		AirportBusiness ports=new AirportBusiness();
		System.out.println(ports.save(airportDTOs));
		System.out.println(ports.findByName("Devanahalli"));
		ports.displayAirportDetails();


	}

}
