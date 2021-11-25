package com.xworkz.bird.dto;
public class BirdAssociation 
{

	private BirdDTO[] dtos= new BirdDTO[100];;
    private int counter;

  
	public boolean save(BirdDTO birdDTO) 
	{
		System.out.println("invoked save");
		return false;
	}

	public BirdDTO findByBreedName(String name) 
	{
		System.out.println("invoked find by breed name");
		return null;
	}
	public void save(BirdDTO birdDTO, int i) {
		System.out.println("save birdDTOs dto and int cost:".concat(birdDTO.getBreed()));
		if (i >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] = birdDTO;
			System.out.println("create birdDTOs dto and int cost:".concat(String.valueOf(i)));
		} else {
			System.out.println("Cannot create the birdDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveBird(BirdDTO birdDTOs1) {
		System.out.println("invoked saveCart ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = birdDTOs1;

		} else {
			System.out.println("Cannot save bird dtos :".concat(String.valueOf(this.counter)));
		}
	}
}
