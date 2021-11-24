package com.xworkz.airport.dto;
import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDTO;


public class AirportBusiness implements AirportDAO{
	
	private AirportDTO[] dtos= new AirportDTO[10];
    private int counter;

	@Override
	public boolean save(AirportDTO airportdto) {
		System.out.println("invoked save");
		return true;
	}

	@Override
	public AirportDTO findByName(String name) {
		System.out.println("invoked find by name");
		return null;
	}

	public void saveAirport(AirportDTO airportDTO, int x) {
		System.out.println("save airportDTOs dto and int cost:".concat(airportDTO.getName()));
		if (x >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] =airportDTO;
			System.out.println("create Airport DTOs dto and int cost:".concat(String.valueOf(x)));
		} else {
			System.out.println("Cannot create the Airport DTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveAirport(AirportDTO airportDTOs) {
		System.out.println("invoked save Airport DTO ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = airportDTOs;

		} else {
			System.out.println("Cannot save Airport dtos :".concat(String.valueOf(this.counter)));
		}
	}
    public void displayAirportDetails() {
	System.out.println("invoked all Airport Details");
		
	}

}
