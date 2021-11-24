package com.xworkz.bus.dto;

import com.xworkz.bus.dao.BusRoute;

public class BusesRoute implements BusRoute{
	
	private BusDTO[] dtos= new BusDTO[10];
    private int counter;


	@Override
	public boolean save(BusDTO busdto) {
		System.out.println("invoked save");
		return true;
	}

	@Override
	public BusDTO findByDriverName(String driverName) 
	{
		System.out.println("invoked find driver name");
		return null;
	}
	
	public void saveCart(BusDTO busDTO, int x) {
		System.out.println("save busDTOs dto and int cost:".concat(busDTO.getDriverName()));
		if (x >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] =busDTO;
			System.out.println("create busDTOs dto and int cost:".concat(String.valueOf(x)));
		} else {
			System.out.println("Cannot create the cartDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveBus(BusDTO busDTOs) {
		System.out.println("invoked save Bus DTO ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = busDTOs;

		} else {
			System.out.println("Cannot save Bus dtos :".concat(String.valueOf(this.counter)));
		}
	}

	

	public void displayBusesDetails() {
	System.out.println("invoked all bus Details");
		
	}

}
