package com.xworkz.bird.dto;

import com.xworkz.bird.dao.Birds;

public class BirdBird implements Birds{

	
	private BirdDTO[] dtos= new BirdDTO[10];
    private int counter;
    
	@Override
	public boolean save(BirdDTO birdDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BirdDTO findByBreedName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
 
	  public void save(BirdDTO birdDTO, int x) {
		System.out.println("save birdDTOs dto and int cost:".concat(birdDTO.getBreed()));
		if (x >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] =birdDTO;
			System.out.println("create birdDTOs dto and int cost:".concat(String.valueOf(x)));
		} else {
			System.out.println("Cannot create the birdDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveBird(BirdDTO birdDTOs) {
		System.out.println("invoked save Bird DTO ");

		if (this.counter < this.dtos.length && this.counter >= 0) 
		{
			this.dtos[this.counter++] = birdDTOs;

		} else {
			System.out.println("Cannot save Bird dtos :".concat(String.valueOf(this.counter)));
		}
	}
     public void displayBusesDetails() {
	System.out.println("invoked all bus Details");
		
	}

	
 
}
