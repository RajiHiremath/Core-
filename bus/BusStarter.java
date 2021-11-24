package com.xworkz.bus;
import com.xworkz.bus.dto.BusDTO;
import com.xworkz.bus.dto.BusesRoute;


public class BusStarter {

	public static void main(String[] args) 
	{
		BusDTO busDTOs = new BusDTO("Ka 17 E 2345","Bangalore","Gangavti","Channappa");
		BusesRoute dto1 = new BusesRoute();
		dto1.save(busDTOs);
        dto1.save(new BusDTO("Ka 16 E 4563","Tumkur","Koppal","Channappa"));

		 BusDTO ref1= dto1.findByDriverName("Kariyeppa");
		System.out.println(ref1);
		
		BusesRoute buses=new BusesRoute();
		System.out.println(buses.save(busDTOs));
		System.out.println(buses.findByDriverName("Chenna"));
		buses.displayBusesDetails();

	}

}
