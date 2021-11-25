package com.xworkz.airport.dto;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDTO;

public class AirportAssociation 
{
	private AirportDAO dao;
	 private AirportDTO[] airportDTOs=new AirportDTO[5];
	 private int octopus=0;
	 public void save(AirportDTO dto)
	 {
		 System.out.println(" save  bank DTO ");

			if (this.octopus < this.airportDTOs.length && this.octopus >= 0) 
			{
				this.airportDTOs[this.octopus++] = dto;

			} 
			else 
			{
				System.out.println("Cannot create the airport DTOs :".concat(String.valueOf(this.octopus)));
			}
		}
		
		
		public void findBusByDriverName(AirportDTO dto)
		{
			System.out.println("invoked findBusByDriverName");
			System.out.println("dto passed");

			for (int note = 0; note < this.airportDTOs.length; note++) 
			{
				AirportDTO ref = this.airportDTOs[note];
				if (ref != null) 
				{
					System.out.println("ref in note is not null: ".concat(String.valueOf(note)));
					String temp = ref.getName();
					System.out.println(temp);
					if (dto.equals(dto)) 
					{
						System.out.println( "name   found");
					
					}

				}
			}
			
		}
		
		public void displayAirport() {
			System.out.println("invoked  display Airport");
		  }
}
