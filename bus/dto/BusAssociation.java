package com.xworkz.bus.dto;

import com.xworkz.bus.dao.BusRoute;

public class BusAssociation 
{
	 private BusRoute dao;
	 private BusDTO[] busDTOs=new BusDTO[5];
	 private int octopus=0;
	 public void save(BusDTO dto)
	 {
		 System.out.println(" save busDTO ");

			if (this.octopus < this.busDTOs.length && this.octopus >= 0) 
			{
				this.busDTOs[this.octopus++] = dto;

			} 
			else 
			{
				System.out.println("Cannot create the bus DTOs :".concat(String.valueOf(this.octopus)));
			}
		}
		
		
		public void findBusByDriverName(BusDTO dto)
		{
			System.out.println("invoked findBusByDriverName");
			System.out.println("dto passed");

			for (int note = 0; note < this.busDTOs.length; note++) 
			{
				BusDTO ref = this.busDTOs[note];
				if (ref != null) 
				{
					System.out.println("ref in note is not null: ".concat(String.valueOf(note)));
					String temp = ref.getDriverName();
					System.out.println(temp);
					if (dto.equals(dto)) 
					{
						System.out.println("Driver name   found");
					
					}

				}
			}
			
		}
		
		public void displayBus() {
			System.out.println("invoked  display Bus");
		  }

}
